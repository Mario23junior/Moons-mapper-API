package com.api.moons.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigModel {

	@Bean
	ModelMapper modelmapper() {
		return new ModelMapper();
	}
}
