package no.hvl.dat100.jplab12.oppgave3;

import no.hvl.dat100.jplab12.common.TODO;
import no.hvl.dat100.jplab12.oppgave1.*;
import no.hvl.dat100.jplab12.oppgave2.Bilde;
import no.hvl.dat100.jplab12.oppgave2.Tekst;

public class Blogg {

	Innlegg[] innleggtabell;
	int nesteledig;

	public Blogg() {
		
		this.innleggtabell = new Innlegg[20];
		
	}

	public Blogg(int lengde) {
		
		this.innleggtabell = new Innlegg[lengde];
		
	}

	public int getAntall() {
		
		int antall = nesteledig;
		
		return 20;
	}
	
	public Innlegg[] getSamling() {
		
		Innlegg[] samling = this.innleggtabell;
		
		return samling;
	}
	
	public int finnInnlegg(Innlegg innlegg) {

		int indeks = -1;
		
		for (int i = 0; i < this.innleggtabell.length; i++) {
			if (innleggtabell[i].erLik(innlegg)) {
				indeks = i;
			}
		}
		
		return indeks;
	}

	public boolean finnes(Innlegg innlegg) {
		
		boolean finnes = false;
		
		for (int i = 0; i < this.innleggtabell.length; i++) {
			if (innleggtabell[i].erLik(innlegg)) {
				finnes = true;
			}
		}
		
		return finnes;
	}

	public boolean ledigPlass() {
		
		boolean ledig = false;
		
		if (getAntall() < innleggtabell.length) {
			ledig = true;
		}
		
		return ledig;
	}
	
	public boolean leggTil(Innlegg innlegg) {

		boolean lagtinn = false;
		
		if (!finnes(innlegg) && ledigPlass()) {
				innleggtabell[this.nesteledig] = innlegg;
				lagtinn = true;
		}

		return lagtinn;
	}
	
	public String toString() {
		
		String output = getAntall() + Bilde.class.toString();
		
		output.replaceAll("BILDE", "TEKST");
		
		return output;
		
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}