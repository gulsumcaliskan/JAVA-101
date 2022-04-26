package gecme;

import java.util.Scanner;
public class EventSuggestion {
	public static void main(String[] args) {
		
		int temperature; 
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the value of air temperature: ");
		temperature = input.nextInt();
		
		if (temperature < 5) {
			System.out.print("We recommend you to skis");
		}else if (temperature >= 5 && temperature <15) {
			System.out.print("We recommend you to cinema");
		}else if (temperature >= 15 && temperature < 25) {
			System.out.print("We recommend you to picnic");
		}else {
			System.out.print("We recommend you to swimming");
		}
		
	}
}
