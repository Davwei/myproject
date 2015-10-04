package MainPanel;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JTextField;

import dosql.Delete_Team;
import dosql.Select_My_Team;
import dosql.Select_Teammate_List;
import utils.Stu;

import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.ScrollPane;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.BorderLayout;

public class My_Team extends JPanel {
	private JTable table;
	private JTable table_1;
	private JTable table_2;
	JPanel panel_3 ;
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
		
		btnLeaveATeam.setBounds(324, 24, 145, 23);
		add(btnLeaveATeam);
		
		String[] titles	={"Your_Team_ID","Your_Team_Proj_Nmae"};
		
		table = new JTable(Select_My_Team.getInfo(s),titles);
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(27, 86, 282, 214);
		add(scrollPane);
		
		JLabel lblCaptionIsNot = new JLabel("Caption is not allowed leave his team");
		lblCaptionIsNot.setBounds(324, 57, 233, 15);
		add(lblCaptionIsNot);
		
		JLabel lblTeamId_1 = new JLabel("Please choose a Team");
		lblTeamId_1.setBounds(479, 24, 145, 23);
		add(lblTeamId_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBounds(324, 86, 357, 214);
		add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		panel_2.add(panel_1, BorderLayout.NORTH);
		
		JLabel lblTeamId = new JLabel(" Team ID choosed on left");
		panel_1.add(lblTeamId);
		
		
		
		
		
		JButton btnYourTeammate = new JButton("your teammate");
		panel_1.add(btnYourTeammate);
		
		panel_3 = new JPanel();
		panel_2.add(panel_3, BorderLayout.CENTER);
		btnYourTeammate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_3.setVisible(false);
				panel_2.remove(panel_3);
				String tid="";
				tid=(String)table.getValueAt(table.getSelectedRow(), 0);
				if(tid.equals(""))
				 System.out.println("Non Team");
				else{
					panel_3 =new My_team_teammate(tid);
					panel_2.add(panel_3, BorderLayout.CENTER);
				}
			}
		});
		
		btnLeaveATeam.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String tid="";
				tid=(String)table.getValueAt(table.getSelectedRow(), 0);
				JOptionPane.showMessageDialog(null, "Exit a Team now", "succeed ", JOptionPane.OK_CANCEL_OPTION);
				Delete_Team dt =new Delete_Team(s,tid);
				
			}
		});
		
		
		

	}
}
