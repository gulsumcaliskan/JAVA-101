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

public class KdvCalculator {
	public static void main(String[] args) {
		
		double total;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the cost of your product: ");
		total = input.nextDouble();
		
		double kdvRate1 = 0.18, kdvRate2 = 0.08;
		
		boolean kdvTotal = (total > 0 && total < 1000);
		double kR1 = (total + total * kdvRate1);
		double kR2 = (total + total * kdvRate2);
		
		System.out.println(kdvTotal ? " with total of KDV:" + kR1 : " with total of KDV:" + kR2);
		
		
	}
}
