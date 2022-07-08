package JavaProgram;

public class DivisibleOrNot {
		public static void main(String[] args) 
		{
			int num=55;
			if((num % 5 == 0) && (num % 11 == 0))
			{
				System.out.println(num+" is Divisible by 5 and 11"); 
			}
			else
			{
				System.out.println(num+ " is Not Divisible by 5 and 11"); 
			}	
		}
	}
