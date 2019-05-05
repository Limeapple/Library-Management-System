import java.awt.BorderLayout;
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
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class AdminNewAccount extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsername;
	private JPasswordField passPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminNewAccount frame = new AdminNewAccount();
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
	public AdminNewAccount() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblUsername.setBounds(207, 200, 102, 28);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPassword.setBounds(207, 239, 102, 28);
		contentPane.add(lblPassword);
		
		txtUsername = new JTextField();
		txtUsername.setColumns(10);
		txtUsername.setBounds(319, 200, 118, 28);
		contentPane.add(txtUsername);
		
		passPassword = new JPasswordField();
		passPassword.setBounds(319, 239, 118, 28);
		contentPane.add(passPassword);
		
		JButton btnCreate = new JButton("Create");
		btnCreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String user = txtUsername.getText();
				String pass = new String(passPassword.getPassword());
				Logs log = new Logs(user, pass, "Admin", null, false);
				AdminMainFrame.list.add(log);

			}
		});
		btnCreate.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnCreate.setBounds(272, 278, 89, 23);
		contentPane.add(btnCreate);
		
		JLabel lblAdminCreateAccount = new JLabel("Admin Create Account");
		lblAdminCreateAccount.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdminCreateAccount.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblAdminCreateAccount.setBounds(207, 161, 230, 28);
		contentPane.add(lblAdminCreateAccount);
		
		JButton btnBack = new JButton("<-");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				AdminLogin obj = new AdminLogin();
				obj.setVisible(true);
			}
		});
		btnBack.setBounds(629, 461, 45, 40);
		contentPane.add(btnBack);
	}
}
