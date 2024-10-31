package com.example.spingjpa.jpa;

import com.example.spingjpa.jpa.entities.AuthorEntity;
import com.example.spingjpa.jpa.entities.VideoEntity;
import com.example.spingjpa.jpa.repository.AuthorRepository;
import com.example.spingjpa.jpa.repository.VideoRepository;
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
	public CommandLineRunner commandLineRunner(AuthorRepository authorRepository, VideoRepository videoRepository){
		return args -> {
			/*var author = AuthorEntity.builder()
					.firstName("Itachi")
					.lastName("Uchiha")
					.age(21)
					.email("itachi@akatsuki.com")
					.createdAt(LocalDateTime.now())
					.build();
			authorRepository.save(author);*/
			var video = VideoEntity.builder()
					.name("5 mins craft")
					.length(5)
					.build();
			videoRepository.save(video);
		};
	}

}
