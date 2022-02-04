
import java.util.Scanner;

public class Pattern {
	
	static int pattern(int a, int b, int c){
		System.out.print(b + " ");
		if(b <= 0 || c ==1){
			while(a != b){
				return pattern(a, b + 5, 1);
			}
			System.exit(0);
		}
		
		return pattern(a, b - 5, 0);
	}
	
	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Number of N: ");
		int n = scan.nextInt();
		System.out.print(pattern(n, n, 0));
	}
	
	

}

