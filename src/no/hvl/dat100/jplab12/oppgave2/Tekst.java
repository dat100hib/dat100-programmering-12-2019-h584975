package no.hvl.dat100.jplab12.oppgave2;

import no.hvl.dat100.jplab12.oppgave1.*;
import no.hvl.dat100.jplab12.common.TODO;

public class Tekst extends Innlegg {

	String tekst;
	
	public Tekst () {
		
	}
	
	public Tekst(int id, String bruker, String dato, String tekst) {
		
		super(id,bruker,dato);
		this.tekst = tekst;
				
	}
	
	public Tekst(int id, String bruker, String dato, int likes, String tekst) {
		
		super(id,bruker,dato,likes);
		this.tekst = tekst;
		
	}
	
	public String getTekst() {
		
		return this.tekst;

	}

	public void setTekst(String tekst) {
		
		this.tekst = tekst;
		
	}

	@Override
	public String toString() {
		
		String output = this.getClass().getSimpleName().toUpperCase() + super.toString() + "\n" + this.tekst + "\n";
		
		return output;
	}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
			
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
