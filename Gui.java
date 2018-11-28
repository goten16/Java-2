import javax.swing.JFrame;
import java.awt.*;

public class Gui {

	public static void main(String[] args) {
		Menu menu = new Menu();
		menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		menu.setSize(600,400);
		menu.setVisible(true);
		menu.setLocationRelativeTo(null);

	}

}
