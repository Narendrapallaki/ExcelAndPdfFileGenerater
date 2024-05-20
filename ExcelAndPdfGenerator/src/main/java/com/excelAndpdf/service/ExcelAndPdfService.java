package com.excelAndpdf.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.excelAndpdf.entity.UserDetails;
import com.excelAndpdf.userRepo.UserRepository;

@Service
public class ExcelAndPdfService {
	
	@Autowired
	private UserRepository repository;

	
	public List<UserDetails>getAllUser()
	{
		
		Iterable<UserDetails> all = repository.findAll();
		return (List<UserDetails>) all;
	}
}
