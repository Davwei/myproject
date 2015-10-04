package MainPanel;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.border.LineBorder;

import dosql.Insert_Want_Proj;
import dosql.Select_Project_List;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.ScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.Panel;
import java.awt.event.ActionListener;
import java.io.File;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class Project_List_stu extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	Panel panel_1 ;
	JTable table;
	JScrollPane scrollPane ;

	/**
	 * Create the panel.
	 */
	public Project_List_stu(String s) {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(122, 10, 419, 44);
		add(panel);
		
		JLabel lblProjrctList = new JLabel("Projrct List");
		panel.add(lblProjrctList);
		
		JButton btnNewButton_1 = new JButton("Apply");
		
		btnNewButton_1.setBounds(411, 287, 130, 23);
		add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Apply it");
		
		btnNewButton_2.setBounds(411, 64, 130, 23);
		add(btnNewButton_2);
		
		
		
		
		panel_1 = new Panel();
		panel_1.setBounds(411, 93, 143, 166);
		add(panel_1);
		panel_1.setLayout(null);
		panel_1.setVisible(false);
		JLabel lblYourId = new JLabel("Please choose left ");
		lblYourId.setBounds(10, 10, 120, 15);
		panel_1.add(lblYourId);
		
		textField = new JTextField();
		textField.setBounds(10, 31, 110, 21);
		panel_1.add(textField);
		textField.setColumns(10);
		
		String[] titles ={"Projrct ID","Project Name"};	
		table = new JTable(Select_Project_List.getInfo(),titles);
		scrollPane = new JScrollPane(table);
		scrollPane.setBounds(113, 60, 255, 283);
		add(scrollPane);
		
		
		JLabel lblYourApplyBook = new JLabel("Your Apply Book");
		lblYourApplyBook.setBounds(10, 62, 110, 15);
		panel_1.add(lblYourApplyBook);
		
		textField_1 = new JTextField();
		textField_1.setBounds(10, 82, 110, 21);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton_3 = new JButton("Find file");
		
		btnNewButton_3.setBounds(10, 119, 110, 23);
		panel_1.add(btnNewButton_3);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(396, 64, 158, 288);
		add(panel_2);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_1.setVisible(true);
				
			}
		});
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFileChooser fileChooser =new JFileChooser();
				int i = fileChooser.showOpenDialog(panel.getRootPane());
				if(i == JFileChooser.APPROVE_OPTION)
				{
					File selectedFile = fileChooser.getSelectedFile();
					textField_1.setText(selectedFile.getPath());
					
				}
				
			}
		});
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tid =(String)table.getValueAt(table.getSelectedRow(), 0);
				textField.setText("Team ID is : "+tid);				
				try {
					
					Insert_Want_Proj iwp =new Insert_Want_Proj(s,tid);
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
	}
}
