package JavaProgram;

import java.util.Scanner;
public class BonusWillBeGivenOrNot {
	public static void main(String[] args) {
               int joiningyear,currentyear ,yearofservice;
               Scanner in = new Scanner(System.in);
               System.out.println("Enter the joining year ");
               joiningyear=in.nextInt();
	       System.out.println("Enter the current year "); 
	       currentyear=in.nextInt();
	       yearofservice=currentyear-joiningyear;
		 if(yearofservice>=3) {
			 System.out.println("year of service is "+yearofservice+" years so 2500 will be given to Employee");
		 }
		 else {
			 System.out.println("year of service is "+yearofservice+" year so 2500 will not be given to Employee"); 
		 }
			
		
	}

}

