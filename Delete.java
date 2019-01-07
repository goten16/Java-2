import java.util.*;

public class Delete {

	private int line;
	private int column;
	private String name;
	private ArrayList<ArrayList<String>> outer = new ArrayList<ArrayList<String>>();

	public String act() {
			Scanner s = new Scanner(System.in);
			String choice = removeD.menu();
			switch (choice) {
				case '1' :
					System.out.println("Please insert the line number you want to delete.");
					Line = s.nextInt();
					removeD.removeLine();
					break;
				case '2' :
					System.out.println("Please insert the Coloumn number you want to delete.");
					Column = s.nextInt();
					removeD.removeColumn();
					break;
				case '3' :
					System.out.println("Please first insert the Line number where is the object you want to delete.");
					Line = s.nextInt();
					System.out.println("Now insert the Column number");
					Column = s.nextInt();
					removeD.removeItem();
					break;
		}
	}

	public String menu() {
			Scanner input = new Scanner(System.in);
			System.out.println("What would you like to delete?");
			System.out.println("Menu:");
			System.out.println("Option 1: Delete line");
			System.out.println("Option 2: Delete column");
			System.out.println("Option 3: Delete a data item");
			String choice = input.nextLine();
			return choice;
	}

	public ArrayList<ArrayList<String>> removeLine(ArrayList<ArrayList<String>> outer) {
			Scanner s = new Scanner(System.in);
			String data;
			for (int i = 0; i < outer.size(); i++) {
				ArrayList<String> inner = new ArrayList<String>(outer.get(i));
				if (Line < inner.size()) {
					inner.remove(Line);
				}
			}
			return outer;
	}

	public ArrayList<ArrayList<String>> removeColumn(ArrayList<ArrayList<String>> outer) {
			Scanner s = new Scanner(System.in);
			String data;
			outer.get(Column).clear();
			ArrayList<String> inner = new ArrayList<String>(outer.get(Column));
			for(int i = 0; i < inner.size(); i++) {
				inner.remove(Column);
			}
			outer.remove(Column, inner);
			return outer;
	}

	public ArrayList<ArrayList<String>> removeItem(ArrayList<ArrayList<String>> outer) {
			Scanner s = new Scanner(System.in);
			String data;
			ArrayList<String> inner = new ArrayList<String>(outer.get(Column));
			data = s.nextLine();
		    inner.remove(Line,data);
		    outer.remove(Column,inner);
			return outer;
	}
}