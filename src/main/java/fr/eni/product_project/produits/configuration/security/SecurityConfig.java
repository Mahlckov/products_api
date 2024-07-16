/**
 * 
 */
package fr.eni.product_project.produits.configuration.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

/**
 * Classe en charge de
 * 
 * @author tipha
 * @version
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig {

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		http.csrf(csrf -> csrf.disable()) 
				.authorizeHttpRequests(auth -> auth.anyRequest().permitAll()
				);

		return http.build();
	}
}
