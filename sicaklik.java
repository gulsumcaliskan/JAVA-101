package gecme;

import java.util.Scanner;
public class sicaklik {
	public static void main(String[] args) {
		
		int temperature; 
		Scanner input = new Scanner(System.in);
		System.out.print("S�cakl�k de�erini giriniz: ");
		temperature = input.nextInt();
		
		if (temperature < 5) {
			System.out.print("Kayak yapman�z� tavsiye ederiz");
		}else if (temperature >= 5 && temperature <15) {
			System.out.print("Sinemaya gitmenizi tavsiye ederiz");
		}else if (temperature >= 15 && temperature < 25) {
			System.out.print("Piknik yapman�z� tavsiye ederiz");
		}else {
			System.out.print("Y�zmeye gitmenizi tavsiye ederiz");
		}
		
	}
}
