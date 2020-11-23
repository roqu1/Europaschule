package vektoren;

import java.io.IOException;

import oop.IO;

public class Balkendiagramm {

	public static void main(String[] args) throws IOException {
		System.out.print("Wie viele Kandidaten sind noch im Rennen: ");
		int werte [] = IO.readIntegerArray1D();
		System.out.println("Ergebnis");


		for (int k = 0; k < werte.length; k++) {
			System.out.print("Kandidat "+(k+1)+": ");  

				for (int j = 0; j < werte[k]; j++) {
					System.out.print(" *");
				}
				System.out.print("  "+werte[k]+"%   ");
			System.out.println("");
		}
			
		}

	}


