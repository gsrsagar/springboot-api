package com.sagarstack.APi_Project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages =
{   "com.sagarstack.controllers",
 	"com.sagarstack.components",
 	"com.sagarstack.services"
})
@EnableJpaRepositories("com.sagarstack.repositories")
@EntityScan("com.sagarstack.entities")
public class APiProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(APiProjectApplication.class, args);
	}

}
