public class StatsDriver {
	// test mean: 
	System.out.println(mean(4, 6));	
	System.out.println(mean(4.5, 6.5) );
	System.out.println("Expected: 5 and 5.5"); 
	System.out.println(mean(0, 2);	// 1
	System.out.println(mean(1, 1) ); // 1
	System.out.println(mean(-5, -7));	// -6
	System.out.println(mean(-5, 3) ); // -1
	System.out.println(mean(1, 2));	// does this convert to doubles, or does it perform the operation under the assumption that 
								    // these are integers, then fail? or does it round?
	System.out.println(mean(0, 6.5) ); //
	System.out.println(mean(-4.4, 6.5) );
	System.out.println(mean(-4.4, -6.5) );
	
	
	
	
	System.out.println(max(5, 7));
	System.out.println(max(7.5, 9.3));
	System.out.println("Expected: 7, 9.3"); 
	
	System.out.println(geoMean(4, 9));
	System.out.println(geoMean(12.25, 42.25) );
	System.out.println("Expected: 6, 22.75" ); 
}