package sss;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class addmedicine extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField medid;
	private JTextField medname;
	private JTextField medcomany;
	private JTextField qty;
	private JTextField price;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addmedicine frame = new addmedicine();
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
	public addmedicine() {
		initComponents();
		 setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 825, 453);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Add Medicine");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 27));
		lblNewLabel.setBounds(296, 36, 247, 35);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Medicine ID");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1.setBounds(84, 113, 151, 14);
		contentPane.add(lblNewLabel_1);
		
		medid = new JTextField();
		medid.setBounds(84, 138, 247, 35);
		contentPane.add(medid);
		medid.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Name");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_2.setBounds(84, 196, 151, 14);
		contentPane.add(lblNewLabel_2);
		
		medname = new JTextField();
		medname.setBounds(84, 221, 247, 35);
		contentPane.add(medname);
		medname.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Company Name");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(84, 280, 151, 14);
		contentPane.add(lblNewLabel_1_1);
		
		medcomany = new JTextField();
		medcomany.setColumns(10);
		medcomany.setBounds(84, 305, 247, 35);
		contentPane.add(medcomany);
		
		JLabel lblNewLabel_1_2 = new JLabel("QTY");
		lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1_2.setBounds(425, 113, 147, 14);
		contentPane.add(lblNewLabel_1_2);
		
		qty = new JTextField();
		qty.setToolTipText("Enter only numbers!!");
		qty.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
                char c=e.getKeyChar();
				
				if(Character.isLetter(c)) {
					JOptionPane.showMessageDialog(null, "Enter only numbers");
				
					
				}
			}
		});
		qty.setColumns(10);
		qty.setBounds(425, 138, 247, 35);
		contentPane.add(qty);
		
		JButton save = new JButton("SAVE");
		save.setIcon(new ImageIcon("C:\\Users\\Anish\\OneDrive\\Documents\\notes\\Save-icon.png"));
		save.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String meid=medid.getText();
				String name= medname.getText();
				String quantity= qty.getText();
				String Price= price.getText();
				
				if(medid.equals("")) {
					JOptionPane.showMessageDialog(null, "Medicine ID field is required");
				}
				else if(name.equals("")) {
					JOptionPane.showMessageDialog(null, "Name field is required");
				}
				else if(quantity.equals("")) {
					JOptionPane.showMessageDialog(null, "Quantity field is required");
				}
				else if(Price.equals("")) {
					JOptionPane.showMessageDialog(null, "Price field is required");
				}
				else {
					setVisible(false);
					new addmedicine().setVisible(true);
				}
				
			}
		});
		save.setFont(new Font("Times New Roman", Font.BOLD, 22));
		save.setBounds(462, 305, 176, 51);
		contentPane.add(save);
		
		JLabel lblNewLabel_1_3 = new JLabel("Price per unit");
		lblNewLabel_1_3.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1_3.setBounds(425, 192, 148, 23);
		contentPane.add(lblNewLabel_1_3);
		
		price = new JTextField();
		price.setColumns(10);
		price.setBounds(425, 221, 247, 35);
		contentPane.add(price);
		
		JButton back = new JButton("BACK");
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pharmistdashboard frame=new pharmistdashboard();
				frame.setVisible(true);
			}
		});
		back.setFont(new Font("Times New Roman", Font.BOLD, 17));
		back.setBounds(104, 360, 176, 23);
		contentPane.add(back);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Anish\\OneDrive\\Documents\\notes\\white-abstract-background_23-2148810113.png"));
		lblNewLabel_3.setBounds(-20, 22, 821, 508);
		contentPane.add(lblNewLabel_3);
	}

	private void initComponents() {
		// TODO Auto-generated method stub
		
	}
}
