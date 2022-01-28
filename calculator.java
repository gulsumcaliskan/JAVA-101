import java.util.Scanner;
public class calculator {
	
	static int sum(int n1, int n2){
		int result = n1 + n2;
		System.out.println("Toplam: " + result);
		return result;
	}
	
	static int subt (int n1, int n2){
		int result = n1 - n2;
		System.out.println("��karma: " + result);
		return result;
	}
	static int mult (int n1, int n2){
		int result = n1 * n2;
		System.out.println("�arpma: " + result);
		return result;
	}
	
	static int div (int n1, int n2){
		if (n2 == 0){
				System.out.println("�kinci say� s�f�rdan farkl� olmal�.");
				return 0;
		}
		int result = n1 / n2;
		System.out.println("B�lme: " + result);
		return result;
	}
	
	static int expo(int n1, int n2){
		int result = 1;
		for (int i = 1; i <= n2; i++){
			result *= n1;
		}
		return result;
	}
	
	static int mod(int n1, int n2){
		int result = n1 % n2;
		System.out.println("Mod: " + result);
		return result;
	}
	
	static void calc(int n1, int n2){
		System.out.println("�evresi: " + (2 * (n1 + n2)));
		System.out.println("Alan�: " + (n1 * n2));
	}
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		int select;
		
		String menu = "1- Toplama ��lemi\n" 
			+ "2- ��karma ��lemi\n"
			+ "3- �arpma ��lemi\n"
			+ "4- B�lme ��lemi\n"
			+ "5- �sl� Say� Hesaplama\n"
			+ "6- Mod Alma\n"
			+ "7- Dikd�rtgen Alan ve �evre Hesab�\n"
			+ "8- ��k�� Yap";
		
		while (true){
			System.out.print("Bir i�lem se�iniz: ");
			select = input.nextInt();
			
			if (select == 0){
				break;
			}
			
			System.out.print("�lk say�y� giriniz: ");
			int n1 = input.nextInt();
			System.out.print("�kinci say�y� giriniz: ");
			int n2 = input.nextInt();
			
			switch (select) {
				case 1:
					sum(n1, n2);
					break;
				case 2:
					subt(n1, n2);
					break;
				case 3:
					mult(n1, n2);
					break;
				case 4:
					div(n1, n2);
					break;
				case 5:
					System.out.println("�s Hesab�: " + expo(n1, n2));
					break;
				case 6:
					mod(n1, n2);
					break;
				case 7:
					calc(n1, n2);
					break;
				default:
					System.out.println("Ge�ersiz bir i�lem girdiniz.");
			}
		}
		System.out.println("G�le g�le");	
			
		
		
	}

}
