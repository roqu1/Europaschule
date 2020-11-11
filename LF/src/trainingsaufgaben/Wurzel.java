package trainingsaufgaben;

import java.io.IOException;

import oop.IO;

public class Wurzel {

	public static void main(String[] args) throws IOException {
		System.out.print("Geben Sie ihre Wert ein: ");
		int nummer = IO.readInteger();
		if (nummer < 0) {
			System.out.println("Schreiben sie eine positive Zahl");
		}
		else if (nummer>0) {
			int wuerzel = (int) Math.sqrt(nummer);
			int positivZahl = Math.abs(wuerzel);
			System.out.println("Das ist das Ergebnis: "+positivZahl);
		}
	}

}
