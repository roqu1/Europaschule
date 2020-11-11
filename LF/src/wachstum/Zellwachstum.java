package wachstum;

import java.io.IOException;

import oop.IO;

public class Zellwachstum {

	public static void main(String[] args) throws IOException {
		while (true) {
			boolean v = true;
			System.out.print("Bitte die aktuelle Zellmenge eingeben: ");
			double zellmenge = IO.readDouble();
			System.out.print("Bitte den Wachstumsfaktor eingeben: ");
			int faktor = IO.readInteger();
			System.out.print("Bitte die Laufzeit der Hochrechnung in Tagen eingeben: ");
			int tage = IO.readInteger();


			System.out.println("Tage      Zellmenge ");
			// Rechnung
			for (int i=0;i<=tage;i++) {

				double formel = zellmenge*Math.pow(faktor, i);
				System.out.println(i+"         "+formel);

			}
			System.out.println("Weiteren Wachstumsprozess berechnen ?");
			String eingabe = IO.readString();
			if (eingabe.equalsIgnoreCase("ja")) {
				v = true;
			} else { 
				break;
			}

		}
	}
}
