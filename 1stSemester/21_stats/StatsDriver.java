public class StatsDriver {
	// test mean: 
	public static void main(String[] args){
		System.out.println(Stats.mean(4, 6));	
		
		
		System.out.println(Stats.mean(4.5, 6.5) );
		System.out.println("Expected: 5 and 5.5"); 
		System.out.println(Stats.mean(0, 2));	// 1
		System.out.println(Stats.mean(1, 1) ); // 1
		System.out.println(Stats.mean(-5, -7));	// -6
		System.out.println(Stats.mean(-5, 3) ); // -1
		System.out.println(Stats.mean(1, 2));	// does this convert to doubles, or does it perform the operation under the assumption that 
										// these are integers, then fail? or does it round?
		System.out.println(Stats.mean(0, 6.5) ); // 3.25
		System.out.println(Stats.mean(-4.4, 6.5) ); //1.05
		System.out.println(Stats.mean(-4.4, -6.5) ); //-5.45
		System.out.println(Stats.mean(4.5, 6) ); //5.25
		
		// success
		
		
		System.out.println("\nMax function"); 
		
		System.out.println(Stats.max(5, 7)); //7
		System.out.println(Stats.max(7.5, 9.3)); //9.3 Since the double and int versions are written in the exact same way, these cases
												 // only need to be tested with one. 
		System.out.println(Stats.max(4.4, 4.4) ); //4.4
		System.out.println(Stats.max(4.4, -6.5) ); //4.4
		System.out.println(Stats.max(-4.4, -6.5) ); //-4.4
		System.out.println(Stats.max(4.4, 0) ); //4.4
		
		System.out.println(Stats.max(5, 7, 6) ); //7
		System.out.println(Stats.max(5, 6, 7) ); //7
		System.out.println(Stats.max(7, 5, 6) ); //7
		System.out.println(Stats.max(0, 7.8, 6.9) ); //7.8
		System.out.println(Stats.max(5, 7.8, 62) ); //62.0
		System.out.println(Stats.max(-5.8, -7, 6) ); //6.0
		System.out.println(Stats.max(-5, -7, -6) ); //-5
		
		
		System.out.println("\nGeo Mean function"); 
		
		
		System.out.println(Stats.geoMean(4, 9)); //6
		System.out.println(Stats.geoMean(12.25, 42.25) ); //22.75
		 
		
		System.out.println(Stats.geoMean(12.25, 0) ); //0
		System.out.println(Stats.geoMean(-12.25, 42.25) ); // error
		System.out.println(Stats.geoMean(-12.25, -42.25) ); // 22.75
		System.out.println(Stats.geoMean(12.25, 12.25) ); // 12.25
		System.out.println(Stats.geoMean(12.25, 9) ); // 10.5
		
		System.out.println(Stats.geoMean(12.25, 12.25, 12.25) ); // 12.25
		System.out.println(Stats.geoMean(6, 6, 6) ); // 6
		System.out.println(Stats.geoMean(1.0, 3.0, 9.0) ); // 3
		System.out.println(Stats.geoMean(-1, -3, -9) ); // -3
		System.out.println(Stats.geoMean(-1, -3, 9) ); // 3
		System.out.println(Stats.geoMean(-1, 3, 9) ); // -3
		System.out.println(Stats.geoMean(0, 3, 9) ); // 0	 
		
		

		
		
		
		
		
	}
	
}