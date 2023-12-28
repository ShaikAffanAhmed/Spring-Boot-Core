package com.app.affan.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(3)
public class DatabaseConRunner implements CommandLineRunner
{
  @Override
public void run(String... args) throws Exception {
	System.out.println("From DatabaseConRunner class");
	
}
}
