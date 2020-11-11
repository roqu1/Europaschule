package trainingsaufgaben;

import java.io.IOException;

import oop.IO;


public class Quadratsummen {

	public static void main(String[] args) throws IOException {
		System.out.print("Geben sie bitte ihre Zahl ein:");
		int zahl = IO.readInteger();
		double summe = 0;

		for (int i=0;i<=zahl;i++) {
			summe += i * i;
		}
		System.out.println("Das Ergebnis ist "+summe);


	}

}
