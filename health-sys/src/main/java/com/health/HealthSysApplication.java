package com.health;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@EnableDiscoveryClient
@MapperScan("com.health.mapper")
@SpringBootApplication(scanBasePackages = "com.health")
public class HealthSysApplication {

	public static void main(String[] args) {
		SpringApplication.run(HealthSysApplication.class, args);
	}

}
