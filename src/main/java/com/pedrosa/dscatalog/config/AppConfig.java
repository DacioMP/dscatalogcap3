package com.pedrosa.dscatalog.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
public class AppConfig {

	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
//	@Configuration
//	public class SecurityConfig {
//
//		@Bean
//		public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//			http.csrf(csrf -> csrf.disable());
//			http.securityMatcher("http://localhost:8080/h2-console/").csrf(csrf -> csrf.disable())
//			.headers(headers -> headers.frameOptions(frameOptions -> frameOptions.disable()));
//			http.authorizeHttpRequests(auth -> auth.anyRequest().permitAll());
//			return http.build();
//		}
//	}
}
