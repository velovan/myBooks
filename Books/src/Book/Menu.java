package Book;

import java.util.ArrayList;

public class Menu {

	private String[] menuOptions;
	private String menuOptionsContent;
	private BookList bookList;
	private MovieList movieList;

	public Menu() {
		menuOptions = new String[5];
		bookList = new BookList();
		movieList = new MovieList();
	}

	public String[] createMenuOptions() {
		menuOptions[0] = "help: ";
		menuOptions[1] = "book: ";
		menuOptions[2] = "reserve Book: ";
		menuOptions[3] = "chek: ";
		menuOptions[4] = "movie: ";
		return menuOptions;
	}

	public String listMenuOptionsContent(String[] menuOptions) {
		menuOptionsContent = menuOptions[0] + "  List all menu options\n" + menuOptions[1] + "  View all books\n"
				+ menuOptions[2].substring(0, 7) + " [--bookName]  Reserve one book called bookName\n" + menuOptions[3]
				+ "  Check your library number\n" + menuOptions[4] + "View all movie";
		return menuOptionsContent;
	}

	public String helpPrintContent(String[] menuOptions) {
		String helpPrintContent;
		helpPrintContent = menuOptions[1] + "  View all books\n" + menuOptions[2].substring(0, 7)
				+ " [--bookName]  Reserve one book called bookName\n" + menuOptions[3] + "  Check your library number\n"
				+ menuOptions[4] + "View all movie";
		return helpPrintContent;
	}

	public String printBook(ArrayList<Book> bookList) {
		String books = "";
		for (int i = 0; i < bookList.size(); i++) {
			books += bookList.get(i).getBookName() + " | " + bookList.get(i).getBookStatus() + "\n";
		}
		return books;
	}

	public String printMovie(ArrayList<Movie> movieList) {
		String movies = "";
		for (int i = 0; i < movieList.size(); i++) {
			movies += movieList.get(i).printOneMovie() + "\n";
		}
		return movies;
	}

	public String CheckPrintContent() {
		Information information = new Information();
		return information.getCheckLibNumInformation();
	}

	public String ReserveValidPrintContent() {
		Information information = new Information();
		return information.getValidBookInformation();
	}

	public String ReserveInvalidPrintContent() {
		Information information = new Information();
		return information.getInvalidBookInformation();
	}

	public String SelectInvalidMenuOptionPrintContent() {
		Information information = new Information();
		return information.getInvalidOptionInformation();
	}

	public String choose1(String menuOptions) {
		String menu = "";
		ArrayList<Book> books = bookList.createBookList();
		ArrayList<Movie> movies = movieList.createMovieList();
		if (menuOptions.equals("help")) {
			menu = helpPrintContent(createMenuOptions());
		} else if (menuOptions.equals("book")) {
			menu = printBook(books);
		} else if (menuOptions.matches("reserve\\s(.*)")) {
			for (int i = 0; i < books.size(); i++) {
				if (menuOptions.split("\\s")[1].equals(books.get(i).getBookName())) {
					if (books.get(i).getBookStatus().equals("valid")) {
						menu = ReserveValidPrintContent();
					} else {
						menu = ReserveInvalidPrintContent();
					}
					break;
				} else {
					menu = ReserveInvalidPrintContent();
				}
			}
		} else if (menuOptions.equals("movie")) {
			menu = printMovie(movies);
		} else if (menuOptions.equals("chek")) {
			menu = CheckPrintContent();
		} else {
			menu = SelectInvalidMenuOptionPrintContent();
		}
		
		return menu;
	}

}
