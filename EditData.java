import java.util.*;

public class EditData {

	/**The method that materializes the data's change*/
	public ArrayList<ArrayList<String>> doIt(ArrayList<ArrayList<String>> outer) {
		Scanner s = new Scanner(System.in);
		PresentData present = new PresentData();
		present.presentTable(outer);
		int choice = menuOfChoices();
		ArrayList<ArrayList<String>> list = new ArrayList<ArrayList<String>>(outer);
		switch (choice) {
			case 1:
				list = new ArrayList<ArrayList<String>>(changeSPD(list));
				break;
			case 2:
				list = new ArrayList<ArrayList<String>>(changeField(list));
				break;
			case 3:
				list = new ArrayList<ArrayList<String>>(changeItem(list));
				break;
		}
		return list;
	}

	/**Choose what I want from the menu*/
	public int menuOfChoices() {
		Scanner s = new Scanner(System.in);
		System.out.println("What would you like to edit?");
		System.out.println("Menu:");
		System.out.println("Option 1: Edit a specific position's data");
		System.out.println("Option 2: Edit a field");
		System.out.println("Option 3: Edit a data item");
		int theChoice = s.nextInt();
		return theChoice ;
	}

	/**Option 1: Edit a specific position's data*/
	public ArrayList<ArrayList<String>> changeSPD(ArrayList<ArrayList<String>> outer) {
		Scanner s = new Scanner(System.in);
		System.out.println("What's the position of the data you would like to edit?");
		int pos = s.nextInt();
		String data;
		ArrayList<ArrayList<String>> list1 = new ArrayList<ArrayList<String>>(outer);
		for(int i=0; i<list1.size() ; i++) {
			ArrayList<String> inner = new ArrayList<String>(outer.get(i));
			if (pos<inner.size()) {
				System.out.printf("Please give the new %s you want to add. " , inner.get(0));
				data = s.next();
				inner.set(pos,data);
				list1.get(i).clear();
				list1.set(i,inner);
			}
		}
		return list1;
	}

	/**Option 2: Edit a field*/
	public ArrayList<ArrayList<String>> changeField(ArrayList<ArrayList<String>> outer) {
		Scanner s = new Scanner(System.in);
		System.out.println("Which field would you like to change?");
		int pos = s.nextInt();
		String data;
		ArrayList<ArrayList<String>> list2 = new ArrayList<ArrayList<String>>(outer);
		ArrayList<String> inner = new ArrayList<String>(list2.get(pos-1));
		int k = inner.size();
		System.out.println(k);
		for(int i=1; i < k ; i++) {
			System.out.printf("Please insert the data for position No.%d?\n", i);
			data = s.next();
			inner.set(i,data);
		}
		outer.set(pos,inner);
		return list2;
	}

	/**Option 3: Edit a data item*/
	public ArrayList<ArrayList<String>> changeItem(ArrayList<ArrayList<String>> outer) {
		Scanner s = new Scanner(System.in);
		System.out.println("Which specific data would you like to change? Please type the position of the field and position of the data");
		int posf = s.nextInt();
		int pos = s.nextInt();
		String data;
		ArrayList<ArrayList<String>> list3 = new ArrayList<ArrayList<String>>(outer);
		ArrayList<String> inner = new ArrayList<String>(list3.get(posf-1));
		System.out.printf("Please insert the data");
		System.out.println();
		data = s.next();
	    inner.set(pos,data);
	    outer.set(posf-1,inner);
		return list3;
	}

}
