package trainingsaufgaben;

import java.io.IOException;

import oop.IO;

public class Schaltjahre {

	public static void main(String[] args) throws IOException {
		System.out.println("Bei welchem Jahr soll ihre Berechnung starten?");
		String startZahl = IO.readString();
		System.out.println("Bis zu welchem Jahr soll Ihre Berechnung gehen?");
		String endZahl = IO.readString();

		int numberInt1 = Integer.parseInt(startZahl);
		int numberInt2 = Integer.parseInt(endZahl);
		if (startZahl.contains(",") && endZahl.contains(",")) {
			System.out.println(startZahl+" oder"+endZahl +" Kein Schaltjahr");
		}
		for (int i=numberInt1;i<=numberInt2;i++) {
			i = i/4;
			String s = String.valueOf(i);
			if (s.contains(",")) {
				System.out.println(s+" kein Schaltjahr");
			} else { System.out.println(s +" Schaltjahr");
			 i = Integer.parseInt(s);
			}
		}
	}
}


