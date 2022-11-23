package com.nttdata.bootcamp.productservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableEurekaClient
@SpringBootApplication
@RestController
public class ProductServiceApplication {
	
	@Value("${server.port}")
	private String port;
	
	@RequestMapping("/port")
	  public String Port() {
	    return "El puerto del micro es " +port;
	  }

	public static void main(String[] args) {
		SpringApplication.run(ProductServiceApplication.class, args);
	}

}
