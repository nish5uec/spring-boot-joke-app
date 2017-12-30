package com.sharma;

import com.sharma.exampleBean.FakeDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:chuck-config.xml")
public class SpringBootJokesAppApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootJokesAppApplication.class, args);

        FakeDataSource fakeDataSource = context.getBean(FakeDataSource.class);

        System.out.println(fakeDataSource.getUser() + " " + fakeDataSource.getPassword() + " " + fakeDataSource.getDbUrl() );


	}
}
