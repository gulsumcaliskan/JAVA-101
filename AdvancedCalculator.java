import java.util.Scanner;

public class AdvancedCalculator {
	
	static int add(int n1, int n2){
		int result = n1 + n2;
		System.out.println("Addition: " + result);
		return result;
	}
	
	static int subt (int n1, int n2){
		int result = n1 - n2;
		System.out.println("Subtraction: " + result);
		return result;
	}
	static int mult (int n1, int n2){
		int result = n1 * n2;
		System.out.println("Multiplication: " + result);
		return result;
	}
	
	static int div (int n1, int n2){
		if (n2 == 0){
			System.out.println("Second number have to be different from 0.");
			return 0;
		}
		int result = n1 / n2;
		System.out.println("Division: " + result);
		return result;
	}
	
	static int expo(int n1, int n2){
		int result = 1;
		for (int i = 1; i <= n2; i++){
			result *= n1;
		}
		System.out.println("Exponent: " + result);
		return result;
	}
	
	static int mod(int n1, int n2){
		int result = n1 % n2;
		System.out.println("Mod: " + result);
		return result;
	}
	
	static void area_perimeter(int n1, int n2){
		System.out.println("Area of a Rectangle: " + (num1 * num2));
		System.out.println("Perimeter of a Rectangle: " + (2 *(num1 + num2)));
	}
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		System.out.println("---------- Welcome to your personal advanced calculator. ----------");
		
		int select;
		
		String menu = "1- Addition\n" 
			+ "2- Subtraction\n"
			+ "3- Multiplication\n"
			+ "4- Division\n"
			+ "5- Exponent\n"
			+ "6- Mod\n"
			+ "7- Area and Perimeter of a Rectangle\n"
			+ "8- Exit";
		
		while (true){
			System.out.print("Please choose an operation: ");
			select = input.nextInt();
			
			if (select == 0){
				System.out.println("Invalid value. Please try again.");
				break;
			}
			
			System.out.print("Please enter first number: ");
			int n1 = input.nextInt();
			System.out.print("Please enter second number: ");
			int n2 = input.nextInt();
			
			switch (select) {
				case 1:
					add(n1, n2);
					break;
				case 2:
					subt(n1, n2);
					break;
				case 3:
					mult(n1, n2);
					break;
				case 4:
					div(n1, n2);
					break;
				case 5:
					System.out.println("Exponent: " + expo(n1, n2));
					break;
				case 6:
					mod(n1, n2);
					break;
				case 7:
					area_perimeter(n1, n2);
					break;
				case 8:
					if(select == 8){
                        			System.out.println("Good Bye");
                        			break;
                    			}
                    			break;
					
				default:
					System.out.println("Invalid value. Please try again!!");
					break;
			}
		}
		System.out.println("GOOD BYE!!!");
			
		
		
	}

}
