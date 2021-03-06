package com.kcsitglobal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kcsitglobal.client.AccountServiceClient;
import com.kcsitglobal.model.CustomerReport;

@RestController
@RequestMapping("/api/reports")
public class ReportController {
	
	@Autowired
	private AccountServiceClient accountServiceClient;
	
	@GetMapping("/customers")
	public ResponseEntity<List<CustomerReport>> getAllCustomerReport(){
		List<CustomerReport> customerReportList=accountServiceClient.getAllCustomerReport();
		return new ResponseEntity<List<CustomerReport>>(customerReportList,HttpStatus.CREATED);
	}

}
