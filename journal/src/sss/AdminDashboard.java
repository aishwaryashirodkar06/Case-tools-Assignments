package sss;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class AdminDashboard extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminDashboard frame = new AdminDashboard();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AdminDashboard() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 903, 578);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("DASHBOARD");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setBounds(325, 10, 225, 49);
		contentPane.add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(0, 0, 0));
		separator.setBounds(-11, 69, 900, 27);
		contentPane.add(separator);
		
		JButton adduser = new JButton("ADD USER");
		adduser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddUser frame=new AddUser();
				frame.setVisible(true);
			}
		});
		adduser.setIcon(new ImageIcon("C:\\Users\\Anish\\OneDrive\\Documents\\notes\\add-user-icon.png"));
		adduser.setFont(new Font("Tahoma", Font.BOLD, 16));
		adduser.setBounds(501, 142, 178, 57);
		contentPane.add(adduser);
		
		JButton viewuser = new JButton("VIEW USER");
		viewuser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewUser frame=new ViewUser();
				frame.setVisible(true);
			}
		});
		viewuser.setIcon(new ImageIcon("C:\\Users\\Anish\\OneDrive\\Documents\\notes\\View-icon.png"));
		viewuser.setFont(new Font("Tahoma", Font.BOLD, 16));
		viewuser.setBounds(501, 351, 190, 57);
		contentPane.add(viewuser);
		
		JButton logout = new JButton("LOGOUT");
		logout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login frame=new Login();
				frame.setVisible(true);
			}
		});
		logout.setIcon(new ImageIcon("C:\\Users\\Anish\\OneDrive\\Documents\\notes\\bx-log-out-icon.png"));
		logout.setFont(new Font("Tahoma", Font.BOLD, 16));
		logout.setBounds(501, 243, 178, 57);
		contentPane.add(logout);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login frame=new Login();
				frame.setVisible(true);
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\Anish\\OneDrive\\Documents\\notes\\delete-button_5974771 (1).png"));
		btnNewButton.setBounds(852, 10, 37, 21);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(86, 264, 45, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Anish\\Downloads\\WhatsApp_Image_2024-03-11_at_9.31.30_AM-removebg-preview (1).png"));
		lblNewLabel_2.setBounds(27, 80, 476, 428);
		contentPane.add(lblNewLabel_2);
	}
}
