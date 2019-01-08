import java.util.*;

public class PresentData {

	/**The method tha presents the data of the outer arraylist*/
	public void presentTable(ArrayList<ArrayList<String>> outer) {
		for (int i = 0; i < outer.size(); i++) {
			for (int j = 0; j < outer.get(i).size(); j++) {
				System.out.println(outer.get(i).get(j));
				if (j == 0 || j == outer.get(i).size() - 1) {
					System.out.println();
				}
			}
		}
	}
}
