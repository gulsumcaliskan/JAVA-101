import java.util.Scanner;
public class minvemax {
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		int n;
		int max = 0, min = 0;
		
		System.out.print("Ka� tane say� gireceksiniz: ");
		n = input.nextInt();
		
		for(int i = 1; i <= n; i++){
			System.out.print(i+". Say� giriniz: ");
			
			int sayi = input.nextInt();
			
			if (sayi > max){
				if (min == 0){
					min = sayi;
				}
				max = sayi;
			}
			if (sayi < min){
				if (max == 0){
					max = sayi;
				}
				min = sayi;
			}
		}
		System.out.println("En b�y�k Say�: " + max);
		System.out.println("En K���k Say�: " + min);
		
		
		
	}

}
