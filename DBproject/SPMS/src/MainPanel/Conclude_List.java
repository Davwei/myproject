package MainPanel;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JTextField;

import dosql.Select_Conclude_List;

import javax.swing.JButton;

public class Conclude_List extends JPanel {
	private JTable table;
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public Conclude_List() {
		setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		add(scrollPane, BorderLayout.CENTER);
		
		String[] title ={"Conclude ID","Team ID","Project ID","status"};
		
		table = new JTable(Select_Conclude_List.getInfo(),title);
		scrollPane.add(table);
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.NORTH);
		
		JLabel lblTheIdIs = new JLabel("The ID is allow");
		panel.add(lblTheIdIs);
		
		textField = new JTextField();
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnCommit = new JButton("commit");
		panel.add(btnCommit);
		btnCommit.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				
				
			}
			
			
		});

	}

}
