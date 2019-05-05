import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JButton;

public class AdminMainFrame extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsername;
	private JTextField txtPassword;
	private JTextField txtBookID;
	private JTextField txtBook;
	private JTextField txtAuthor;
	private JTextField txtPages;
	static ArrayList<Logs> list = new ArrayList<Logs>();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminMainFrame frame = new AdminMainFrame();
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
	public AdminMainFrame() {
		new AdminNewAccount();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitle = new JLabel("Admin Main Frame");
		lblTitle.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setBounds(10, 11, 664, 76);
		contentPane.add(lblTitle);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblUsername.setBounds(20, 98, 102, 28);
		contentPane.add(lblUsername);
		
		txtUsername = new JTextField();
		txtUsername.setColumns(10);
		txtUsername.setBounds(132, 98, 118, 28);
		contentPane.add(txtUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPassword.setBounds(20, 137, 102, 28);
		contentPane.add(lblPassword);
		
		txtPassword = new JTextField();
		txtPassword.setColumns(10);
		txtPassword.setBounds(132, 137, 118, 28);
		contentPane.add(txtPassword);
		
		JLabel lblBookID = new JLabel("BookID");
		lblBookID.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblBookID.setBounds(20, 176, 102, 28);
		contentPane.add(lblBookID);
		
		txtBookID = new JTextField();
		txtBookID.setColumns(10);
		txtBookID.setBounds(132, 176, 118, 28);
		contentPane.add(txtBookID);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(408, 98, 266, 403);
		contentPane.add(scrollPane);
		
		JList list = new JList();
		scrollPane.setViewportView(list);
		
		JButton btnNewMember = new JButton("New Member");
		btnNewMember.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewMember.setBounds(10, 332, 112, 23);
		contentPane.add(btnNewMember);
		
		JButton btnAddBook = new JButton("Add Book");
		btnAddBook.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnAddBook.setBounds(138, 332, 112, 23);
		contentPane.add(btnAddBook);
		
		JButton btnBorrowBook = new JButton("Borrow Book");
		btnBorrowBook.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnBorrowBook.setBounds(260, 332, 112, 23);
		contentPane.add(btnBorrowBook);
		
		JButton btnReturnBook = new JButton("Return Book");
		btnReturnBook.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnReturnBook.setBounds(10, 366, 112, 23);
		contentPane.add(btnReturnBook);
		
		JButton btnUpdateMember = new JButton("Update Member");
		btnUpdateMember.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnUpdateMember.setBounds(138, 366, 112, 23);
		contentPane.add(btnUpdateMember);
		
		JButton btnUpdateBook = new JButton("Update Book");
		btnUpdateBook.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnUpdateBook.setBounds(260, 366, 112, 23);
		contentPane.add(btnUpdateBook);
		
		JButton btnFirst = new JButton("First");
		btnFirst.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnFirst.setBounds(10, 400, 112, 23);
		contentPane.add(btnFirst);
		
		JButton btnLast = new JButton("Last");
		btnLast.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnLast.setBounds(260, 400, 112, 23);
		contentPane.add(btnLast);
		
		JButton btnNext = new JButton(">>");
		btnNext.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNext.setBounds(138, 400, 50, 23);
		contentPane.add(btnNext);
		
		JButton btnPrevious = new JButton("<<");
		btnPrevious.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnPrevious.setBounds(200, 400, 50, 23);
		contentPane.add(btnPrevious);
		
		txtBook = new JTextField();
		txtBook.setColumns(10);
		txtBook.setBounds(132, 215, 118, 28);
		contentPane.add(txtBook);
		
		txtAuthor = new JTextField();
		txtAuthor.setColumns(10);
		txtAuthor.setBounds(132, 254, 118, 28);
		contentPane.add(txtAuthor);
		
		txtPages = new JTextField();
		txtPages.setColumns(10);
		txtPages.setBounds(132, 293, 118, 28);
		contentPane.add(txtPages);
		
		JLabel lblBookName = new JLabel("Book Name");
		lblBookName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblBookName.setBounds(20, 215, 102, 28);
		contentPane.add(lblBookName);
		
		JLabel lblAuthor = new JLabel("Author");
		lblAuthor.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblAuthor.setBounds(20, 252, 102, 28);
		contentPane.add(lblAuthor);
		
		JLabel lblPages = new JLabel("Pages");
		lblPages.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPages.setBounds(20, 293, 102, 28);
		contentPane.add(lblPages);
	}
}
