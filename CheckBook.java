package biblioteka_2018_1_24;

import java.util.List;

public class CheckBook {
	
	public static boolean isBookTaken(List<Book> lista, int bookId) {
		return !lista.contains(new Book(bookId, " "));
	}
	
	public static boolean isBookIdValid(int bookId) {
		return bookId > 0;
	}
	
	public static boolean isBookExists (List<Book> lista, int bookID) {
		for(Book book1 : lista)
		{
			if(book1.getNum() == bookID)
				return false; //BookID already exists
		}
		return true; //BookID is free
	}
}
