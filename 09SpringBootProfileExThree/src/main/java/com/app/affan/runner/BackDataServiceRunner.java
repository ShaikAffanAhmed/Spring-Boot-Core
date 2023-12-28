package com.app.affan.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
//@Profile("prod")
@Profile({"prod","podsup","uat"})
public class BackDataServiceRunner implements CommandLineRunner {

	public void run(String... args) throws Exception {
		System.out.println("Form BackUp Data Runner");
	}

}
