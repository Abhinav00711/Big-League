package swingex;

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
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class Cart extends JFrame {

	private JPanel contentPane;
	
	public static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    public static final String DB_URL = "jdbc:mysql://localhost:3306/JP";
    public static final String USER = "root";
    public static final String PASS = "Hello@1234";
    private JTable table;
    private JTable table_1;

	/**
	 * Launch the application.
	 */
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

	/**
	 * Create the frame.
	 * @throws SQLException 
	 */
	public Cart() throws SQLException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize (1474,1080); //full screen
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(156, 102, 68));
		panel_1.setBounds(0, 79, 1474, 973);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(147, 78, 1163, 529);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_3.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(42, 53, 247, 402);
		panel_2.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("New label");
		lblNewLabel_3_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_3_1.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		lblNewLabel_3_1.setBounds(358, 53, 220, 402);
		panel_2.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("New label");
		lblNewLabel_3_2.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_3_2.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		lblNewLabel_3_2.setBounds(652, 53, 215, 402);
		panel_2.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_3 = new JLabel("New label");
		lblNewLabel_3_3.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_3_3.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		lblNewLabel_3_3.setBounds(869, 53, 220, 402);
		panel_2.add(lblNewLabel_3_3);
		
	    JLabel lblNewLabel_4 = new JLabel("");
	    lblNewLabel_4.setFont(new Font("Century Gothic", Font.BOLD, 14));
	    lblNewLabel_4.setBounds(877, 476, 212, 43);
	    panel_2.add(lblNewLabel_4);
	    
		int total=0;
		try {
		    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tcf", "root","admin");

		    Statement statement = connection.createStatement();
		    ResultSet resultSet = statement.executeQuery("SELECT * FROM cart");

		    StringBuilder labelText = new StringBuilder();
		    StringBuilder labelText1 = new StringBuilder();
		    StringBuilder labelText2 = new StringBuilder();
		    StringBuilder labelText3 = new StringBuilder();
		    while (resultSet.next()) {
		        String column1Data = resultSet.getString(2);
		        String column2Data = resultSet.getString(3);
		        String column3Data = resultSet.getString(4);
		        labelText.append(column1Data).append("<br><br>");
		        labelText1.append(column2Data).append("<br><br>");
		        labelText2.append(column3Data).append("<br><br>");
		        labelText3.append(Integer.parseInt(column2Data)*Integer.parseInt(column3Data)).append("<br><br>");
		        total=Integer.parseInt(column2Data)*Integer.parseInt(column3Data)+total;
		    }
		    lblNewLabel_3.setText("<html>" + labelText.toString() + "</html>");
		    lblNewLabel_3_1.setText("<html>" + labelText1.toString() + "</html>");
		    lblNewLabel_3_2.setText("<html>" + labelText2.toString() + "</html>");
		    lblNewLabel_3_3.setText("<html>" + labelText3.toString() + "</html>");
		    lblNewLabel_4.setText("<html>" + total + "</html>");
		    
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
		    


		    resultSet.close();
		    statement.close();
		    connection.close();
		} catch (SQLException e) {
		    e.printStackTrace();
		}

		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(237, 224, 211));
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
		lblNewLabel_1.setIcon(new ImageIcon("/Users/richiekenathcollin/Desktop/Christ University /3 MCA/Java (MCA372)/Eclipse/logo(f).png"));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(0, 0, 250, 79);
		panel.add(lblNewLabel_1);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				TCF second = new TCF();
		        setVisible(false); // Hide current frame
		        second.setVisible(true); //second frame
			
			}
		});
		//------------------------------------------------------------------------------

//		table = new JTable();
//		table.setBounds(132, 101, 690, 365);
//		panel_1.add(table);
//		JScrollPane scrollPane = new JScrollPane(table);
//		
//		
//		DefaultTableModel model = new DefaultTableModel();
//		model.addColumn("Column 1");
//		model.addColumn("Column 2");
//
//		// Create a database connection
//		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tcf", "root","admin");
//
//		// Create a statement object and execute a query
//		Statement statement = connection.createStatement();
//		ResultSet resultSet = statement.executeQuery("SELECT * FROM cart");
//
//		// Loop through the result set and add data to the table model
//		while (resultSet.next()) {
//		    Object[] rowData = new Object[]{resultSet.getString(1), resultSet.getString(2)};
//		    model.addRow(rowData);
//		}
//
//		// Close the database connection and statement
//		resultSet.close();
//		statement.close();
//		connection.close();
//
//		// Set the model on the JTable
//		table.setModel(model);

	}
}
