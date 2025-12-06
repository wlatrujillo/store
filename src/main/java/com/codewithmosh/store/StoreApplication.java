package com.codewithmosh.store;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class StoreApplication {

	public static void main(String[] args) {

        ConfigurableApplicationContext context =
                SpringApplication.run(StoreApplication.class, args);

        context.getBean(NotificationManager.class).sendNotification("Hello World");
	}

}
