import no.hvl.dat100.jplab12.oppgave1.Innlegg;
import no.hvl.dat100.jplab12.oppgave2.Tekst;
import no.hvl.dat100.jplab12.oppgave2.Bilde;
import no.hvl.dat100.jplab12.oppgave3.Blogg;

public class Test {
	
	public static void main(String[] args) {
		
		Blogg samling = new Blogg(2);
		
		Tekst test = new Tekst(1,"Oliver","2019","HEI");
		Tekst test2 = new Tekst(2,"Oliver","2019","HEI");
		Tekst test3 = new Tekst(3,"Oliver","2019","HEI");
		
		boolean inn1 = samling.leggTil(test);
		boolean inn2 = samling.leggTil(test2);
		
		System.out.println("Antall objekt i tabell: " + samling.getAntall());
		
		System.out.println();
		
		System.out.println("Ledig plass i tabell etter lagt inn: " + samling.ledigPlass());
		
		System.out.println();
		
		System.out.println("Lagt inn 1: " + inn1);
		System.out.println("Lagt inn 2: " + inn2);
		
		System.out.println();
		
		System.out.println(samling.finnInnlegg(test3));
		
	}

}
