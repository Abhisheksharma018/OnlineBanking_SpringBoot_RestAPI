package com.online.banking.userfront.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled=true)
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	
	 @Autowired
	 private Environment env;
	 
	 @Override
	    protected void configure(HttpSecurity http) throws Exception {
	    	
	    	http.csrf().disable().
	                authorizeRequests()
	                .antMatchers("**").permitAll()
	                .anyRequest().authenticated();
	 }
}
