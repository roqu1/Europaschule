package vektoren;

import java.io.IOException;

import oop.IO;

public class Lagerbestand {

	public static void main(String[] args) throws IOException {

		// Info sammeln
		System.out.print("Wie viele unterschiedliche Artikel haben sie im Lager?:");
		int artikels = IO.readInteger();
		System.out.print("Erfassen Sie die einzelnen Artikelbezeichnungen:");
		String[] artikeln = IO.readStringArray1D(artikels);
		System.err.println("Erfassen sie jetzt den Einzelpreis jedes Artikels:");
		int zahl = 0;
		int[] menge = new int[artikels];
		double [] price = new double[artikels];
		for (int i = 0; i < artikeln.length; i++) {
			System.err.print("Preis des Artikels '"+artikeln[i]+"':");
			
			price [i] = IO.readDouble();


		}
		System.out.println("Erfassen Sie jetzt die Anzahl der einzelnen Artikeln:");
		for (int i = 0; i < artikeln.length; i++) {
			System.err.println("Menge des Artikels '"+artikeln[i]+"':");
			
			menge[i] = IO.readInteger();
			
		}
		// Ermitteln
		int summeMenge=0;
		double kostet = 0;
		for (int i = 0; i < artikeln.length; i++) {
			summeMenge= summeMenge+menge[i];
		}
		for (int i = 0; i < price.length; i++) {
		kostet = summeMenge + price[i]*menge[i];
		}
		System.out.println("In Ihrem Lager befinden sich insgesamt "+summeMenge+" Artikel im Wert von "+kostet+"€");

	}

}
