import java.util.Scanner;

public class GCDLCM {
	public static void main(String[] args){
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter the number of n1: ");
		int n1 = input.nextInt();
		
		System.out.print("Enter the number of n2: ");
		int n2 = input.nextInt();
		
		int gcd = 1;
		int lcd = (n1 > n2) ? n1: n2;
		
		while(true){
			if (lcd % n1 == 0 && lcd % n2 == 0){
				System.out.println(n1 + " and " + n2 + " Greatest common divisor: " + lcd);
				break;
			}
			++lcd;
		}
			
		System.out.println("**********************");
		
		for (int k = n1; k >= 1; k--){
			if (n1 % k == 0 && n2 % k == 0){
				gcd = k;
				System.out.println(gcd);
				break;
			}
		}	
			
			
	}

}
