package array;

import java.io.IOException;

import oop.IO;

public class arrays {

	public static void main(String[] args) throws IOException {
		System.out.println("Wie viele Arrays?");
		int eingabe = IO.readInteger();
		String [] arrays = new String[eingabe];

		System.out.println("Schreiben sie die Werte für Arrays ein: ");

		for (int i=0;i<arrays.length;i++) {
			arrays[i] = IO.readString();
		}

		System.out.println("Ihre Arrays Werte sind ");

		for (int i=0;i<arrays.length;i++) {
			System.out.print(arrays[i]+" ");
		}
	}
}

