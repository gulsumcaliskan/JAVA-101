import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args){
		
		int year; 
		boolean leapYear = false;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the year: ");
		year = input.nextInt();
		
		
		if (year % 4 == 00){
			if (year % 100 == 0){
				if (year % 400 ==0){
					leapYear = true;
				}else {
					leapYear = false;
				}
			}else {
				leapYear = true;
			}
		}else {
			leapYear = false;
		}
		if(leapYear) {
			System.out.println(year + " is a leap year.");
		}else {
			System.out.println(year + " is not a leap year.");
		}
	}

}
