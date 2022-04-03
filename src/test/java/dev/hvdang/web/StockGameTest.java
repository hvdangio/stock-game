
package dev.hvdang.web;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@Log4j2
@SpringBootTest
class StockGameTest
{

	public static void main(String[] args) {
		System.setProperty("spring.config.additional-location", "classpath:/custom-config/");
		StockGame.main(args);
	}

	@Test
	void contextLoads() {
	}

}
