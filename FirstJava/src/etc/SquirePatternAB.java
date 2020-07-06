package etc;

public class SquirePatternAB {

	public static void main(String[] args) {
		
		for(char i = 'A' ; i<'E'; i++)
		{
			for(char j = 'A' ; j<'E'; j++)
			{
				//System.out.print(i+"  "); //to print AAAA
				System.out.print(j+" ");   // to print ABCD
			}
			System.out.println();
		}

	}

}
