package sarmiento.rigo.martrust;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class ForexApplication {

    public static void main(String[] args) {
        SpringApplication.run(ForexApplication.class, args);
    }

}
