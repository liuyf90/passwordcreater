package com.wmtower.passwordcreater;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author liuyf90
 * 2022-02-08
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
	protected void configure(HttpSecurity http) throws Exception {
		http
			.authorizeRequests()
				.antMatchers("/css/**").permitAll()
				.anyRequest().authenticated()
				.and()
			.formLogin()
				.loginPage("/login")
				.permitAll()
				.and()
			.logout()
				.permitAll();
	}
        // @formatter:on

    //@Bean
    //public UserDetailsService userDetailsService() {
    //    UserDetails userDetails = User.withDefaultPasswordEncoder().username("user").password("password").roles("USER")
    //            .build();
    //    return new InMemoryUserDetailsManager(userDetails);
    //}
    
}
