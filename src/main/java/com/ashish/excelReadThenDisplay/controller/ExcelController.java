package com.ashish.excelReadThenDisplay.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ashish.excelReadThenDisplay.entity.ExcelModel;


@Controller
public class ExcelController {

	@RequestMapping("/showCreate")
	public String showCreate(ModelMap modelMap) throws IOException {
		
		List<ExcelModel> listExcel = ExcelController.readFromExcelFile("D:\\excelSampleTestData\\excelSample.xlsx");
		modelMap.addAttribute("listExcel",listExcel);
		return "displayExcel";
		
	}
	
	
//	@RequestMapping("/saveLoc")
//	public String saveLocation(ModelMap modelMap) {
//	
//		modelMap.addAttribute("msg", );
//		
//		return "createLocations";
//	}
//	
	 public static List<ExcelModel> readFromExcelFile(String excelFilePath) throws IOException {
	        List<ExcelModel> listExcel = new ArrayList<ExcelModel>();
	        FileInputStream inputStream = new FileInputStream(new File(excelFilePath));
	     
//	        Workbook workbook = new XSSFWorkbook(inputStream);
	        
	        Workbook workbook = null;
	        
	        if (excelFilePath.endsWith("xlsx")) {
	            workbook = new XSSFWorkbook(inputStream);
	        } else if (excelFilePath.endsWith("xls")) {
	            workbook = new HSSFWorkbook(inputStream);
	        } else {
	            throw new IllegalArgumentException("The specified file is not Excel file");
	        }
	        
	        Sheet firstSheet = workbook.getSheetAt(0);
	        Iterator<Row> iterator = firstSheet.iterator();
	     
	        while (iterator.hasNext()) {
	            Row nextRow = iterator.next();
	            Iterator<Cell> cellIterator = nextRow.cellIterator();
	            ExcelModel excelModel = new ExcelModel();
	     
	            while (cellIterator.hasNext()) {
	                Cell nextCell = cellIterator.next();
	                int columnIndex = nextCell.getColumnIndex();
	     
	                switch (columnIndex) {
	                case 1:
	                	excelModel.setSegment((String) getCellValue(nextCell));
	                    break;
	                case 2:
	                    excelModel.setCountry((String) getCellValue(nextCell));
	                    break;
	                case 3:
	                	excelModel.setProduct((String) getCellValue(nextCell));
	                    break;
	                case 4:
	                	excelModel.setDiscountBand((String) getCellValue(nextCell));
	                    break;
	                case 5:
	                	excelModel.setUnitsSold((String) getCellValue(nextCell));
	                    break;
	                case 6:
	                	excelModel.setManufacture((String) getCellValue(nextCell));
	                    break;
	                case 7:
	                	excelModel.setSalePrise((String) getCellValue(nextCell));
	                    break;
	                case 8:
	                	excelModel.setGrossSales((String) getCellValue(nextCell));
	                    break;
	                case 9:
	                	excelModel.setDiscount((String) getCellValue(nextCell));
	                    break;
	                case 10:
	                	excelModel.setSales((String) getCellValue(nextCell));
	                    break;
	                case 11:
	                	excelModel.setCogs((String) getCellValue(nextCell));
	                    break;
	                case 12:
	                	excelModel.setProfit((String) getCellValue(nextCell));
	                    break;
	                case 13:
	                	excelModel.setDate((String) getCellValue(nextCell));
	                    break;
	                case 14:
	                	excelModel.setMonthNumber((String) getCellValue(nextCell));
	                    break;
	                case 15:
	                	excelModel.setMonthName((String) getCellValue(nextCell));
	                    break;
	                case 16:
	                	excelModel.setYear((String) getCellValue(nextCell));
	                    break;
//	                case 16:
//	                    aBook.setPrice((String) getCellValue(nextCell));
//	                    break;
	                }
	     
	     
	            }
	            listExcel.add(excelModel);
	        }
	     
	        workbook.close();
	        inputStream.close();
	     
	        return listExcel;
	    }
	    
	    private static Object getCellValue(Cell cell) {
	        switch (cell.getCellType()) {
	        case Cell.CELL_TYPE_STRING:
	            return cell.getStringCellValue();
	     
//	        case Cell.CELL_TYPE_BOOLEAN:
//	            return cell.getBooleanCellValue();
//	     
//	        case Cell.CELL_TYPE_NUMERIC:
//          return cell.getNumericCellValue();
	        }
	     
	        return null;
	    }
	
}
