package MainPanel;

import javax.swing.JPanel;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JLayeredPane;
import java.awt.BorderLayout;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.LineBorder;

import dosql.Conn;
import dosql.Select_Team_List;

import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JScrollBar;
import java.awt.ScrollPane;
import java.awt.Panel;

public class Team_List_stu extends JPanel {
	private JTable table;

	/**
	 * Create the panel.
	 */
	public Team_List_stu() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(-39, 0, 735, 25);
		add(panel);
		
		JLabel lblResultset = new JLabel("Result_set");
		panel.add(lblResultset);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 251, 697, 156);
		add(panel_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Team_List_stu.class.getResource("/resouse/part.jpg")));
		panel_1.add(lblNewLabel);
		
		Panel panel_2 = new Panel();
		panel_2.setBounds(504, 31, 163, 214);
		add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnTeamdetails = new JButton("Team_details");
		btnTeamdetails.setBounds(20, 39, 123, 23);
		panel_2.add(btnTeamdetails);
		
		JButton btnNewButton = new JButton("Project_details");
		btnNewButton.setBounds(20, 116, 123, 23);
		panel_2.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("To be continue...");
		lblNewLabel_1.setBounds(36, 189, 102, 15);
		panel_2.add(lblNewLabel_1);
		
		
		
		
		String[] titles ={"Team ID","Team leader","Projrct ID","Number_of_People"};		
		table = new JTable(Select_Team_List. getObject(),titles);
		
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(0, 35, 452, 214);
		add(scrollPane);
		}
	}		

	
