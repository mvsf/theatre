package demo.theatreApp.backendTheatre;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackendTheatreApplication {

	public static void main(String[] args) {
            	System.setProperty("server.servlet.context-path", "/backendTheatre");
		SpringApplication.run(BackendTheatreApplication.class, args);
	}

}
