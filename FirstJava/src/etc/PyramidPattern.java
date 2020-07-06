package etc;

import java.util.Scanner;

public class PyramidPattern {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int row, col, n;
		System.out.print("Please enter the value of n\n");
		n = input.nextInt();
		
		for (row =  1; row<=n; row++)
		{
			for (col = 1; col <=n-row; col++)
			{
				System.out.print("   ");
			}
			for(col = 1; col<=row; col++)
			{
				System.out.print(" * ");
			}
			System.out.println();
		}
	input.close();
	}
	
	

}
