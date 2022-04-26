import java.util.Scanner;

public class ZodiacSign {
	public static void main(String[] args){
		
		int month, day;
		String zodiacSign = "";
		boolean isError = false;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your birth month: ");
		month = input.nextInt();
		
		System.out.print("Enter your birth day: ");
		day = input.nextInt();
		
		if (month == 1) {
			if (day >= 1 && day <=31) {
				if (day < 22) {
					zodiacSign = "Capricorn";
				}else {
					zodiacSign = "Aquarius";
				}
			}else {
				isError = true;
			}
		}
		if (month == 2) {
			if (day >= 1 && day <=29) {
				if (day < 20) {
					zodiacSign = "Aquarius";
				}else {
					zodiacSign = "Pisces";
				}
			}else {
				isError = true;
			}
		}
		if (month == 3) {
			if (day >= 1 && day <=31) {
				if (day < 21) {
					zodiacSign = "Pisces";
				}else {
					zodiacSign = "Aires";
				}
			}else {
				isError = true;
			}
		}
		if (month == 4) {
			if (day >= 1 && day <=31) {
				if (day < 21) {
					zodiacSign = "Aires";
				}else {
					zodiacSign = "Taurus";
				}
			}else {
				isError = true;
			}
		}
		if (month == 5) {
			if (day >= 1 && day <=31) {
				if (day < 22) {
					zodiacSign = "Taurus";
				}else {
					zodiacSign = "Gemini";
				}
			}else {
				isError = true;
			}
		}
		if (month == 6) {
			if (day >= 1 && day <=31) {
				if (day < 22) {
					zodiacSign = "Gemini";
				}else {
					zodiacSign = "Cancer";
				}
			}else {
				isError = true;
			}
		}
		if (month == 7) {
			if (day >= 1 && day <=31) {
				if (day < 23) {
					zodiacSign = "Cancer";
				}else {
					zodiacSign = "Leo";
				}
			}else {
				isError = true;
			}
		}
		if (month == 8) {
			if (day >= 1 && day <=31) {
				if (day < 23) {
					zodiacSign = "Leo";
				}else {
					zodiacSign = "Virgo";
				}
			}else {
				isError = true;
			}
		}
		if (month == 9){
			if (day >= 1 && day <=31) {
				if (day < 23) {
					zodiacSign = "Virgo";
				}else {
					zodiacSign = "Libra";
				}
			}else {
				isError = true;
			}
		}
		if (month == 10){
			if (day >= 1 && day <=31) {
				if (day < 23) {
					zodiacSign = "Libra";
				}else {
					zodiacSign = "Scorpio";
				}
			}else {
				isError = true;
			}
		}
		if (month == 11){
			if (day >= 1 && day <=31) {
				if (day < 23) {
					zodiacSign = "Scorpio";
				}else {
					zodiacSign = "Sagittarius";
				}
			}else {
				isError = true;
			}
		}
		if (month == 12) {
			if (day >= 1 && day <=31) {
				if (day < 22) {
					zodiacSign = "Sagittarius";
				}else {
					zodiacSign = "Capricorn";
				}
			}else {
				isError = true;
			}
		}
		if (isError) {
			System.out.println("Invalid value. Please try again!!");
		}else {
			System.out.print("Your Zodiac Sign is: " + zodiacSign);
		}
		
	}
	

}
