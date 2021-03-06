package front;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import MainPanel.*;
import dosql.login_sql;
import utils.Stu;

import java.awt.FlowLayout;
import java.awt.Panel;


import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.CardLayout;

public class Stu_front extends JFrame {
	
	private JPanel contentPane;
	JPanel panel=null;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//debug
					String s = "201300301249";
					Stu_front frame = new Stu_front(s);
					frame.setVisible(true);
				} 	catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Stu_front(String s) {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 452);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JMenuBar menuBar = new JMenuBar();
		
		JMenu mnNewMenu = new JMenu("Team");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Team List");
		
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Apply a Team");
		
		mnNewMenu.add(mntmNewMenuItem_4);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("My Team");
		
		mnNewMenu.add(mntmNewMenuItem_5);
		
		JMenuItem mntmJoinTeamList = new JMenuItem("Join Team List(Caption Only)");
		
		mnNewMenu.add(mntmJoinTeamList);
		
		JMenu mnNewMenu_1 = new JMenu("Personal");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Information");
		
		mnNewMenu_1.add(mntmNewMenuItem_1);
		contentPane.add(menuBar, BorderLayout.NORTH);
		
		JMenu mnNewMenu_3 = new JMenu("SumProject");
		menuBar.add(mnNewMenu_3);
		
		JMenuItem mntmNewMenuItem_6 = new JMenuItem("Project List");
		
		mnNewMenu_3.add(mntmNewMenuItem_6);
		
		JMenuItem mntmConcludebook = new JMenuItem("Conclude_Book(Team_Leader Only)");
		
		mnNewMenu_3.add(mntmConcludebook);
		
		JMenu mnNewMenu_2 = new JMenu("Others");
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("About me");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "This system design by Davidwei Copyright_resvered 2015 \n e-mail wangwei3791@outlook.com", "Wurning!", JOptionPane.OK_CANCEL_OPTION);
			}
		});
		mnNewMenu_2.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Help");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "No drugs can help", "Wurning!", JOptionPane.OK_CANCEL_OPTION);
			}
		});
		mnNewMenu_2.add(mntmNewMenuItem_3);
		
		
		panel =new Welcome_p();		
		contentPane.add(panel, BorderLayout.CENTER);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Stu_front.class.getResource("/resouse/welcome_icon.png")));
		panel.add(lblNewLabel, BorderLayout.CENTER);
		
		
		
		
		mntmNewMenuItem.addActionListener(new ActionListener() {//Team list
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(false);
				contentPane.remove(panel);
				panel = new Team_List_stu();
				contentPane.add(panel, BorderLayout.CENTER);//保证加入的panel
				//show Team List 
				
			}
		});
		mntmNewMenuItem_4.addActionListener(new ActionListener() {//Join a team
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(false);
				contentPane.remove(panel);
				panel =new Join_Team_front(s);
				contentPane.add(panel, BorderLayout.CENTER);
			}
		});
		mntmNewMenuItem_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(false);
				contentPane.remove(panel);
				panel =new My_Team(s);
				contentPane.add(panel, BorderLayout.CENTER);
			}
		});
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(false);
				contentPane.remove(panel);
				panel =new Information();
				contentPane.add(panel, BorderLayout.CENTER);
			}
		});
		mntmNewMenuItem_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(false);
				contentPane.remove(panel);
				panel =new Project_List_stu(s);
				contentPane.add(panel, BorderLayout.CENTER);
				
			}
		});
		mntmJoinTeamList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!login_sql.check4(s))
				{
				JOptionPane.showMessageDialog(null, "you are not a caption", "Worning", JOptionPane.ERROR_MESSAGE);
				}else{
				panel.setVisible(false);
				panel =new Want_Join(s);
				contentPane.add(panel);
				}
			}
		});
		mntmConcludebook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!login_sql.check4(s))
				{
				JOptionPane.showMessageDialog(null, "you are not a caption", "Worning", JOptionPane.ERROR_MESSAGE);
				
				}else{
				panel.setVisible(false);
				panel =new Conclude_Push(s);
				contentPane.add(panel);
				}
			}
		});
	}

}
