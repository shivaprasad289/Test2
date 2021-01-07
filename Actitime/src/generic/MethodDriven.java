package generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class MethodDriven implements IAutoContext
{
	public static String getDataFromExcel(int rownum,int colnum) throws EncryptedDocumentException, FileNotFoundException, IOException
	{
		Workbook wb = WorkbookFactory.create(new FileInputStream(Excel_path));
		String a = wb.getSheet(Excel_Sheet_Name).getRow(rownum).getCell(colnum).toString();
		return a;	
	}
}
