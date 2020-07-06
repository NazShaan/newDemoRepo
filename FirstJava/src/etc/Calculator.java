package etc;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		float a, b, res;
		char choice;
		Scanner scan = new Scanner(System.in);
		
		do {
				System.out.println("1. Enter 1 for Addition");
				System.out.println("2. Enter 2 for Substraction");
				System.out.println("3. Enter 3 for Multipication");
				System.out.println("4. Enter 4 for Division");
				System.out.println("5. Enter 5 for Exit");
				System.out.print("Enter your choice");
				choice = scan.next().charAt(0);
				
				switch (choice) 
				{
				case '1': 
					System.out.println("Enter the first number \n");
					a = scan.nextFloat();
					System.out.println("Enter your second number \n");
					b = scan.nextFloat();
					res = a+b;
					System.out.println("Addition of 2 given numbers is  : "+res);
					
					break;
				
				case '2': 
					System.out.println("Enter the first number \n");
					a = scan.nextFloat();
					System.out.println("Enter your second number \n");
					b = scan.nextFloat();
					res = a-b;
					System.out.println("Substraction of 2 given numbers is  : "+res);
					
					break;
				case '3': 
					System.out.println("Enter the first number \n");
					a = scan.nextFloat();
					System.out.println("Enter your second number \n");
					b = scan.nextFloat();
					res = a*b;
					System.out.println("Multipication of 2 given numbers is  : "+res);
					
					break;
				case '4': 
					System.out.println("Enter the first number \n");
					a = scan.nextFloat();
					System.out.println("Enter your second number \n");
					b = scan.nextFloat();
					res = a/b;
					System.out.println("Division of 2 given numbers is  : "+res);
					
					break;
				case '5':
					System.out.println("Good bye!");
					System.exit(0);
				default:
					System.out.println("Opps!! Wrong choice, Try again");
					break;
				}
			System.out.println("\n-------------------------------------------------\n");
		} while ( choice  != 5);
		
		
		scan.close();
	}

}
