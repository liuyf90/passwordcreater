package com.wmtower.passwordcreater;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author liuyf90
 * 2022-02-08
 */
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    
    // @formatter:off
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
                    .authorizeRequests((authorize) -> authorize
                            .antMatchers("/css/**", "/index").permitAll()
                            .antMatchers("/user/**").hasRole("USER")
                            )
                    .formLogin((formLogin) -> formLogin
                            .loginPage("/login")
                            .failureUrl("/login-error")
                            );
        }
        // @formatter:on

    //@Bean
    //public UserDetailsService userDetailsService() {
    //    UserDetails userDetails = User.withDefaultPasswordEncoder().username("user").password("password").roles("USER")
    //            .build();
    //    return new InMemoryUserDetailsManager(userDetails);
    //}
    
}
