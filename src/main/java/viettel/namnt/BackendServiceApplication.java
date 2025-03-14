package viettel.namnt;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackendServiceApplication {

	@Value("${jwt.secretKey}")
	private String jwtkey;

	public static void main(String[] args) {
		SpringApplication.run(BackendServiceApplication.class, args);
	}

	@PostConstruct
	public void Test() {
		System.out.println("jwtKey: " + jwtkey);
	}

}
