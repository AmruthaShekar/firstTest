package testNGExamples;

import org.apache.poi.xssf.streaming.SXSSFSheet;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.testng.annotations.Test;

public class MyFirstTest {
  @Test
  public void f() {
	  
	  SXSSFWorkbook workBook = new SXSSFWorkbook();
	  SXSSFSheet  sheet = workBook.getSheet("sheet1");
	  sheet.getPhysicalNumberOfRows();
  }
}
