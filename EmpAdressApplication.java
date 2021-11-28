package empAdress.curd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class EmpAdressApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmpAdressApplication.class, args);
	}

}
