import java.util.Scanner;
public class ArmstrongNumber {
	public static void main(String[] args){
		
	int number;
        int sum = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        number = input.nextInt();

        while(number >= 1){
            sum += (number % 10);
            number = number / 10; 
        }
        System.out.println("Total: " + sum);
		
		
	}

}
