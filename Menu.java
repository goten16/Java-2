import java.util.* ;
public class Menu {
	public void Select() {
		Scanner input = new Scanner(System.in);
		System.out.println("\t \t \t \t << MENU >>");
		System.out.println(" ��������  ������� ��� ������ ��� �������� ���.");
		System.out.println("<1> ������� ���� ������");
		System.out.println("<2> �������� ���������");
		System.out.println("<3> ���������� ���������");
		System.out.println("<4> �������� ���������");
		System.out.println("<5> ������ ���������");
		System.out.println("<6> ���������� ��������� �� ������");
		System.out.println("<7> ������!" );
		int ans = input.nextInt();
		while ( ans < 1 || ans > 7 ) {
			System.out.println("�� ������ ������� , ����������� ����!");
			ans = input.nextInt();
		}
		//��������� ���� ������� �����
		if (ans == 7) {
			System.out.println(" �����������; \n ������� <0> ��� ��� \n ������� <1> ��� ���" );
			int exit = input.nextInt();
			while (exit != 0 && exit != 1) {
				System.out.println(" �� ������ �������, ����������� ���� ");
				if ( exit == 1) {
					break;
				} else {
					Select();
				}
			}
		}

	}
}