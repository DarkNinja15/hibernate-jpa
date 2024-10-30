package com.example.spingjpa.jpa;

import com.example.spingjpa.jpa.entities.AuthorEntity;
import com.example.spingjpa.jpa.repository.AuthorRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@SpringBootApplication
public class JpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(AuthorRepository authorRepository){
		return args -> {
			var author = AuthorEntity.builder()
					.firstName("Itachi")
					.lastName("Uchiha")
					.age(21)
					.email("itachi@akatsuki.com")
					.createdAt(LocalDateTime.now())
					.build();
			authorRepository.save(author);
		};
	}

}
