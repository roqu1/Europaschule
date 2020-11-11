package trainingsaufgaben;

import java.io.IOException;

import oop.IO;

public class Maexchen {

	public static void main(String[] args) throws IOException {
		System.out.println("Was ist der Anzahl des erstes Wurfel: ");
		int wuerfel1 = IO.readInteger();
		System.out.println("Was ist der Anzahl des zweites Wurfel: ");
		int wuerfel2 = IO.readInteger();
		int operation1 = wuerfel1*10+wuerfel2;
		int operation2 = wuerfel2*10+wuerfel1;
		if (wuerfel1 == 1 && wuerfel2 ==2 || wuerfel1 == 2 && wuerfel2 == 1) {
			System.out.println("Sie haben Mäxchen bekommen");

		}
		else if (wuerfel1==wuerfel2) {
			int pasch = wuerfel1*100;
			System.out.println("Sie haben Pasch "+pasch);
		}
		else if (wuerfel1>wuerfel2) {
			System.out.println("Sie haben " +operation1+" Punkte");
		} else {
			System.out.println("Sie haben "+operation2+ " Punkte");
		}
	}
}


