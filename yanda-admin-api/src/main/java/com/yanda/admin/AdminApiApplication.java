package com.yanda.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication(scanBasePackages={"com.yanda.core", "com.yanda.admin"})
@MapperScan(basePackages = "com.yanda.core.mapper")
@EnableScheduling
@EnableConfigurationProperties
public class AdminApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdminApiApplication.class, args);
	}
}
