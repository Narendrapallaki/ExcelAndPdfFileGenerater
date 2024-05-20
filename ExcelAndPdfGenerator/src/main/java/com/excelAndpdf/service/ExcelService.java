package com.excelAndpdf.service;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.excelAndpdf.entity.UserDetails;
import com.excelAndpdf.excelReader.ExcelReader;

@Service
public class ExcelService {
	
	@Autowired
	private ExcelAndPdfService excelAndPdfService;
	      
	public ByteArrayInputStream generateExcel() throws IOException
	{
		List<UserDetails> allUser = excelAndPdfService.getAllUser();
		 ByteArrayInputStream dataToExcel = ExcelReader.dataToExcel(allUser);
		 
		 return dataToExcel;
	}

}
