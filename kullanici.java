
package giris;

import java.util.Scanner;

public class kullanici {
	public static void main(String[] args) {
		
		String userName, password;
		int select = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Kullan�c� ad�n�z: ");
		userName = input.nextLine();
		
		System.out.print("�ifreniz: ");
		password = input.nextLine();
		
		if (userName.equals("java101") && password.equals("12345")) {
			System.out.println("Giri� ba�ar�l�.");			
		}else if (!userName.equals("java101")) {
			System.out.print("Kullan�c� ad� yanl�� girildi.");
		}else {
			System.out.println("�ifre yanl�� girildi");
			System.out.println("�ifrenizi de�i�tirmek ister misiniz?");
			System.out.println("1-�ifremi de�i�tirmek istiyorum.\n2-�stemiyorum.");
			System.out.print("Se�iniz: ");
			//System.out.print(select);
			select = input.nextInt();
			System.out.print(select);
		}


		String newPass;
		
		switch(select) {
			case 1:
				System.out.print("Yeni �ifrenizi giriniz: ");
				newPass = input.nextLine();
				input.nextLine();
			//	System.out.print(newPass);
				
				if (newPass.equals("12345")) {
					System.out.println("L�tfen ba�ka �ifre giriniz.");
				}
				else {
					System.out.println(" �ifreniz olu�turuldu.");
				}
			break;
			
			case 2:
				System.out.println(" �ifremi de�i�tirmek istemiyorum.");
			break;
			
			default:
				System.out.println(" Ba�ar�s�z giri�");
			break;
		}
		
	}

}

