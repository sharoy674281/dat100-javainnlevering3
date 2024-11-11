package no.hvl.dat100.oppgave4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import no.hvl.dat100.oppgave3.Blogg;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {
		String fullFilnavn = mappe + File.separator + filnavn;

		try {
			PrintWriter writer = new PrintWriter(fullFilnavn);

			writer.print(samling.toString());

			writer.close();

			return true;
		} catch (FileNotFoundException e) {
			System.out.println("Feil ved skriving til fil: " + e.getMessage());
			return false;
		}
	}
}
