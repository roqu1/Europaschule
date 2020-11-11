package pqFormel;

import java.io.IOException;

import oop.IO;

public class PQ_Formel_XL {

	public static void main(String[] args) throws IOException {
		System.out.print("Geben sie p ein: ");
		double p = IO.readDouble();
		System.out.println("Geben sie q ein: ");
		double q = IO.readDouble();
		double d = Math.sqrt((Math.pow(p/2, 2)-q));
		if (d == 0) {
			double ergebnis =-p/2;
			System.out.println("Zwei nullstellen in eine nullstelle "+ergebnis);
		} else if (d<0) {
			System.out.println("Ungültige Discriminante");
		} else { 
			double x1 = -p/2+d;
			double x2 = -p/2-d;			
			System.out.println("x1 ist "+x1);
			System.out.println("x2 ist "+x2);
		}

	}
}
