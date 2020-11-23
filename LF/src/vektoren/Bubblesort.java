package vektoren;

import java.io.IOException;
import java.util.Arrays;

import oop.IO;

public class Bubblesort {

	public static void main(String[] args) throws IOException {
		System.out.println("Wie viele Werte?");
		int stelle = IO.readInteger();
		System.out.println("Geben sie Ihre Wert ein");
		double werte [] = new double[stelle];
		for (int i = 0; i < werte.length; i++) {
			werte [i] = IO.readDouble();
		}
		Arrays.sort(werte);
		for (int i = 0; i < werte.length; i++) {
			System.out.println(werte[i]);
		}
	}

}
