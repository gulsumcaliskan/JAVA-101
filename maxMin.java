import java.util.Arrays;
import java.util.Scanner;

public class maxMin {
	public static void main(String[] args){
		
		int[] list = {15, 12, 788, 1, -1, -778, 2, 0};
		Scanner input = new Scanner(System.in);
		Arrays.sort(list);
		
		System.out.println("Liste: " + Arrays.toString(list));
		System.out.println("Girilen sayý: ");
		int number = input.nextInt();
		
		int min = list[0];
		int max = list[7];
		
		for (int i: list){
			if (i < x){
				min = i;
			}
		}
		
		for (int j: list){
			if (i > j){
				max = j;
				break;
			}
		}
		System.out.println("Girilen sayýdan kucuk en yakin sayi: " + min);
		System.out.println("Girilen sayýdan buyuk en yakin sayi: " + max);
	}

}
