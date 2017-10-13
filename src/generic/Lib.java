package generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Lib {
	public static String getpropety(String path,String value)
	{
		String v="";
		Properties p = new Properties();
		//String path="./config.propertties";
		try {
			p.load(new FileInputStream(path));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		v= p.getProperty(value);
		System.out.println(v);
		Reporter.log(v);
		return v;
	}
	
	public static String getcellvalue(String path,String value,int r,int c)
	{
		String v="";
		//String path="./data/Book1.xlsx";
		try {
			FileInputStream fis = new FileInputStream(path);
			//excel space
			Workbook wb= WorkbookFactory.create(fis);
			//open
			Sheet sheet = wb.getSheet(value);
			Row row = sheet.getRow(r);
			Cell cell = row.getCell(c);
			v = cell.getStringCellValue();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(v);
		return v;
	}

}
