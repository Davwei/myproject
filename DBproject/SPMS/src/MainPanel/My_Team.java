package MainPanel;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

import dosql.Select_My_Team;
import utils.Stu;

import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.ScrollPane;

public class My_Team extends JPanel {
	private JTable table;
	private JTable table_1;

	/**
	 * Create the panel.
	 */
	public My_Team(String s) {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(27, 24, 242, 38);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblYourTeamId = new JLabel("Your team ID List as followed");
		lblYourTeamId.setBounds(32, 10, 200, 15);
		panel.add(lblYourTeamId);
		
		JButton btnLeaveATeam = new JButton("Leave a Team");
		btnLeaveATeam.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnLeaveATeam.setBounds(27, 330, 145, 23);
		add(btnLeaveATeam);
		
		JButton btnWatchTeamate = new JButton("Watch teammate List");
		btnWatchTeamate.setBounds(337, 39, 166, 23);
		add(btnWatchTeamate);
		
		JButton btnNewButton = new JButton("Details");
		btnNewButton.setBounds(513, 39, 86, 23);
		add(btnNewButton);
		
		ScrollPane scrollPane = new ScrollPane();
		scrollPane.setBounds(27, 86, 242, 214);
		add(scrollPane);
		
		ScrollPane scrollPane_1 = new ScrollPane();
		scrollPane_1.setBounds(341, 86, 258, 214);
		add(scrollPane_1);
		
		String[] titles	={"Your_Team_ID","Your_Team_Proj_Nmae"};
		
		table = new JTable(Select_My_Team.getInfo(s),titles);
		scrollPane.add(table);
		
		
		table_1 = new JTable();
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String[] titles_1={"StuID","StuName","TeamID"};
				
				
			}
		});

	}
}
