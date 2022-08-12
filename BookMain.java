package booksystem;
import java.util.Scanner;
public class BookMain {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch;
		Scanner sc=new Scanner(System.in);
		BookService bservice=new BookService();
		System.out.println("//Welcome to book service system//");
		System.out.println("================================");
		do {
		System.out.println("Press1.Create Book\nPress2.To get book details by id"
				+ "\nPress3.To get all the book details\nPress4.For update book details by id\nPress5.Quit");
		System.out.println("================================");
		System.out.println("Enter your choice");
		ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			
			bservice.createBook();
			break;
		case 2:
			BookService.SreachById();
			break;
		case 3:
			BookService.getAllBookDetails();
			break;
		case 4:
			BookService.updateBookById();
			break;
		case 5:
			System.exit(0);
		
		}
		System.out.println("Thanks for visit us");
		}while(true);
		
		
		
	}
}

