
package javaconceptoftheday;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootQualifierDemoApplication implements CommandLineRunner {

    @Autowired
    ClassKLM klm;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootQualifierDemoApplication.class, args);
    }

    @Override
    public void run(String... args) {
        klm.show();
    }
}
