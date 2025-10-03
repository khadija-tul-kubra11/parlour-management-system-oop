//WELCOME PAGE:
package project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class welcomepage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					welcomepage frame = new welcomepage();
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
	public welcomepage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 773, 408);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(221, 160, 221));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("Login To Dashboard");
		btnNewButton.setBackground(new Color(153, 204, 153));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				  String inputPassword = JOptionPane.showInputDialog(null, "Enter Password:", "Login", JOptionPane.PLAIN_MESSAGE);

			        // Null means cancel button was pressed
			        if (inputPassword != null) {
			            String correctPassword = "12345"; // ✅ Set your actual password here

			            if (inputPassword.equals(correctPassword)) {
			                // Correct password
			                dashboard frame = new dashboard();
			                frame.setVisible(true);
			                dispose();
			            } else {
			                // Incorrect password
			                JOptionPane.showMessageDialog(null, "Incorrect password!", "Access Denied", JOptionPane.ERROR_MESSAGE);
			            }
			        }
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		
		JLabel lblNewLabel = new JLabel("Welcome To GlowUp Salon");
		lblNewLabel.setBackground(new Color(204, 153, 153));
		lblNewLabel.setFont(new Font("Brush Script MT", Font.PLAIN, 52));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(290)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 186, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(121, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap(147, Short.MAX_VALUE)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 489, GroupLayout.PREFERRED_SIZE)
					.addGap(111))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(23)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
					.addGap(31)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(136, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}

}

//DASHBOARD:
package project;
import javax.swing.JOptionPane;

import project.employe;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class dashboard extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					dashboard frame = new dashboard();
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
	public dashboard() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 614, 324);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(221, 160, 221));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("Customer\r\n");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				customer frame = new customer();
				frame.setVisible(true);
				dispose();
			}
			
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnNewButton.setBackground(new Color(153, 204, 153));
		
		JLabel lblNewLabel = new JLabel("GlowUp Parlor Dashboard\r\n");
		lblNewLabel.setFont(new Font("Script MT Bold", Font.PLAIN, 23));
		
		JButton btnEmployes = new JButton("Employes");
		btnEmployes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 JPasswordField pf = new JPasswordField();
			        
			        // Show confirm dialog with password field
			        int okCxl = JOptionPane.showConfirmDialog(
			            null, pf, "Enter Password", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE
			        );

			        // If user presses OK
			        if (okCxl == JOptionPane.OK_OPTION) {
			            String password = new String(pf.getPassword());

			            // Check the password (you can change "admin123" to your desired password)
			            if ("mkf123".equals(password)) {
			                employe frame = new employe(); // Replace with your actual Employee form class name
			                frame.setVisible(true);
			            } else {
			                JOptionPane.showMessageDialog(null, "Incorrect Password!", "Access Denied", JOptionPane.ERROR_MESSAGE);
			            }
			        }
			    }
			});
		btnEmployes.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnEmployes.setBackground(new Color(153, 204, 153));
		
		JButton btnAppointments = new JButton("Appointments");
		btnAppointments.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				appointments frame = new appointments();
				frame.setVisible(true);
				dispose();
			}
			
		});
		btnAppointments.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnAppointments.setBackground(new Color(153, 204, 153));
		
		JButton btnServices = new JButton("Services");
		btnServices.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Services frame = new Services();
				frame.setVisible(true);
				dispose();
			}
		});
		btnServices.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnServices.setBackground(new Color(153, 204, 153));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(148)
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 276, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(215)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addComponent(btnNewButton, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
								.addComponent(btnServices, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnAppointments, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnEmployes, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(164, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(5)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnNewButton)
					.addGap(18)
					.addComponent(btnServices, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnAppointments, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnEmployes, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(99, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}

//CUSTOMER:
package project;

import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import com.dbutil.DBUtil;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class customer extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblAdress;
	private JTextField textField_2;
	private JTextField textField_3;
	private JLabel lblEmail;
	private JTextField textField_4;
	private JButton btnNewButton;
	private JButton btnSaveCustomer;
	private static int customerCounter = 1;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					customer frame = new customer();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public customer() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(221, 160, 221));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JLabel lblNewLabel = new JLabel("Customer_ID");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 15));

		textField = new JTextField();
		

		JLabel lblCustomerName = new JLabel("Customer_Name:");
		lblCustomerName.setFont(new Font("Times New Roman", Font.PLAIN, 15));

		textField_1 = new JTextField();
		textField_1.setColumns(10);

		JLabel lblContactNo = new JLabel("Contact_No:");
		lblContactNo.setFont(new Font("Times New Roman", Font.PLAIN, 15));

		lblAdress = new JLabel("Customer_Address");
		lblAdress.setFont(new Font("Times New Roman", Font.PLAIN, 15));

		textField_2 = new JTextField();
		textField_2.setColumns(10);

		textField_3 = new JTextField();
		textField_3.setColumns(10);

		lblEmail = new JLabel("Customer_Email");
		lblEmail.setFont(new Font("Times New Roman", Font.PLAIN, 15));

		textField_4 = new JTextField();
		textField_4.setColumns(10);

		btnNewButton = new JButton("Back");
		btnNewButton.setBackground(new Color(255, 99, 71));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dashboard frame = new dashboard();
				frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 15));

		btnSaveCustomer = new JButton("Save Customer");
		btnSaveCustomer.setBackground(new Color(153, 204, 102));
		btnSaveCustomer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String customerId = textField.getText().trim();
				String customerName = textField_1.getText().trim();
				String contactNo = textField_2.getText().trim();
				String customerAddress = textField_3.getText().trim();
				String customerEmail = textField_4.getText().trim();

				if (customerEmail.isEmpty() || customerId.isEmpty() || customerName.isEmpty() ||
						customerAddress.isEmpty() || contactNo.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Please fill all fields!", "Error", JOptionPane.ERROR_MESSAGE);
					return;
				}

				if (!customerName.matches("[a-zA-Z ]+")) {
					JOptionPane.showMessageDialog(null, "Name must only contain letters!", "Error", JOptionPane.ERROR_MESSAGE);
					return;
				}

				if (!contactNo.matches("\\d+")) {
					JOptionPane.showMessageDialog(null, "Phone must only contain numbers!", "Error", JOptionPane.ERROR_MESSAGE);
					return;
				}

				if (!customerEmail.matches("^[\\w.-]+@[\\w.-]+\\.\\w+$")) {
					JOptionPane.showMessageDialog(null, "Invalid email format!", "Error", JOptionPane.ERROR_MESSAGE);
					return;
				}
				

				try {
					DBUtil.executeQuery("INSERT INTO CUSTOMERS (CUSTOMER_ID, CUSTOMER_NAME, CONTACT_NO, CUSTOMER_ADDRESS, CUSTOMER_EMAIL) VALUES ('"+textField.getText()+"','"+textField_1.getText()+"','"+textField_2.getText()+"','"+textField_3.getText()+"','"+textField_4.getText()+"')");
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				JOptionPane.showMessageDialog(null, "Saved Successfully!");
			}
		});
		btnSaveCustomer.setFont(new Font("Times New Roman", Font.PLAIN, 15));

		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addComponent(lblNewLabel)
								.addComponent(lblCustomerName)
								.addComponent(lblContactNo, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblEmail, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblAdress, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 178, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 178, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 178, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 178, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, 178, GroupLayout.PREFERRED_SIZE))
							.addContainerGap(96, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 179, Short.MAX_VALUE)
							.addComponent(btnSaveCustomer)
							.addGap(56))))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(lblCustomerName, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(GroupLayout.Alignment.TRAILING)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblContactNo, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblAdress, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblEmail, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
					.addGap(32)
					.addGroup(gl_contentPane.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(btnNewButton)
						.addComponent(btnSaveCustomer))
					.addContainerGap(30, Short.MAX_VALUE))
		);

		contentPane.setLayout(gl_contentPane);
	}

	// Customer ID Generator Function
	private String generateCustomerId() {
		return String.format("CUST%03d", customerCounter++);
	}
}
//SERVICES:
package project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.table.DefaultTableModel;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Services extends JFrame {

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
					Services frame = new Services();
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
	public Services() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 532, 338);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(221, 160, 221));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		table = new JTable();
		table.setCellSelectionEnabled(true);
		table.setColumnSelectionAllowed(true);
		table.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"S001", "Haircut", new Float(800.0f)},
				{"S002", "Hair Coloring", new Float(2500.0f)},
				{"S003", "Facial", new Float(1500.0f)},
				{"S004", "Threading", new Float(300.0f)},
				{"S005", "Waxing", new Float(1000.0f)},
				{"S006", "Makeup (Bridal)", new Float(40000.0f)},
				{"S007", "Makeup (Party)", new Float(10000.0f)},
				{"S008", "Manicure", new Float(700.0f)},
				{"S009", "Pedicure", new Float(800.0f)},
				{"S010", "Hair Treatment", new Float(5000.0f)},
				{"S011", "Bleach", new Float(300.0f)},
				{"S012", "Mehndi Application", new Float(1500.0f)},
				{"S013", "Mehndi Bridle", new Float(2000.0f)},
				{"S014", "Nail Treatment", new Float(1500.0f)},
			},
			new String[] {
				"Services ID", "Service Name", "Prices"
			}
		) {
			Class[] columnTypes = new Class[] {
				Object.class, String.class, Float.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.getColumnModel().getColumn(0).setResizable(false);
		table.getColumnModel().getColumn(0).setPreferredWidth(65);
		table.getColumnModel().getColumn(1).setPreferredWidth(110);
		table.getColumnModel().getColumn(1).setMinWidth(35);
		table.getColumnModel().getColumn(1).setMaxWidth(125);
		table.getColumnModel().getColumn(2).setPreferredWidth(55);
		
		JLabel lblNewLabel = new JLabel("Service ID");
		lblNewLabel.setBackground(new Color(255, 128, 128));
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		
		JLabel lblServiceName = new JLabel("Service Name");
		lblServiceName.setBackground(new Color(255, 157, 157));
		lblServiceName.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.setBackground(new Color(255, 99, 71));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dashboard frame = new dashboard();
				frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(21)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
							.addGap(88)
							.addComponent(lblServiceName, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
							.addGap(39)
							.addComponent(lblPrice, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
							.addGap(58))
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addComponent(table, GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE)
							.addContainerGap())))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(205)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(226, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblServiceName, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblPrice, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(table, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
					.addComponent(btnNewButton))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
//APPOINTMENT:
package project;
import javax.swing.JOptionPane;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.dbutil.DBUtil;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JCheckBox;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JScrollBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class appointments extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JLabel lblStatus;
	private JButton btnNewButton;
	private JButton btnClear;
	private JButton btnBookAppointment;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;

	/**
	 * Launch the application.
	 */
	public void updateStatus() {
		lblStatus .setText("Completed"); // 'statusLabel' ka naam aapke label ke name ke mutabiq hona chahiye
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					appointments frame = new appointments();
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
	public appointments() {
		setBackground(new Color(102, 255, 102));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 529, 336);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(221, 160, 221));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Appointment_ID");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JLabel lblServicesId = new JLabel("Service_ ID");
		lblServicesId.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		JLabel lblCustomerId = new JLabel("Customer_ ID");
		lblCustomerId.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		JLabel lblAppointmentDate = new JLabel("Appointment_Date");
		lblAppointmentDate.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
	     

		
		btnNewButton = new JButton("Back");
		btnNewButton.setBackground(new Color(255, 99, 71));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dashboard frame = new dashboard();
				frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		
		btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
			}
		});
		btnClear.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		
		btnBookAppointment = new JButton("Book Appointment");
		btnBookAppointment.setBackground(new Color(153, 204, 102));
		btnBookAppointment.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        String appointmentId = textField.getText().trim();
		        String serviceId = textField_1.getText().trim();
		        String customerId = textField_2.getText().trim();
		        String appointmentDateInput = textField_3.getText().trim(); // User input date

		        if (appointmentId.isEmpty() || serviceId.isEmpty() || customerId.isEmpty() || appointmentDateInput.isEmpty()) {
		            JOptionPane.showMessageDialog(null, "Please fill all fields!", "Error", JOptionPane.ERROR_MESSAGE);
		            return;
		        }

		        try {
		            // Date conversion from dd-MM-yyyy to yyyy-MM-dd
		            java.text.SimpleDateFormat inputFormat = new java.text.SimpleDateFormat("dd-MM-yyyy");
		            inputFormat.setLenient(false);  // prevent invalid dates like 32-01-2024
		            java.util.Date parsedDate = inputFormat.parse(appointmentDateInput);

		            java.text.SimpleDateFormat sqlFormat = new java.text.SimpleDateFormat("yyyy-MM-dd");
		            String appointmentDateFormatted = sqlFormat.format(parsedDate);

		            // SQL Query
		            String query = "INSERT INTO APPOINTMENTS (APPOINTMENT_ID, SERVICE_ID, CUSTOMER_ID, APPOINTMENT_DATE) " +
		                           "VALUES ('" + appointmentId + "', '" + serviceId + "', '" + customerId + "', '" + appointmentDateFormatted + "')";

		            DBUtil.executeQuery(query);

		            JOptionPane.showMessageDialog(null, "Saved Successfully!");
		        } catch (java.text.ParseException ex) {
		            JOptionPane.showMessageDialog(null, "Invalid date format! Please use dd-MM-yyyy (e.g., 13-04-2006)", "Error", JOptionPane.ERROR_MESSAGE);
		        } catch (Exception ex) {
		            ex.printStackTrace();
		            JOptionPane.showMessageDialog(null, "Error saving data to database.", "Error", JOptionPane.ERROR_MESSAGE);
		        }
		    }
		});

		btnBookAppointment.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		
		lblNewLabel_1 = new JLabel("Payment");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		
		lblNewLabel_2 = new JLabel("Cash");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
							.addComponent(btnClear, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
									.addComponent(lblServicesId, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
									.addComponent(lblCustomerId, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
									.addComponent(lblAppointmentDate, GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE))
								.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE))
							.addGap(43)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_2, GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
									.addComponent(textField_3, GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
									.addComponent(textField_2, GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
									.addComponent(textField_1, GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
									.addComponent(textField, GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)))))
					.addGap(89)
					.addComponent(btnBookAppointment)
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblServicesId, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCustomerId, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblAppointmentDate, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
					.addGap(29)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewButton)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(btnBookAppointment, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
							.addComponent(btnClear, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(63, Short.MAX_VALUE))
		);
		
		
		contentPane.setLayout(gl_contentPane);
		
		
	}
}
//EMPLOYEE:
package project;
import javax.swing.JOptionPane;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.dbutil.DBUtil;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class employe extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField employee_id_text;
	private JTextField employee_name_text;
	private JLabel lblContactNo;
	private JTextField employee_contact_text;
	private JLabel lblSpecialization;
	private JTextField employee_specialization_text;
	private JLabel lblSalary;
	private JTextField employee_salary_text;
	private JButton btnNewButton;
	private JButton btnSave;
    
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					employe frame = new employe();
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
	public employe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(221, 160, 221));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Employee_ID\r\n");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		
		employee_id_text = new JTextField();
		employee_id_text.setColumns(10);
		
		JLabel lblEmployeeName = new JLabel("Employee_Name");
		lblEmployeeName.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		
		employee_name_text = new JTextField();
		employee_name_text.setColumns(10);
		
		lblContactNo = new JLabel("Contact_No");
		lblContactNo.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		
		employee_contact_text = new JTextField();
		employee_contact_text.setColumns(10);
		
		lblSpecialization = new JLabel("Specialization");
		lblSpecialization.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		
		employee_specialization_text = new JTextField();
		employee_specialization_text.setColumns(10);
		
		lblSalary = new JLabel("Salary");
		lblSalary.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		
		employee_salary_text = new JTextField();
		employee_salary_text.setColumns(10);
		
		btnNewButton = new JButton("Back");
		btnNewButton.setBackground(new Color(255, 99, 71));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dashboard frame = new dashboard();
				frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		
		btnSave = new JButton("Save");
		btnSave.setBackground(new Color(153, 255, 102));
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//ISERT ITO DATABase
				
				try {
					DBUtil.executeQuery("INSERT INTO EMPLOYES (EMPLOYEE_ID, EMPLOYEE_NAME, CONTACT_NO, SPECIALIZATION, SALARY) VALUES ('"+employee_id_text.getText()+"','"+employee_name_text.getText()+"','"+employee_contact_text.getText()+"','"+employee_specialization_text.getText()+"','"+employee_salary_text.getText()+"')");
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				 JOptionPane.showMessageDialog(null, "Saved Successfully");
			}
		});
		btnSave.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(19)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblSpecialization, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblEmployeeName)
								.addComponent(lblContactNo, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblSalary, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE))
							.addGap(49)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(employee_salary_text, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE)
								.addComponent(employee_name_text, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE)
								.addComponent(employee_id_text, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE)
								.addComponent(employee_specialization_text, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE)
								.addComponent(employee_contact_text, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE))
							.addContainerGap(85, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
							.addComponent(btnSave, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
							.addGap(50))))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
						.addComponent(employee_id_text, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(13)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(employee_name_text, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblEmployeeName, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
					.addGap(13)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(employee_contact_text, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblContactNo, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblSpecialization, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
						.addComponent(employee_specialization_text, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblSalary, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
						.addComponent(employee_salary_text, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnSave, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
					.addGap(19))
		);
		contentPane.setLayout(gl_contentPane);
	}

}