package com.sample.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import com.sample.service.ICustomerService;
import com.sample.service.impl.CustomerServiceImpl;

@Configuration
@Import(AutoConfig.class)
@PropertySource("app.properties")
public class JavaConfig {

	@Autowired
	AutoConfig autoConfig;

	@Bean
	public static PropertySourcesPlaceholderConfigurer getPropertySourcesPlaceholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}

	@Bean(name = "customerService")
	// @Scope("singleton")
	// @Scope("prototype")
	public ICustomerService getCustomerService() {
		CustomerServiceImpl customerService = new CustomerServiceImpl();
		return customerService;
	}

}
