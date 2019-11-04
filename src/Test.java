import no.hvl.dat100.jplab12.oppgave1.Innlegg;
import no.hvl.dat100.jplab12.oppgave2.Tekst;
import no.hvl.dat100.jplab12.oppgave2.Bilde;
import no.hvl.dat100.jplab12.oppgave3.Blogg;

public class Test {
	
	public static void main(String[] args) {
		
		Blogg samling = new Blogg();
		
		Tekst test = new Tekst(1,"Oliver","2019","HEI");
		
		samling.leggTil(test);
		samling.leggTil(test);
		samling.leggTil(test);
		samling.leggTil(test);
		samling.leggTil(test);
		
		System.out.println(samling.getAntall());
		
	}

}
