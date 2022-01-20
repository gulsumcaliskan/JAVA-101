package makine;

import java.util.Scanner;

public class hesap {
	public static void main(String[] args) {
		
		int num1, num2, select; 
		Scanner input = new Scanner(System.in);
		System.out.print("Ýlk sayýyý giriniz: ");
		num1 = input.nextInt();
		System.out.print("Ýkinci sayýsý giriniz: ");
		num2 = input.nextInt();
		
		System.out.println("1-Toplama\n2-Çýkarma\n3-Çarpma\n4-Bölme");
		System.out.print("Seçiniz: ");
		select = input.nextInt();
		
		switch(select) {
			case 1:
				System.out.println("Toplam: " + (num1 + num2));
				break;
			case 2:
				System.out.println("Çýkarma: " + (num1 - num2));
				break;
			case 3:
				System.out.println("Çarpma: " + (num1 * num2));
				break;
			case 4:
				if (num2 != 0) {
					System.out.println("Bölme: " + (num1 / num2));	
				}else {
					System.out.println("0'a bölünemez.");
				}
				break;
			default:
				System.out.println("Geçersiz ifadeye týkladýnýz. Yeniden numara giriniz!!!");
				break;
		}
		
	}
}
