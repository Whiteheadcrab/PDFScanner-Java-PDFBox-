import java.io.File;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class searchController {

	public String FindFile(String path)
	{
		String Message = "<Error missing of file>";
		
		//Here we will receive text from pdf file
		try {
			File file = new File("path");
			PDDocument document = PDDocument.load(file);
			PDFTextStripper stripper = new PDFTextStripper();
			Message = stripper.getText(document);
		}
		catch(Exception e)
		{
			Message = "<Error missing of file>";
		}

		
		return Message;			
	}
}
