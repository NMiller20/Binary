// MNM: Mosiah, Nora Miller
// APCS pd6
// HW61: Instructions so Simple...
// 2022-02-07
// time spent: .8 hrs

/***
  class MergeSort
  Implements mergesort on array of ints.

  Summary of Algorithm:
  0. Split array in a binary fashion until subarrays are 1 element long
  1. Merge pairs of most recently split subarrays until the entire array
    has been merged together. (See FIRMWARE for a description of merge)

  ***/

public class MergeSort
{
  /******************************************************
   * int[] merge(int[],int[])
   * Merges two input arrays
   * Precond:  Input arrays are sorted in ascending order
   * Postcond: Input arrays unchanged, and
   * output array sorted in ascending order.
   ******************************************************/
  private static int[] merge( int[] a, int[] b )
  {
    int[] result = new int[ a.length + b.length ];  // initialize result
    //printArray(result);
    int aIndex = 0; // initialize aIndex, keeps track of the next element to be looked at in a
    int bIndex = 0; // initialize aIndex, keeps track of the next element to be looked at in b

    while (aIndex < a.length && bIndex < b.length) {  // runs until either a or b is exhausted
      if (a[aIndex] < b[bIndex]) {  // take smallest element and place it into result
        result[aIndex + bIndex] = a[aIndex];
        aIndex += 1;
      }
      else {  // take smallest element and place it into result
        result[aIndex + bIndex] = b[bIndex];
        bIndex += 1;
      }
    }
    while (bIndex < b.length) { // takes care of leftovers in b
      result[aIndex + bIndex] = b[bIndex];
      bIndex += 1;
    }
    while (aIndex < a.length) { // takes care of leftovers in a
      result[aIndex + bIndex] = a[aIndex];
      aIndex += 1;
    }
    return result;
  }//end merge()


  /******************************************************
   * int[] sort(int[])
   * Sorts input array using mergesort algorithm
   * Returns sorted version of input array (ascending)
   ******************************************************/
  public static int[] sort( int[] arr )
  {
    if (arr.length == 1) {
      return arr; // basecase
    }
    else {
      int[] a = new int[arr.length / 2];  // initialize lower "half" or arr
      int[] b = new int[arr.length - arr.length / 2]; // initalize upper "half" of arr

      for (int i = 0; i < arr.length / 2; i++) {
        a[i] = arr[i];  // fill lower "half"
      }
      for (int j = 0; j < arr.length - arr.length / 2; j++) {
        b[j] = arr[j + arr.length / 2]; // fill upper "half"
      }

      return merge( sort(a), sort(b));  // recursive case
    }
  }//end sort()



  //-------------------HELPERS-------------------------
  //tester function for exploring how arrays are passed
  //usage: print array, mess(array), print array. Whaddayasee?
  public static void mess( int[] a ) {
    for( int i = 0 ; i<a.length; i++ )
      a[i] = 0;
  }

  //helper method for displaying an array
  public static void printArray( int[] a ) {
    System.out.print("[");
    for( int i : a )
      System.out.print( i + ",");
    System.out.println("]");
  }
  //---------------------------------------------------


  //main method for testing
  public static void main( String [] args )
  {
      int[] arr0 = {0};
      int[] arr1 = {1};
      int[] arr2 = {1,2};
      int[] arr3 = {3,4};
      int[] arr4 = {1,2,3,4};
      int[] arr5 = {4,3,2,1};
      int[] arr6 = {9,42,17,63,0,512,23};
      int[] arr7 = {9,42,17,63,0,9,512,23,9};

      System.out.println("\nTesting mess-with-array method...");
      printArray( arr3 );
      mess(arr3);
      printArray( arr3 );

      System.out.println("\nMerging arr1 and arr0: ");
      printArray( merge(arr1,arr0) );

      System.out.println("\nMerging arr2 and arr3: ");
      printArray( merge(arr2,arr3) );

      System.out.println("\nMerging arr4 and arr6: ");
      printArray( merge(arr4,arr6) );

      System.out.println("\nSorting arr4-7...");
      printArray( sort( arr4 ) );
      printArray( sort( arr5 ) );
      printArray( sort( arr6 ) );
      printArray( sort( arr7 ) );
  }//end main()

}//end class MergeSort
