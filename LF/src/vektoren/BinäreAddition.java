package vektoren;

import java.io.IOException;

import array.arrays;
import oop.IO;

public class BinäreAddition {

	public static void main(String[] args) throws IOException {
		System.out.println("Wie viele Stellen haben die Binärzahlen maximal?");
		int stelle = IO.readInteger();
		System.out.println("Gib die erste Zahl ziffernweise von rechts ein:");
		int zahlen1 [] = IO.readIntegerArray1D(stelle);
		
	}

}
