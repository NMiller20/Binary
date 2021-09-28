
public class Date {
	public static void main(String[] args){
		int year = 2021;
		String month = "August";
		String day = "Friday";
		int date = 10;
		String sp = " ";
		String cm = ", ";
		
		System.out.print("American format: \n");
		System.out.println(day + cm + month + sp + date + cm + year);
		System.out.print("European format: \n");
		System.out.println(day + sp + date + sp + month + sp + year);
	}
}