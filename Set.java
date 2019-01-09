import java.util.*;

public class Set {
	/**The method returns the outer arraylist that contains the other arraylists*/
	public ArrayList<ArrayList<String>> SetFields() {

		boolean loop = true;
		/**The first field must be inserted at any rate*/
		System.out.println("Insert a field: ");
		ArrayList<ArrayList<String>> outer = new ArrayList<ArrayList<String>>();
		ArrayList<String> inner = new ArrayList<String>();
		Scanner s = new Scanner(System.in);
		String field = s.nextLine();
		inner.add(field);
		outer.add(inner);
		int k;
		/**While the user wants to enter new fields the loop will continue to run,
		it will stop when the loop variable becomes false*/
		do {
			System.out.println("Would you like to insert another field: 1.Yes\n2.No");
			k = s.nextInt();
			if (k == 1) {
				System.out.println("Insert field's data: ");
				inner = new ArrayList<String>();
				field=s.nextLine();
				inner.add(field);
				outer.add(inner);
			} else {
				loop = false;
			}
		} while(loop == true);
		System.out.println("Field insertion stopped");
		return outer;
	}
}