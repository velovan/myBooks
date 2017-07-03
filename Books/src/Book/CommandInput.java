package Book;

import java.util.*;

public class CommandInput {

	public String readInput() {
		String res = "";
		Scanner sc = new Scanner(System.in);
		if (sc.hasNext()) {
			res = sc.nextLine();
		}
		return res;
	}

}