package biblioteka_2018_1_24;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Library {
	static List<Book> books = Arrays.asList(new Book(0, "Java"), new Book(1, "Eclipse"), new Book(2, "C"));
	static ArrayList<Account> users = new ArrayList<Account>();
	
	public static void main(String[] args) {

		
		//Testiranje
		if(canMakeAccount(0, "Mladen") == true)
		{
			Account ac = new Account(0, "Mladen");
			users.add(ac);
		}
		else
			System.out.println("Account couldn't be created");
		
		//Hoćemo knjigu sa id 0
		if(!CheckBook.isBookTaken(books, 0) &&
				CheckAccount.CheckAccountExists(users, 0) && !CheckAccount.isOverLimit(users, 0))
		{
			Book book = null;
			for(Book bk : books)
			{
				if(bk.getNum() == 0) //ne mora biti nula, ovo je proizvoljno
				{
					book = bk;
					break;
				}
			}
			users.get(0).addBookToAccount(book);
		}
		
		
		
	}
	
	private static boolean canMakeAccount(int num, String name) {
		if(CheckAccount.isUserIDValid(num) && !CheckAccount.CheckAccountExists(users, num))
			return true;
		else return false;
	}
}
