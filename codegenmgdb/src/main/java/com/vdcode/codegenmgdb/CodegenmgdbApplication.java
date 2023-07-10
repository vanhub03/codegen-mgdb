package com.vdcode.codegenmgdb;

//import com.vdcode.codegenmgdb.entities.User;
//import com.vdcode.codegenmgdb.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CodegenmgdbApplication {

	public static void main(String[] args) {
		SpringApplication.run(CodegenmgdbApplication.class, args);
	}

//	@Bean
//	CommandLineRunner commandLineRunner(UserService userService){
//		return args -> {
//			User user = User.builder().firstName("vanh").lastName("dao").email("vanhdao.mail@gmai").build();
//			userService.saveUser(user);
//
//		};
//	}
}
