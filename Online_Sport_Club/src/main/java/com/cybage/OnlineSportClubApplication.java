package com.cybage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@EnableJpaRepositories(basePackages = "com.cybage.*")
@EntityScan(basePackages = "com.cybage.*")
@SpringBootApplication(scanBasePackages="com.cybage.*")//exclude = { DataSourceAutoConfiguration.class, DataSourceTransactionManagerAutoConfiguration.class} )
public class OnlineSportClubApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineSportClubApplication.class, args);
	}

}
