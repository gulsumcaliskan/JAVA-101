import java.util.Scanner;
public class ExpoNumber {
	public static void main(String[] args){
		
		/*
		int n, r;
		Scanner input = new Scanner(System.in);
		System.out.print("Base number: ");
		n = input.nextInt();
		System.out.print("Power number: ");
		r = input.nextInt();
		
		int total = 1;
		
		int i = 1;
		
		while(i <= r){
			total *= n;
			i++;
		}
		
		System.out.println("Result: " + total);
		*/
		
		int n, r;
		int result = 1;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the base number: ");
		n = input.nextInt();
		System.out.print("Enter the power number: ");
		r = input.nextInt();
		
	//	int result;
		
		for (int i = 1; i <= r; i++){
			result *= n;
		}
		System.out.println("Result: " + result);
		
		
	}

}
