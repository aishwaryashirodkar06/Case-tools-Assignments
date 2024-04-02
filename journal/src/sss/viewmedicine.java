package sss;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.JScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class viewmedicine extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					viewmedicine frame = new viewmedicine();
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
	public viewmedicine() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 929, 584);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("View Medicine");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 29));
		lblNewLabel.setBounds(260, 26, 222, 29);
		contentPane.add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 66, 915, 15);
		contentPane.add(separator);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int index=table.getSelectedRow();
				TableModel model=table.getModel();
				String id=model.getValueAt(index, 0).toString();
				int a=JOptionPane.showConfirmDialog(null, "Do you want to delete this row??","Select",JOptionPane.YES_NO_OPTION);
				if(a==0) {
					JOptionPane.showConfirmDialog(null, "Medicine Deleted Successfully");
					setVisible(false);
					new viewmedicine().setVisible(true);
				}
			}
		});
		scrollPane.setBounds(78, 101, 693, 308);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "Medicine ID", "Name", "Company Name", "Quantity", "Price"
			}
		));
		
		JButton back = new JButton("BACK");
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pharmistdashboard frame=new pharmistdashboard();
				frame.setVisible(true);
			}
		});
		back.setFont(new Font("Tahoma", Font.PLAIN, 18));
		back.setBounds(347, 456, 127, 36);
		contentPane.add(back);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Anish\\OneDrive\\Documents\\notes\\white-abstract-background_23-2148810113.png"));
		lblNewLabel_1.setBounds(-15, 0, 930, 566);
		contentPane.add(lblNewLabel_1);
		table.getColumnModel().getColumn(3).setMinWidth(20);
		table.getColumnModel().getColumn(4).setMinWidth(16);
	}
}
