package com.example.Loan_mangement_module;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication(exclude = {
		org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration.class,
		org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration.class
})


public class LoanMangementModuleApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoanMangementModuleApplication.class, args);
	}

}
