package com.datarynx.consumer.api.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestClientException;

import com.datarynx.consumer.api.model.Employee;
import com.datarynx.consumer.api.service.FeignCallService;

@Controller
public class ConsumerControllerClient {


	@Autowired
	private FeignCallService service;

	public void getEmployee() throws RestClientException, IOException {
		
		
		try{
			Employee emp = service.getData();
			System.out.println("Employee ID from Producer :" + emp.getEmpId());
		}catch (Exception ex)
		{
			System.out.println(ex);
		}
		
	}
}