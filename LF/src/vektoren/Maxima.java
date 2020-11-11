package vektoren;

import java.io.IOException;
import java.util.Arrays;

import oop.IO;

public class Maxima {

	public static void main(String[] args) throws IOException {
		System.out.println("Bitte geben Sie ein Array aus Kommazahlen ein: ");
		double werte [] = IO.readDoubleArray1D();
		
		Arrays.sort(werte);
		System.out.println("Größte Zahl: "+werte[werte.length-1]);
		System.out.println("Zweite größte Zahl: "+werte[werte.length-2]);
	}

}
