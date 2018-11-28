import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Menu extends JFrame {
	private JLabel choose;
	private JButton field;
	private JButton input;
	private JButton show;
	private JButton delete;
	private JButton change;
	private JButton save;
	
	public Menu() {
		super("MENU");
		setLayout(new FlowLayout(FlowLayout.CENTER,30,20) );
		choose = new JLabel("Make your selection:");
		choose.setToolTipText("Click one of the following Buttons");
		add(choose);
		
		field = new JButton("Enter a new field");
		input = new JButton("Insert Data");
		show = new JButton("Data Presentasion");
		delete = new JButton("Delete Data");
		change = new JButton("Change Data");
		save = new JButton ("SAVE");
		add(field);
		add(input);
		add(show);
		add(delete);
		add(change);
		add(save);
		
	}

}
