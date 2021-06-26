package minh.project.FixJobSpyder;

import minh.project.FixJobSpyder.Service.StatusSCHService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class FixJobSpyderApplication {

	public static void main(String[] args) {
		SpringApplication.run(FixJobSpyderApplication.class, args);
	}

//	@Bean
//	public StatusSCHService statusSCHService() {
//		StatusSCHService service = new StatusSCHService();
//		return service;
//	}
}
