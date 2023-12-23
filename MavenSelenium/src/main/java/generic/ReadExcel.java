package generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel implements FrameWorkConstraint {

	public static Object[][] fetchExcel() throws Throwable {
		FileInputStream fis = new FileInputStream(EXCEL_PATH);
		Workbook w = WorkbookFactory.create(fis);
		Sheet s = w.getSheet("sheet1");
		int row = s.getPhysicalNumberOfRows();
		int column = s.getRow(0).getPhysicalNumberOfCells();
		Object[][] d = new Object[row][column];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				d[i][j] = s.getRow(i).getCell(j).toString();
			}
		}
		return d;
	}
}
