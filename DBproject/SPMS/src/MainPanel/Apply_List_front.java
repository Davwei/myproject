package MainPanel;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.List;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class Apply_List_front extends JPanel {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public Apply_List_front() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		
		panel.setBounds(71, 10, 500, 36);
		add(panel);
		
		JLabel lblNewLabel = new JLabel("Which Team do you want to join in?");
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(71, 56, 225, 43);
		add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("The Team ID :");
		lblNewLabel_1.setBounds(51, 10, 78, 15);
		panel_1.add(lblNewLabel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(71, 143, 225, 146);
		add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("self-introduction");
		lblNewLabel_3.setBounds(48, 59, 142, 33);
		panel_2.add(lblNewLabel_3);
		
		JLabel lblNewLabel_2 = new JLabel("Your breif ");
		lblNewLabel_2.setBounds(48, 22, 129, 27);
		panel_2.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(340, 66, 160, 21);
		add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(184, 317, 112, 36);
		add(btnNewButton);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(340, 317, 112, 36);
		add(btnCancel);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(340, 143, 231, 146);
		add(textArea);

	}
}