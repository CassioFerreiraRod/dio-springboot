package dio.springiocdibeansautowired;

import dio.springiocdibeansautowired.app.ConversorJSON;
import dio.springiocdibeansautowired.app.ViaCepResponce;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringIocDiBeansAutowiredApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringIocDiBeansAutowiredApplication.class, args);
	}

	@Bean
	public CommandLineRunner run(ConversorJSON conversor) {
		return args -> {
			String json = "{\"cep\": \"01001-000\",\"logradouro\": \"Praça da Sé\",\"localidade\": \"São Paulo\"}";
			ViaCepResponce responce = conversor.converter(json);
			System.out.println("Dados do cep: " + responce);
		};
	}
}
