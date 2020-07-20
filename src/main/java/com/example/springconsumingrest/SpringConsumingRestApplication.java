package com.example.springconsumingrest;

import com.example.springconsumingrest.model.QuoteModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SpringConsumingRestApplication {

	private static final Logger log = LoggerFactory.getLogger(SpringConsumingRestApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringConsumingRestApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
			QuoteModel quoteModel = restTemplate.getForObject("https://gturnquist-quoters.cfapps.io/api/random", QuoteModel.class);
			if (quoteModel != null) {
				log.info(quoteModel.toString());
				log.info(quoteModel.getType());
				log.info(quoteModel.getValue().getQuote());
			}
		};
	}

}
