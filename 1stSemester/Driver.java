public class Driver {

    public static void main( String[] args ) {

        //test default constructor
        Coin mine = new Coin();

        //test 1st overloaded constructor
        Coin yours = new Coin( "quarter" );

        //test 2nd overloaded constructor
        Coin wayne = new Coin( "dollar", "heads" );

        //test toString() methods of each Coin
        System.out.println("mine: " + mine);
        System.out.println("yours: " + yours);
        System.out.println("wayne: " + wayne);

        //test flip() method
        System.out.println("\nAfter flipping...");
        yours.flip();
        wayne.flip();
        System.out.println("yours: " + yours);
        System.out.println("wayne: " + wayne);

        //test equals() method
        if ( yours.equals(wayne) ) {
            System.out.println( "Matchee matchee!" );
        }
        else {
            System.out.println( "No match. Firestarter you can not be." ); 
    	}
            
        System.out.println(yours.summary());
     }
        
        public static void summary() {
        	long numHeads = 0;
        	long numMatches = 0;
        	while ( numMatches < 65536 || numMatches % 2005 != 0) {
        		yours.flip();
        		wayne.flip();
        		if ( yours.upFace == "heads" || wayne.upFace == "heads") {
        			numHeads++; } 
        		yours.equals(wayne);
        		if ( yours.equals(wayne) == true) {
        			numMatches++; }
        	} return (numHeads + " heads have come up\n" + 
        		  numMatches + " matches have occurred.");
        }
        

}