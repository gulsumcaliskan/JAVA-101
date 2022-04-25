import java.util.Scanner;

public class PalindromeNumber {
    
    static boolean isPalindrome (int a) {
            int temp = a, reverseNumber = 0, lastNumber; 
            while(temp != 0){
                lastNumber = temp % 10;
                reverseNumber = (reverseNumber * 10) + lastNumber;
                temp /= 10;
            }
            
            if(a == reverseNumber){
                return true;
            }else {
                return false;
            }
            
        }
    
    public static void main(String[] args) {
        
        int num;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please, enter a number: ");
        num = input.nextInt();
        
        
        if(isPalindrom(num)){
            System.out.println(num + " is a Palindrome Number.");
        }else {
            System.out.println(num + " is not a Palindrome Number.");
        }
//        System.out.print(isPalindrome(num));
        
    }
}
