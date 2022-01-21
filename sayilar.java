import java.util.Scanner;

public class sayilar {
	public static void main(String[] args) {
		
		int num1, num2, num3;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Ýlk sayýyý giriniz: ");
		num1 = input.nextInt();
		
		System.out.print("Ýkinci sayýyý giriniz: ");
		num2 = input.nextInt();
		
		System.out.print("Üçüncü sayýyý giriniz: ");
		num3 = input.nextInt();
		
		if ((num1 > num2) && (num1 > num3)){
			if (num2 > num3) {
				System.out.println("a > b > c");
			}else {
				System.out.println("a > c > b");
			}
		}else if ((num2 > num1) && (num2 > num3)){
			if (num1 > num3) {
				System.out.println("b > a > c");
			}else {
				System.out.println("b > c > a");
			}
		}else {
			if (num1 > num2) {
				System.out.println("c > a > b");
			}else {
				System.out.println("c > b > a");
			}
		}
	}

}