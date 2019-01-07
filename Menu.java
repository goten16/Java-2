import java.util.* ;
public class Menu {
	public void Select() {
		Scanner input = new Scanner(System.in);
		showOptions();
		int ans = input.nextInt();
		while ( ans < 1 || ans > 7 ) {
			System.out.println("Invalid number, Please try again!");
			ans = input.nextInt();
		}
		Insert input = new Insert();
		Set field = new Set();

		switch (ans) {
			case 1:
						ArrayList<ArrayList<String>> DataFields = field.SetFields();
						break;
			case 2:		ArrayList<ArrayList<String>> DataInserts = input.InsertData(DataFields);
						break;
			case 3:		PresentData show = new PresentData(DataInserts);
						break;
			case 4:		DeleteData delete = new DeleteData(DataInserts);
						break;
			case 5:		ChangeData change = new ChangeData(DataInserts);
						break;
			case 6:// SAVE
						break;
			case 7: exit();
						break;
		}
	}
	//SHOW THE OPTIONS
	public void showOptions() {
		System.out.println("\t \t \t \t << MENU >>");
		System.out.println(" Please type the number of your selection :");
		System.out.println("<1> Enter a new field");
		System.out.println("<2> Data Input");
		System.out.println("<3> Data Presentation");
		System.out.println("<4> Delete data");
		System.out.println("<5> Change Data");
		System.out.println("<6> SAVE");
		System.out.println("<7> EXIT!" );
	}

		//EXIT METHOD
		public  void exit() {
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