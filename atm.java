import java.util.Scanner;
public class atm {
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		String userName, password;
		int right = 3;
		int select = 5;
		int balance = 1500;
		boolean session = true;
		
		while (right > 0){
		
			System.out.print("Enter your name: ");
			userName = input.nextLine();
			
			System.out.print("Enter your password: ");
			password = input.nextLine();
			
			
			if(userName.equals("username") && password.equals("123")){
				System.out.println("Hi, Welcome to the X Bank!");
					
				while(session) {
					System.out.println("1-Withdraw\n" + 
							"2-Deposit\n" + 
							"3-Balance Inquiry\n" + 
							"4-Exit");
					System.out.println("Please choose an option: ");
					
					select = input.nextInt();
					
					switch(select){
						case 1:
							System.out.println("Please enter amount: ");
							int amount = input.nextInt();
							balance += amount;
							System.out.println("Total Balance: " + balance);
							break;
						case 2:
							System.out.println("Please enter amount: ");
							int price = input.nextInt();
							if (price > balance){
								System.out.println("Insufficient balance");
							}else {
								balance -= price;
								System.out.println("Total Balance: " + balance);
							}
							break;
						case 3:
							System.out.println("Total Balance: " + balance);
							break;
						case 4:
							System.out.println("Exit.");
							break;
							//session = false;
						//	right =-1;
						default:
							System.out.print("Please try again");
							session = false;
							break;
					}
				}
				
				
			}
				else {
				right--;
				System.out.println("Incorrect username or password. Please try again!!!");
				if (right == 0){
					System.out.println("You entered your password incorrectly 3 times. Your password has been blocked. Please contact with your bank!!!!");
				}else {
					System.out.println("Your remining entry right: " + right);
				}
			}
		
		}
		
		}

}
