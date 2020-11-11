package trainingsaufgaben;


import java.io.IOException;


import oop.IO;

public class Alterspruefun {

	public static void main(String[] args) throws NumberFormatException,IOException { 


		System.out.println("Wie Alt sind Sie ?");
		String eingabe = IO.readString();
		int alter = Integer.parseInt(eingabe);

		if (alter>=18) {
			System.out.println("Du bist schon volljährig");
		}
		else if (alter<18) {
			System.out.println("Du bist noch minderjährig");
		}
		else { System.out.println("ungültige Eingabe");

		}

	}
}

