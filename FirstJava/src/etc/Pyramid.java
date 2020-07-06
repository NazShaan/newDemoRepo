package etc;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		
		int row, col, n;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the value of n");
		n = input.nextInt();
		
		for (row = 1; row <=n; row++)
		{
			for (col = 1; col <= n-row; col++)
			{
				System.out.print("   ");
			}
			
			for (col = 1; col <= 2*row-1; col++)
			{
				
				System.out.print(" * ");
				
			}
			System.out.println();
		}
		
		input.close();
	}

}
