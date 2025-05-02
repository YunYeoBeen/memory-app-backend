package org.yyb.memoryappbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class MemoryAppBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(MemoryAppBackendApplication.class, args);
    }

}
