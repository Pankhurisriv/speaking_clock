package speakingclockproject;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
@OpenAPIDefinition(
		info=@Info(
				title = "Spring Boot Speaking Clock Rest API Documentation",
				description = "Spring Boot Speaking Clock Rest API Documentation",
				version = "v1.0",
				contact = @Contact(
						name="Pankhuri",
						email="pankhurishrivastava67@gmail.com",
						url="https://www.pankhuri.net"
				),
				license = @License(
						name="Apache 2.0",
						url="https://www.pankhuri.net/license"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "Spring Boot  Speaking Clock Documentation",
				url="https://www.pankhuri.net/student_management.html"
		)
)

//http://localhost:8081/swagger-ui/index.html
public class SpeakingClockApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpeakingClockApplication.class, args);
	}

}
