import java.util.*;

public class Insert <T> {

	//������ �� ������ ���� �������� ����� �� �������
	public static int HowMany() {
		Scanner input = new Scanner(System.in);
		System.out.println("How many data would you like to insert?");
		int x = input.nextInt();
		return x;
	}



	/*�������� ��������� ��� �� ������ ��� �������� ���� �� ��� LinkedList,�� ������ x
	��� ������ ��� ��������� ��� �� HowMany*/
	public static LinkedList<String> DataInput(int x) {
		Scanner input = new Scanner(System.in);
		String data;
		String[] array1 = new String[x];
		LinkedList<String> list = new LinkedList<String>();
		for(int i=0; i < x;i++) {
			System.out.printf("Please insert the data for position No.%d?\n", i+1);
			data = input.nextLine();
			array1[i] = data;
		}
		for (int y = 0; y < array1.length; y++){
			list.add(y, array1[y]);
		}
		return list;
	}
}


