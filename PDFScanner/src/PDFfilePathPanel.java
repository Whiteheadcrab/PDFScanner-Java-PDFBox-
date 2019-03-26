import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PDFfilePathPanel extends JPanel {
	private JTextField textFieldforReceivingPath;


	//Panel for Search Panel
	public PDFfilePathPanel() {
		setLayout(null);
		
		JLabel labelForAskingPath = new JLabel("Please input path to pdf file :");
		labelForAskingPath.setBounds(10, 11, 199, 14);
		add(labelForAskingPath);
		
		textFieldforReceivingPath = new JTextField();
		textFieldforReceivingPath.setBounds(10, 32, 349, 20);
		add(textFieldforReceivingPath);
		textFieldforReceivingPath.setColumns(10);
		
		JButton buttonForSearching = new JButton("Search");
		buttonForSearching.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String path = textFieldforReceivingPath.getText();
				searchController search = new searchController();
				search.FindFile(path);
			}
		});
		buttonForSearching.setBounds(142, 67, 89, 23);
		add(buttonForSearching);

	}
}
