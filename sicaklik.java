package gecme;

import java.util.Scanner;
public class sicaklik {
	public static void main(String[] args) {
		
		int temperature; 
		Scanner input = new Scanner(System.in);
		System.out.print("Sýcaklýk deðerini giriniz: ");
		temperature = input.nextInt();
		
		if (temperature < 5) {
			System.out.print("Kayak yapmanýzý tavsiye ederiz");
		}else if (temperature >= 5 && temperature <15) {
			System.out.print("Sinemaya gitmenizi tavsiye ederiz");
		}else if (temperature >= 15 && temperature < 25) {
			System.out.print("Piknik yapmanýzý tavsiye ederiz");
		}else {
			System.out.print("Yüzmeye gitmenizi tavsiye ederiz");
		}
		
	}
}
