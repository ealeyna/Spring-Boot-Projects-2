package com.eylulaleynasahin.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan(basePackages = {"com.eylulaleynasahin"})
@ComponentScan(basePackages = {"com.eylulaleynasahin"})
@EnableJpaRepositories(basePackages = {"com.eylulaleynasahin"})
@SpringBootApplication
public class GalleristApplicationStarter {

	public static void main(String[] args) {
		SpringApplication.run(GalleristApplicationStarter.class, args);
	}
}
