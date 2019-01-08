import java.util.*;

public class EditData {

	//The method that materializes the data's change
	public ArrayList<ArrayList<String>> doIt(ArrayList<ArrayList<String>> outer) {
		Scanner s = new Scanner(System.in);
		PresentData present = new PresentData();
		present.presentTable();
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

	//Choose what I want from the menu
	public int menuOfChoices() {

		Scanner s = new Scanner(System.in);

		System.out.println("WHAT WOULD YOU LIKE TO DO?");
		System.out.println("MENU OF CHOICES:");
		System.out.println("CHOICE 1: CHANGE A SPECIFIC POSITION'S DATA");
		System.out.println("CHOICE 2: CHANGE A FIELD");
		System.out.println("CHOICE 3: CHANGE A DATA ITEM");

		int theChoice = s.nextInt();
		return theChoice ;

	}


	//Choise 1: Change a line
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
				data = s.nextLine();
				inner.set(pos,data);
				list1.get(i).clear();
				list1.set(i,inner);
			}
		}
		return list1;
	}


	//Choise 2: Change a column
	public ArrayList<ArrayList<String>> changeField(ArrayList<ArrayList<String>> outer) {
		Scanner s = new Scanner(System.in);
		System.out.println("Which field would you like to change?");
		int pos = s.nextInt();
		String data;
		ArrayList<ArrayList<String>> list2 = new ArrayList<ArrayList<String>>(outer);
		ArrayList<String> inner = new ArrayList<String>(list2.get(pos));
		for(int i=0; i<inner.size() ; i++) {
			System.out.printf("Please insert the data for position No.%d?\n", i+1);
			data = s.nextLine();
			inner.add(data);
		}
		outer.set(pos,inner);
		return list2;
	}


	//Choise 3: Change a data item
	public ArrayList<ArrayList<String>> changeItem(ArrayList<ArrayList<String>> outer) {
		Scanner s = new Scanner(System.in);
		System.out.println("Which specific data would you like to change? Please type the position of the field and position of the data");
		int posf = s.nextInt();
		int pos = s.nextInt();
		String data;
		ArrayList<ArrayList<String>> list3 = new ArrayList<ArrayList<String>>(outer);
		ArrayList<String> inner = new ArrayList<String>(list3.get(posf));
		System.out.printf("Please insert the data");
		data = s.nextLine();
	    inner.set(pos,data);
	    outer.set(posf,inner);
		return list3;
	}

}
