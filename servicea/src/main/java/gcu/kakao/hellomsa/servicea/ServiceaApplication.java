package gcu.kakao.hellomsa.servicea;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@SpringBootApplication
public class ServiceaApplication {

	@RequestMapping("/")
	public String helloa(){
		return "hello servicea!!!";
	}

	public static void main(String[] args) {
		SpringApplication.run(ServiceaApplication.class, args);
	}

}
