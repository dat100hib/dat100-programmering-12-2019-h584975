package no.hvl.dat100.jplab12.oppgave2;

import no.hvl.dat100.jplab12.common.TODO;

public class Bilde extends Tekst {

	String url;
	
	public Bilde(int id, String bruker, String dato, String tekst, String url) {
		
		super(id,bruker,dato,tekst);
		this.url = url;
		
	}

	public Bilde(int id, String bruker, String dato, int likes, String tekst, String url) {
		
		super(id,bruker,dato,likes,tekst);
		this.url = url;
		
	}
	
	public String getUrl() {
		
		return this.url;

	}

	public void setUrl(String url) {
		
		this.url = url;
		
	}

	@Override
	public String toString() {
		
		String output = super.toString() + url + "\n";
		
		return output;
	}

	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
			
		String url = "\t\t<iframe src=" + '"' + this.url + '"' + "/iframe\n";
		
		String output = super.toHTML() + url;
		
		return output;		
	}
}
