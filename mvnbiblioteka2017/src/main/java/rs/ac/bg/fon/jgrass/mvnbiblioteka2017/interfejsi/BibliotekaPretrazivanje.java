package rs.ac.bg.fon.jgrass.mvnbiblioteka2017.interfejsi;

import java.util.LinkedList;

import rs.ac.bg.fon.jgrass.mvnbiblioteka2017.Autor;
import rs.ac.bg.fon.jgrass.mvnbiblioteka2017.Knjiga;

public interface BibliotekaPretrazivanje {

	public LinkedList<Knjiga> pronadjiKnjigu(
			String naslov, Autor autor, long isbn, String izdavac);
	
	public void ucitajKnjige(String filepath) throws Exception;
	
	
}
