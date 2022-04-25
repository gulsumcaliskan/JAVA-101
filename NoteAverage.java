package pass;

import java.util.Scanner;

public class NoteAverage {
	public static void main(String[] args) {
		
		int math, physic, turkish, chemistry, music;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter your math note: ");
		math = input.nextInt();
		math = (math >= 0 && math < 100) ? math : 0;
		
		System.out.print("Please enter your physic note: ");
		physic = input.nextInt();
		physic = (physic >= 0 && physic < 100) ? physic : 0;
		
		System.out.print("Please enter your turkish note: ");
		turkish = input.nextInt();
		turkish = (turkish >= 0 && turkish < 100) ? turkish : 0;
		
		System.out.print("Please enter your chemistry note: ");
		chemistry = input.nextInt();
		chemistry = (chemistry >= 0 && chemistry < 100) ? chemistry : 0;
		
		System.out.print("Please enter your music note: ");
		music = input.nextInt();
		music = (music >= 0 && music < 100) ? music : 0;
		
		double average = ((math + physic + turkish + chemistry + music) / 5);
		if (average <= 55) {
			System.out.println("You failed the class!!");
		} else {
			System.out.println("Congragulations. You passed the class");		
		}
		System.out.println("Average: " + average);
		 
	}
	

}
