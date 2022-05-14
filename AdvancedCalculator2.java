
import java.util.Scanner;
import java.lang.Math;

public class AdvancedCalculator {

    // Addition
    static void addition(){
        Scanner input = new Scanner(System.in);

        System.out.print("How many numbers will you enter?: ");
        int counter = input.nextInt();
        int number;
        int result = 0;
       

        for(int i = 1; i <= counter; i++){
            System.out.print(i + ". number: ");
            number = input.nextInt();
            result += number;
        }
        System.out.println("Addition: " + result);
    }

    // Subtraction
    static void subtraction(){
        Scanner input = new Scanner(System.in);

        System.out.print("How many numbers will you enter?: ");
        int counter = input.nextInt();
        int number;
        int result = 0;
       

        for(int i = 1; i <= counter; i++){
            System.out.print(i + ". number: ");
            number = input.nextInt();

            if(i == 1){
                result += number;
                continue;
            }
            result -= number;
        }
        System.out.println("Subtraction: " + result);
    }

    // Multiplication
    static void multiplication(){
        Scanner input = new Scanner(System.in);

        System.out.print("How many numbers will you enter?: ");
        int counter = input.nextInt();
        int number;
        int result = 1;
       

        for(int i = 1; i <= counter; i++){
            System.out.print(i + ". number: ");
            number = input.nextInt();
            result *= number;
        }
        System.out.println("Multiplication: " + result);
    }

    // Division
    static void division(){
        Scanner input = new Scanner(System.in);

        System.out.print("How many numbers will you enter?: ");
        int counter = input.nextInt();
        double number;
        double result = 0.0;
       

        for(int i = 1; i <= counter; i++){
            System.out.print(i + ". number: ");
            number = input.nextInt();

            if(i != 1 && number == 0){
                System.out.println("The divider can't be 0.");
                continue;
            }

            if(i == 1){
                result = number;
                continue;
            }
            result /= number;
        }
        System.out.println("Division: " + result);
    }

    // Exponent
    static void exponent(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a base number: ");
        int base = input.nextInt();
        System.out.print("Enter a power number: ");
        int power = input.nextInt();
        int result = 1;
       

        for(int i = 1; i <= power; i++){
            result *= base;
        }
        System.out.println("Exponent Result: " + result);
    }

    // Mod
    static void mod(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter your second number: ");
        int num2 = input.nextInt();
        int result = num1 % num2;
    
        System.out.println("Mod: " + result);
    }

    // Square Root

    static void squareRoot(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        System.out.println("Result: " + Math.sqrt(number));
    }

    // Absolute Value

    static void absoluteValue(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        System.out.println("Result: " + Math.abs(number));
    } 

    // Factorial

    static void factorial(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int result = 1;

        for(int i = 1; i <= num; i++){
            result *= i;
        }

        System.out.println("Result: " + result);
    }

    // Derivative

    static void derivative(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a constant (c) value: ");
        int constant = input.nextInt();

        if(constant == 0){
            System.out.println("If " + "f(x) = "+constant+"*x^n" + "f(x)= 0");
            System.out.println("f'(x) = 0");
        }else {
            System.out.print("Enter a power number (n): ");
            int power = input.nextInt();
            System.out.println("f(x)="+constant+"*x^"+power);
            System.out.println("f'(x)="+(constant*power)+"*x^"+ (power-1));
        }
    }


    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("----- <Welcome to your personel advanced calculator> -----");

        int select;

        String menu = "1- Addition\n" 
        + "2- Subtraction\n"
        + "3- Multiplication\n"
        + "4- Division\n"
		+ "5- Exponent\n"
		+ "6- Mod\n"
		+ "7- karekök alma\n"
        + "8- mutlak değer hesaplama\n"
        + "9- faktöriyel hesaplama\n"
        + "10- türev alma\n"
		+ "0- Exit";

        while(true){
            System.out.print("Please choose an operation: ");
            select = input.nextInt();

            switch (select) {
            case 1:
                addition();
                break;
            case 2:
                subtraction();
                break;
            case 3:
                multiplication();
                break;
            case 4:
                division();
                break;
            case 5:
                exponent();
                break;
            case 6:
                mod();
                break;
            case 7:
                squareRoot();
                break;
            case 8:
                absoluteValue();
                break;
            case 9:
                factorial();
                break;
            case 10:
                derivative();
                break;
            default:
                System.out.println("You entered a wrong value. Please try it again.");
                break;
        }

        }

    }

}

