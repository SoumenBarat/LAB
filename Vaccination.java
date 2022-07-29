/*create abstract class vaccine.create 2 concrete method firstDose() and 2ndDose().
Scenario 1:user can take first dose if user is Indian and age is 18.after vaccination user has to pay 250rs. 
Scenario 2: user can take 2nd dose if already the first dose has completed.
Scenario 3: create abstract method boosterDose() in abstract class Vaccine.create one implementation class vaccinationSuccessful where implement boosterDose() method.
Create main class vaccination and invoke all methods accord*/

package Abstractiondemo;
 import java.util.Scanner;
	abstract class Vaccine {  //creating abstract class
	public void firstdose() {  //concrete method and body
		int age;
		int amount;
		String nationality;
		
		Scanner sc=new Scanner(System.in);//creating object for user input
		System.out.println("Enter your age:");
		age=sc.nextInt();
		System.out.println("Enter your nationality:");
		nationality=sc.next();
		 if(age>=18 && nationality.equals("Indian"))  //checking condition
		 {
			   System.out.println("user can take first dose ");
		 }

			else
			{
				System.out.println("user can't take first dose");
				System.exit(0);
			}
		       System.out.println("Enter your amount:");
		        amount=sc.nextInt(); 
			    if(amount>=250)
			    {
				 System.out.println("you have payed 250"
						    +'\n'+"vaccination successful");
		        }
			    
			    else
			    {
				System.out.println("please pay 250");
				System.exit(0);
			    }
	}
		void seconddose(){  //concrete method and body
			System.out.println("you are eligible to take seconddose");
			int choice;
			Scanner sc=new Scanner(System.in); //creating object for use input
			System.out.println("please press 1 to take seconddose");
			choice=sc.nextInt();
			if (choice==1) //checking condition
			{
			 System.out.println("Vaccination Successful");
			}
			else {
				System.out.println("Wrong choice");
				System.exit(0);
			}
			
		}
		
			abstract void boosterdose();  //creating abstract method
	}
		class Finaldose extends Vaccine
		{
			public void boosterdose()
			{
				System.out.println("Now you are eligible to take boosterdose");
			}
		}

	
public class Vaccination {
	public static void main(String[] args) {
		Finaldose v=new Finaldose(); //creating object 
		v.firstdose();  // calling firstdose method with ref variable
		v.seconddose();  // calling seconddose method with ref variable
		v.boosterdose();  // calling boosterdose method with ref variable
	}
}
	