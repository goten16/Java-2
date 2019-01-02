import java.util.*;

public class Insert {

	//Method that inserts the data into the inner arraylists and the returns it
	public ArrayList<ArrayList<String>> InsertData(ArrayList<ArrayList<String>> outer) {
		Scanner s = new Scanner(System.in);
		String field;
		String data;
		boolean b1;
		int i;
		int ans1;
		int ans2;

		//The first loop is for how many fields the user wants to insert data into
		do{
			b1 = false;
			i=-1;
			/*The second is for the program to see if there is the name
				of the field in the arraylist and then take the number of its position*/

			do {
				System.out.println("Please type the field name of the data you would like to insert: ");
				field = s.nextLine();

				/*The third looks in the arraylist until it finds the name
				of the field or the counter becomes greater than the arraylist size*/
				do {
					i++;
					if (outer.get(i).get(i) == field) {
						b1 = true;
					}
				} while(b1 = false || i<outer.size());
				if (b1 = false) {
					i = -1;
					System.out.println("Field name not found! Please try again.");
				} else {
					System.out.println("Field name found!");
				}
			} while(b1 == false);

			/*The fourth is for the number of data the user wants
			to insert in the certain field he typed before*/
			do {
				System.out.println("Please insert data for the certain field: ");
				data = s.nextLine();
				outer.get(i).add(data);
				System.out.println("Would you like to insert more data: 1.Yes\n2.No ");
				ans2 = s.nextInt();
			} while (ans2 == 1);
			System.out.println("Would you like to insert data for another field: 1.Yes\n2.No ");
			ans1= s.nextInt();
		} while (ans1 == 1);
		return outer;
	}
}






