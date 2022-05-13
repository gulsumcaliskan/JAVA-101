import java.util.Scanner;

public class ReversedTriAngle {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the step number: ");
		int n = input.nextInt();
		
		for (int i = n - 1; i > 0; i--){
			for (int j = n; j > i; j--){
				System.out.print(" ");
			}
			for (int k = 1; k <= (2*(i - 1)) + 1; k++){
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
