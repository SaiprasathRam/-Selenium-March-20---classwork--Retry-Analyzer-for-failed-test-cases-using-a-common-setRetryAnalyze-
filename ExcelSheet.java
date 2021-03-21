package IRetryAnalyzerCode;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelSheet {
	 public String[][] excelRead(String fileName) throws IOException
	 {
		 XSSFWorkbook wb = new XSSFWorkbook("./data/"+fileName+".xlsx");
		 XSSFSheet ws = wb.getSheet("Sheet1");
		 int rowCount = ws.getLastRowNum();
		 int totalRows = ws.getPhysicalNumberOfRows();
		 System.out.println("The number of rows excluding the header will be "+rowCount);
		 System.out.println("The number of rows including the header will be "+totalRows);
		 int cellCount = ws.getRow(0).getLastCellNum();
		 String[][] data = new String[rowCount][cellCount];
		 for(int i=1; i<=rowCount; i++)
		 {
			 for(int j=0; j<cellCount; j++)
			 {
				 String value = ws.getRow(i).getCell(j).getStringCellValue();
				 data[i-1][j] = value;
				 System.out.print(data[i-1][j]);
				 System.out.print(" ");
			 }
			 System.out.println("");
		 }
		 wb.close();
		return data;
		 
	 }
}
