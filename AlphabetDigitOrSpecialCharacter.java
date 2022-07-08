package JavaProgram;

public class AlphabetDigitOrSpecialCharacter {

	    public static void main(String[] args) {
	    	char k='n';

	         if((k >= 'a' && k <= 'z') || (k >= 'A' && k <= 'Z')) 

	             System.out.println(k+ " is an alphabet");

	        else if( k>= '0' && k<= '9')

	             System.out.println(k+ " is a digit");

	        else

	             System.out.print(k+ " is A special character");
	        }
	    
	    }


