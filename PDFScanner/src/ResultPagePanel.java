import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class ResultPagePanel extends JPanel {


	public ResultPagePanel(String Message, String path) {
		setLayout(null);
		
		
		JLabel labelforFilePath = new JLabel("File path :");
		labelforFilePath.setBounds(10, 11, 77, 14);
		add(labelforFilePath);
		
		JLabel labelForFilePath_data = new JLabel(path);
		labelForFilePath_data.setBounds(97, 11, 343, 14);
		add(labelForFilePath_data);
		
		JScrollPane scrollPanefortextArea = new JScrollPane();
		scrollPanefortextArea.setBounds(10, 36, 430, 253);
		add(scrollPanefortextArea);
		
		JTextArea textAreaforResult = new JTextArea(Message);
		textAreaforResult.setWrapStyleWord(true);
		textAreaforResult.setEditable(false);
		scrollPanefortextArea.setViewportView(textAreaforResult);

	}
}
