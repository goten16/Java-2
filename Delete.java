import java.util.*;

public class Delete {

	public ArrayList<ArrayList<String>> DeleteData(ArrayList<ArrayList<String>> outer) {
		Scanner s = new Scanner(System.in);
		System.out.println("What would you like to delete?");
		System.out.println("Menu:");
		System.out.println("Option 1: Delete data from the same position of each field");
		System.out.println("Option 2: Delete entire field");
		System.out.println("Option 3: Delete a data item");
		int choice = s.nextInt();
		ArrayList<ArrayList<String>> list = new ArrayList<ArrayList<String>>(outer);
		switch (choice) {
			case 1:
				list = new ArrayList<ArrayList<String>>(removeDOF(list));
				break;
			case 2:
				list = new ArrayList<ArrayList<String>>(removeField(list));
				break;
			case 3:
				list = new ArrayList<ArrayList<String>>(removeItem(list));
				break;
			}
		return list;
	}

	public ArrayList<ArrayList<String>> removeDOF(ArrayList<ArrayList<String>> outer) {
				Scanner s = new Scanner(System.in);
				System.out.println("What's the position of the data you would like to delete?");
				int pos = s.nextInt();
				ArrayList<ArrayList<String>> list1 = new ArrayList<ArrayList<String>>(outer);
				for (int i = 0; i < list1.size(); i++) {
					list1.get(i).remove(pos-1);
				}
				return list1;
		}

		public ArrayList<ArrayList<String>> removeField(ArrayList<ArrayList<String>> outer) {
				Scanner s = new Scanner(System.in);
				System.out.println("Which field would you like to delete?");
				int choice = s.nextInt();
				ArrayList<ArrayList<String>> list2 = new ArrayList<ArrayList<String>>(outer);
				list2.get(choice-1).clear();
				return list2;
		}

		public ArrayList<ArrayList<String>> removeItem(ArrayList<ArrayList<String>> outer) {
				Scanner s = new Scanner(System.in);
				System.out.println("Which specific data would you like to delete? Please type the position of the field and position of the data");
				int posf = s.nextInt();
				int pos = s.nextInt();
				ArrayList<ArrayList<String>> list3 = new ArrayList<ArrayList<String>>(outer);
				list3.get(posf-1).remove(pos-1);
				return list3;
		}
}