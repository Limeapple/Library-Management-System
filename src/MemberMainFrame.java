import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.SwingConstants;


public class MemberMainFrame extends JFrame {

	private JPanel contentPane;
	private JTextField txtBookID;
	private JTextField txtBook;
	private JTextField txtAuthor;
	private JTextField txtPages;
	static ArrayList<Logs> list = new ArrayList<Logs>();
	private JTextField txtMember;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MemberMainFrame frame = new MemberMainFrame();
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
	public MemberMainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("BookID");
		label.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label.setBounds(21, 177, 102, 28);
		contentPane.add(label);
		
		txtBookID = new JTextField();
		txtBookID.setColumns(10);
		txtBookID.setBounds(133, 177, 118, 28);
		contentPane.add(txtBookID);
		
		JLabel label_1 = new JLabel("Book Name");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_1.setBounds(21, 216, 102, 28);
		contentPane.add(label_1);
		
		txtBook = new JTextField();
		txtBook.setColumns(10);
		txtBook.setBounds(133, 216, 118, 28);
		contentPane.add(txtBook);
		
		JLabel label_2 = new JLabel("Author");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_2.setBounds(21, 253, 102, 28);
		contentPane.add(label_2);
		
		txtAuthor = new JTextField();
		txtAuthor.setColumns(10);
		txtAuthor.setBounds(133, 255, 118, 28);
		contentPane.add(txtAuthor);
		
		JLabel label_3 = new JLabel("Pages");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_3.setBounds(21, 294, 102, 28);
		contentPane.add(label_3);
		
		txtPages = new JTextField();
		txtPages.setColumns(10);
		txtPages.setBounds(133, 294, 118, 28);
		contentPane.add(txtPages);
		
		JList list = new JList();
		list.setBounds(410, 100, 264, 401);
		contentPane.add(list);
		
		JLabel lblTitle = new JLabel("Member Main Frame");
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblTitle.setBounds(10, 11, 664, 76);
		contentPane.add(lblTitle);
		
		JLabel lblMember = new JLabel("Member");
		lblMember.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMember.setBounds(21, 138, 102, 28);
		contentPane.add(lblMember);
		
		txtMember = new JTextField();
		txtMember.setColumns(10);
		txtMember.setBounds(133, 138, 118, 28);
		contentPane.add(txtMember);
		
		JLabel lblChecked = new JLabel("Checked Out?");
		lblChecked.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblChecked.setBounds(21, 333, 102, 28);
		contentPane.add(lblChecked);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(133, 333, 118, 28);
		contentPane.add(textField);
	}
}
