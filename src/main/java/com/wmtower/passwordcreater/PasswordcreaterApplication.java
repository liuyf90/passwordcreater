package com.wmtower.passwordcreater;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * @author liuyf90
 **/
@SpringBootApplication
@EnableJpaRepositories
@Controller
@EnableJpaAuditing
public class PasswordcreaterApplication {
	public static void main(String[] args) {
		SpringApplication.run(PasswordcreaterApplication.class, args);
	}
        @RequestMapping("/login")
        public String login() {
            return "index";
        }
}
