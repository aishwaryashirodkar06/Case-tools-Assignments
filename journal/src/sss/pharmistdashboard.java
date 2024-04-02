package sss;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class pharmistdashboard extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pharmistdashboard frame = new pharmistdashboard();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/* String user=" ";
	 public Pharmistdashboard(String tempuser) {
		 initComponents();
		 user=tempuser;
		 setLocationRelativeTo(null)
	 }
	 */

	/**
	 * Create the frame.
	 */
	public pharmistdashboard() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 720, 465);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Pharmasist Dashboard");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 27));
		lblNewLabel.setBounds(208, 10, 299, 45);
		contentPane.add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 69, 684, 19);
		contentPane.add(separator);
		
		JButton btnNewButton = new JButton("Add Medicine");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new addmedicine().setVisible(true);
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\USER\\Downloads\\medicine.jpg"));
		btnNewButton.setBounds(68, 110, 206, 45);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton(" view Medicine ");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new viewmedicine().setVisible(true);
			}
		});
		btnNewButton_1.setBounds(68, 185, 203, 45);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Exit ");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=JOptionPane.showConfirmDialog(null, "Do u want to close application","Select",JOptionPane.YES_NO_OPTION);
				if (a==0) {
					System.exit(0);
				}
			}
		});
		btnNewButton_2.setBounds(430, 340, 156, 45);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("View Bill");
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_3.setBounds(401, 110, 203, 45);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("LOG OUT");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=JOptionPane.showConfirmDialog(null, "Do u want to log out  application","Select",JOptionPane.YES_NO_OPTION);
				if (a==0) {
					setVisible(false);
					new Login().setVisible(true);				}
			}
		});
		btnNewButton_4.setFont(new Font("Times New Roman", Font.BOLD, 19));
		btnNewButton_4.setBounds(220, 343, 156, 45);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Update Medicine");
		btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new updatemedicine().setVisible(true);
			}
		});
		
		
		
		btnNewButton_5.setBounds(401, 185, 206, 45);
		contentPane.add(btnNewButton_5);
		
		JButton back = new JButton("BACK");
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login frame=new Login();
				frame.setVisible(true);
			}
		});
		back.setFont(new Font("Times New Roman", Font.BOLD, 17));
		back.setBounds(54, 355, 120, 34);
		contentPane.add(back);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Anish\\OneDrive\\Documents\\notes\\white-abstract-background_23-2148810113.png"));
		lblNewLabel_1.setBounds(-16, -10, 732, 449);
		contentPane.add(lblNewLabel_1);
	}
}
