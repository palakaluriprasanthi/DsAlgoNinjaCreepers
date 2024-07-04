package dsUtilities;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.commons.compress.archivers.dump.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReader  {


	public void readData() throws IOException {
	String path = System.getProperty("user.dir")+"/src/test/resources/TestData/Demo.xlsx";
	File file = new File(path);
	FileInputStream fis = new FileInputStream(file);
	XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fis);
	XSSFSheet sheet = xssfWorkbook.getSheet("sheet1");
	Iterator<Row> row = sheet.rowIterator();
	while(row.hasNext()) {
		Row currentRow = row.next();
		Iterator<Cell> cell = currentRow.cellIterator();
		while(cell.hasNext()) {
			Cell currentCell = cell.next();
			System.out.println(currentCell.getStringCellValue());
		}
	}

	}

	public static int totalRow;


	public static List<Map<String, String>> getData(String excelpath, String sheetName)
			throws InvalidFormatException, IOException {

		Workbook workbook = WorkbookFactory.create(new File(excelpath));
		Sheet sheet = workbook.getSheet(sheetName);
		workbook.close();
		return readSheet(sheet);
	}
		private static List<Map<String, String>> readSheet(Sheet sheet) {

			Row row;
			Cell cell;

			totalRow = sheet.getLastRowNum();

			List<Map<String, String>> excelRows = new ArrayList<Map<String, String>>();

			for (int currentRow = 1; currentRow <= totalRow; currentRow++) {

				row = sheet.getRow(currentRow);

				int totalColumn = row.getLastCellNum();

				LinkedHashMap<String, String> columnMapdata = new LinkedHashMap<String, String>();

				for (int currentColumn = 0; currentColumn < totalColumn; currentColumn++) {

					cell = row.getCell(currentColumn);

					String columnHeaderName = sheet.getRow(sheet.getFirstRowNum()).getCell(currentColumn)
							.getStringCellValue();

					columnMapdata.put(columnHeaderName, cell.getStringCellValue());
				}

				excelRows.add(columnMapdata);
			}

			return excelRows;
		}

		public int countRow() {

			return totalRow;
		}

}
