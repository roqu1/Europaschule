package trainingsaufgaben;

import java.io.IOException;

import oop.IO;

public class GeometrischeReihe {

	public static void main(String[] args) throws IOException {
		System.out.println("Geben sie Ihre Zahl ein");
		int index = IO.readInteger();
		double ergebnis = 0;
		for(int i=0;i<=index;i++) {
			System.out.println("Mit Index:"+i);
			System.out.println("Wird das Ergebnis:" + ergebnis);
			ergebnis = (1/Math.pow(2,i)) + ergebnis;
		}
		System.out.println(ergebnis);

	}

}
