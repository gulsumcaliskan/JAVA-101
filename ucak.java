import java.util.Scanner;

public class ucak {
	public static void main(String[] args){
		
		int mesafe, yas, yolculuk;
		double mesafeBasý = 0.10;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Mesafeyi km türünden giriniz: ");
		mesafe = input.nextInt();
		
		System.out.print("Yaþýnýzý giriniz: ");
		yas = input.nextInt();
		
		System.out.print("Yolculuk tipini seçiniz. 1-Tek Yön\n2-Gidiþ Dönüþ: ");
		yolculuk = input.nextInt();
		System.out.print(yolculuk);
		
		double toplamTutar = (mesafe * mesafeBasý);
		double yasIndirim, indirimliTutar, gdbIndirim;
		
		if ((mesafe > 0) && (yas > 0) && (yolculuk >=1 && yolculuk <=2)) {
			System.out.println("Sisteme baþarýlý veri girildi.");
		}else {
			System.out.println("Hatalý veri girdiniz.");
		}
		
		if (yas < 12) {
			yasIndirim = (toplamTutar * 0.50);
			indirimliTutar = toplamTutar - yasIndirim;
			System.out.println("Ýndirimli Fiyat: " + indirimliTutar);
		}else if (yas >= 12 && yas < 24){
			yasIndirim = (toplamTutar * 0.10);
			indirimliTutar = toplamTutar - yasIndirim;
			System.out.println("Ýndirimli Fiyat: " + indirimliTutar);
		}else if (yas > 65){
			yasIndirim = (toplamTutar * 0.30);
			indirimliTutar = toplamTutar - yasIndirim;
			System.out.println("Ýndirimli Fiyat: " + indirimliTutar);
		}else {
			yasIndirim = (toplamTutar * 1);
			indirimliTutar = toplamTutar - yasIndirim;
			System.out.println("Ýndirimli Fiyat: " + indirimliTutar);
		}
		
		if (yolculuk == 2){
			gdbIndirim = (indirimliTutar * 0.20);
			System.out.println("Gidiþ Dönüþ Bilet Ýndirimi: " + gdbIndirim);
		}else {
			System.out.print("Ýndirim tarifesi bulunmamaktadýr");
		}
	}

}
