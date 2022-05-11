// National Security Agency: Nora Miller, Sophia Eiden, Ameer Alnasser
// APCS pd6
// HW96 - treecursion
// 2022-05-11
// time spent: 1 hr



/**
 * class BST
 * v1:partial
 * SKELETON
 * Implementation of the BINARY SEARCH TREE abstract data type (ADT)
 *
 * A BST maintains the invariant that, for any node N with value V,
 * L<V && V<R, where L and R are node values in N's left and right
 * subtrees, respectively.
 * (Any value in a node's left subtree must be less than its value,
 *  and any value in its right subtree must be greater.)
 *
 * This BST implementation only holds ints (its nodes have int cargo)
 */

public class BST
{

  //instance variables / attributes of a BST:
  TreeNode _root;

  /**
   * default constructor
   */
 BST()
  {
    _root=null;
  }

  /**
   * void insert( int )
   * Adds a new data element to tree.
   */
  public void insert( int newVal )
  {
    TreeNode newNode = new TreeNode( newVal );
    if(_root!=null){
    insert(_root,newNode);
    }
    else{
      _root=newNode;
    }
  }
    /*** YOUR IMPLEMENTATION HERE ***/

  //recursive helper for insert(int)
  public void insert( TreeNode stRoot, TreeNode newNode )
  {
    /*** YOUR IMPLEMENTATION HERE ***/
    TreeNode one,two;
        if (newNode.getValue()<stRoot.getValue()){
          if(stRoot.getLeft()==null){
          stRoot.setLeft(newNode);
        }
        else{
          one=stRoot.getLeft();
          insert(one,newNode);
        }
      }

    else{
      if(stRoot.getRight()==null){
      stRoot.setRight(newNode);
    }
    else{
      two=stRoot.getRight();
      insert(two,newNode);
    }
}
}


  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  //~~~~~~~~~~~~~v~~TRAVERSALS~~v~~~~~~~~~~~~~~~~~~~~~

  // each traversal should simply print to standard out
  // the nodes visited, in order

  //process root, recurse left, recurse right
  public void preOrderTrav()
  {
    preOrderTrav( _root );
  }
  public void preOrderTrav( TreeNode currNode )
    {
      System.out.println(currNode.getValue());
      if (currNode.getLeft() != null) {
        preOrderTrav(currNode.getLeft());
      }
      if(currNode.getRight() != null) {
        preOrderTrav(currNode.getRight());
      }
    }

  //recurse left, process root, recurse right
  public void inOrderTrav()
  {
    inOrderTrav(_root);
  }
  public void inOrderTrav( TreeNode currNode )
  {
    /*** YOUR IMPLEMENTATION HERE ***/
    if (currNode.getLeft() != null) {
      preOrderTrav(currNode.getLeft());
    }
    System.out.println(currNode.getValue());

    if(currNode.getRight() != null) {
      preOrderTrav(currNode.getRight());
    }

  }

  //recurse left, recurse right, process root
  public void postOrderTrav()
  {
  postOrderTrav(_root);
  }
  public void postOrderTrav( TreeNode currNode )
  {
    if (currNode.getLeft() != null) {
      preOrderTrav(currNode.getLeft());
    }
    if(currNode.getRight() != null) {
      preOrderTrav(currNode.getRight());
    }
    System.out.println(currNode.getValue());

  }

  //~~~~~~~~~~~~~^~~TRAVERSALS~~^~~~~~~~~~~~~~~~~~~~~~
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  //~~~~~~~~~~~~~v~~MORE FXNS~~v~~~~~~~~~~~~~~~~~~~~~

  /*****************************************************
   * TreeNode search(int)
   * returns pointer to node containing target,
   * or null if target not found
   *****************************************************/
  TreeNode search( int target )
  { // 1. compare the target to the root
    // if it's equal, return this node.
    // 2. If it's below the root, look in the left half - invoke the search function
    // same thing for right half

    return searchHelper(target, _root);

  }

  TreeNode searchHelper (int target, TreeNode start){
    int n = target - start.getValue();
    //TreeNode pointer = new TreeNode(target); // this will traverse the tree.
    if (n==0){
      return start;
    } else if (n > 0) {
      // right half
      return searchHelper(target, start.getRight() );
    }
      // left half
      return searchHelper(target, start.getLeft() );

  }


  /*****************************************************
   * int height()
   * returns height of this tree (length of longest leaf-to-root path)
   * eg: a 1-node tree has height 1
   *****************************************************/
  public int height()
  {
    /*** YOUR IMPLEMENTATION HERE ***/
    // 1. if you have no kids, your height is zero
    // 2. if you have just one kid, your hieght is one more than their height
    // 3. if you have two kids, your height is one more than the max of their heights


    return heightHelper(_root);
  }

  public int heightHelper( TreeNode start){
    if (start.getLeft() == null){
      if (start.getRight() == null) {
        return 0;
      } else {
        return 1 + heightHelper(start.getRight());
      }
    } else {
      if (start.getRight() == null){
        return 1 + heightHelper(start.getLeft());
      } else {
        return 1 + Math.max( heightHelper(start.getLeft()), heightHelper(start.getRight()) );
      }

    }
    //return -5;
  }


  /*****************************************************
   * int numLeaves()
   * returns number of leaves in tree
   *****************************************************/
  public int numLeaves()
  {
    // 1. are you a leaf?
    // 2. if not, sum the number of leaves on your kids.
    /*** YOUR IMPLEMENTATION HERE ***/
    return leafHelper(_root);
  }

    public int leafHelper(TreeNode start){
      int totLeaves = 0;
      if (start.getLeft() == null && start.getRight() == null){
        return 1;
      }
      if (start.getLeft() != null){
        totLeaves += leafHelper(start.getLeft());
      }
      if (start.getRight() != null){
        totLeaves += leafHelper(start.getRight());
      }
      return totLeaves;
    }

  //~~~~~~~~~~~~~^~~MORE FXNS~~^~~~~~~~~~~~~~~~~~~~~~
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~





  //main method for testing
  public static void main( String[] args )
  {

      BST arbol = new BST();

      //PROTIP: sketch state of tree after each insertion
      //        ...BEFORE executing these.
      arbol.insert( 4 );
      arbol.insert( 2 );
      arbol.insert( 5 );
      arbol.insert( 6 );
      arbol.insert( 1 );
      arbol.insert( 3 );

      System.out.println( "\n-----------------------------");
      System.out.println( "pre-order traversal:" );
      arbol.preOrderTrav();

      System.out.println( "\n-----------------------------");
      System.out.println( "in-order traversal:" );
      arbol.inOrderTrav();

      System.out.println( "\n-----------------------------");
      System.out.println( "post-order traversal:" );
      arbol.postOrderTrav();

      System.out.println( "\n-----------------------------");
      System.out.println( "search:" );
      System.out.println( arbol.search(4) );
      System.out.println(arbol.search(4).getRight().getValue() ); //5

      System.out.println( "\n-----------------------------");
      System.out.println( "height:" );
      System.out.println(arbol.height()); //2

      BST arbre = new BST();
      arbre.insert(10);
      arbre.insert(12);
      arbre.insert(6);
      arbre.insert(11);
      arbre.insert(13);
      arbre.insert(5);
      arbre.insert(8);
      arbre.insert(7);
      arbre.insert(9);
      arbre.insert(4);
      arbre.insert(2);
      arbre.insert(1);
      arbre.insert(3);

      System.out.println( "\n-----------------------------");
      System.out.println(arbre.height());// 5

      System.out.println( "\n-----------------------------");
      System.out.println( "leaves for arbol:" );
      System.out.println(arbol.numLeaves()); //3

      System.out.println( "\n-----------------------------");
      System.out.println( "leaves for arbre:" );
      System.out.println(arbre.numLeaves()); //6

  }

}//end class
