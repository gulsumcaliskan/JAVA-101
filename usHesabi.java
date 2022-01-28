import java.util.Scanner;
public class usHesabi {
	static int calc(int t, int u){
		int result = 1;
		for(int i = 1; i <= u; i++){
			result *= t;
		}
		return result;
	}
	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Taban deðeri giriniz: ");
		int t = scan.nextInt();
		System.out.print("Üs deðerini giriniz: ");
		int u = scan.nextInt();
		
		System.out.println("Sonuç: " + calc(t, u));
	
		
	}

}
