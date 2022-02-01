import java.util.Scanner;
import java.util.Arrays;

public class Eleman {
	
	static int[] Sort(int[] arr){
		int a;
		for(int b = 0; b < arr.length; b++){
			for(int i = 0; i < arr.length - 1; i++){
				if (arr[i] > arr[i + 1]){
					a = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = a;
				}
			}
		}
		return arr;
	}
	
	public static void main(String[] args){
		
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Dizinin boyutu n: ");
		int n = scan.nextInt();
		int [] list = new int[n];
		System.out.println("Dizinin eleman sayýsýný giriniz: ");
		
		for(int i = 0; i < n; i++){
			System.out.print(i + 1 + ". value : ");
			list[i] = scan.nextInt();
		}
		Sort(list);
		System.out.println(Arrays.toString(list));
		
		
		
		
		
		
	}

}
