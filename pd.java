import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class pd {
	private String type;
	public pd (String type) {
		this.type=type;
		System.out.println("A pd of type: "+this.type+" has been created.");
	}
	/*orizw enan neo typo ws mia nea klash*/
	public String getType() {return this.type;}
}
class pd_adder_sorter{
	public pd[] add_in_matrix(pd type_to_add,pd[] array) {
		List<pd> list= new ArrayList<pd>() ;
		for(int i=0; i<array.length;i++)list.add(array[i]);
		list.add(type_to_add);
		return list.toArray(new pd[list.size()]);
	}
	public LinkedList<pd> add_in_list(pd[] array){
		LinkedList<pd> my_list=new LinkedList<pd>();
		int i;
		for(i=0;i<array.length;i++)my_list.add(array[i]);
		return my_list;
	}
}