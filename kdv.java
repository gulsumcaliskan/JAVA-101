/*
import java.util.Scanner;
public class kdv {
	public static void main(String[] args) {
		
		double tutar, kdvOran = 0.18;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Fiyatı giriniz: ");
		tutar = input.nextDouble();
		
		double kdvTutar, kdvliTutar;
		kdvTutar = kdvOran * tutar;
		kdvliTutar = kdvTutar + tutar; 
		
		System.out.println("Kdvsiz Tutar: " + tutar);
		System.out.println("Kdv Oran: " + kdvOran);
		System.out.println("Kdv Tutar: " + kdvTutar);
		System.out.println("Kdvli Tutar: " + kdvliTutar);
		
	}
}

*/

import java.util.Scanner;

public class kdv {
	public static void main(String[] args) {
		
		double tutar;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Fiyatı giriniz: ");
		tutar = input.nextDouble();
		
		double kdvOran1 = 0.18, kdvOran2 = 0.08;
		
		boolean kdvHesap = (tutar > 0 && tutar < 1000);
		double kucuk = (tutar + tutar * kdvOran1);
		double buyuk = (tutar + tutar * kdvOran2);
		
		System.out.println(kdvHesap ? "KDV'li tutar:" + kucuk : "KDV'li tutar:" + buyuk);
		
		
	}
}