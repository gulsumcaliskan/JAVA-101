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
			System.out.println("Lütfen tahmininizi giriniz: ");
			selected = input.nextInt();
			
			if (selected < 0 || selected > 99){
				System.out.println("Lütfen 0-100 arasýnda bir deðer giriniz.");
				continue;
			}
			
			if (selected == number){
				System.out.println("Tebrikler doðru tahmin!! Tahmin ettiðiniz sayý: " + number);
				isWin = true;
				break;
			}else {
				System.out.println("Hatalý bir sayý girdiniz.");
				if (selected > number){
					System.out.println(selected + " sayýsý, girdiðiniz sayýdan büyüktür.");
				}else {
					System.out.println(selected + " sayýsý girdiðiniz sayýdan küçüktür.");
				}
				
				System.out.println("Kalan hakkýnýz: " + (5 - right));
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
