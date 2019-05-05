import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdminLogin extends JFrame {

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
					AdminLogin frame = new AdminLogin();
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
	public AdminLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAdminLogin = new JLabel("Admin Login");
		lblAdminLogin.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblAdminLogin.setBounds(81, 90, 102, 28);
		contentPane.add(lblAdminLogin);
		
		JLabel lblPic = new JLabel("");
		lblPic.setBounds(247, 11, 427, 200);
		contentPane.add(lblPic);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblUsername.setBounds(81, 228, 102, 28);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPassword.setBounds(81, 267, 102, 28);
		contentPane.add(lblPassword);
		
		txtUsername = new JTextField();
		txtUsername.setBounds(189, 230, 118, 28);
		contentPane.add(txtUsername);
		txtUsername.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String username = txtUsername.getText();
				String password = new String(passPassword.getPassword());
				for(int i = 0; i < AdminMainFrame.list.size(); i++)
				{
					if(username.equals(AdminMainFrame.list.get(i).getUsername()))
					{
						if(password.equals(AdminMainFrame.list.get(i).getPassword()))	
						{
							if(AdminMainFrame.list.get(i).getType().equals("Admin"))
							dispose();
							AdminMainFrame obj = new AdminMainFrame();
							obj.setVisible(true);
						}
					}
				}
			}
		});
		btnLogin.setBounds(148, 360, 89, 23);
		contentPane.add(btnLogin);
		
		JLabel lblForget = new JLabel("Forgot My Password");
		lblForget.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				dispose();
				AdminForgotPassword obj = new AdminForgotPassword();
				obj.setVisible(true);
			}
		});
		lblForget.setForeground(Color.BLUE);
		lblForget.setBackground(Color.BLUE);
		lblForget.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblForget.setBounds(148, 303, 102, 28);
		contentPane.add(lblForget);
		Image img = new ImageIcon(this.getClass().getResource("Library.jpg")).getImage();
		Image resized = img.getScaledInstance(lblPic.getWidth(), lblPic.getHeight(), Image.SCALE_AREA_AVERAGING);
		lblPic.setIcon(new ImageIcon(resized));
		
		passPassword = new JPasswordField();
		passPassword.setBounds(189, 269, 118, 28);
		contentPane.add(passPassword);
		
		JButton btnBack = new JButton("<-");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				Intro obj;
				try {
					obj = new Intro();
					obj.setVisible(true);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		btnBack.setBounds(629, 461, 45, 40);
		contentPane.add(btnBack);
		
		JLabel lblAdminNewAccount = new JLabel("Create New Account");
		lblAdminNewAccount.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				dispose();
				AdminNewAccount obj = new AdminNewAccount();
				obj.setVisible(true);
			}
		});
		lblAdminNewAccount.setForeground(Color.BLUE);
		lblAdminNewAccount.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblAdminNewAccount.setBounds(128, 413, 133, 28);
		contentPane.add(lblAdminNewAccount);
		
	}
}
