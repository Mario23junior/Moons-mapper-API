package com.api.moons.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.api.moons.utils.CargaBaseDataService;

@Configuration
@Profile("dev")
public class CargaBase {
   
	@Autowired
	private CargaBaseDataService bdService;
	
	@Bean
	public void CargaBaseDataBase() {
		this.bdService.bdInstance();
	}
}
