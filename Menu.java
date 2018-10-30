import java.util.* ;
public class Menu {
	public void Select() {
		Scanner input = new Scanner(System.in);
		System.out.println("\t \t \t \t << MENU >>");
		System.out.println(" Παρακαλώ  πατήστε τον αριθμό της επιλογής σας.");
		System.out.println("<1> Ορισμός νέου πεδίου");
		System.out.println("<2> Εισαγωγή δεδομένων");
		System.out.println("<3> Παρουσίαση δεδομένων");
		System.out.println("<4> Διαγραφή δεδομένων");
		System.out.println("<5> Αλλαγή δεδομένων");
		System.out.println("<6> Αποθήκευση δεδομένων σε αρχείο");
		System.out.println("<7> Έξοδος!" );
		int ans = input.nextInt();
		while ( ans < 1 || ans > 7 ) {
			System.out.println("Μη έγκυρη επιλογή , προσπαθήστε ξανά!");
			ans = input.nextInt();
		}
		//ΠΕΡΙΠΤΩΣΗ ΟΠΟΥ ΘΕΛΟΥΜΕ ΕΞΟΔΟ
		if (ans == 7) {
			System.out.println(" ΤΕΡΜΑΤΙΣΜΟΣ; \n Πατήστε <0> για ΟΧΙ \n Πατήστε <1> για ΝΑΙ" );
			int exit = input.nextInt();
			while (exit != 0 && exit != 1) {
				System.out.println(" Μη έγκυρη επιλογή, προσπαθήστε ξανά ");
				if ( exit == 1) {
					break;
				} else {
					Select();
				}
			}
		}

	}
}