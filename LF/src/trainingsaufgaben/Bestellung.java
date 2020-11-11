package trainingsaufgaben;

import java.io.IOException;

import oop.IO;

public class Bestellung {

	
public static void main(String[] args) throws IOException {

		double Schraube = 0.5;
		double Muttern = 0.3;
		double Unterlegscheiben = 0.1;


		System.out.println("Möchten Sie Schraube und Muttern?");
		String schraube = IO.readString();
		if (schraube.equalsIgnoreCase("Muttern")) {
			System.out.println("Wie viele Muttern benötigen Sie?");
			int anzahlMutter = IO.readInteger();
			double summemuttern = anzahlMutter*Muttern;
			System.out.println("wie viele Schrauben benötigen Sie?");
			int anzahlschraube = IO.readInteger();
			double summeschraube = anzahlschraube * Schraube;
			if (anzahlMutter!= anzahlschraube) {
				System.out.println("Einkauf ist unmöglich");
				
			
			}
			else {
				double gesamt = summemuttern + summeschraube;
				System.out.println("Es sind " + gesamt +"€ zu bezahlen");
			}
			
			
		System.out.println("Sollen Unterlegscheiben auch in Ihrem Warenkorb hinzugefügt werden?");
		String antwort = IO.readString();
		if (antwort.equalsIgnoreCase("ja")){
			System.out.println("Wie viele Unterlegscheiben werden Sie benötigen?");
			int anzahlunterlegscheiben = IO.readInteger();
			double summeunterlegscheiben= Unterlegscheiben * anzahlunterlegscheiben;
			System.out.println("Es sind "+ summeunterlegscheiben+ "€ für Untelegscheiben zu bezahlen");
			
		} else {
			System.out.println("Alles klar,Vielen Dank für Ihr Einkauf!");
		
		}
	}
}
}

