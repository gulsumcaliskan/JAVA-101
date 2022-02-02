import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Tahmin {
	public static void main(String[] args){
		
		Random rand = new Random();
		int number = rand.nextInt(100);
		
		Scanner input = new Scanner(System.in);
		int right = 0;
		int selected = 0;
		int[] wrong = new int[5];
		boolean isWin = false;
//		System.out.println(number);
		
		while(right < 5){
			System.out.println("L�tfen tahmininizi giriniz: ");
			selected = input.nextInt();
			
			if (selected < 0 || selected > 99){
				System.out.println("L�tfen 0-100 aras�nda bir de�er giriniz.");
				continue;
			}
			
			if (selected == number){
				System.out.println("Tebrikler do�ru tahmin!! Tahmin etti�iniz say�: " + number);
				isWin = true;
				break;
			}else {
				System.out.println("Hatal� bir say� girdiniz.");
				if (selected > number){
					System.out.println(selected + " say�s�, girdi�iniz say�dan b�y�kt�r.");
				}else {
					System.out.println(selected + " say�s� girdi�iniz say�dan k���kt�r.");
				}
				
				System.out.println("Kalan hakk�n�z: " + (5 - right));
			}
			wrong[right++] = selected;
			
		}
		
		if (!isWin){
			System.out.println("Kaybettiniz.");
			System.out.println("Tahminleriniz: " + Arrays.toString(wrong));
		}
		
		
		
		System.out.println(number);
		
	}

}
