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

public class AdminForgotPassword extends JFrame {

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
					AdminForgotPassword frame = new AdminForgotPassword();
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
	public AdminForgotPassword() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblUsername.setBounds(212, 220, 102, 28);
		contentPane.add(lblUsername);
		
		JLabel lblMemberChangePassword = new JLabel("Admin Change Password");
		lblMemberChangePassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblMemberChangePassword.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblMemberChangePassword.setBounds(212, 183, 230, 28);
		contentPane.add(lblMemberChangePassword);
		
		JLabel lblPassword = new JLabel("New Password");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPassword.setBounds(212, 259, 102, 28);
		contentPane.add(lblPassword);
		
		txtUsername = new JTextField();
		txtUsername.setColumns(10);
		txtUsername.setBounds(324, 220, 118, 28);
		contentPane.add(txtUsername);
		
		passPassword = new JPasswordField();
		passPassword.setBounds(324, 259, 118, 28);
		contentPane.add(passPassword);
		
		JButton btnChange = new JButton("Change");
		btnChange.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String user = txtUsername.getText();
				for(int i = 0; i < list.size(); i++)
				{
					if(user.equals(list.get(i).getUsername()))
					{
						String pass = new String(passPassword.getPassword());
						list.get(i).setPassword(pass);
					}
				}
			}
		});
		btnChange.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnChange.setBounds(285, 298, 89, 23);
		contentPane.add(btnChange);
		
		JButton tbnBack = new JButton("<-");
		tbnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				AdminLogin obj = new AdminLogin();
				obj.setVisible(true);
			}
		});
		tbnBack.setBounds(629, 461, 45, 40);
		contentPane.add(tbnBack);
	}

}
