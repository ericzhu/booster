package com.booster;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
// @ComponentScan
public class BoosterBootstrapAutoconfigApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(BoosterBootstrapAutoconfigApplication.class, args);
	}

}
