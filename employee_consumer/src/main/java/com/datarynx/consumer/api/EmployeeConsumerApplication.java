package com.datarynx.consumer.api;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ApplicationContext;
import org.springframework.web.client.RestClientException;

import com.datarynx.consumer.api.controller.ConsumerControllerClient;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class EmployeeConsumerApplication {

	public static void main(String[] args) throws RestClientException, IOException {
		//SpringApplication.run(EmployeeConsumerApplication.class, args);
		ApplicationContext ctx = SpringApplication.run(EmployeeConsumerApplication.class, args);

		ConsumerControllerClient consumerControllerClient = ctx.getBean(ConsumerControllerClient.class);
		System.out.println(consumerControllerClient);
		consumerControllerClient.getEmployee();
	}

}
