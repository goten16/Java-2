import java.util.*;

public class PresentData {

	public  void presentTable(LinkedList<pd> my_list) {
		//����� set ���� �� ��� ������������ ���� �������� ��� ����� �������� ���� ��� ��� ����
		Set<pd> s = new HashSet<>();
		int i = 0;
		for(pd data : my_list) {
			i++;
			if( i == 1) {
				System.out.println(pd.type);
				System.out.println();
			}
			if(s.add(data) == true)
			System.out.println(data);
		}
	}
}















