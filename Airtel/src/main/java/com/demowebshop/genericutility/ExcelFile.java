package com.demowebshop.genericutility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFile {
	public String readStringCell(String sheet, int row, int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream("./commondata/tcspecificdata.xlsx");
		String cellValue = WorkbookFactory.create(fis).getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		return cellValue;
	}
	public String readNumericCell(String sheet, int row, int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream("./commondata/tcspecificdata.xlsx");
		long cellValue = (long)(WorkbookFactory.create(fis).getSheet(sheet).getRow(row).getCell(cell).getNumericCellValue());
		return String.valueOf(cellValue);
	}
}
