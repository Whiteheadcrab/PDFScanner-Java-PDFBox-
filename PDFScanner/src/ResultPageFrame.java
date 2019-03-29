import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class ResultPageFrame extends JFrame {

	private JPanel contentPane;

	public static void main(String Message, String path) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ResultPageFrame frame = new ResultPageFrame(Message,path);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ResultPageFrame(String Message, String path) {
		setTitle("Result of search");
		setBounds(100, 100, 465, 335);
		contentPane = new ResultPagePanel(Message,path);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
