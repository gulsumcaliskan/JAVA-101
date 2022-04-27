import java.util.Scanner;
public class EvenNumberAve {
	public static void main(String[] args){
		
		int number;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		number = input.nextInt();
		
		int sum = 0, count = 0;
		double ave;
		
		for (int i = 0; i <= number; i++) {
			if (i % 3 == 0 && i % 4 == 0){
				sum+= i;
				count++;
				//System.out.print(i);
				
			}
		}	
		
		//System.out.println(count);
		ave = sum / count;
		System.out.println("Average: " + ave);
		
	}
}
