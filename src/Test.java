import no.hvl.dat100.jplab12.oppgave1.Innlegg;
import no.hvl.dat100.jplab12.oppgave2.Tekst;
import no.hvl.dat100.jplab12.oppgave2.Bilde;
import no.hvl.dat100.jplab12.oppgave3.Blogg;

public class Test {
	
	public static void main(String[] args) {
		
		Blogg samling = new Blogg(1);
		
		Tekst test = new Tekst(1,"Oliver","2019","HEI");
		
		boolean test1 = samling.leggTil(test);
		boolean test2 = samling.leggTil(test);
		
		System.out.println("Antall objekt i tabell: " + samling.getAntall());
		
		System.out.println();
		
		System.out.println("Ledig plass i tabell etter lagt inn: " + samling.ledigPlass());
		
		System.out.println();
		
		System.out.println("Lagt inn 1: " + test1);
		System.out.println("Lagt inn 2: " + test2);
		
	}

}
