package matrix;

import java.io.IOException;

import oop.IO;

public class DreiGewinnt {

	public static void main(String[] args) throws IOException {
		String[][] spiel = erzeugenSpiel();
		anzeigeSpiel(spiel);
		boolean endeSpiel = false;
		System.out.println("X fängt an");
		do {
			xStelle(spiel);
			
			anzeigeSpiel(spiel);
			
			oStelle(spiel);
			anzeigeSpiel(spiel);
			System.out.println("Wollen sie weiter spielen?");
			String eingabe = IO.readString();
			if (eingabe.equalsIgnoreCase("nein")) {
				endeSpiel = true;
			} 
		} while (endeSpiel == false);
	}

	private static String[][] erzeugenSpiel() throws IOException{
		String spiel [][] = new String[3][3];
		for (int i = 0; i < spiel.length; i++) {
			for (int j = 0; j < spiel.length; j++) {
				spiel[i][j]= "..";
			}
		}
		return spiel;
	}


	private static void anzeigeSpiel(String[][] spiel) throws IOException{
		for (int i = 0; i < spiel.length; i++) {
			for (int j = 0; j < spiel[i].length; j++) {
				System.out.print(spiel[i][j]+" |\t");
			}
			System.out.println();

		}
	}
	private static void oStelle(String[][] spiel) throws IOException{
		System.out.print("In welche Zeile? : ");
		int zeile = IO.readInteger() -1;
		System.out.print("In welche Reihe? : ");
		int spalte = IO.readInteger() -1;
		
			if (spiel[zeile][spalte].equalsIgnoreCase("X")) {
				System.err.println("Da steht schön was");
				oStelle(spiel);
			}
			else if (spiel[zeile][spalte].equalsIgnoreCase("O")) {
				System.err.println("Da steht schön was");
				oStelle(spiel);
			}
		spiel[zeile][spalte] = "O";

	}

	private static void xStelle(String[][] spiel) throws IOException{
		System.out.print("In welche Zeile? : ");
		int zeile = IO.readInteger()-1;
		System.out.print("In welche Reihe? : ");
		int spalte = IO.readInteger()-1;
			if (spiel[zeile][spalte].equalsIgnoreCase("X")) {
				System.err.println("Da steht schön was");
				xStelle(spiel);
			}else if (spiel[zeile][spalte].equalsIgnoreCase("O")) {
				System.err.println("Da steht schön was");
				xStelle(spiel);
			} 
		spiel[zeile][spalte] = "X";
	}



}
