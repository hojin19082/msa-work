package gcu.kakao.hellomsa.serviceb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@SpringBootApplication
public class ServicebApplication {


	@RequestMapping("/")
	public String helloa(){
		return "hellob";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(ServicebApplication.class, args);
	}

}
