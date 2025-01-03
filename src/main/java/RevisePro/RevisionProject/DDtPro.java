package RevisePro.RevisionProject;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DDtPro {
	
	static String username;
	static String password;
	
	 void dataTest() throws EncryptedDocumentException, IOException {
		FileInputStream fs = new FileInputStream("C:\\Users\\rohit.joshi\\Desktop\\EclipseWorkspace\\RevisionProject\\DataFetch\\Credentials.xlsx");
		Workbook w1=WorkbookFactory.create(fs);
		username=w1.getSheet("Creds").getRow(1).getCell(0).getStringCellValue();
		password=w1.getSheet("Creds").getRow(1).getCell(1).getStringCellValue();
	}

}
