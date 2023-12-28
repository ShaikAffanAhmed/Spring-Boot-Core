package com.app.affan;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TestDataRunner implements CommandLineRunner {
    

	public void run(String... args) throws Exception {
		Process p1 = new Process();
		p1.setCode("A");
		p1.setPort(111);
		
		Process p2 = new Process();
		p2.setCode("A");
		p2.setPort(111);
		
		System.out.println(p1.equals(p2));
		

	}

}
