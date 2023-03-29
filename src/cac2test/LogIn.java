package cac2test;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class LogIn extends JFrame {

	private JPanel contentPane;
	private JTextField unameSignUp;
	private JTextField pwSignUp;
	private JTextField unameLogin;
	private JTextField pwLogin;
	private JTextField pwConfirm;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogIn frame = new LogIn();
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
	public LogIn() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1153, 549);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(176, 196, 222));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("WELCOME TO BIG-LEAGUE");
		lblNewLabel.setFont(new Font("Perpetua Titling MT", Font.BOLD, 30));
		lblNewLabel.setBounds(354, 10, 428, 54);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(233, 150, 122));
		panel.setBounds(160, 74, 332, 428);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("USERNAME");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(110, 77, 100, 25);
		panel.add(lblNewLabel_1);
		
		unameSignUp = new JTextField();
		unameSignUp.setBounds(10, 112, 312, 34);
		panel.add(unameSignUp);
		unameSignUp.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("SIGN UP");
		lblNewLabel_2.setFont(new Font("Verdana", Font.BOLD, 22));
		lblNewLabel_2.setBounds(110, 22, 132, 21);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("PASSWORD");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(110, 170, 105, 21);
		panel.add(lblNewLabel_1_1);
		
		pwSignUp = new JTextField();
		pwSignUp.setColumns(10);
		pwSignUp.setBounds(10, 201, 312, 34);
		panel.add(pwSignUp);
		
		JButton btnNewButton = new JButton("SIGN UP");
		btnNewButton.setBackground(new Color(144, 238, 144));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 21));
		btnNewButton.setBounds(98, 384, 144, 34);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("CONFIRM PASSWORD");
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1_2.setBounds(63, 270, 209, 21);
		panel.add(lblNewLabel_1_1_2);
		
		pwConfirm = new JTextField();
		pwConfirm.setColumns(10);
		pwConfirm.setBounds(10, 301, 312, 34);
		panel.add(pwConfirm);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(107, 142, 35));
		panel_1.setLayout(null);
		panel_1.setBounds(654, 74, 332, 428);
		contentPane.add(panel_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("USERNAME");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_2.setBounds(110, 77, 100, 25);
		panel_1.add(lblNewLabel_1_2);
		
		unameLogin = new JTextField();
		unameLogin.setColumns(10);
		unameLogin.setBounds(10, 112, 312, 34);
		panel_1.add(unameLogin);
		
		JLabel lblNewLabel_2_1 = new JLabel("LOG IN");
		lblNewLabel_2_1.setFont(new Font("Verdana", Font.BOLD, 22));
		lblNewLabel_2_1.setBounds(110, 22, 132, 21);
		panel_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("PASSWORD");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1_1.setBounds(110, 191, 105, 21);
		panel_1.add(lblNewLabel_1_1_1);
		
		pwLogin = new JTextField();
		pwLogin.setColumns(10);
		pwLogin.setBounds(10, 223, 312, 34);
		panel_1.add(pwLogin);
		
		JButton btnLogIn = new JButton("LOG IN");
		btnLogIn.setBackground(new Color(60, 179, 113));
		btnLogIn.setFont(new Font("Tahoma", Font.PLAIN, 21));
		btnLogIn.setBounds(98, 384, 144, 34);
		panel_1.add(btnLogIn);
	}
}
