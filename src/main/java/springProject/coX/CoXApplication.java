package springProject.coX;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class CoXApplication {

	public static void main(String[] args) {

//	// .env 파일에서 환경 변수를 로드
//	Dotenv dotenv = Dotenv.configure().load();
//	dotenv.entries().forEach(entry -> System.setProperty(entry.getKey(), entry.getValue()));
//
//	System.out.println("DB_URL: " + System.getProperty("DB_URL"));
//	System.out.println("DB_USERNAME: " + System.getProperty("DB_USERNAME"));
//	System.out.println("DB_PASSWORD: " + System.getProperty("DB_PASSWORD"));

	// Spring Boot 애플리케이션을 시작
	SpringApplication.run(CoXApplication.class, args);
	}


}