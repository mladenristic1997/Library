package biblioteka_2018_1_24;

public class Book {
	static int takenBooks;
	private int num;
	private String name;
	private boolean taken = false;
	
	public Book(int num, String name) {
		this.num = num;
		this.name = name;
	}
	
	public int getNum() {
		return num;
	}
	
	public String getName() {
		return name;
	}
	
	//If true, book is taken
	public boolean isTaken() {
		return taken;
	}
	
	public void setBookTaken(boolean status) {
		taken = status;
	}
	
	public static void bookTaken() {
		takenBooks++;
	}
	
	public static void bookReturned() {
		takenBooks--;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (num != other.num)
			return false;
		return true;
	}
	
}
