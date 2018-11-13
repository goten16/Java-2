import java.util.* ;
public class Menu {
	public void Select() {
		Scanner input = new Scanner(System.in);
		System.out.println("\t \t \t \t << MENU >>");
		System.out.println(" Please type the number of your selection :");
		System.out.println("<1> Enter a new field");
		System.out.println("<2> Data Input");
		System.out.println("<3> Data Presentation");
		System.out.println("<4> Delete data");
		System.out.println("<5> Change Data");
		System.out.println("<6> SAVE");
		System.out.println("<7> EXIT!" );
		int ans = input.nextInt();
		while ( ans < 1 || ans > 7 ) {
			System.out.println("Invalid number, Please try again!");
			ans = input.nextInt();
		}
		switch (ans) {
			case 1: // NEW FIELD
						break;
			case 2:// INPUT
						break;
			case 3:// PRESENT
						break;
			case 4:// DELETE
						break;
			case 5:// CHANGE
						break;
			case 6:// SAVE
						break;
			case 7: exit();
						break;
		}
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