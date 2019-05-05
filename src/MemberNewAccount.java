import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class MemberNewAccount extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsername;
	private JPasswordField passPassword;
	ArrayList<Logs> list = new ArrayList<Logs>();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MemberNewAccount frame = new MemberNewAccount();
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
	public MemberNewAccount() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMemberCreateAccount = new JLabel("Member Create Account");
		lblMemberCreateAccount.setHorizontalAlignment(SwingConstants.CENTER);
		lblMemberCreateAccount.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblMemberCreateAccount.setBounds(207, 185, 230, 28);
		contentPane.add(lblMemberCreateAccount);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblUsername.setBounds(207, 224, 102, 28);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPassword.setBounds(207, 263, 102, 28);
		contentPane.add(lblPassword);
		
		txtUsername = new JTextField();
		txtUsername.setColumns(10);
		txtUsername.setBounds(319, 224, 118, 28);
		contentPane.add(txtUsername);
		
		passPassword = new JPasswordField();
		passPassword.setBounds(319, 263, 118, 28);
		contentPane.add(passPassword);
		
		JButton btnBack = new JButton("<-");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				MemberLogin obj = new MemberLogin();
				obj.setVisible(true);
			}
		});
		btnBack.setBounds(629, 461, 45, 40);
		contentPane.add(btnBack);
		
		JButton btnCreate = new JButton("Create");
		btnCreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String user = txtUsername.getText();
				String pass = new String(passPassword.getPassword());
				Logs log = new Logs(user, pass, "Admin", null, false);
				list.add(log);
			}
		});
		btnCreate.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnCreate.setBounds(274, 302, 89, 23);
		contentPane.add(btnCreate);
	}
}
