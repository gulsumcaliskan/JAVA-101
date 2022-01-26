import java.util.Scanner;
public class minvemax {
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		int n;
		int max = 0, min = 0;
		
		System.out.print("Kaç tane sayý gireceksiniz: ");
		n = input.nextInt();
		
		for(int i = 1; i <= n; i++){
			System.out.print(i+". Sayý giriniz: ");
			
			int sayi = input.nextInt();
			
			if (sayi > max){
				if (min == 0){
					min = sayi;
				}
				max = sayi;
			}
			if (sayi < min){
				if (max == 0){
					max = sayi;
				}
				min = sayi;
			}
		}
		System.out.println("En büyük Sayý: " + max);
		System.out.println("En Küçük Sayý: " + min);
		
		
		
	}

}
