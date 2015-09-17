package MainPanel;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.border.LineBorder;

import dosql.Select_Project_List;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.ScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.Panel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Project_List_stu extends JPanel {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public Project_List_stu() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(122, 10, 419, 44);
		add(panel);
		
		JLabel lblProjrctList = new JLabel("Projrct List");
		panel.add(lblProjrctList);
		
		JButton btnNewButton = new JButton("Download");
		btnNewButton.setBounds(411, 320, 130, 23);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Apply");
		
		btnNewButton_1.setBounds(411, 287, 130, 23);
		add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Apply it");
		btnNewButton_2.setBounds(411, 64, 130, 23);
		add(btnNewButton_2);
		
		
		
		
		Panel panel_1 = new Panel();
		panel_1.setBounds(411, 93, 130, 166);
		add(panel_1);
		panel_1.setLayout(null);
		panel_1.setVisible(false);
		JLabel lblYourId = new JLabel("Your ID");
		lblYourId.setBounds(10, 10, 54, 15);
		panel_1.add(lblYourId);
		
		textField = new JTextField();
		textField.setBounds(10, 31, 110, 21);
		panel_1.add(textField);
		textField.setColumns(10);
		
		String[] titles ={"Projrct ID","Project Name"};	
		JTable table = new JTable(Select_Project_List.getInfo(),titles);
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(113, 60, 255, 283);
		add(scrollPane);
		
		
		JLabel lblYourApplyBook = new JLabel("Your Apply Book");
		lblYourApplyBook.setBounds(10, 62, 110, 15);
		panel_1.add(lblYourApplyBook);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(396, 64, 158, 288);
		add(panel_2);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_1.setVisible(true);
				
			}
		});
	}
}
