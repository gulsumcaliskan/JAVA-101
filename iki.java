import java.util.Scanner;
public class iki {
	public static void main(String[] args){
		
		// 4 ve 5 in kuvvetlerini ekrana yazd�ran prog.
		
		int number;
		Scanner scan = new Scanner(System.in);
		System.out.print("Sayi giriniz: ");
		number = scan.nextInt();
		
		
		// ikinin kuvvetleri i�in
		/*
		for (int i = 1; i <= number; i*= 2){
			System.out.println(i);
		}
		*/
		
		for(int i = 1; i <= number; i *= 4){
			System.out.println("4'�n katlar�: " + i);
		}
		
		for(int k = 1; k <= number; k *= 5){
			System.out.println(k);
		}
		
	}

}
