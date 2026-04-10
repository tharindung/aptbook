package com.ccws.aptbook;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class AptbookApplicationTests {

	private static final Logger logger = LoggerFactory.getLogger(AptbookApplication.class);

	@Test
	void contextLoads() {

		logger.info("Test executing....");

		assertEquals(true, true);
	}

}
