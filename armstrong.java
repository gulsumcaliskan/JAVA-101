import java.util.Scanner;
public class armstrong {
	public static void main(String[] args){
		
		int number;
        int sum = 0;

        Scanner inp = new Scanner(System.in);

        System.out.println("Sayı giriniz: ");
        number = inp.nextInt();

        while(number >= 1){
            sum += (number % 10);
            number = number / 10; 
        }
        System.out.println("Toplam: " + sum);
		
		
	}

}
