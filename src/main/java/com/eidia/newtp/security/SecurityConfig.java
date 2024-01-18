package com.eidia.newtp.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
	/*
	 * protected void configure(AuthenticationManagerBuilder auth) throws Execption
	 * { auth.inMemoryAuthentication().withUser("admin").roles("USER", "ADMIN");
	 * auth.inMemoryAuthentication().withUser("user").roles("USER"); }
	 */
	@Bean
	public InMemoryUserDetailsManager userDetailsService() {
	    UserDetails user = User.withDefaultPasswordEncoder()
	        .username("user")
	        .password("1234")
	        .roles("USER")
	        .build();

	    UserDetails admin = User.withDefaultPasswordEncoder()
	        .username("admin")
	        .password("1234")
	        .roles("USER", "ADMIN")
	        .build();

	    return new InMemoryUserDetailsManager(user, admin);
	}
	
	
}
