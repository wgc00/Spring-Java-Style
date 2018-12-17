package com.wgc.persons.spring.web;

import com.wgc.persons.spring.SpringDAOConfig;
import com.wgc.persons.spring.SpringServiceConfig;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.wgc.persons.spring")
@PropertySource(value = "classpath:jdbc.properties")
@Import({SpringDAOConfig.class, SpringServiceConfig.class})
public class RootConfig {

}
