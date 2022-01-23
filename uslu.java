import java.util.Scanner;
public class uslu {
	public static void main(String[] args){
		
		/*
		int n, r;
		Scanner input = new Scanner(System.in);
		System.out.print("Üssü alýnacak sayý: ");
		n = input.nextInt();
		System.out.print("Üs olacak sayý: ");
		r = input.nextInt();
		
		int total = 1;
		
		int i = 1;
		
		while(i <= r){
			total *= n;
			i++;
		}
		
		System.out.println("Cevap: " + total);
		*/
		
		int n, r;
		int result = 1;
		Scanner input = new Scanner(System.in);
		System.out.print("Üssü alýnacak sayýyý giriniz: ");
		n = input.nextInt();
		System.out.print("Üs olacak sayýyý giriniz: ");
		r = input.nextInt();
		
	//	int result;
		
		for (int i = 1; i <= r; i++){
			result *= n;
		}
		System.out.println("Cevap: " + result);
		
		
		
		
		
		
	}

}
