import java.util.Scanner;
public class mukemmel {
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		System.out.print("Bir sayý giriniz: ");
		int n = input.nextInt();
		int total = 0;
		
		for (int i = 1; i < n; i++){
			if (n % i == 0){
				total += i;
			}
		}
		if (total == n){
			System.out.println(n + " Mukemmel bir sayýdýr");
		}else {
			System.out.println(n + " Mukemmel bir sayý deðildir.");
		}
		
		
		
	}

}
