package mateusz.book;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import mateusz.book.domain.BookRepository;
import mateusz.book.domain.Ksiazka;

@SpringBootApplication
public class BookstoreApplication {


	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(BookRepository repository) {
		return (args) -> {

			Ksiazka bk = new Ksiazka(1, "Ksiażka0", "tytul0", 2011, 20);
			Ksiazka bk2 = new Ksiazka(2, "Ksiażka0", "tytul1", 2012, 15);
			Ksiazka bk3 = new Ksiazka(3, "Ksiażka0", "tytul2", 2013, 25);
			Ksiazka bk4 = new Ksiazka(4, "Ksiażka0", "tytul3", 2014, 35);
			Ksiazka bk5 = new Ksiazka(5, "Ksiażka0", "tytul4", 2015, 30);
			Ksiazka bk6 = new Ksiazka(6, "Ksiażka0", "tytul5", 2016, 15);
			Ksiazka bk7 = new Ksiazka(7, "Ksiażka0", "tytul6", 2017, 20);

			repository.save(bk);
			repository.save(bk2);
			repository.save(bk3);
			repository.save(bk4);
			repository.save(bk5);
			repository.save(bk6);
			repository.save(bk7);

		};

	}
}