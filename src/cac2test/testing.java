package cac2test;
import cac2test.cart;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollBar;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import java.awt.Font;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JSlider;
import java.awt.Canvas;
import java.awt.Label;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;

public class testing extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					testing frame = new testing();
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws IOException 
	 */
	public testing() throws IOException {
		setBackground(new Color(176, 196, 222));
		setTitle("SportsOnline!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1645,1078);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(176, 196, 222));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Products");
		lblNewLabel.setBounds(10, 0, 209, 38);
		lblNewLabel.setFont(new Font("Baskerville Old Face", Font.BOLD, 37));
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(176, 196, 222));
		panel.setBounds(10, 41, 1087, 239);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(0, 3, 0, 0));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(102, 102, 102));
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Tennis Ball");
		lblNewLabel_1.setFont(new Font("Poor Richard", Font.PLAIN, 24));
		lblNewLabel_1.setBounds(10, 10, 110, 40);
		panel_3.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("5 Rs");
		lblNewLabel_2.setFont(new Font("Perpetua Titling MT", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(308, 11, 44, 40);
		panel_3.add(lblNewLabel_2);
		
		JButton btnNewButton_1 = new JButton("Add to cart");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1.setBounds(242, 215, 110, 21);
		panel_3.add(btnNewButton_1);
		
		JLabel lblNewLabel_3_6 = new JLabel("Number:");
		lblNewLabel_3_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3_6.setBounds(10, 215, 55, 21);
		panel_3.add(lblNewLabel_3_6);
		
		textField = new JTextField();
		textField.setBounds(75, 218, 96, 19);
		panel_3.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\Nikhil Pinto\\eclipse-workspace\\Demo\\src\\images\\tennis.jpg"));
		lblNewLabel_4.setBounds(113, 60, 148, 147);
		panel_3.add(lblNewLabel_4);
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setBackground(new Color(119, 136, 153));
		panel.add(panel_3_1);
		panel_3_1.setLayout(null);
		
		JLabel lblNewLabel_1_1 = new JLabel("Football");
		lblNewLabel_1_1.setFont(new Font("Poor Richard", Font.PLAIN, 24));
		lblNewLabel_1_1.setBounds(10, 10, 110, 40);
		panel_3_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("12 Rs");
		lblNewLabel_2_1.setFont(new Font("Perpetua Titling MT", Font.PLAIN, 20));
		lblNewLabel_2_1.setBounds(291, 10, 61, 40);
		panel_3_1.add(lblNewLabel_2_1);
		
		JButton btnNewButton_1_1 = new JButton("Add to cart");
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1_1.setBounds(242, 215, 110, 21);
		panel_3_1.add(btnNewButton_1_1);
		
		JLabel lblNewLabel_3_5 = new JLabel("Number:");
		lblNewLabel_3_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3_5.setBounds(10, 215, 55, 21);
		panel_3_1.add(lblNewLabel_3_5);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(75, 218, 96, 19);
		panel_3_1.add(textField_5);
		
		JLabel lblNewLabel_4_1 = new JLabel("New label");
		lblNewLabel_4_1.setIcon(new ImageIcon("C:\\Users\\Nikhil Pinto\\eclipse-workspace\\Demo\\src\\images\\football.jpg"));
		lblNewLabel_4_1.setBounds(118, 60, 148, 147);
		panel_3_1.add(lblNewLabel_4_1);
		
		JPanel panel_3_2 = new JPanel();
		panel_3_2.setBackground(new Color(102, 102, 102));
		panel.add(panel_3_2);
		panel_3_2.setLayout(null);
		
		JLabel lblNewLabel_1_2 = new JLabel("Cricket Ball");
		lblNewLabel_1_2.setFont(new Font("Poor Richard", Font.PLAIN, 24));
		lblNewLabel_1_2.setBounds(10, 10, 131, 40);
		panel_3_2.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_2_2 = new JLabel("3 Rs");
		lblNewLabel_2_2.setFont(new Font("Perpetua Titling MT", Font.PLAIN, 20));
		lblNewLabel_2_2.setBounds(308, 10, 44, 40);
		panel_3_2.add(lblNewLabel_2_2);
		
		JButton btnNewButton_1_2 = new JButton("Add to cart");
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1_2.setBounds(242, 215, 110, 21);
		panel_3_2.add(btnNewButton_1_2);
		
		JLabel lblNewLabel_3_4 = new JLabel("Number:");
		lblNewLabel_3_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3_4.setBounds(10, 215, 55, 21);
		panel_3_2.add(lblNewLabel_3_4);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(75, 218, 96, 19);
		panel_3_2.add(textField_6);
		
		JLabel lblNewLabel_4_2 = new JLabel("New label");
		lblNewLabel_4_2.setIcon(new ImageIcon(testing.class.getResource("/images/cricketball.jpg")));
		lblNewLabel_4_2.setBounds(126, 60, 148, 147);
		panel_3_2.add(lblNewLabel_4_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(176, 196, 222));
		panel_1.setBounds(10, 290, 1087, 239);
		contentPane.add(panel_1);
		panel_1.setLayout(new GridLayout(0, 3, 0, 0));
		
		JPanel panel_3_3 = new JPanel();
		panel_3_3.setBackground(new Color(119, 136, 153));
		panel_1.add(panel_3_3);
		panel_3_3.setLayout(null);
		
		JLabel lblNewLabel_1_3 = new JLabel("Tennis Raquet");
		lblNewLabel_1_3.setFont(new Font("Poor Richard", Font.PLAIN, 24));
		lblNewLabel_1_3.setBounds(10, 10, 152, 40);
		panel_3_3.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_2_5 = new JLabel("20 Rs");
		lblNewLabel_2_5.setFont(new Font("Perpetua Titling MT", Font.PLAIN, 20));
		lblNewLabel_2_5.setBounds(287, 10, 65, 40);
		panel_3_3.add(lblNewLabel_2_5);
		
		JButton btnNewButton_1_5 = new JButton("Add to cart");
		btnNewButton_1_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1_5.setBounds(242, 215, 110, 21);
		panel_3_3.add(btnNewButton_1_5);
		
		JLabel lblNewLabel_3_7 = new JLabel("Number:");
		lblNewLabel_3_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3_7.setBounds(10, 215, 55, 21);
		panel_3_3.add(lblNewLabel_3_7);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(75, 218, 96, 19);
		panel_3_3.add(textField_1);
		
		JLabel lblNewLabel_4_5 = new JLabel("New label");
		lblNewLabel_4_5.setIcon(new ImageIcon(testing.class.getResource("/images/raquet.jpg")));
		lblNewLabel_4_5.setBounds(107, 60, 148, 147);
		panel_3_3.add(lblNewLabel_4_5);
		
		JPanel panel_3_1_1 = new JPanel();
		panel_3_1_1.setBackground(new Color(102, 102, 102));
		panel_1.add(panel_3_1_1);
		panel_3_1_1.setLayout(null);
		
		JLabel lblNewLabel_1_6 = new JLabel("Football Shoes");
		lblNewLabel_1_6.setFont(new Font("Poor Richard", Font.PLAIN, 24));
		lblNewLabel_1_6.setBounds(10, 10, 140, 40);
		panel_3_1_1.add(lblNewLabel_1_6);
		
		JLabel lblNewLabel_2_4 = new JLabel("18 Rs");
		lblNewLabel_2_4.setFont(new Font("Perpetua Titling MT", Font.PLAIN, 20));
		lblNewLabel_2_4.setBounds(289, 10, 63, 40);
		panel_3_1_1.add(lblNewLabel_2_4);
		
		JButton btnNewButton_1_4 = new JButton("Add to cart");
		btnNewButton_1_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1_4.setBounds(242, 215, 110, 21);
		panel_3_1_1.add(btnNewButton_1_4);
		
		JLabel lblNewLabel_3_8 = new JLabel("Number:");
		lblNewLabel_3_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3_8.setBounds(10, 215, 55, 21);
		panel_3_1_1.add(lblNewLabel_3_8);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(75, 218, 96, 19);
		panel_3_1_1.add(textField_4);
		
		JLabel lblNewLabel_4_4 = new JLabel("New label");
		lblNewLabel_4_4.setIcon(new ImageIcon(testing.class.getResource("/images/shoes.jpg")));
		lblNewLabel_4_4.setBounds(111, 60, 148, 147);
		panel_3_1_1.add(lblNewLabel_4_4);
		
		JPanel panel_3_2_1 = new JPanel();
		panel_3_2_1.setBackground(new Color(119, 136, 153));
		panel_1.add(panel_3_2_1);
		panel_3_2_1.setLayout(null);
		
		JLabel lblNewLabel_1_4 = new JLabel("Cricket Helmet");
		lblNewLabel_1_4.setFont(new Font("Poor Richard", Font.PLAIN, 24));
		lblNewLabel_1_4.setBounds(10, 10, 147, 40);
		panel_3_2_1.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_2_3 = new JLabel("10 Rs");
		lblNewLabel_2_3.setFont(new Font("Perpetua Titling MT", Font.PLAIN, 20));
		lblNewLabel_2_3.setBounds(297, 10, 55, 40);
		panel_3_2_1.add(lblNewLabel_2_3);
		
		JButton btnNewButton_1_3 = new JButton("Add to cart");
		btnNewButton_1_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1_3.setBounds(242, 215, 110, 21);
		panel_3_2_1.add(btnNewButton_1_3);
		
		JLabel lblNewLabel_3_3 = new JLabel("Number:");
		lblNewLabel_3_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3_3.setBounds(10, 215, 55, 21);
		panel_3_2_1.add(lblNewLabel_3_3);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(75, 218, 96, 19);
		panel_3_2_1.add(textField_7);
		
		JLabel lblNewLabel_4_3 = new JLabel("New label");
		lblNewLabel_4_3.setIcon(new ImageIcon(testing.class.getResource("/images/helmet.jpg")));
		lblNewLabel_4_3.setBounds(127, 60, 148, 147);
		panel_3_2_1.add(lblNewLabel_4_3);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(176, 196, 222));
		panel_2.setBounds(10, 539, 1087, 238);
		contentPane.add(panel_2);
		panel_2.setLayout(new GridLayout(0, 3, 0, 0));
		
		JPanel panel_3_4 = new JPanel();
		panel_3_4.setBackground(new Color(102, 102, 102));
		panel_2.add(panel_3_4);
		panel_3_4.setLayout(null);
		
		JLabel lblNewLabel_1_7 = new JLabel("Basketball");
		lblNewLabel_1_7.setFont(new Font("Poor Richard", Font.PLAIN, 24));
		lblNewLabel_1_7.setBounds(10, 10, 110, 40);
		panel_3_4.add(lblNewLabel_1_7);
		
		JLabel lblNewLabel_2_6 = new JLabel("5 Rs");
		lblNewLabel_2_6.setFont(new Font("Perpetua Titling MT", Font.PLAIN, 20));
		lblNewLabel_2_6.setBounds(308, 10, 44, 40);
		panel_3_4.add(lblNewLabel_2_6);
		
		JButton btnNewButton_1_6 = new JButton("Add to cart");
		btnNewButton_1_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1_6.setBounds(242, 215, 110, 21);
		panel_3_4.add(btnNewButton_1_6);
		
		JLabel lblNewLabel_3 = new JLabel("Number:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(10, 215, 55, 21);
		panel_3_4.add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(75, 218, 96, 19);
		panel_3_4.add(textField_2);
		
		JLabel lblNewLabel_4_6 = new JLabel("New label");
		lblNewLabel_4_6.setIcon(new ImageIcon(testing.class.getResource("/images/basketball.jpg")));
		lblNewLabel_4_6.setBounds(102, 58, 148, 147);
		panel_3_4.add(lblNewLabel_4_6);
		
		JPanel panel_3_1_2 = new JPanel();
		panel_3_1_2.setBackground(new Color(119, 136, 153));
		panel_2.add(panel_3_1_2);
		panel_3_1_2.setLayout(null);
		
		JLabel lblNewLabel_1_5 = new JLabel("Goalie Gloves");
		lblNewLabel_1_5.setFont(new Font("Poor Richard", Font.PLAIN, 24));
		lblNewLabel_1_5.setBounds(10, 10, 143, 40);
		panel_3_1_2.add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_2_7 = new JLabel("8 Rs");
		lblNewLabel_2_7.setFont(new Font("Perpetua Titling MT", Font.PLAIN, 20));
		lblNewLabel_2_7.setBounds(308, 10, 44, 40);
		panel_3_1_2.add(lblNewLabel_2_7);
		
		JButton btnNewButton_1_7 = new JButton("Add to cart");
		btnNewButton_1_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1_7.setBounds(242, 215, 110, 21);
		panel_3_1_2.add(btnNewButton_1_7);
		
		JLabel lblNewLabel_3_1 = new JLabel("Number:");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3_1.setBounds(10, 215, 55, 21);
		panel_3_1_2.add(lblNewLabel_3_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(75, 218, 96, 19);
		panel_3_1_2.add(textField_3);
		
		JLabel lblNewLabel_4_7 = new JLabel("New label");
		lblNewLabel_4_7.setIcon(new ImageIcon(testing.class.getResource("/images/glovesGoal.jpg")));
		lblNewLabel_4_7.setBounds(101, 58, 148, 147);
		panel_3_1_2.add(lblNewLabel_4_7);
		
		JPanel panel_3_2_2 = new JPanel();
		panel_3_2_2.setBackground(new Color(102, 102, 102));
		panel_2.add(panel_3_2_2);
		panel_3_2_2.setLayout(null);
		
		JLabel lblNewLabel_1_8 = new JLabel("Cricket Bat");
		lblNewLabel_1_8.setFont(new Font("Poor Richard", Font.PLAIN, 24));
		lblNewLabel_1_8.setBounds(10, 10, 110, 40);
		panel_3_2_2.add(lblNewLabel_1_8);
		
		JLabel lblNewLabel_2_8 = new JLabel("15 Rs");
		lblNewLabel_2_8.setFont(new Font("Perpetua Titling MT", Font.PLAIN, 20));
		lblNewLabel_2_8.setBounds(297, 10, 55, 40);
		panel_3_2_2.add(lblNewLabel_2_8);
		
		JButton btnNewButton_1_8 = new JButton("Add to cart");
		btnNewButton_1_8.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1_8.setBounds(242, 215, 110, 21);
		panel_3_2_2.add(btnNewButton_1_8);
		
		JLabel lblNewLabel_3_2 = new JLabel("Number:");
		lblNewLabel_3_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3_2.setBounds(10, 215, 55, 21);
		panel_3_2_2.add(lblNewLabel_3_2);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(75, 218, 96, 19);
		panel_3_2_2.add(textField_8);
		
		JLabel lblNewLabel_4_8 = new JLabel("New label");
		lblNewLabel_4_8.setIcon(new ImageIcon(testing.class.getResource("/images/bat.jpg")));
		lblNewLabel_4_8.setBounds(125, 58, 148, 147);
		panel_3_2_2.add(lblNewLabel_4_8);
		
		JButton btnNewButton = new JButton("View Cart");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cart c = new cart();
				c.setVisible(true);
			}
		});
		btnNewButton.setForeground(new Color(128, 0, 64));
		btnNewButton.setBackground(UIManager.getColor("Button.focus"));
		btnNewButton.setFont(new Font("Stencil", Font.PLAIN, 16));
		btnNewButton.setBounds(1300, 12, 158, 25);
		contentPane.add(btnNewButton);
		
		JPanel panel_3_1_3 = new JPanel();
		panel_3_1_3.setLayout(null);
		panel_3_1_3.setBackground(new Color(119, 136, 153));
		panel_3_1_3.setBounds(1096, 41, 362, 239);
		contentPane.add(panel_3_1_3);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Shuttle Cock");
		lblNewLabel_1_1_1.setFont(new Font("Poor Richard", Font.PLAIN, 24));
		lblNewLabel_1_1_1.setBounds(10, 10, 140, 40);
		panel_3_1_3.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("3 Rs");
		lblNewLabel_2_1_1.setFont(new Font("Perpetua Titling MT", Font.PLAIN, 20));
		lblNewLabel_2_1_1.setBounds(308, 10, 44, 40);
		panel_3_1_3.add(lblNewLabel_2_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("Add to cart");
		btnNewButton_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1_1_1.setBounds(242, 215, 110, 21);
		panel_3_1_3.add(btnNewButton_1_1_1);
		
		JLabel lblNewLabel_3_5_1 = new JLabel("Number:");
		lblNewLabel_3_5_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3_5_1.setBounds(10, 215, 55, 21);
		panel_3_1_3.add(lblNewLabel_3_5_1);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(75, 218, 96, 19);
		panel_3_1_3.add(textField_9);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("New label");
		lblNewLabel_4_1_1.setIcon(new ImageIcon(testing.class.getResource("/images/Shuttlecock.jpg")));
		lblNewLabel_4_1_1.setBounds(118, 60, 148, 147);
		panel_3_1_3.add(lblNewLabel_4_1_1);
		
		JPanel panel_3_1_4 = new JPanel();
		panel_3_1_4.setLayout(null);
		panel_3_1_4.setBackground(new Color(119, 136, 153));
		panel_3_1_4.setBounds(1096, 539, 362, 239);
		contentPane.add(panel_3_1_4);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Squash Raquet");
		lblNewLabel_1_1_2.setFont(new Font("Poor Richard", Font.PLAIN, 24));
		lblNewLabel_1_1_2.setBounds(10, 10, 173, 40);
		panel_3_1_4.add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("13 Rs");
		lblNewLabel_2_1_2.setFont(new Font("Perpetua Titling MT", Font.PLAIN, 20));
		lblNewLabel_2_1_2.setBounds(297, 15, 55, 40);
		panel_3_1_4.add(lblNewLabel_2_1_2);
		
		JButton btnNewButton_1_1_2 = new JButton("Add to cart");
		btnNewButton_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1_1_2.setBounds(242, 215, 110, 21);
		panel_3_1_4.add(btnNewButton_1_1_2);
		
		JLabel lblNewLabel_3_5_2 = new JLabel("Number:");
		lblNewLabel_3_5_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3_5_2.setBounds(10, 215, 55, 21);
		panel_3_1_4.add(lblNewLabel_3_5_2);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(75, 218, 96, 19);
		panel_3_1_4.add(textField_10);
		
		JLabel lblNewLabel_4_1_2 = new JLabel("New label");
		lblNewLabel_4_1_2.setIcon(new ImageIcon(testing.class.getResource("/images/squash.jpg")));
		lblNewLabel_4_1_2.setBounds(118, 60, 148, 147);
		panel_3_1_4.add(lblNewLabel_4_1_2);
		
		JPanel panel_3_2_2_1 = new JPanel();
		panel_3_2_2_1.setLayout(null);
		panel_3_2_2_1.setBackground(new Color(102, 102, 102));
		panel_3_2_2_1.setBounds(1096, 291, 362, 238);
		contentPane.add(panel_3_2_2_1);
		
		JLabel lblNewLabel_1_8_1 = new JLabel("Badminton Raquet");
		lblNewLabel_1_8_1.setFont(new Font("Poor Richard", Font.PLAIN, 24));
		lblNewLabel_1_8_1.setBounds(10, 10, 183, 40);
		panel_3_2_2_1.add(lblNewLabel_1_8_1);
		
		JLabel lblNewLabel_2_8_1 = new JLabel("16 Rs");
		lblNewLabel_2_8_1.setFont(new Font("Perpetua Titling MT", Font.PLAIN, 20));
		lblNewLabel_2_8_1.setBounds(297, 10, 55, 40);
		panel_3_2_2_1.add(lblNewLabel_2_8_1);
		
		JButton btnNewButton_1_8_1 = new JButton("Add to cart");
		btnNewButton_1_8_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1_8_1.setBounds(242, 215, 110, 21);
		panel_3_2_2_1.add(btnNewButton_1_8_1);
		
		JLabel lblNewLabel_3_2_1 = new JLabel("Number:");
		lblNewLabel_3_2_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3_2_1.setBounds(10, 215, 55, 21);
		panel_3_2_2_1.add(lblNewLabel_3_2_1);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(75, 218, 96, 19);
		panel_3_2_2_1.add(textField_11);
		
		JLabel lblNewLabel_4_8_1 = new JLabel("New label");
		lblNewLabel_4_8_1.setIcon(new ImageIcon(testing.class.getResource("/images/badminton.jpg")));
		lblNewLabel_4_8_1.setBounds(125, 58, 148, 147);
		panel_3_2_2_1.add(lblNewLabel_4_8_1);
	}
}
