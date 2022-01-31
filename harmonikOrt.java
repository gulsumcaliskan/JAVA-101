
public class harmonikOrt {
	public static void main(String[] args){

		
		int[] numbers = {1, 2};
		double sum = 0;
		
		for(int i = 0; i < numbers.length; i++){
			sum += 1.0/numbers[i];
		}
		
		
		System.out.println(numbers.length / sum);
	
	}

}
