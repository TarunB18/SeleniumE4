package java_utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class TestData {

	public String data(String path, int row, int cell) throws EncryptedDocumentException, IOException {
		FileInputStream fileInputStream = new FileInputStream("C:\\Selenium_qsp\\TestData.xlsx");
		Workbook workBook = WorkbookFactory.create(fileInputStream);
		Sheet sheet = workBook.getSheet(path);
		return sheet.getRow(row).getCell(cell).toString();
	}

}
