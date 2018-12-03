import java.util.*;

public class PresentData {

	public  void presentTable(LinkedList<pd> my_list) {
		//χρηση set ωστε να μην εμφανιζονται ιδια δεδομενα που εχουν εισαχθει πανω απο μια φορα
		Set<pd> s = new HashSet<>();
		int i = 0;
		for(pd data : my_list) {
			i++;
			if( i == 1) {
				System.out.println(data.getType());
				System.out.println();
			}
			if(s.add(data) == true)
			System.out.println(data);
			System.out.println(pd.type);
		}
	}
}











