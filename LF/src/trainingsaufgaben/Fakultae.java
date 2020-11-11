package trainingsaufgaben;

import java.io.IOException;

import oop.IO;

public class Fakultae {

	public static void main(String[] args) throws IOException {
		System.out.print("Geben sie bitte ihre Fakultaet ein:");
		int zahl = IO.readInteger();
		int fakultaet = 1;
		for (int i = 1; i<=zahl; i++) {
			 fakultaet = fakultaet * i;

			System.out.println("Fakultät von "+zahl+" ist "+fakultaet);


		}
	}
}

