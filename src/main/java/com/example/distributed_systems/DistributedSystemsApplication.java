package com.example.distributed_systems;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.example.distributed_systems.controller"})
@EntityScan("com.example.distributed_systems.model")
@EnableJpaRepositories("com.example.distributed_systems.repository")
public class DistributedSystemsApplication {
	public static void main(String[] args) {
		SpringApplication.run(DistributedSystemsApplication.class, args);
	}
}
