package vektoren;

import java.io.IOException;

import oop.IO;

public class Summen {

	public static void main(String[] args) throws IOException {
		double werte [] = IO.readDoubleArray1D();
		double gerade = 0;
		double ungerade = 0;
		int anzahlGerade = 0;
		int anzahlunGerade = 0;
		for(int i=0;i<werte.length;i++) {
			if(werte [i]%2 == 0) {
				gerade = werte[i]+gerade;
				anzahlGerade = 1+anzahlGerade;
			}
			else {
				ungerade = werte[i]+ungerade;
				anzahlunGerade = 1+anzahlunGerade;
			}
		}
		System.out.println("Gerade Zahlen:");
		System.out.println("Anzahl = "+anzahlGerade);
		System.out.println("Summe = "+gerade+"\n");
		System.out.println("Ungerade Zahlen:");
		System.out.println("Anzahl = "+anzahlunGerade);
		System.out.println("Summe = "+ungerade);

	}

}
