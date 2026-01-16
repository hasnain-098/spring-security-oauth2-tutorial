package dev.hasnain.oauth_tutorial;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		Dotenv dotenv = Dotenv.load();
		System.setProperty("CLIENT_SECRET", dotenv.get("CLIENT_SECRET"));
		System.out.println(dotenv.get("CLIENT_SECRET"));

		SpringApplication.run(Application.class, args);
	}

}
