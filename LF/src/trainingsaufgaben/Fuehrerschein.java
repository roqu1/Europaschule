package trainingsaufgaben;

import java.io.IOException;

import oop.IO;

public class Fuehrerschein {

	public static void main(String[] args) throws IOException{
		System.out.println("Wie Alt sind Sie?");
		int alter = IO.readInteger();
		if (alter<14) {
			System.out.println("Du darfst Bobby-Car oder Fahrrad fahren.");
		} else if (alter<16 || alter==14) {
			System.out.println("Du darfst schon 50er fahren.");
		} else if (alter<18 || alter ==16) {
			System.out.println("Du darfst schon 125er fahren, aber noch kein Auto.");
		} else { System.out.println("Du darfst jetzt auch Auto fahren.");



		}
	}
}

