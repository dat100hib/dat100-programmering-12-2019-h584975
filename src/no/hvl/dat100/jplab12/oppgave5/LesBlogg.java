package no.hvl.dat100.jplab12.oppgave5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import no.hvl.dat100.jplab12.common.TODO;
import no.hvl.dat100.jplab12.oppgave1.*;
import no.hvl.dat100.jplab12.oppgave2.*;
import no.hvl.dat100.jplab12.oppgave3.*;

import javax.swing.JOptionPane;

public class LesBlogg {

	private static String MAPPE = System.getProperty("user.dir") + "/src/no/hvl/dat100/jplab12/tests/";

	private static String TEKST = "TEKST";
	private static String BILDE = "BILDE";

	public static Blogg les(String filnavn) {

		Blogg samling = new Blogg();
		int antall = 0;
		int id = 0;
		int likes = 0;
		String bruker = "";
		String dato = "";
		String url = "";
		String tekst = "";
		Innlegg innlegg;
		boolean bilde = false;
				
		try {
			
			Scanner leser = new Scanner(new File(MAPPE + filnavn));
			
			antall = Integer.parseInt(leser.nextLine());
			samling = new Blogg(antall);
			
			for (int i = 0; i < antall; i++) {
				
				if (leser.nextLine().equals(BILDE)) {
					bilde = true;
				}
				
				id = Integer.parseInt(leser.nextLine());
				bruker = leser.nextLine();
				dato = leser.nextLine();
				likes = Integer.parseInt(leser.nextLine());
				tekst = leser.nextLine();
				
				if (bilde) {
					url = leser.nextLine();
					innlegg = new Bilde(id,bruker,dato,likes,tekst,url);
				} else {
					innlegg = new Tekst(id,bruker,dato,likes,tekst);
				}
				
				samling.leggTil(innlegg);
				
				bilde = false;
			}
			
			leser.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("Fil ikke funnet");
		}

		return samling;
	}
}
