package study.boardtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class BoardTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(BoardTestApplication.class, args);
    }

}
