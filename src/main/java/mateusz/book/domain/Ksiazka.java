package mateusz.book.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ksiazka {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long id;
	
	private String tytul;
	private String autor;

	private int rok;
	private double cena;

	public Ksiazka(long id, String autor, String tytul, int rok, double cena) {
		super();
		this.tytul = tytul;
		this.autor = autor;
		this.rok = rok;
		this.cena = cena;
	}

	public Ksiazka() {
		super();
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	public String getTytul() {
		return tytul;
	}

	public void setTytul(String title) {
		this.tytul = title;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String author) {
		this.autor = author;
	}

	public double getCena() {
		return cena;
	}

	public void setCena(double price) {
		this.cena = price;
	}

	public int getRok() {
		return rok;
	}

	public void setRok(int year) {
		this.rok = year;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + tytul + ", author=" + autor + ",year=" + rok + ", price=" + cena + "]";
	}

}
