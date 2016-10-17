package com.sample.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = { "com.sample.repository", "com.sample.common" })
@PropertySource("app.properties")
public class AutoConfig {

}
