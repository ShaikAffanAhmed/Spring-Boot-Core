package com.app.affan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.affan.service.ExportExcelService;
import com.app.affan.service.PdfExportService;
@Component
public class TestObjRunner implements CommandLineRunner {
	
    @Autowired
	private ExportExcelService es;
    @Autowired
    private PdfExportService pdf;{	
	}
    
    public void run(String... args) throws Exception {
	System.out.println(es);
	System.out.println(pdf);

	}

}
