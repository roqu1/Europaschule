package trainingsaufgaben;

import java.io.IOException;

import oop.IO;

public class Quadrat {

	public static void main(String[] args) throws IOException {
		System.out.println("Wie viele Sterne:");
		int eingabe = IO.readInteger();
		for (int i = 0;i<eingabe-1;i++) {   //Die erste reihe von Sterne
			System.out.print("*"); 
			}

			for (int j = 0;j<eingabe-1;++j) {
				System.out.print("*");
				for (int jis = 0;jis<eingabe-2;++jis) {
					System.out.print(" ");
				}
				System.out.println("*");
			}
			for (int i = 0;i<eingabe;i++) {   //Die letze reihe von Sterne
				System.out.print("*"); 
				}
		
	}

}
