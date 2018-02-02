package biblioteka_2018_1_24;

import java.util.ArrayList;

public class Account {

	private ArrayList<Book> booksTaken = new ArrayList<>();
	private int num;
	private String name;

	public Account(int num, String name) {
		this.num = num;
		this.name = name;
	}
	
	public void addBookToAccount(Book book) {
		booksTaken.add(book);
		book.setBookTaken(true);
	}
	
	public Book returnBook(Book book) {
		booksTaken.remove(book);
		book.setBookTaken(false);
		return book;
	}
	
	public int getNum() {
		return num;
	}
	
	public int getNumOfBooksTaken() {
		return booksTaken.size();
	}

	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append(this.name + "\n");
		for(Book book : booksTaken)
		{
			buffer.append(book.getName());
			buffer.append("\n");
		}
		return buffer.toString();
	}

}
