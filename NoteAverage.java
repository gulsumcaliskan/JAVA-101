package pass;

import java.util.Scanner;

public class NoteAverage {
	public static void main(String[] args) {
		
		int math, physic, turkish, chemistry, music;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter your math note: ");
		math = input.nextInt();
		int math = (math >= 0 && math < 100) ? math : 0;
		
		System.out.print("Fizik notunu giriniz: ");
		physic = input.nextInt();
		int physic = (physic >= 0 && physic < 100) ? physic : 0;
		
		System.out.print("Türkçe notunu giriniz: ");
		turkish = input.nextInt();
		int turkish = (turkish >= 0 && turkish < 100) ? turkish : 0;
		
		System.out.print("Kimya notunu giriniz: ");
		chemistry = input.nextInt();
		int chemistry = (chemistry >= 0 && chemistry < 100) ? chemistry : 0;
		
		System.out.print("Müzik notunu giriniz: ");
		music = input.nextInt();
		int music = (music >= 0 && music < 100) ? music : 0;
		
		double average = ((math + physic + turkish + chemistry + music) / 5);
		if (average <= 55) {
			System.out.println("You failed the class!!");
		} else {
			System.out.println("Congragulations. You passed the class");		
		}
		System.out.println("Average: " + average);
		 
	}
	

}
