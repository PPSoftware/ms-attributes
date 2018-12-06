package io.github.ppSoftware.rpgSys.msAttributes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class MsAttributesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsAttributesApplication.class, args);
	}
}
