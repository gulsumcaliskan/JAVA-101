import java.util.Scanner;
public class ebob {
	public static void main(String[] args){
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("n1 sayýsýný giriniz: ");
		int n1 = input.nextInt();
		
		System.out.print("n2 sayýsýný giriniz: ");
		int n2 = input.nextInt();
		
		int ebob = 1;
		int ekok = (n1 > n2) ? n1: n2;
		
		while(true){
			if (ekok % n1 == 0 && ekok % n2 == 0){
				System.out.println(n1 + " ve " + n2 + " sayýlarýnýn EKOK deðeri: " + ekok);
				break;
			}
			++ekok;
		}
			
		System.out.println("**********************");
		
		for (int k = n1; k >= 1; k--){
			if (n1 % k == 0 && n2 % k == 0){
				ebob = k;
				System.out.println(ebob);
				break;
			}
		}	
			
			
	}

}
