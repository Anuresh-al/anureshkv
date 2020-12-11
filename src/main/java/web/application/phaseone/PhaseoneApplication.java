package web.application.phaseone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class PhaseoneApplication {

	public static void main(String[] args) {
		SpringApplication.run(PhaseoneApplication.class, args);
	}

}
