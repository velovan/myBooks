package Book;

import java.util.ArrayList;

public class BookList {

	private ArrayList<Book> bookList;

	public BookList() {
		
	     bookList = new ArrayList<Book>();
	}

	public ArrayList<Book> createBookList() {
	     bookList.add(new Book("The_Hobbit", "valid"));
	     bookList.add(new Book("Anne_of_Green_Gables", "valid"));
	     bookList.add(new Book("Le_Petit_Prince", "valid"));
	     bookList.add(new Book("The_Eagle_Has_Landed", "valid"));
	     bookList.add(new Book("Magic_Tree_House_series", "valid"));
	     bookList.add(new Book("The_Catcher_in_the_Rye", "invalid"));
	     bookList.add(new Book("Tarzan", "invalid"));

	     return bookList;
	}

	public String getEachBookName(int n) {
	     return bookList.get(n).getBookName();
	}

	public String getEachBookStatus(int s) {
	     return bookList.get(s).getBookStatus();
	}

}
