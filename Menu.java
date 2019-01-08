import java.util.*;
import java.io.*;

public class Menu {

	/**Calls the Select Method*/
	public static void main(String args[]) {
		Select();
	}
	/**Main method of the database that lets the user choose what he wants to do*/
	public static void Select() {
		Scanner input = new Scanner(System.in);
		showOptions();
		int ans = input.nextInt();
		Insert ins = new Insert();
		Set field = new Set();
		PresentData show = new PresentData();
		Delete del = new Delete();
		EditData change = new EditData();
		Txt text = new Txt();
		boolean f = false;
		boolean d = false;
		ArrayList<ArrayList<String>> Mylist = new ArrayList<ArrayList<String>>();
		while ( ans < 1 || ans > 7 ) {
			System.out.println("Invalid number, Please try again!");
			ans = input.nextInt();
		}
		do {
			switch (ans) {
				case 1:		Mylist = new ArrayList<ArrayList<String>>(field.SetFields());
							f = true;
							break;
				case 2:		if (f == true) {
								Mylist = new ArrayList<ArrayList<String>>(ins.InsertData(Mylist));
								d = true;
							} else {
								System.out.println("Please insert a field first!!");
							}
							break;
				case 3:		if (d == true) {
								show.presentTable(Mylist);
							} else {
								System.out.println("Please insert data first!!");
							}
							break;
				case 4:		if (d == true) {
								Mylist = new ArrayList<ArrayList<String>>(del.DeleteData(Mylist));
							} else {
								System.out.println("Please insert data first!!");
							}
							break;
				case 5:		if (d == true) {
								Mylist = new ArrayList<ArrayList<String>>(change.doIt(Mylist));
							} else {
								System.out.println("Please insert data first!!");
							}
							break;
				case 6:		if (d == true) {
								try {
									text.createFile(Mylist);
								} catch (IOException e) {
									System.out.println("IOException!");
								}
							} else {
								System.out.println("Please insert data first!!");
							}
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

	/**Shows the options*/
	public static void showOptions() {
		System.out.println("\t \t \t \t << MENU >>");
		System.out.println(" Please type the number of your selection :");
		System.out.println("<1> Enter a New Field");
		System.out.println("<2> Data Input");
		System.out.println("<3> Data Presentation");
		System.out.println("<4> Delete Data");
		System.out.println("<5> Edit Data");
		System.out.println("<6> Save In txt File");
		System.out.println("<7> EXIT!" );
	}

		/**Exits method*/
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