package MainPanel;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTable;

import dosql.Select_Join_Team;

public class Want_Join extends JPanel {
	private JTable table;

	/**
	 * Create the panel.
	 */
	public Want_Join(String s) {
		setLayout(new BorderLayout(0, 0));
		
		
		String[] title={"Stu ID","Self_Introdution"};
		table = new JTable(Select_Join_Team.getInfo(s),title);
		JScrollPane scrollPane = new JScrollPane(table);
		add(scrollPane, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.NORTH);
		
		JButton btnNewButton = new JButton("Allow");
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Don't Allow ");
		panel.add(btnNewButton_1);
		

	}

}
