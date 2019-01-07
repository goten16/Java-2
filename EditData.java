import java.util.*;

public class EditData {

	private int Line;
	private int Column;
	public EditData() {}

	/*
				//Takes the line I want to change
				private void setLine(int newLine) {
					Line = newLine;
				}
				//Returns the line I want to change
				private int getLine() {
					return Line;
				}
			
				//Takes the column I want to change
				private void setColumn(int newColumn) {
					Column = newColumn;
				}
				//Returns the column I want to change
				private int getColumn() {
					return Column;
				}                                               */

	
	private ArrayList<ArrayList<String>> outer = new ArrayList<ArrayList<String>>();

	    
	//The method that materializes the data's change
	public String doIt() {
		Scanner s = new Scanner(System.in);
		PresentData present = new PresentData
		present.presentTable()
		String choice = editD.menuOfChoices;
		switch (choice) {
			case '1' :
				System.out.println("Please insert the Line number you want to change.");
				Line = s.nextInt();
				editD.changeLine();
				break;
			case '2' :
				System.out.println("Please insert the Coloumn number you want to change.");
				Column = s.nextInt();
				editD.changeColumn();
				break;
			case '3' :
				System.out.println("Please first insert the Line number where is the object you want to change.");
				Line = s.nextInt();
				System.out.println("Now insert the Coloumn number");
				Coloumn = s.nextInt();
				editD.changeItem();
				break;
		}

		//probolh olon ton stoixeion toy pinaka , olon ton dedomeon
	}

	
	//Choose what I want from the menu
	public String menuOfChoices() {

		Scanner input = new Scanner(System.in);

		System.out.println("WHAT WOULD YOU LIKE TO DO?");
		System.out.println("MENU OF CHOICES:");
		System.out.println("CHOICE 1: CHANGE A LINE");
		System.out.println("CHOICE 2: CHANGE A COLUMN");
		System.out.println("CHOICE 3: CHANGE A DATA ITEM");    // PI8ANH ALLAGH ONOMATOS

		String theChoice = input.nextLine();
		return theChoice ;

	}

	
	//Choise 1: Change a line
	public ArrayList<ArrayList<String>> changeLine(ArrayList<ArrayList<String>> outer) {
		Scanner s = new Scanner(System.in);
		String data;
		for(int i=0; i<outer.size() ; i++) {
			ArrayList<String> inner = new ArrayList<String>(outer.get(i));
			if (Line<inner.size()) {
				System.out.printf("Please give the new %s you want to add. " , inner.get(0));
				data = s.nextLine();
				inner.set(Line,data);	
				outer.get(i).clear();
				outer.set(i,inner);
			} 
		}
		return outer;
	}

	
	//Choise 2: Change a column
	public ArrayList<ArrayList<String>> changeColumn(ArrayList<ArrayList<String>> outer) {
		Scanner s = new Scanner(System.in);
		String data;
		outer.get(Column).clear();
		ArrayList<String> inner = new ArrayList<String>(outer.get(Column));
		for(int i=0; i<inner.size() ; i++) {
			System.out.printf("Please insert the data for position No.%d?\n", i+1);
			data = s.nextLine();
			inner.add(data);	
		}
		outer.set(Column,inner);
		return outer;
	}
	
	
	//Choise 3: Change a data item
	public ArrayList<ArrayList<String>> changeItem(ArrayList<ArrayList<String>> outer) {
		Scanner s = new Scanner(System.in);
		String data;
		ArrayList<String> inner = new ArrayList<String>(outer.get(Column));
		System.out.printf("Please insert the data");
		data = s.nextLine();	
	    inner.set(Line,data);
	    outer.set(Coloumn,inner);
		return outer;
	}
	
}




/*  CHANGE COLOUMN

    Scanner s = new Scanner(System.in);
	String data;
	for(int i=0; i<outer.size() ; i++) {
	ArrayList<String> inner = new ArrayList<String>(outer.get(i));
		if (Line<inner.size()) {
			//IF ARRAY SIZE>LINE
			System.out.printf("Please give the new %s you want to add. " , inner.get(0));
			data = s.nextLine();
			inner.set(Line,data);
			outer.get(i).clear();
			outer.set(i,inner);
		}else {
			//IF ARRAY SIZE<LINE
			System.out.println("There is no object in this Column. Do you want to add one?");
			System.out.println("1.YES \n 2.NO \n");
			int ans = s.nextInt();
			if(ans==1){
				int size = inner.size();
				for(int j=size;j<Line;j++){
					inner.add(null);
				}
				System.out.printf("Please give the new %s you want to add. " , inner.get(0));
				data = s.nextLine();
				inner.set(Line,data);
				outer.get(i).clear();
				outer.set(i,inner);
			}
		}
	}
	return outer;  
	
*/
