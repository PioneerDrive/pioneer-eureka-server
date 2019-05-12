package com.pioneer.eurekaserver.pioneereurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@EnableEurekaServer
@SpringBootApplication
@EnableAdminServer
public class PioneerEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PioneerEurekaServerApplication.class, args);
	}

}

