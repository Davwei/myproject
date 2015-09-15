package MainPanel;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class My_Team extends JPanel {

	/**
	 * Create the panel.
	 */
	public My_Team() {
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
		
		JList list = new JList();
		list.setBounds(27, 93, 242, 207);
		add(list);
		
		JList list_1 = new JList();
		list_1.setBounds(337, 93, 258, 207);
		add(list_1);

	}
}
