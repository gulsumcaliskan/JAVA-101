import java.util.Arrays;
public class Cýft {
	
	static boolean isFind(int[] arr, int value){
		for(int i = 0; i < arr.length; i++){
			if(arr[i] == value){
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args){
		int[] list = {3, 5, 9, 4, 3, 6, 4, 0, 9, 4, 2, 0};
		int[] dublicate = new int[list.length];
		int startIndex = 0;
		
		for (int i = 0; i < list.length; i++){
			for(int j = 0; j < list.length; j++){
				if ((i != j) && (list[i] == list[j]) && (list[i] %2 == 0)){
					if (isFind(dublicate, list[i])){
						dublicate[startIndex++] = list[i];
						
					}
					break;
				}
			}
		}
		for (int value: dublicate){
			if (value != 0){
				System.out.println(value);
			}
		}
		
	}

}
