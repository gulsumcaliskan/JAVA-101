import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class GuessNumber {
	public static void main(String[] args){
		
		Random rand = new Random();
		int number = rand.nextInt(100);
		
		Scanner input = new Scanner(System.in);
		int right = 0;
		int selected = 0;
		int[] wrong = new int[5];
		boolean isWin = false;
//		System.out.println(number);
		
		while(right < 5){
			System.out.println("Please enter your guess number: ");
			selected = input.nextInt();
			
			if (selected < 0 || selected > 99){
				System.out.println("Please enter a value between 0-100.");
				continue;
			}
			
			if (selected == number){
				System.out.println("Congratulation, correct guess number!! Your guess number is: " + number);
				isWin = true;
				break;
			}else {
				System.out.println("You entered a wrong number.");
				if (selected > number){
					System.out.println(selected + " number, is bigger than your entered number.");
				}else {
					System.out.println(selected + " number, is smaller than your entered number.");
				}
				
				System.out.println("Rest right: " + (5 - right));
			}
			wrong[right++] = selected;
			
		}
		
		if (!isWin){
			System.out.println("You lost.");
			System.out.println("Your guessing numbers: " + Arrays.toString(wrong));
		}
		
		
		
		System.out.println(number);
		
	}

}
