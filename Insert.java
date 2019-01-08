import java.util.*;

public class Insert {

	//Method that inserts the data into the inner arraylists and the returns it
	public ArrayList<ArrayList<String>> InsertData(ArrayList<ArrayList<String>> outer) {
		Scanner s = new Scanner(System.in);
		ArrayList<ArrayList<String>> list = new ArrayList<ArrayList<String>>(outer);
		String data;
		int ans1;
		int ans2;
		System.out.println("Please insert the position of the field which you would like to insert data into: ");
		ans1 = s.nextInt();
		while (ans1 > list.size()) {
			System.out.println("There is not a field in this position");
			ans1 = s.nextInt();
		}
		/*The loop is for the number of data the user wants
		to insert in the certain field he typed before*/
		do {
			System.out.println("Please insert data for the specific field: ");
			data = s.next();
			list.get(ans1).add(data);
			System.out.println("Would you like to insert more data: \n1.Yes\n2.No ");
			ans2 = s.nextInt();
		} while (ans2 == 1);
		return list;
	}
}






