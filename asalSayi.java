import java.util.Scanner;
public class asalSayi {
	
	static boolean isPrime(int x, int y){
		if(x == 1){
			return false;
		}
		if (y >= x){
			return true;
		}
		if (x % y == 0){
			return false;
		}else {
			return isPrime(x, y+1);
		}
		
	}
	
	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Say� giriniz: ");
		int number = scan.nextInt();
		
		System.out.println(isPrime(number, 2) ? number + " Asal Say�d�r" : number + " Asal Say� De�ildir.");
		
	}

}
