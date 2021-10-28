package bd203467.veterinaria;

import bd203467.veterinaria.repository.CitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class VeterinariaApplication {

	public static void main(String[] args) {
		SpringApplication.run(VeterinariaApplication.class, args);
	}

}
