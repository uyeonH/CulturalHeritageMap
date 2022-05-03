package yooyeon.mapofculturalheritage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
@EnableJpaAuditing
@SpringBootApplication
public class MapOfCulturalHeritageApplication {

    public static void main(String[] args) {
        SpringApplication.run(MapOfCulturalHeritageApplication.class, args);
    }

}
