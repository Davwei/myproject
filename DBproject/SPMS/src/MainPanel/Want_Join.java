package MainPanel;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTable;

import dosql.Delete_Join_Team;
import dosql.Insert_Teammate;
import dosql.Select_Join_Team;
import utils.Stu;

import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class Want_Join extends JPanel {
	private JTable table;

	/**
	 * Create the panel.
	 */
	public Want_Join(String s) {
		setLayout(new BorderLayout(0, 0));
		
		
		String[] title={"Team ID","Stu ID","Self_Introdution"};
		table = new JTable(Select_Join_Team.getInfo(s),title);
		JScrollPane scrollPane = new JScrollPane(table);
		add(scrollPane, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.NORTH);
		
		JButton btnNewButton = new JButton("Allow ");
		
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Don't Allow ");
		panel.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String tid =(String) table.getValueAt(table.getSelectedRow(), 0);
				String sid =(String) table.getValueAt(table.getSelectedRow(), 1);
				Delete_Join_Team djt =new Delete_Join_Team();
				djt.Delete(tid,s,sid);
				
				JOptionPane.showMessageDialog(null, "Please reopen this windows", "succeed ", JOptionPane.OK_CANCEL_OPTION);
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					String tid =(String) table.getValueAt(table.getSelectedRow(), 0);//jtabe from 0
					System.out.println(tid);
					String sid =(String) table.getValueAt(table.getSelectedRow(), 1);
					System.out.println(sid);
					Delete_Join_Team djt =new Delete_Join_Team();
					
					djt.Delete(tid,s,sid);
					
					
					Insert_Teammate it =new Insert_Teammate(sid,tid,s);
					
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				JOptionPane.showMessageDialog(null, "Please re open this windows", "succeed ", JOptionPane.OK_CANCEL_OPTION);
			}
		});

	}

}
