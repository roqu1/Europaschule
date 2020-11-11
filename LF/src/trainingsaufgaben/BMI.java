package trainingsaufgaben;

import java.io.IOException;

import oop.IO;

public class BMI {

	public static void main(String[] args) throws IOException {
		System.out.println("Geschlecht? m oder w");
		String eingabe = IO.readString();
		if (eingabe.equalsIgnoreCase("m")) {
			System.out.print("Gewicht: ");
			double gewicht = IO.readDouble();
			System.out.println("Groﬂe in cm: ");
			int cm = IO.readInteger();
			double bmi = gewicht/(cm/100*cm/100);
			if (bmi<20) {
				System.out.println("Untergewicht");
			} else if (bmi<25) {
				System.out.println("Normalgewicht");
			} else if (bmi<30) {
				System.out.println("‹bergewicht");
			} else if (bmi<40) {
				System.out.println("Adipositas");
			} else { 
				System.out.println("Starke Adipositas");
			}
		}
		if (eingabe.equalsIgnoreCase("w")) {
			System.out.print("Gewicht: ");
			double gewicht = IO.readDouble();
			System.out.println("Groﬂe in cm: ");
			int cm = IO.readInteger();
			double bmi = gewicht/(cm/100*cm/100);
			if (bmi<19) {
				System.out.println("Untergewicht");
			} else if (bmi<24) {
				System.out.println("Normalgewicht");
			} else if (bmi<30) {
				System.out.println("‹bergewicht");
			} else if (bmi<40) {
				System.out.println("Adipositas");
			} else { 
				System.out.println("Starke Adipositas");
			}
		}
		
		
		
	}

}
