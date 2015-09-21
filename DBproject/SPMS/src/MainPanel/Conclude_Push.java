package MainPanel;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;

import dosql.Sup_Insert_Conclude;

import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Conclude_Push extends JPanel {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public Conclude_Push(String s) {
		setLayout(null);
		
		JButton btnNewButton = new JButton("Push it");
		
		btnNewButton.setBounds(250, 65, 93, 23);
		add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(148, 66, 66, 21);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblTeamid = new JLabel("Team_ID");
		lblTeamid.setBounds(65, 69, 54, 15);
		add(lblTeamid);
		
		JLabel lblPleaseDontEnter = new JLabel("Please Dont enter  others ID");
		lblPleaseDontEnter.setBounds(65, 32, 204, 15);
		add(lblPleaseDontEnter);
		
		JLabel lblConcludebook = new JLabel("Conclude_Book");
		lblConcludebook.setBounds(65, 148, 102, 15);
		add(lblConcludebook);
		
		JLabel lblGodSaysThere = new JLabel("God says there shell be a file Manage System");
		lblGodSaysThere.setBounds(65, 196, 278, 15);
		add(lblGodSaysThere);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sup_Insert_Conclude sic =new Sup_Insert_Conclude(s,textField.getText());
			}
		});
		
	}

	
}
