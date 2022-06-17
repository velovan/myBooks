package Book;

public class Main {

	public static void main(String[] args){
		Init init = new Init();
		init.initOutput();
		while(true){
		   CommandInput comm = new CommandInput();
		   Menu menu = new Menu();
		   String input = comm.readInput();
		   String output = menu.choose1(input);
		   System.out.println(output);
		}
	}
	

}
