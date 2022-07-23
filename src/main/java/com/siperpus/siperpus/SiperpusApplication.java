package com.siperpus.siperpus;

import java.util.ArrayList;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.siperpus.siperpus.entity.Role;
import com.siperpus.siperpus.entity.User;
import com.siperpus.siperpus.services.UserService;

@SpringBootApplication
public class SiperpusApplication {

	public static void main(String[] args) {
		SpringApplication.run(SiperpusApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(UserService userService) {
		return args -> {
			userService.saveRole(new Role(null, "ROLE_SUPERADMIN"));
			userService.saveRole(new Role(null, "ROLE_ADMIN"));
			userService.saveRole(new Role(null, "ROLE_MANAGER"));
			userService.saveRole(new Role(null, "ROLE_USER"));

			userService.saveUser(new User(null, "Aan Maryanto", "aan", "1234", "A", null, null, new ArrayList<>()));
		
			userService.addRoleToUser("aan", "ROLE_SUPERADMIN");
		};
	}

	@Bean
	PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

}
