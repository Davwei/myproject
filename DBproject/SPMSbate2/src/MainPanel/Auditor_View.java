package MainPanel;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class Auditor_View extends JPanel {

	/**
	 * Create the panel.
	 */
	public Auditor_View() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(139, 10, 401, 45);
		add(panel);
		
		JLabel lblThereIsThe = new JLabel("There is the List of Stufent who want to join in:");
		panel.add(lblThereIsThe);
		
		JList list = new JList();
		list.setBorder(new LineBorder(new Color(0, 0, 0)));
		list.setBounds(139, 65, 280, 226);
		add(list);
		
		JButton btnAllowHeher = new JButton("Allow he/her");
		btnAllowHeher.setBounds(429, 138, 111, 23);
		add(btnAllowHeher);
		
		JButton btnNewButton = new JButton("Clean it");
		btnNewButton.setBounds(429, 197, 111, 23);
		add(btnNewButton);

	}

}
