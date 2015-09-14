package front;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.JList;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;


import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JRadioButton;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JPasswordField;

public class login {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100,400,250);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(login.class.getResource("/resouse/logo.jpg")));
		panel.add(label_1);
		
		JLabel label = new JLabel("\u5C71\u4E1C\u5927\u5B66");
		panel.add(label);
		label.setFont(new Font("������κ", Font.PLAIN, 30));
		
		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(0, 1, 394, 34);
		panel_1.add(panel_3);
		
		JLabel lblNewLabel = new JLabel("Your_ID :");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		textField = new JTextField();
		textField.setColumns(10);
		panel_3.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		panel_3.add(lblNewLabel);
		panel_3.add(textField);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(0, 98, 394, 34);
		panel_1.add(panel_5);
		
		JButton btnNewButton = new JButton("Submit");
		panel_5.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancel");
		panel_5.add(btnNewButton_1);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(0, 32, 394, 31);
		panel_1.add(panel_6);
		
		JLabel lblNewLabel_1 = new JLabel("Password :");
		panel_6.add(lblNewLabel_1);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		
		passwordField = new JPasswordField();
		passwordField.setColumns(10);
		panel_6.add(passwordField);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBounds(0, 62, 394, 34);
		panel_1.add(panel_7);
		panel_7.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("stu");
		panel_7.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("tea");
		panel_7.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("admin");
		panel_7.add(rdbtnNewRadioButton_2);
		
		ButtonGroup bg =new ButtonGroup();//��ѡ
		bg.add(rdbtnNewRadioButton_2);
		bg.add(rdbtnNewRadioButton_1);
		bg.add(rdbtnNewRadioButton);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 131, 394, 25);
		panel_1.add(panel_2);
		
		JLabel lblNewLabel_2 = new JLabel("Copyright \u00A9 reserved 2015 Davwei");
		panel_2.add(lblNewLabel_2);
		
		frame.setResizable(false);
	}
}