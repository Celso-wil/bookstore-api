package com.celso.bookstore.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.celso.bookstore.service.DBService;

@Configuration
@Profile("teste")

public class TesteConfig {
	@Autowired
	
	private DBService dbService;
	@Bean
	public void InstaciaBD () {
		this.dbService.InstaciaBD();
		
		
		
		
	}
		
		
	

}
