package MainPanel;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.border.LineBorder;

import dosql.Select_Apply_List;

import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Apply_List_tea extends JPanel {
	private JTable table;
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public Apply_List_tea() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		String[] title={"Apply ID","Stu ID","Project ID","time"};		
		table = new JTable(Select_Apply_List.getInfo(),title);
		
		JScrollPane scrollPane = new JScrollPane(table);
		panel.add(scrollPane, BorderLayout.CENTER);
		
		JPanel panel_1 = new JPanel();
		add(panel_1, BorderLayout.SOUTH);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblEnterTeamId = new JLabel("Enter Team ID");
		panel_1.add(lblEnterTeamId);
		
		textField = new JTextField();
		panel_1.add(textField);
		textField.setColumns(10);
		
		JButton button = new JButton("Allow it");
		
		panel_1.add(button);
		
		JButton button_1 = new JButton("Don't allow it");
		panel_1.add(button_1);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {//allow it
				//Update apply list and insert team
				
				
			}
		});

	}
}
