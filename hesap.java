package makine;

import java.util.Scanner;

public class hesap {
	public static void main(String[] args) {
		
		int num1, num2, select; 
		Scanner input = new Scanner(System.in);
		System.out.print("�lk say�y� giriniz: ");
		num1 = input.nextInt();
		System.out.print("�kinci say�s� giriniz: ");
		num2 = input.nextInt();
		
		System.out.println("1-Toplama\n2-��karma\n3-�arpma\n4-B�lme");
		System.out.print("Se�iniz: ");
		select = input.nextInt();
		
		switch(select) {
			case 1:
				System.out.println("Toplam: " + (num1 + num2));
				break;
			case 2:
				System.out.println("��karma: " + (num1 - num2));
				break;
			case 3:
				System.out.println("�arpma: " + (num1 * num2));
				break;
			case 4:
				if (num2 != 0) {
					System.out.println("B�lme: " + (num1 / num2));	
				}else {
					System.out.println("0'a b�l�nemez.");
				}
				break;
			default:
				System.out.println("Ge�ersiz ifadeye t�klad�n�z. Yeniden numara giriniz!!!");
				break;
		}
		
	}
}
