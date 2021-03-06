package MainPanel;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;

import dosql.Delete_Proj;
import dosql.Insert_Proj;
import dosql.Select_Project_List;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.ScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.Panel;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class Project_List_tea extends JPanel {
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Create the panel.
	 */
	public Project_List_tea(String s) {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(122, 10, 419, 44);
		add(panel);
		
		JLabel lblProjrctList = new JLabel("Projrct List");
		panel.add(lblProjrctList);
		
		String[] titles ={"Projrct ID","Project Name"};	
		JTable table = new JTable(Select_Project_List.getInfo(),titles);
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(113, 60, 255, 283);
		add(scrollPane);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(396, 64, 158, 288);
		add(panel_2);
		panel_2.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 35, 66, 21);
		panel_2.add(textField);
		textField.setColumns(10);
		
		JLabel lblProjName = new JLabel("Proj Name");
		lblProjName.setBounds(10, 10, 98, 15);
		panel_2.add(lblProjName);
		
		JButton btnNewButton_2 = new JButton("Add");
		
		btnNewButton_2.setBounds(82, 34, 76, 23);
		panel_2.add(btnNewButton_2);
		
		JLabel lblProjName_1 = new JLabel("Proj ID");
		lblProjName_1.setBounds(10, 78, 82, 15);
		panel_2.add(lblProjName_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(10, 103, 66, 21);
		panel_2.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnDelete = new JButton("Delete");
		
		btnDelete.setBounds(82, 102, 76, 23);
		panel_2.add(btnDelete);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 try {
					Insert_Proj ip =new  Insert_Proj(s,textField.getText());
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Delete_Proj dp =new Delete_Proj(textField_1.getText());
				
			}
		});
	}
}
