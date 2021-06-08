package com.raj.multiplepropfiles;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@Value("${bd_name}")
	private String prop_dbname;
	
	@Value("${mailId1}")	
	private String prop_email1;

	@GetMapping("/test")
	public String getMultilePropData() {
		String retValue = prop_email1 +" "+ prop_dbname;
		return retValue;
	}
}
