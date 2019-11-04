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
		this.nesteledig = 0;
		
	}

	public Blogg(int lengde) {
		
		this.innleggtabell = new Innlegg[lengde];
		this.nesteledig = 0;
		
	}

	public int getAntall() {
		
		int antall = nesteledig;
		
		return antall;
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
				i = this.innleggtabell.length;
			}
		}
		
		return indeks;
	}

	public boolean finnes(Innlegg innlegg) {
		
		boolean finnes = false;
		
		for (int i = 0; i < this.innleggtabell.length; i++) {
			if (innleggtabell[i].erLik(innlegg)) {
				finnes = true;
				i = this.innleggtabell.length;
			}
		}
		
		return finnes;
	}

	public boolean ledigPlass() {
		
		boolean ledig = false;
		
		if (getAntall() < this.innleggtabell.length) {
			ledig = true;
		}
		
		return ledig;
	}
	
	public boolean leggTil(Innlegg innlegg) {

		int nesteledig = getAntall();
		
		boolean lagtinn = false;
		
		if (ledigPlass()) {
			innleggtabell[nesteledig] = innlegg;
			lagtinn = true;
			this.nesteledig = nesteledig + 1;
		}

		return lagtinn;
	}
	
	public String toString() {
		
		int indeks = getAntall();
		
		String output = indeks + "\n";
		
		for (int i = 0; i < indeks; i++) {
			output += this.innleggtabell[i].toString();
		}
		
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