import java.util.Scanner;
public class harmonik {
	public static void main(String[] args){
		int number;
		Scanner scan = new Scanner(System.in);
		System.out.print("Say� giriniz: ");
		number = scan.nextInt();
		double result = 0;
		
		for(int i = 1; i <= number; i++){
			result += (1.0/i); //double de�er d�nd�rmek i�in
		}
		// 1. d�ng�, i = 1; result = 0 +(1/1) = 1;
		// 2. d�ng�, i = 2; result = 1 + (1/2) = 1.5;
		
		System.out.println(result);
		
		
		
		
	}

}
