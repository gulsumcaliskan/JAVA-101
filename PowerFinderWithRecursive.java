import java.util.Scanner;

public class PowerFinderWithRecursive {
	static int calc(int base, int power){
		int result = 1;
		for(int i = 1; i <= power; i++){
			result *= base;
		}
		return result;
	}
	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter a base value: ");
		int base = scan.nextInt();
		System.out.print("Please enter a power value: ");
		int power = scan.nextInt();
		
		System.out.println("Result: " + calc(base, power));
	
		
	}

}
