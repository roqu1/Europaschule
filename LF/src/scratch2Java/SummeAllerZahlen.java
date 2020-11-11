package scratch2Java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SummeAllerZahlen {
	public static void main(String[] args) throws IOException { 
		
		int summe = 0 ;
		int zahl = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
        // Eingabe
		System.out.println("Geben Sie die Zahl ein");
		String eingabe = br.readLine();
		int ende = Integer.parseInt(eingabe) ;
		
		for (zahl=0; zahl <= ende; zahl++) {
			summe=zahl+summe;
		}
				
		 // Ausgabe
		System.out.println("Die Summe durch for-Schleife ist " + summe);
	
	
	}

}
