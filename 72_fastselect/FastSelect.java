// TNPG: Minions (Melody Lew, Nora Miller, Nicole Zhou)
// APCS
// HW72: So So Fast
// 2022-03-08
// time spent: 2 hrs

/*
ALGO:
We want to find the yth smallest term:
partition the array in the middle
compare the index of the pivot point to the index of the yth term we intend to find
  if it is greater:
    partition the LOWER HALF of the first partition
  if it is less:
    partition the UPPER HALF of the first partition
  if it is the same:
    then we have found the yth smallest value!
    return and exit
continue doing this until you have returned and exited

BEST CASE SCENARIO:
When the term we are looking for is the pivot value of the first partition.
In this case, partition is only invoked once, which is the lowest possible
number of invocations.
Since partitioner is O(n), this case is O(n)

WORST CASE SCENARIO:
This would be the maximum number of invocations possible of partitioner, for example
if you're looking for the first smallest value. This would require roughly log_2(n)
partitions, each of which is O(n). Simplifying this, the worst case will be
O(n log(n) ).

DISCO:
0)

QCC:
0)
*/

public class FastSelect{
  //--------------v  HELPER METHODS  v--------------
  //swap values at indices x, y in array o
  public static void swap( int x, int y, int[] o ){
    int tmp = o[x];
    o[x] = o[y];
    o[y] = tmp;
  }

  //print input array
  public static void printArr( int[] a ){
    for ( int o : a )
      System.out.print( o + " " );
    System.out.println();
  }

  //shuffle elements of input array
  public static void shuffle( int[] d ){
    int tmp;
    int swapPos;
    for( int i = 0; i < d.length; i++ ) {
      tmp = d[i];
      swapPos = i + (int)( (d.length - i) * Math.random() );
      swap( i, swapPos, d );
    }
  }

  //return int array of size s, with each element fr range [0,maxVal)
  public static int[] buildArray( int s, int maxVal ){
    int[] retArr = new int[s];
    for( int i = 0; i < retArr.length; i++ )
      retArr[i] = (int)( maxVal * Math.random() );
    return retArr;
  }
  //--------------^  HELPER METHODS  ^--------------


  public static int partitioner( int[] arr, int lower, int upper, int pvtPos){
    int v = arr[pvtPos];
    swap( pvtPos, upper, arr);
    int s = lower;
    for( int i = lower; i < upper; i++ ) {
      if ( arr[i] <= v) {
        swap( i, s, arr );
        s++;
      }
    }
    swap(s,upper,arr);
    return s;
  }//end partitioner

  public static int fastHelper( int[] arr, int lower, int upper, int pvtPos, int y){
    //int smaller = partitioner(arr, lower, upper, pvtPos);
    partitioner(arr, lower, upper, pvtPos);
    if (pvtPos == y){// base case
      return arr[pvtPos]; // if the pivot value is at the pivot position, you're done
    }
    if (y == arr.length -1){ // the case where you're looking for the greatest value
                             // needs to be treated separately because due to typecasting,
                             // the greatest index will never show up as a pivot.
      return arr[arr.length - 1];
    }
    else {// other cases
      if (pvtPos > y - 1){ // we need to look more in depth at the lower half
        int newPvt = (int)((pvtPos + lower)/2);
        return( fastHelper(arr, lower, pvtPos, newPvt, y));
      }
      else { // we need to look at the upper half
        int newPvt = (int)((pvtPos + upper)/2);
        return( fastHelper(arr, pvtPos, upper, newPvt, y));
      }
    }
  }

  // precond: looking for the yth smallest value in the array
  // postcond: the yth smallest value of the array (pvt)

  public static int fastSelect(int[] arr, int y){
    int firstPvt = (int) (0.5 * arr.length);
    return fastHelper(arr, 0, arr.length-1, firstPvt, y-1);
  }


  //main method for testing
  public static void main( String[] args ){

    //init test arrays of magic numbers
    int[] arr1 = {0,1};
    int[] arr3 = {1,28,33,4982,37};
    int[] arr4 = {5,4,17,9000,6,33,44,12};
    int[] arr5 = {3,3};

    int[] arr2 = {3,7,9,2,8};
    partitioner(arr2, 0, 4, 2);
    printArr(arr2);

    System.out.print("arr1: ");
    printArr(arr1);
    System.out.print(" smallest: ");
    System.out.println(fastSelect(arr1, 1));

    System.out.print("arr3: ");
    printArr(arr3);
    System.out.print("second smallest: ");
    System.out.println(fastSelect(arr3, 2));

    System.out.print("fourth smallest: ");
    System.out.println(fastSelect(arr3, 4));

    System.out.print("arr4: ");
    printArr(arr4);
    System.out.print("third smallest: ");
    System.out.println(fastSelect(arr4, 3));

    System.out.print("seventh smallest: ");
    System.out.println(fastSelect(arr4, 7));

    System.out.print("eighth smallest: ");
    System.out.println(fastSelect(arr4, 8));

  }//end main
}
