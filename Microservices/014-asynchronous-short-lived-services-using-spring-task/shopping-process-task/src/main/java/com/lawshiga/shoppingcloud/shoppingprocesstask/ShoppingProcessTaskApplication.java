package com.lawshiga.shoppingcloud.shoppingprocesstask;

import com.lawshiga.shoppingcloud.shoppingprocesstask.service.ShoppingProcessTaskRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.configuration.EnableTask;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableTask
public class ShoppingProcessTaskApplication {

	@Bean
	ShoppingProcessTaskRunner getShoppingProcessTaskRunner(){
		return new ShoppingProcessTaskRunner();
	}

	public static void main(String[] args) {
		SpringApplication.run(ShoppingProcessTaskApplication.class, args);
	}

}
