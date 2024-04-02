package sss;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField username;
	private JPasswordField password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	
	
	
	public Login() {
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 638, 447);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setBounds(243, 61, 113, 42);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1.setBounds(111, 172, 113, 20);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_2.setBounds(111, 223, 113, 20);
		contentPane.add(lblNewLabel_2);
		
		username = new JTextField();
		username.setBounds(243, 165, 286, 41);
		contentPane.add(username);
		username.setColumns(10);
		
		password = new JPasswordField();
		password.setBounds(243, 216, 286, 41);
		contentPane.add(password);
		
		JButton btnNewButton = new JButton("login");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\Anish\\OneDrive\\Documents\\notes\\logout-icon.png"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String u=username.getText();
				String pass=password.getText();
				
				
				if(u.equals("admin")&& pass.equals("123"))
				{
                    JOptionPane.showMessageDialog(null,"login succesful");
					AdminDashboard frame=new AdminDashboard();
					frame.setVisible(true);
				}

                   else if((u.equals("pharma1")&& pass.equals("1234"))){
                	pharmistdashboard frame= new pharmistdashboard();
				    setVisible(true);
					
                   }
				
				/*if(u.equals("admin")&& pass.equals("admin")){
					JOptionPane.showMessageDialog(null, "Login Successfull");
					AdminDashboard frame=new AdminDashboard();
					frame.setVisible(true);
				}
				else
				{
					//setVisible(false);
					pharmistdashboard frame= new pharmistdashboard();
					JOptionPane.showMessageDialog(null, "Incorrect Credentials");
				}
			*/}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton.setBounds(243, 279, 142, 51);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Anish\\OneDrive\\Documents\\notes\\1710078090710.jpg"));
		lblNewLabel_3.setBounds(0, -31, 680, 500);
		contentPane.add(lblNewLabel_3);
	}
}
