package com.app.affan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseConRunner implements CommandLineRunner
{
    @Autowired
	private EmailConfig Econ;
    
	@Override
	public void run(String... args) throws Exception {
		System.out.println(Econ);
		
	}
}
