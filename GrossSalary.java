package JavaProgram;
import java.util.Scanner;
/*Weite a program to calculate gross salary of an employee.Basic salary
 * should be taken from user.If basic salary is greater than 1500,HRA=20%
 * and DA=90% will be given else HRA=500 and DA=70% given the empliyee.*/
public class GrossSalary{
public static void main(String[] args) {
    int basic;
    float DA,HRA,Gross;
	Scanner sc=new Scanner(System.in);//creating the object of scanner class
	System.out.println("Enter the basic salary:");
	basic=sc.nextInt();//taking input from user
	if(basic>1500){//check the basic is greaterthan 1500 of not
	{
		HRA=(basic*20/100);// calculate HRA
		DA=(basic*90/100);// calculate DA
		Gross=basic+HRA+DA;// calculate Gross Salary
	}
        System.out.println("The Gross Salary is "+Gross);
	}
        else {
        	{
		HRA=500;
	    DA=(basic*70/100);//calculate DA
	    Gross=basic+HRA+DA;// calculate Gross Salary
        }
		System.out.println("The Gross salary of is "+Gross);
        }
     }
}
