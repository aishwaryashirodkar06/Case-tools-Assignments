package sss;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class updatemedicine extends JFrame {
	public String numberpattern="^[0-9]*";

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField mid1;
	private JTextField n1;
	private JTextField cn1;
	private JTextField q2;
	private JTextField p1;
	private JTextField q1;

	protected Object Price;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					updatemedicine frame = new updatemedicine();
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
	public updatemedicine() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 730, 474);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Update Medicine");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 27));
		lblNewLabel.setBounds(247, 10, 219, 38);
		contentPane.add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 58, 704, 16);
		contentPane.add(separator);
		
		JLabel lblNewLabel_1 = new JLabel("Medicine ID");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(44, 77, 125, 25);
		contentPane.add(lblNewLabel_1);
		
		mid1 = new JTextField();
		mid1.setBounds(173, 79, 225, 25);
		contentPane.add(mid1);
		mid1.setColumns(10);
		
		JButton search = new JButton("Search");
		search.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int checkmedicineexist=0;
				String me1=mid1.getText(); 
				if(me1.equals("")) {
					JOptionPane.showMessageDialog(null,"medicine ID field is required");
				}
				else if(checkmedicineexist==0) {
					JOptionPane.showMessageDialog(null,"medicine does not exist");
				}
					
				}
			

		
			
		});
		search.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		search.setBounds(454, 75, 125, 34);
		contentPane.add(search);
		
		JLabel lblNewLabel_2 = new JLabel("Name");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(44, 133, 100, 31);
		contentPane.add(lblNewLabel_2);
		
		n1 = new JTextField();
		n1.setBounds(45, 174, 254, 28);
		contentPane.add(n1);
		n1.setColumns(10);
		
		JLabel lblNewLabel_2_1 = new JLabel("Company Name");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2_1.setBounds(44, 218, 148, 25);
		contentPane.add(lblNewLabel_2_1);
		
		cn1 = new JTextField();
		cn1.setColumns(10);
		cn1.setBounds(44, 253, 255, 31);
		contentPane.add(cn1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Quantity");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2_2.setBounds(44, 300, 107, 25);
		contentPane.add(lblNewLabel_2_2);
		
		q2 = new JTextField();
		q2.setColumns(10);
		q2.setBounds(173, 366, 126, 31);
		contentPane.add(q2);
		
		JLabel lblNewLabel_2_3 = new JLabel("Price");
		lblNewLabel_2_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2_3.setBounds(402, 218, 115, 19);
		contentPane.add(lblNewLabel_2_3);
		
		p1 = new JTextField();
		p1.setColumns(10);
		p1.setBounds(402, 253, 204, 31);
		contentPane.add(p1);
		
		JButton btnNewButton = new JButton("UPDATE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id=mid1.getText();
				String name=n1.getText();
				String quantity=q1.getText();
				String price=p1.getText();
				String  addqty=q1.getText();
				
				double totalqty=0;
				if(addqty.equals("")) {
					totalqty=Integer.parseInt(quantity);
				}
				else {
					totalqty=Integer.parseInt(quantity)+Integer.parseInt(addqty);
				}
				if(id.equals("")) {
					JOptionPane.showMessageDialog(null, "Medicine ID field is required");
				}
				else if(name.equals("")) {
					JOptionPane.showMessageDialog(null, "Name field is required");
				}
				else if(quantity.equals("")) {
					JOptionPane.showMessageDialog(null, "Quantity field is required");
				}
				else if(Price.equals("")) {
					JOptionPane.showMessageDialog(null, "Price per unit field is required");
				}
				else if(!price.matches(numberpattern)) {
					JOptionPane.showMessageDialog(null, "Price per unit is invalid is required");
				}
				else {
					setVisible(false);
					new updatemedicine().setVisible(true);
				}
			}
			
			
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 24));
		btnNewButton.setBounds(402, 337, 167, 47);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("Add quantity");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(44, 366, 132, 31);
		contentPane.add(lblNewLabel_3);
		
		q1 = new JTextField();
		q1.setBounds(144, 304, 155, 25);
		contentPane.add(q1);
		q1.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\Anish\\OneDrive\\Documents\\notes\\white-abstract-background_23-2148810113.png"));
		lblNewLabel_4.setBounds(0, 0, 732, 447);
		contentPane.add(lblNewLabel_4);
	}
}
