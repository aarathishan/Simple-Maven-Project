package com.fb.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelActions {
	
	public static void main(String[] args) throws Exception
	{
		File f=new File("C:\\Users\\LENOVO\\eclipse-workspace\\SimpleMavenProject\\src\\main\\resources\\ExcelFile\\NewWorksheeet.xlsx");
		FileInputStream f1=new FileInputStream(f);
		Workbook w=new XSSFWorkbook(f1);
		Sheet s=w.getSheet("Sample1");
		Row r=s.getRow(1);
		Cell c=r.getCell(1);
		System.out.println(c);
	}

}
