package JavaProgram;
import java.util.Scanner;
/*Create a bank class to calculate eithdraw and diposite.if amount will be given from user.
 *if amount is sufficient then"withdraw successful" will going to print.
 *Later on diposit 5000rs in the account balance.
 */
public class Bank {
		public static void main(String[] args) {
		    int amount,balance=30000;
			Scanner sc=new Scanner(System.in);//creating the object of scanner class
			System.out.println("Enter the amount :");
			amount=sc.nextInt();//taking input from user
			if(amount<=balance)//checking amount is greater than balance or not
			{
				System.out.println("Withdraw Successful");
			}
			else
			   System.out.println("deposit "+(amount-30000)+"rs in the account balance");
			}
	}



