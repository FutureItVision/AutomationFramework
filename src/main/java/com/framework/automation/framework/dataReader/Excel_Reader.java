package com.framework.automation.framework.dataReader;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Reader {
	public FileOutputStream fileOut=null;
	public String path;
	public FileInputStream fis;
	public XSSFWorkbook workbook;
	public XSSFSheet sheet;
	public XSSFRow raw;
	public XSSFCell cell;

	
	
	
	public Excel_Reader(String path){
		this.path=path;
		try{
			fis=new FileInputStream(path);
			workbook=new XSSFWorkbook(fis);
		}catch(Exception e){
			e.printStackTrace();
			
		}
	}
	
	@SuppressWarnings("deprecation")
	public String[][] readDataFromSheet(String sheetName, String Excelname){
		String dataSets[][]=null;
		try{
			//get sheet from excel workbook 
			XSSFSheet sheet=workbook.getSheet(sheetName);
			//Count number of raw
			int totalraw=sheet.getLastRowNum()+1;
			//Count number of Active column in raw
			int totalcolumn=sheet.getRow(0).getLastCellNum();
			//Create array rows and column
			dataSets=new String[totalraw-1][totalcolumn];
            //run for loop and store data in 2D array
			//This for loop will run on rows
			for(int i=1; 1<totalraw; i++){
				XSSFRow raws=sheet.getRow(i);
		    //This for loop will run column of that raw
				for(int j=0; j<totalcolumn; j++){
					XSSFCell cell=raws.getCell(j);;
			//If cell of type String,then this if conditional will work
					if(cell.getCellType()==cell.CELL_TYPE_STRING)
						dataSets[i-1][j]=cell.getStringCellValue();
					
			//If cell of type number,then this if conditional will work		
					else if(cell.getCellType()==cell.CELL_TYPE_NUMERIC){
						String cellText=String.valueOf(cell.getNumericCellValue());
						dataSets[i -1][j] =cellText;
					}
					else
			//If cell of type boolean,then this if conditional will work
						dataSets[i -1][j]=String.valueOf(cell.getBooleanCellValue());
				}
			}
			return dataSets;
		}catch (Exception e){
			System.out.println("Exception reading xcelfile " + e.getMessage());
			e.printStackTrace();
		}
		return dataSets;
		
		
	}
	
	
	@SuppressWarnings("deprecation")
	public String getCellData(String sheetName,String colName,int rowNum){
		try{
			int col_Num=0;
			int index=workbook.getSheetIndex(sheetName);
			sheet=workbook.getSheetAt(index);
			XSSFRow row= sheet.getRow(0);
			for(int i=0;i<row.getLastCellNum();i++){
			if(row.getCell(i).getStringCellValue().equals(colName))	{
			
				col_Num=i;
				break;
				
			}
			}
			row=sheet.getRow(rowNum -1);
			XSSFCell cell=row.getCell(col_Num);
			if(cell.getCellType()==Cell.CELL_TYPE_STRING){
				return cell.getStringCellValue();
			}else if(cell.getCellType()==Cell.CELL_TYPE_BLANK){
				return "";	
				
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return null;
	}
	
}