
package caca2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.border.BevelBorder;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

@SuppressWarnings("serial")
public class Cart extends JFrame {

	private JPanel contentPane;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cart frame = new Cart();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Cart() throws SQLException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize (1474,1080); //full screen
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setBounds(0, 79, 1474, 973);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 61, 1163, 529);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_3.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(42, 53, 247, 33);
		panel_2.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("New label");
		lblNewLabel_3_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_3_1.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		lblNewLabel_3_1.setBounds(358, 53, 220, 33);
		panel_2.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("New label");
		lblNewLabel_3_2.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_3_2.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		lblNewLabel_3_2.setBounds(652, 53, 215, 33);
		panel_2.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_3 = new JLabel("New label");
		lblNewLabel_3_3.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_3_3.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		lblNewLabel_3_3.setBounds(869, 53, 220, 33);
		panel_2.add(lblNewLabel_3_3);
		
	    JLabel lblNewLabel_4 = new JLabel("");
	    lblNewLabel_4.setFont(new Font("Century Gothic", Font.BOLD, 14));
	    lblNewLabel_4.setBounds(877, 476, 212, 43);
	    panel_2.add(lblNewLabel_4);
	    
		
		    JLabel lblNewLabel_2 = new JLabel("Item Name");
		    lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		    lblNewLabel_2.setFont(new Font("Century Gothic", Font.BOLD, 14));
		    lblNewLabel_2.setBounds(10, 10, 279, 33);
		    panel_2.add(lblNewLabel_2);
		    
		    JLabel lblNewLabel_2_1 = new JLabel("Price");
		    lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		    lblNewLabel_2_1.setFont(new Font("Century Gothic", Font.BOLD, 14));
		    lblNewLabel_2_1.setBounds(351, 10, 239, 33);
		    panel_2.add(lblNewLabel_2_1);
		    
		    JLabel lblNewLabel_2_1_1 = new JLabel("Quantity");
		    lblNewLabel_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		    lblNewLabel_2_1_1.setFont(new Font("Century Gothic", Font.BOLD, 14));
		    lblNewLabel_2_1_1.setBounds(642, 10, 198, 33);
		    panel_2.add(lblNewLabel_2_1_1);
		    
		    JLabel lblNewLabel_2_1_1_1 = new JLabel("Total");
		    lblNewLabel_2_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		    lblNewLabel_2_1_1_1.setFont(new Font("Century Gothic", Font.BOLD, 14));
		    lblNewLabel_2_1_1_1.setBounds(886, 10, 181, 33);
		    panel_2.add(lblNewLabel_2_1_1_1);
		    
		    JButton btnNewButton_1 = new JButton("Buy Now");
		    btnNewButton_1.setBounds(1221, 656, 157, 49);
		    panel_1.add(btnNewButton_1);
		    
		    JLabel lblNewLabel_5 = new JLabel("New label");
		    lblNewLabel_5.setBounds(1221, 26, 189, 180);
		    panel_1.add(lblNewLabel_5);
		    
		    JLabel lblNewLabel_6 = new JLabel("New label");
		    lblNewLabel_6.setFont(new Font("Century Gothic", Font.BOLD, 14));
		    lblNewLabel_6.setBounds(1313, 229, 97, 32);
		    panel_1.add(lblNewLabel_6);
		    
		    JLabel lblNewLabel_6_1 = new JLabel("New label");
		    lblNewLabel_6_1.setFont(new Font("Century Gothic", Font.BOLD, 14));
		    lblNewLabel_6_1.setBounds(1313, 280, 97, 32);
		    panel_1.add(lblNewLabel_6_1);
		    
		    JLabel lblNewLabel_6_1_1 = new JLabel("Item Price\r\n");
		    lblNewLabel_6_1_1.setFont(new Font("Century Gothic", Font.BOLD, 14));
		    lblNewLabel_6_1_1.setBounds(1206, 280, 97, 32);
		    panel_1.add(lblNewLabel_6_1_1);
		    
		    JLabel lblNewLabel_6_2 = new JLabel("Item Name");
		    lblNewLabel_6_2.setFont(new Font("Century Gothic", Font.BOLD, 14));
		    lblNewLabel_6_2.setBounds(1206, 229, 97, 32);
		    panel_1.add(lblNewLabel_6_2);
		    


		 
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		panel.setBounds(0, 0, 1680, 79);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CART");
		lblNewLabel.setFont(new Font("Big Caslon", Font.BOLD, 24));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(750, 0, 130, 79);
		panel.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon("/Users/richiekenathcollin/Desktop/Christ University /3 MCA/Java (MCA372)/Eclipse/back.png"));
		btnNewButton.setBackground(new Color(210, 179, 140));
		btnNewButton.setBounds(1403, 0, 70, 77);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("D:\\MCA\\Trimester 3\\Java\\Java Theory\\cac2\\image.jpg"));
		ImageIcon icon=new ImageIcon("D:\\\\MCA\\\\Trimester 3\\\\Java\\\\Java Theory\\\\cac2\\\\image.jpg");
		Image img=icon.getImage();
		Image imgScale=img.getScaledInstance(lblNewLabel_1.getWidth(), lblNewLabel_1.getHeight(), lblNewLabel_1.SCALE_DEFAULT);
		icon=new ImageIcon(imgScale);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(0, 0, 250, 79);
		panel.add(lblNewLabel_1);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			
			}
		});


	}
}
