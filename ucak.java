import java.util.Scanner;

public class ucak {
	public static void main(String[] args){
		
		int mesafe, yas, yolculuk;
		double mesafeBas� = 0.10;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Mesafeyi km t�r�nden giriniz: ");
		mesafe = input.nextInt();
		
		System.out.print("Ya��n�z� giriniz: ");
		yas = input.nextInt();
		
		System.out.print("Yolculuk tipini se�iniz. 1-Tek Y�n\n2-Gidi� D�n��: ");
		yolculuk = input.nextInt();
		System.out.print(yolculuk);
		
		double toplamTutar = (mesafe * mesafeBas�);
		double yasIndirim, indirimliTutar, gdbIndirim;
		
		if ((mesafe > 0) && (yas > 0) && (yolculuk >=1 && yolculuk <=2)) {
			System.out.println("Sisteme ba�ar�l� veri girildi.");
		}else {
			System.out.println("Hatal� veri girdiniz.");
		}
		
		if (yas < 12) {
			yasIndirim = (toplamTutar * 0.50);
			indirimliTutar = toplamTutar - yasIndirim;
			System.out.println("�ndirimli Fiyat: " + indirimliTutar);
		}else if (yas >= 12 && yas < 24){
			yasIndirim = (toplamTutar * 0.10);
			indirimliTutar = toplamTutar - yasIndirim;
			System.out.println("�ndirimli Fiyat: " + indirimliTutar);
		}else if (yas > 65){
			yasIndirim = (toplamTutar * 0.30);
			indirimliTutar = toplamTutar - yasIndirim;
			System.out.println("�ndirimli Fiyat: " + indirimliTutar);
		}else {
			yasIndirim = (toplamTutar * 1);
			indirimliTutar = toplamTutar - yasIndirim;
			System.out.println("�ndirimli Fiyat: " + indirimliTutar);
		}
		
		if (yolculuk == 2){
			gdbIndirim = (indirimliTutar * 0.20);
			System.out.println("Gidi� D�n�� Bilet �ndirimi: " + gdbIndirim);
		}else {
			System.out.print("�ndirim tarifesi bulunmamaktad�r");
		}
	}

}
