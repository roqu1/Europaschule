package pqFormel;

import java.io.IOException;

import oop.IO;

public class Pqformelpq {

	public static void main(String[] args) throws IOException {
		System.out.print("Geben sie p ein: ");
		double p = IO.readDouble();
		System.out.println("Geben sie q ein: ");
		double q = IO.readDouble();
		double x1 = -p/2+Math.sqrt((Math.pow(p/2, 2)-q));
		double x2 = -p/2-Math.sqrt((Math.pow(p/2, 2)-q));
		System.out.println("x1 ist "+x1);
		System.out.println("x2 ist "+x2);

	}

}
