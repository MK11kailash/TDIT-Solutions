package utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataReader {

	XSSFWorkbook workbook;
	FileInputStream fis;
	XSSFSheet sheet;

	public ExcelDataReader(String sheetName) {
		try {
			File file = new File("C:\\Users\\mk11k\\New folder\\Atoumation_TDIT_FrameworkProject_2\\ExcelData.xlsx");
			fis = new FileInputStream(file);
			workbook = new XSSFWorkbook(fis);
			sheet = workbook.getSheet(sheetName);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public int getRowNum() {
		return sheet.getPhysicalNumberOfRows();
	}

	public int getColNum() {
		return sheet.getRow(0).getLastCellNum();
	}

	public List<Object> getRowData(int rowNum) {
		List<Object> list = new ArrayList<>();
		XSSFRow row = sheet.getRow(rowNum);
		for (int j = 0; j < getColNum(); j++) {

			list.add(row.getCell(j).getNumericCellValue());
		}

		return list;
	}

	public Object[][] getAllData() {
		Object[][] obj = new Object[getRowNum() - 1][getColNum()];

		for (int i = 1; i < getRowNum(); i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < getColNum(); j++) {
				obj[i - 1][j] = row.getCell(j).toString();
			}
		}

		return obj;
	}

}
