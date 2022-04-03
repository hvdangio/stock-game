package dev.hvdang.web;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.SpringApplication;


@Log4j2
public class StockGame extends SbwebBaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(StockGame.class, args);
		log.info("App available at: localhost:8091/hvdangApp/swagger-ui/");
		log.info("App available at: localhost:8091/hvdangApp/web/stockgame/");
	}

}
