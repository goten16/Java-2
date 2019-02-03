import java.util.*;

public class PresentData {

	/**The method tha presents the data of the outer arraylist*/
	public void presentTable(ArrayList<ArrayList<String>> outer) {
		int sum = outer.get(0).size();
		for (int j = 0; j < sum; j++) {
			for (int i = 0; i < outer.size(); i++) {
				System.out.print(outer.get(i).get(j) + "\t");
			}
			System.out.println();
			if (j == 0)
			System.out.println();
		}
		System.out.println();
	}
}


