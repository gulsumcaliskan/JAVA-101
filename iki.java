import java.util.Scanner;
public class iki {
	public static void main(String[] args){
		
		// 4 ve 5 in kuvvetlerini ekrana yazdýran prog.
		
		int number;
		Scanner scan = new Scanner(System.in);
		System.out.print("Sayi giriniz: ");
		number = scan.nextInt();
		
		
		// ikinin kuvvetleri için
		/*
		for (int i = 1; i <= number; i*= 2){
			System.out.println(i);
		}
		*/
		
		for(int i = 1; i <= number; i *= 4){
			System.out.println("4'ün katlarý: " + i);
		}
		
		for(int k = 1; k <= number; k *= 5){
			System.out.println(k);
		}
		
	}

}
