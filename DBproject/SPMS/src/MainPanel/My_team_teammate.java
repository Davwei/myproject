package MainPanel;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

import dosql.Select_Teammate_List;

import java.awt.BorderLayout;
import javax.swing.JLabel;

public class My_team_teammate extends JPanel {
	
	/**
	 * Create the panel.
	 */
	public My_team_teammate(String s) {
		
		String[] title_2={"Mate ID","Mate Name"};
		setLayout(new BorderLayout(0, 0));
		setLayout(new BorderLayout(0, 0));
		JTable table_2 = new JTable(Select_Teammate_List.getInfo(s),title_2);
		JScrollPane scrollPane_1 = new JScrollPane(table_2);
		add(scrollPane_1, BorderLayout.CENTER);
	}
	

}
