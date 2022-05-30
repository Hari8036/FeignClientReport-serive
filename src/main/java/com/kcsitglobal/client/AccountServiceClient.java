package com.kcsitglobal.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.kcsitglobal.model.CustomerReport;
@FeignClient(name="account-service")
public interface AccountServiceClient {

	@GetMapping("/api/customers")
public	List<CustomerReport> getAllCustomerReport();

}
