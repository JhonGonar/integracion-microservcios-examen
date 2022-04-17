package com.dh.serieservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


//TODO Enable eureka confog and sleuth
@EnableEurekaClient
@SpringBootApplication
public class SerieServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SerieServiceApplication.class, args);
	}

}
