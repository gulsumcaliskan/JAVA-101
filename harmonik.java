import java.util.Scanner;
public class harmonik {
	public static void main(String[] args){
		int number;
		Scanner scan = new Scanner(System.in);
		System.out.print("Sayý giriniz: ");
		number = scan.nextInt();
		double result = 0;
		
		for(int i = 1; i <= number; i++){
			result += (1.0/i); //double deðer döndürmek için
		}
		// 1. döngü, i = 1; result = 0 +(1/1) = 1;
		// 2. döngü, i = 2; result = 1 + (1/2) = 1.5;
		
		System.out.println(result);
		
		
		
		
	}

}
