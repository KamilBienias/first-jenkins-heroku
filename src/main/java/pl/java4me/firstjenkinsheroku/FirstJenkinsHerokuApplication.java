package pl.java4me.firstjenkinsheroku;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FirstJenkinsHerokuApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstJenkinsHerokuApplication.class, args);
	}

	@GetMapping("/")
	public String get(){
		return "Hello Jenkins on Docker with Heroku";
	}

}
