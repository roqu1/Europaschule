package vektoren;

import java.io.IOException;

import oop.IO;

public class Verdoppeln {

	public static void main(String[] args) throws IOException {
		System.out.println("Bitte geben Sie ein Array aus Kommazahlen ein: ");
		double[] werte = IO.readDoubleArray1D();
		System.out.println("Ursprungliches Arrys: ");
		for (int i=0;i<werte.length;i++) {
			System.out.print(werte[i]+"\t");
		}
		System.out.println();
		System.out.println("Verdoppeltes Arrays: ");
		for (int i=0;i<werte.length;i++) {
			double formel = werte[i]*2;
			System.out.print(formel+"\t");
			}
		
	}

}
