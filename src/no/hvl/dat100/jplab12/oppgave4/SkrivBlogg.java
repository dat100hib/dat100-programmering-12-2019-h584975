package no.hvl.dat100.jplab12.oppgave4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.File;
import no.hvl.dat100.jplab12.oppgave3.*;
import no.hvl.dat100.jplab12.common.TODO;

public class SkrivBlogg {

	private static String MAPPE = System.getProperty("user.dir") + "/src/no/hvl/dat100/jplab12/tests/";

	public static boolean skriv(Blogg samling, String filnavn) {

		boolean skrevet = true;
		
		try {
			File fil = new File(filnavn);
			PrintWriter skriver = new PrintWriter(fil);
			skriver.print(samling.toString());
			skriver.close();
		}		
		catch (FileNotFoundException e) {
			skrevet = false;
			System.out.println("Fil ikke funnet");
		}
		
		return skrevet;
	}
}
