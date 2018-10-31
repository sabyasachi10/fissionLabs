package com.fission.lab.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.fission.lab.bean.EmployeeData;

public class StoreEmployeeData {

	public void processEmployeeData(List<EmployeeData> empList) {

		Collections.sort(empList);
		processEmployeeData1(empList);
		processEmployeeData2(empList);
		processEmployeeData3(empList);
		
		System.out.println("Writesheet.xlsx written successfully");
	}
	
	private static void processEmployeeData1(List<EmployeeData> empList) {
		FileInputStream file = null;
		try {
			file = new FileInputStream("src/main/java/data/EmployeeData1.xlsx");
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		Workbook workbook = null;
		try {
			workbook = new XSSFWorkbook(file);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		int rowid = 0;
		int cellid = 0;
		Row row;
		Cell cell;
		Sheet sheet = workbook.getSheet(" Employee Info ");
		if (sheet == null) {
			sheet = workbook.createSheet(" Employee Info ");
			
			row = sheet.createRow(rowid++);
			cell = row.createCell(cellid++);
			cell.setCellValue("Organization");
			
			cell = row.createCell(cellid++);
			cell.setCellValue("Experience");
			
			cell = row.createCell(cellid++);
			cell.setCellValue("FirstName");
			
			cell = row.createCell(cellid++);
			cell.setCellValue("LastName");
		} else {
			rowid = sheet.getLastRowNum() + 1;
		}
		for (int i=0; i < empList.size(); i++) {
			row = sheet.createRow(rowid++);
			EmployeeData empObj = empList.get(i);
			cellid = 0;

			cell = row.createCell(cellid++);
			cell.setCellValue(empObj.getOrganization());
			
			cell = row.createCell(cellid++);
			cell.setCellValue(empObj.getExperience());
			
			cell = row.createCell(cellid++);
			cell.setCellValue(empObj.getFirstName());
			
			cell = row.createCell(cellid++);
			cell.setCellValue(empObj.getLastName());
			
		}
		
		FileOutputStream out;
		try {
			out = new FileOutputStream(new File("src/main/java/data/EmployeeData1.xlsx"));
			workbook.write(out);
			Thread.sleep(5000);
			out.close();
			workbook.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static void processEmployeeData2(List<EmployeeData> empList) {
		FileInputStream file = null;
		try {
			file = new FileInputStream("src/main/java/data/EmployeeData2.xlsx");
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		Workbook workbook = null;
		try {
			workbook = new XSSFWorkbook(file);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		int rowid = 0;
		int cellid = 0;
		Row row;
		Cell cell;
		Sheet sheet = workbook.getSheet(" Emp vs Age ");
		if (sheet == null) {
			sheet = workbook.createSheet(" Emp vs Age ");
			
			row = sheet.createRow(rowid++);
			cell = row.createCell(cellid++);
			cell.setCellValue("Exp/Age");
			
			cell = row.createCell(cellid++);
			cell.setCellValue("Organisation");
			
		} else {
			rowid = sheet.getLastRowNum() + 1;
		}
		for (int i=0; i < empList.size(); i++) {
			row = sheet.createRow(rowid++);
			EmployeeData empObj = empList.get(i);
			cellid = 0;

			double expByAge = Double.parseDouble(empObj.getExperience()) / Double.parseDouble(empObj.getAge());
			cell = row.createCell(cellid++);
			cell.setCellValue(expByAge);
			
			cell = row.createCell(cellid++);
			cell.setCellValue(empObj.getOrganization());
			
		}
		
		FileOutputStream out;
		try {
			out = new FileOutputStream(new File("src/main/java/data/EmployeeData2.xlsx"));
			workbook.write(out);
			Thread.sleep(5000);
			out.close();
			workbook.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static void processEmployeeData3(List<EmployeeData> empList) {
		FileInputStream file = null;
		try {
			file = new FileInputStream("src/main/java/data/EmployeeData3.xlsx");
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		Workbook workbook = null;
		try {
			workbook = new XSSFWorkbook(file);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		int rowid = 0;
		int cellid = 0;
		Row row;
		Cell cell;
		Sheet sheet = workbook.getSheet(" Employee ");
		if (sheet == null) {
			sheet = workbook.createSheet(" Employee ");
			
			row = sheet.createRow(rowid++);
			cell = row.createCell(cellid++);
			cell.setCellValue("Organization");
			
			cell = row.createCell(cellid++);
			cell.setCellValue("Experience");
			
			cell = row.createCell(cellid++);
			cell.setCellValue("FirstName");
			
			cell = row.createCell(cellid++);
			cell.setCellValue("LastName");
			
			cell = row.createCell(cellid++);
			cell.setCellValue("Age");
		} else {
			rowid = sheet.getLastRowNum() + 1;
		}
		for (int i=0; i < empList.size(); i++) {
			row = sheet.createRow(rowid++);
			EmployeeData empObj = empList.get(i);
			cellid = 0;

			cell = row.createCell(cellid++);
			cell.setCellValue(empObj.getOrganization());
			
			cell = row.createCell(cellid++);
			cell.setCellValue(empObj.getExperience());
			
			cell = row.createCell(cellid++);
			cell.setCellValue(empObj.getFirstName());
			
			cell = row.createCell(cellid++);
			cell.setCellValue(empObj.getLastName());
			
			cell = row.createCell(cellid++);
			cell.setCellValue(empObj.getAge());
			
		}
		
		FileOutputStream out;
		try {
			out = new FileOutputStream(new File("src/main/java/data/EmployeeData3.xlsx"));
			workbook.write(out);
			Thread.sleep(5000);
			out.close();
			workbook.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
