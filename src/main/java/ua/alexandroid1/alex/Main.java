package ua.alexandroid1.alex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by Oleksandr on 09.01.2017.
 */

@SpringBootConfiguration
@ComponentScan
@EnableAutoConfiguration
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

}
