package rs.ac.bg.fon.jgrass.mvnbiblioteka2017;

import java.util.LinkedList;

import rs.ac.bg.fon.jgrass.mvnbiblioteka2017.interfejsi.BibliotekaPretrazivanje;
import rs.ac.bg.fon.jgrass.mvnbiblioteka2017.sistemske_operacije.SOPronadjiKnjigu;
import rs.ac.bg.fon.jgrass.mvnbiblioteka2017.sistemske_operacije.SOUcitajKnjige;

public class BibliotekaPretrazivanjeImplementacija implements BibliotekaPretrazivanje {

	private LinkedList<Knjiga> knjige = new LinkedList<Knjiga>();

	public LinkedList<Knjiga> pronadjiKnjigu(String naslov, Autor autor, long isbn, String izdavac) {
		return SOPronadjiKnjigu.izvrsi(naslov, autor, isbn, izdavac, knjige);
	}

	public void ucitajKnjige(String filepath) throws Exception {
		knjige = SOUcitajKnjige.izvrsi(filepath);
	}

}
