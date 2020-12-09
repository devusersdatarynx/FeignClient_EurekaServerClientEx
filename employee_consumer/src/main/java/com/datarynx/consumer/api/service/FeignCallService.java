package com.datarynx.consumer.api.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.datarynx.consumer.api.model.Employee;

@FeignClient(name="employee-producer")
public interface FeignCallService {
	
	@RequestMapping(method = RequestMethod.GET, value = "/employee")
	public Employee getData();

}
