package intra.erp.myerp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class MyerpApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyerpApplication.class, args);
	}

}
