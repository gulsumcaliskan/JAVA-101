import java.util.Scanner;
public class faktoriyel {
	public static void main(String[] args){
		/*
		int number;
		Scanner scan = new Scanner(System.in);
		System.out.print("Faktoriyel Say�s�: ");
		number = scan.nextInt();
		int total = 1;
		
		// n! = 1 + 2 + 3 +4 + ....... +n
		
		for(int i = 1; i <= number; i++){
			//System.out.println(i);
			total = total * i;
		}
		System.out.println(number + ". Fakt�riyel: " + total);
	*/
		
		int n, r, c;
		int total1 = 1; 
		int total2 = 1;
		int total3 = 1;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("�lk say�y� giriniz: ");
		n = scan.nextInt();
		System.out.print("�kinci say�y� giriniz: ");
		r = scan.nextInt();
		
		int fark = (n - r);
		
		for (int i = 1; i <= n; i++){
			total1 = total1 * i;
		}
		for (int k = 1; k <= r; k++){
			total2 = total2 * k;
		}
		for (int m = 1; m <= fark; m++){
			total3 = total3 * m;
		}
		
		c = total1 / (total2 * total3);
		System.out.println(n  + " ve " + r + " in kombinasyon sonucu: " + c);
	
	
	
	}

}
