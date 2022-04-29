import java.util.Scanner;

public class Login {
	public static void main(String[] args) {
		
		String userName, password;
		int select = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your Username: ");
		//username = username
		userName = input.nextLine();
		
		System.out.print("Enter your Password: ");
		//password = 12345
		password = input.nextLine();
		
		if (userName.equals("username") && password.equals("12345")) {
			System.out.println("The login is successfully.");			
		}else if (!userName.equals("username")) {
			System.out.print("The username is wrong. Please try it again.");
		}else {
			System.out.println("The password is wrong. Please try it again.");
			System.out.println("Do you want to change your password?");
			System.out.println("1-I want to change my password.\n2-I don't want to change my password.");
			System.out.print("Choose your option: ");
			//System.out.print(select);
			select = input.nextInt();
			System.out.print(select);
		}


		String newPass;
		
		switch(select) {
			case 1:
				System.out.print("Please enter your new password: ");
				newPass = input.nextLine();
				input.nextLine();
			//	System.out.print(newPass);
				
				if (newPass.equals("12345")) {
					System.out.println("Please enter another password.");
				}
				else {
					System.out.println("Your new password is created.");
				}
			break;
			
			case 2:
				System.out.println("I don't want to change my password.");
			break;
			
			default:
				System.out.println("Unsuccessul Login");
			break;
		}
		
	}

}

