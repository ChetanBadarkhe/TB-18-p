package com.cjc.dws.webapp.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class Common 
{
public static WebDriver driver;
public static FileInputStream fis;
public static XSSFWorkbook aw;
public static XSSFSheet sheet;
public static XSSFRow row;
public static XSSFCell cell;
public static FileInputStream fineCall() throws FileNotFoundException 
{
fis=new FileInputStream("src/test/resources/DWS.xlsx")	;
return fis;
}
public static String Username() throws IOException
{
fis=new FileInputStream("src/test/resources/DWS.xlsx");
aw=new XSSFWorkbook(fis);
sheet=aw.getSheet("Sheet1");
row=sheet.getRow(1);
cell=row.getCell(0);
String username=cell.getStringCellValue();
return username;
}
public static String password() throws IOException
{
fis=new FileInputStream("src/test/resources/DWS.xlsx");
aw=new XSSFWorkbook(fis);
sheet=aw.getSheet("Sheet1");
row=sheet.getRow(1);
cell=row.getCell(1);
String pass=cell.getStringCellValue();
return pass;
}

}
