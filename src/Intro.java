import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Intro extends JFrame {

	private JPanel contentPane;
	public PrintWriter out;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Intro frame = new Intro();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws FileNotFoundException 
	 */
	public Intro() throws FileNotFoundException {
		out = new PrintWriter (new File ("library.txt"));
		out.print("USUJBNHBNSH");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitle = new JLabel("Library Management System");
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblTitle.setBounds(10, 11, 664, 59);
		contentPane.add(lblTitle);
		
		JButton btnAdminLogin = new JButton("Admin Login");
		btnAdminLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				AdminLogin obj = new AdminLogin();
				obj.setVisible(true);
			}
		});
		btnAdminLogin.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnAdminLogin.setBounds(74, 136, 212, 212);
		contentPane.add(btnAdminLogin);
		
		JButton btnMemberLogin = new JButton("Member Login");
		btnMemberLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				MemberLogin obj = new MemberLogin();
				obj.setVisible(true);
			}
		});
		btnMemberLogin.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnMemberLogin.setBounds(378, 136, 212, 212);
		contentPane.add(btnMemberLogin);
	}
}
