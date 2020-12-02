package matrix;

import java.io.IOException;


import oop.IO;

public class Kino {

	public static void main(String[] args) throws IOException {
		String kino[][] = erzeugenSaal();
		anzeigesaal(kino);
		boolean beenden = false;
		do {
			System.out.println("Was kann ich für Sie tun?");
			System.out.println("[1] - Für Reservieren");
			System.out.println("[2] - Für Stornieren");
			System.out.println("[3] - Für Abrechnen");
			int eingeben = IO.readInteger();
			if(eingeben==3) {
				System.out.println("Tschüss");
				beenden = true;
			} else if (eingeben==1) {
				reservierung(kino);
				anzeigesaal(kino);
			} else if (eingeben ==2) {
				stornieren(kino);
				anzeigesaal(kino);
			} else {
				System.err.println("Ungültige eingabe");
			}
			
			
		} while (beenden == false);
		


	}

	private static String[][] erzeugenSaal() throws IOException{
		System.out.print("Geben sie die Anzahl der Reihe: ");
		int zeile = IO.readInteger();
		System.out.print("Geben sie die Anzahl der Plätze: ");
		int spalte = IO.readInteger();
		String[][] saal = new String[zeile][spalte];
		for (int i = 0; i < saal.length; i++) {
			for (int j = 0; j < saal[i].length; j++) {
				saal[i][j]="O";
			}
		}

		return saal;
	}

	private static void anzeigesaal(String[][] saal) throws IOException{
		for (int i = 0; i < saal.length; i++) {
			for (int j = 0; j < saal[i].length; j++) {
				System.out.print(saal[i][j]+"\t");
			}
			System.out.println();
		}
		

	}
	private static void reservierung(String[][] saal) throws IOException{
		System.out.print("Welche Reihe?: ");
		int zeile1= IO.readInteger() -1;
		System.out.print("Welche Platz?: ");
		int spalte1= IO.readInteger() -1;
		
		if (zeile1 > saal.length || spalte1 > saal.length) {
			System.out.println("Falsche eingabe");
		} else if (saal[zeile1][spalte1].equalsIgnoreCase("X")) {
			System.err.println("Der Platz ist schön reserviert");
		} else {
			saal[zeile1][spalte1] = "X";
		}

	}
	private static void stornieren(String[][] saal) throws IOException{
		System.out.print("Welche Reihe?: ");
		int zeile1= IO.readInteger() -1;
		System.out.print("Welche Platz?: ");
		int spalte1= IO.readInteger() -1;
		
		if (zeile1 > saal.length || spalte1 > saal.length) {
			System.out.println("Falsche eingabe");
		} else if (saal[zeile1][spalte1].equalsIgnoreCase("O")) {
			System.err.println("Der Platz ist frei");
		} else {
			saal[zeile1][spalte1] = "O";
		}

	}

}
