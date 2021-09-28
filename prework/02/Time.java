
public class Time {
	public static void main(String[] args){
	double hour = 1.0;
	double pm = 1.0; /// This is actually meant to be a boolean, but I don't feel like writing code to convert the boolean to an int.
	double minute = 8.0;
	double second = 54.0;
	
	System.out.println("\n Current time: 1:08:54 PM");
	
	
	double seconds = (hour + 12.0 * pm) * 3600.0 + minute * 60.0 + second;
	System.out.print("Seconds since midnight: ");
	System.out.println(seconds);
	
	double secondsPerDay = 24.0 * 60.0 * 60.0;
	System.out.print("Seconds remaining in the day: ");
	System.out.println(secondsPerDay - seconds);
	
	double percentPassed = seconds / secondsPerDay * 100;
	System.out.print("Percent of the day that has passed:" + percentPassed);
	
	System.out.print("\n\n Current time: 1:45:37 PM");
	
	hour = 1.0;
	pm = 1.0;
	minute = 45.0;
	second = 37.0;
	double secondsBefore = seconds; /// stores the old value of seconds 
	seconds = (hour + 12.0 * pm) * 3600.0 + minute * 60.0 + second; /// the new value of seconds
	double secondsElapsed = seconds - secondsBefore;
	System.out.println("\n Seconds elapsed since I started this program: " + secondsElapsed);
	

	
	
	
	

	
	}
}