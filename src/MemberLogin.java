import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileNotFoundException;

public class MemberLogin extends JFrame {

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
					MemberLogin frame = new MemberLogin();
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
	public MemberLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPic = new JLabel("");
		lblPic.setBounds(247, 11, 427, 200);
		contentPane.add(lblPic);
		Image img = new ImageIcon(this.getClass().getResource("Library 2.jpg")).getImage();
		Image resized = img.getScaledInstance(lblPic.getWidth(), lblPic.getHeight(), Image.SCALE_AREA_AVERAGING);
		lblPic.setIcon(new ImageIcon(resized));
		
		JLabel lblMemberLogin = new JLabel("Member Login");
		lblMemberLogin.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblMemberLogin.setBounds(81, 90, 102, 28);
		contentPane.add(lblMemberLogin);
		
		JLabel label_1 = new JLabel("Username");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_1.setBounds(81, 228, 102, 28);
		contentPane.add(label_1);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPassword.setBounds(81, 267, 102, 28);
		contentPane.add(lblPassword);
		
		txtUsername = new JTextField();
		txtUsername.setColumns(10);
		txtUsername.setBounds(193, 230, 118, 28);
		contentPane.add(txtUsername);
		
		passPassword = new JPasswordField();
		passPassword.setBounds(193, 269, 118, 28);
		contentPane.add(passPassword);
		
		JLabel label_2 = new JLabel("Forgot My Password");
		label_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				dispose();
				MemberForgotPassword obj = new MemberForgotPassword();
				obj.setVisible(true);
			}
		});
		label_2.setForeground(Color.BLUE);
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		label_2.setBackground(Color.BLUE);
		label_2.setBounds(142, 306, 102, 28);
		contentPane.add(label_2);
		
		JButton button = new JButton("Login");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String username = txtUsername.getText();
				String password = new String(passPassword.getPassword());
				for(int i = 0; i < MemberMainFrame.list.size(); i++)
				{
					if(username.equals(MemberMainFrame.list.get(i).getUsername()))
					{
						if(password.equals(MemberMainFrame.list.get(i).getPassword()))	
						{
							if(MemberMainFrame.list.get(i).getType().equals("Admin"))
							dispose();
							MemberMainFrame obj = new MemberMainFrame();
							obj.setVisible(true);
						}
					}
				}
			}
		});
		button.setBounds(142, 356, 89, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("<-");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Intro obj;
				try {
					obj = new Intro();
					obj.setVisible(true);
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		button_1.setBounds(629, 461, 45, 40);
		contentPane.add(button_1);
		
		JLabel lblMemberNewAccount = new JLabel("Create New Account");
		lblMemberNewAccount.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				MemberNewAccount obj = new MemberNewAccount();
				obj.setVisible(true);
			}
		});
		lblMemberNewAccount.setForeground(Color.BLUE);
		lblMemberNewAccount.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMemberNewAccount.setBounds(123, 416, 133, 28);
		contentPane.add(lblMemberNewAccount);
	}
}
