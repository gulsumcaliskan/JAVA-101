import java.util.Scanner;
public class cift {
	public static void main(String[] args){
		
		int sayi;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Sayi giriniz: ");
		sayi = input.nextInt();
		
		int sum = 0, count = 0;
		double ort;
		
		for (int i = 0; i <= sayi; i++) {
			if (i % 3 == 0 && i % 4 == 0){
				sum+= i;
				count++;
				//System.out.print(i);
				
			}
		}	
		
		//System.out.println(count);
		ort = sum / count;
		System.out.println("Ortalama: " + ort);
		
	}
}