package MainPanel;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;

public class Welcome_p extends JPanel {

	/**
	 * Create the panel.
	 */
	public Welcome_p() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.CENTER);
		
		JLabel lblNewLabel = new JLabel("this is a welcome icon");
		panel.add(lblNewLabel);

	}

}
