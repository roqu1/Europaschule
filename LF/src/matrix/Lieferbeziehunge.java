package matrix;

import java.io.IOException;

import oop.IO;
import scratch2Java.SummeAllerZahlen;

public class Lieferbeziehunge {

	public static void main(String[] args) throws IOException {
		System.out.println("Wie viele Zeile?");
		int zeile = IO.readInteger();
		System.out.println("Wie viele Spalte?");
		int spalte = IO.readInteger();
		int lieferungen [][] = new int [zeile][spalte];
		lieferungen = IO.readIntegerTable(zeile,spalte);
		System.out.println("Jetzt das zweite Tabelle");
		System.out.println("________________________");
		int lieferungen2 [][] = IO.readIntegerTable(zeile, spalte);
		IO.writeIntegerTable(lieferungen);
		System.out.println();
		IO.writeIntegerTable(lieferungen2);
		int [][] summe = new int[zeile][spalte];

		for (int i = 0; i < lieferungen2.length; i++) {
			for (int j = 0; j < lieferungen2[i].length; j++) {
				summe[i][j] = lieferungen[i][j]+lieferungen2[i][j];
			}
		}
		System.out.println();
		IO.writeIntegerTable(summe);
		System.out.println("------------");


		int [] zeilensumme = new int[spalte];

		for (int i = 0; i < summe.length; i++) {
			for (int j = 0; j < summe[i].length; j++) {
				zeilensumme[i] += summe[i][j];
			}
		}


		int [] spaltensumme = new int[zeile];

		for (int i = 0; i < summe.length; i++) {
			for (int j = 0; j < summe.length; j++) {
				spaltensumme[i] += summe[j][i];
			}
		}
		
		for (int i = 0; i < spaltensumme.length; i++) {
			for (int j = 0; j < spaltensumme.length; j++) {
				System.out.println(summe[i][j]+"\t"+zeilensumme[i]);
			
			}
		}
		for (int i = 0; i < spaltensumme.length; i++) {
			System.out.print(spaltensumme[i]+"\t");
		}

	}

}

