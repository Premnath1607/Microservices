package com.example.feignuser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

import com.example.feignuser.config.RibbonConfiguration;

@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
@RibbonClient(name = "order-service", configuration = RibbonConfiguration.class)
@EnableCircuitBreaker
@EnableHystrixDashboard
public class FeignUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeignUserApplication.class, args);
	}

}
