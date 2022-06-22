package Book;

public class Init{

	public void initOutput(){
	     Information info = new Information();
	     Menu menu = new Menu();
	     String[] createMenu = menu.createMenuOptions();
	     String listMenu = menu.listMenuOptionsContent(createMenu);
	     String output = info.getWelcomeInformation() + "\n"  + listMenu;
	     System.out.println(output);
	}
	
}
