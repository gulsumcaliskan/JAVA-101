package gecme;

import java.util.Scanner;

public class sinif {
	public static void main(String[] args) {
		
		int mat, fizik, turkce, kimya, muzik;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Matematik notunu giriniz: ");
		mat = input.nextInt();
		int mate = (mat >= 0 && mat < 100) ? mat : 0;
		
		System.out.print("Fizik notunu giriniz: ");
		fizik = input.nextInt();
		int fiz = (mat >= 0 && mat < 100) ? fizik : 0;
		
		System.out.print("Türkçe notunu giriniz: ");
		turkce = input.nextInt();
		int turkc = (mat >= 0 && mat < 100) ? turkce : 0;
		
		System.out.print("Kimya notunu giriniz: ");
		kimya = input.nextInt();
		int kim = (mat >= 0 && mat < 100) ? kimya : 0;
		
		System.out.print("Müzik notunu giriniz: ");
		muzik = input.nextInt();
		int muz = (mat >= 0 && mat < 100) ? muzik : 0;
		
		double ort = ((mat + fizik + turkce + kimya + muzik) / 5);
		if (ort <= 55) {
			System.out.println("Sýnýfta kaldýnýz!!");
		} else {
			System.out.println("Tebrikler geçtiniz");		
		}
		System.out.println("Ortalamanýz: " + ort);
		 
	}
	

}
