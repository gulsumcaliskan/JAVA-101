import java.util.Scanner;
public class artik {
	public static void main(String[] args){
		
		int year; 
		boolean artik = false;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Yıl giriniz: ");
		year = input.nextInt();
		
		
		if (year % 4 == 00){
			if (year % 100 == 0){
				if (year % 400 ==0){
					artik = true;
				}else {
					artik = false;
				}
			}else {
				artik = true;
			}
		}else {
			artik = false;
		}
		if(artik) {
			System.out.println(year + " bir artık yıdır.");
		}else {
			System.out.println(year + " bir artık yıl değildir.");
		}
	}

}
