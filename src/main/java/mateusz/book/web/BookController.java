package mateusz.book.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import mateusz.book.domain.BookRepository;
import mateusz.book.domain.Ksiazka;

@Controller
public class BookController {

	@Autowired
	BookRepository repository;

	@RequestMapping(value = "/ksiegarnia", method = RequestMethod.GET)
	public String bookStoreFront(Model model) {

		model.addAttribute("book", new Ksiazka());
		model.addAttribute("books", repository.findAll());
		return "books";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveBook(@ModelAttribute Ksiazka book, BindingResult errors,
			Model model) {

		repository.save(book);
		return "redirect:ksiegarnia";
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	public String deleteBook(@PathVariable("id") Long id, Model model) {

		repository.delete(id);
		return "redirect:../ksiegarnia";
	}

}
