package com.ccws.aptbook;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AptbookApplication {

	private static final Logger logger = LoggerFactory.getLogger(AptbookApplication.class);

	public void init()
	{
		logger.info("Starting application execution....");
	}

	public static void main(String[] args) {

		SpringApplication.run(AptbookApplication.class, args);
		logger.info("Application exeuted....");
	}

}
