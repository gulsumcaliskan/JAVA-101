
package giris;

import java.util.Scanner;

public class kullanici {
	public static void main(String[] args) {
		
		String userName, password;
		int select = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Kullanýcý adýnýz: ");
		userName = input.nextLine();
		
		System.out.print("Þifreniz: ");
		password = input.nextLine();
		
		if (userName.equals("java101") && password.equals("12345")) {
			System.out.println("Giriþ baþarýlý.");			
		}else if (!userName.equals("java101")) {
			System.out.print("Kullanýcý adý yanlýþ girildi.");
		}else {
			System.out.println("Þifre yanlýþ girildi");
			System.out.println("Þifrenizi deðiþtirmek ister misiniz?");
			System.out.println("1-Þifremi deðiþtirmek istiyorum.\n2-Ýstemiyorum.");
			System.out.print("Seçiniz: ");
			//System.out.print(select);
			select = input.nextInt();
			System.out.print(select);
		}


		String newPass;
		
		switch(select) {
			case 1:
				System.out.print("Yeni þifrenizi giriniz: ");
				newPass = input.nextLine();
				input.nextLine();
			//	System.out.print(newPass);
				
				if (newPass.equals("12345")) {
					System.out.println("Lütfen baþka þifre giriniz.");
				}
				else {
					System.out.println(" Þifreniz oluþturuldu.");
				}
			break;
			
			case 2:
				System.out.println(" Þifremi deðiþtirmek istemiyorum.");
			break;
			
			default:
				System.out.println(" Baþarýsýz giriþ");
			break;
		}
		
	}

}

