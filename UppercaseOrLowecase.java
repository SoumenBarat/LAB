package JavaProgram;

public class UppercaseOrLowecase {
	public static void main(String[] args) {
		char c='A';
		if(c>='A' && c<='Z') 
			System.out.println(c+" is uppercase");		
		else if(c>='a' && c<='z') 
			System.out.println(c+" is lowercase");
		else
			System.out.println(c+" is not an alphabet");
					
		
	}

}

