package com.ricardo.devsuperior;

import com.ricardo.devsuperior.entities.Category;
import com.ricardo.devsuperior.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DevsuperiorApplication implements CommandLineRunner { // o CommandLineRunner permite iniciar a aplicação rodando os comandos aqui inseridos

	@Autowired
	private CategoryRepository categoryRepository;

	public static void main(String[] args) {
		SpringApplication.run(DevsuperiorApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception { // método que implementa os comandos nele inseridos
		Category cat1 = new Category(1L, "Electronics");
		Category cat2 = new Category(2L, "Books");

		categoryRepository.save(cat1);
		categoryRepository.save(cat2);
	}
}
