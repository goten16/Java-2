import java.util.* ;
import java.io.IOException;
import java.io.FileWriter;

public class Menu {

	public static void main(String args[]) {
		Select();
	}
	public static void Select() {
		Scanner input = new Scanner(System.in);
		showOptions();
		int ans = input.nextInt();
		Insert ins = new Insert();
		Set field = new Set();
		PresentData show = new PresentData();
		Delete del = new Delete();
		EditData change = new EditData();
		ArrayList<ArrayList<String>> Mylist = new ArrayList<ArrayList<String>>();
		while ( ans < 1 || ans > 7 ) {
			System.out.println("Invalid number, Please try again!");
			ans = input.nextInt();
		}
		do {
			switch (ans) {
				case 1:		Mylist = new ArrayList<ArrayList<String>>(field.SetFields());
							break;
				case 2:		Mylist = new ArrayList<ArrayList<String>>(ins.InsertData(Mylist));
							break;
				case 3:		show.presentTable(Mylist);
							break;
				case 4:		Mylist = new ArrayList<ArrayList<String>>(del.DeleteData(Mylist));
							break;
				case 5:		Mylist = new ArrayList<ArrayList<String>>(change.doIt(Mylist));
							break;
				case 6:// SAVE
							break;
				case 7: exit();
							break;
			}
			System.out.println("What would you like to do next?");
			ans = input.nextInt();
			while ( ans < 1 || ans > 7 ) {
				System.out.println("Invalid number, Please try again!");
				ans = input.nextInt();
			}
		} while (ans >=1 && ans <= 7);
	}

	//SHOW THE OPTIONS
	public static void showOptions() {
		System.out.println("\t \t \t \t << MENU >>");
		System.out.println(" Please type the number of your selection :");
		System.out.println("<1> Enter a new field");
		System.out.println("<2> Data Input");
		System.out.println("<3> Data Presentation");
		System.out.println("<4> Delete data");
		System.out.println("<5> Edit Data");
		System.out.println("<6> SAVE");
		System.out.println("<7> EXIT!" );
	}


		//EXIT METHOD
		public static void exit() {
			Scanner input = new Scanner(System.in);
			System.out.println(" EXIT; \n PRESS <0> --> NO \n PRESS <1> --> YES" );
			int exit = input.nextInt();
			while (exit != 0 && exit != 1) {
				System.out.println("Invalid number, Please try again! ");
				exit = input.nextInt();
			}
			if ( exit == 1) {
				System.exit(0);
			} else {
					Select();
			}
		}
}