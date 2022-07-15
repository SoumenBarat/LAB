package JavaProgram;
/*print the pattern
 * 1
 * 12
 * 123
 * 1234
 * 12345
 */
public class Pattern1to5 {
	public static void main(String[] args) {
		int i,j,n;
		
		for(i=1;i<=5;i++)//external loop
		 {
			for(j=1;j<=i;j++)//internal loop
			{
				System.out.print(j);//print the value of j
			}
			System.out.println();//print the next row
		}
	}
	

}

