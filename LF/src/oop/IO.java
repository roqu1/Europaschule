package oop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IO {
	public static String readString() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String eingabe = br.readLine();
		return eingabe;


	}
	public static int readInteger() throws IOException {
		while (true) {
			try	{
				String eingabe = readString();
				int zahl = Integer.parseInt(eingabe);
				return zahl;
			}
			catch (NumberFormatException e) {
				System.out.print("Das ist keine Ganzzahl!! Wiederholen sie erneut");
			}

		}
	}
	public static double readDouble() throws IOException {
		while (true) {
			try	{
				String eingabe = readString();
				double zahl = Double.parseDouble(eingabe.trim().replace("," , "."));
				return zahl;
			}
			catch (NumberFormatException e) {
				System.out.print("Das ist keine Zahl!! Wiederholen sie erneut");
			}

		}
	}
	public static boolean readBoolean() throws IOException {

		while (true) {

			String eingabe = readString();
			if ((eingabe.equalsIgnoreCase("Ja"))|| (eingabe.equalsIgnoreCase("Yes"))
					||(eingabe.equalsIgnoreCase("j"))||(eingabe.equalsIgnoreCase("y"))) {
				return true ;
			}
			else if( eingabe.equalsIgnoreCase("n")||eingabe.equalsIgnoreCase("nein") ) {
				return false ;
			}
			System.out.println("Falsche Eingabe. Bitte wiederholen");
		}

	}

	public static int[] readIntegerArray1D() throws IOException {
		System.out.println("Wie viele Werte?");
		int zeilen = IO.readInteger();
		int [] array = readIntegerArray1D(zeilen);
		return array;
	}
	public static int[] readIntegerArray1D(int anzahlWerte) throws IOException {
		int [] array = new int [anzahlWerte];
		array = readIntegerArray1D(array);
		return array;
	}
	public static int[] readIntegerArray1D(int []array) throws IOException {
		for (int i=0;i< array.length;i++) {
			System.out.println("Wert eingeben für [" + (i+1) +"]:  ");
			array[i]= readInteger();
		}
		return array;
	}

	public static double[] readDoubleArray1D() throws IOException {
		System.out.println("Wie viele Werte?");
		double zeilen = IO.readDouble();
		double [] array = readDoubleArray1D(zeilen);
		return array;
	}
	public static double[] readDoubleArray1D(double anzahlWerte) throws IOException {
		double [] array = new double [(int) anzahlWerte];
		array = readDoubleArray1D(array);
		return array;
	}
	public static double[] readDoubleArray1D(double []array) throws IOException {
		for (int i=0;i< array.length;i++) {
			System.out.println("Wert eingeben für [" + (i+1) +"]:  ");
			array[i]= readDouble();
		}
		return array;
	}


	public static String[] readStringArray1D() throws IOException {
		System.out.println("Wie viele Werte?");
		String zeilen = IO.readString();
		String [] array = readStringArray1D();
		return array;
	}
	public static String[] readStringArray1D(int anzahlWerte) throws IOException {
		String [] array = new String [anzahlWerte];
		array = readStringArray1D(array);
		return array;
	}
	public static String[] readStringArray1D(String []array) throws IOException {
		for (int i=0;i< array.length;i++) {
			System.out.println("Wert eingeben für [" + (i+1) +"]:  ");
			array[i]= readString();
		}
		return array;
	}

	public static double[][] readDoubleTable()throws IOException{
		System.out.println("Wie viele Zeile: ");
		int zeile=IO.readInteger();
		System.out.println("Wie viele Spalte: ");
		int spalte=IO.readInteger();
		double [][] matrixDouble = new double [zeile][spalte];
		//Eingabe in der Console 
		for (int i=0;i< matrixDouble.length;i++) {
			for(int j=0;j< matrixDouble[i].length;j++) {
				System.out.println("Erfassen Sie die Zahlen ["+ i + "] und ["+ j +"]");
				matrixDouble[i][j] = IO.readDouble();
			}
		}
		return  matrixDouble;
	}

	public static double[][] readDoubleTable(int anzahlSpalten, int anzahlZeilen)throws IOException{
		double [][] matrixDouble2 = new double [anzahlSpalten][anzahlZeilen];
		for (int i=0;i< matrixDouble2.length;i++) {
			for(int j=0;j< matrixDouble2[i].length;j++) {
				System.out.println("Erfassen Sie die Zahlen ["+ i + "] und ["+ j +"]");
				matrixDouble2[i][j] = IO.readDouble();
			}
		}
		return  matrixDouble2;
	}

	public static void readDoubleTable(double[][] matrixDouble3)throws IOException{
		for (int i=0;i< matrixDouble3.length;i++) {
			for(int j=0;j< matrixDouble3[i].length;j++) {
				System.out.println("Erfassen Sie die Zahlen ["+ i + "] und ["+ j +"]");
				matrixDouble3[i][j] = IO.readDouble();
			}
		}
	}


	public static void writeDoubleTable(double[][] zahl) {

		//Ausgabe in der Console
		for (int i=0;i<zahl.length;i++) {
			for(int j=0;j<zahl[i].length;j++) {
				System.out.print(zahl[i][j]+"\t");
			}
			System.out.println();
		}
	}
	public static int[][] readIntegerTable()throws IOException{

		System.out.println("Wie viele Zeile: ");
		int zeile=IO.readInteger();
		System.out.println("Wie viele Spalte: ");
		int spalte=IO.readInteger();
		int [][]zahl = new int [zeile][spalte];
		//Eingabe in der Console 
		for (int i=0;i<zahl.length;i++) {
			for(int j=0;j<zahl[i].length;j++) {
				System.out.println("Erfassen Sie die Zahlen ["+ i + "] und ["+ j +"]");
				zahl[i][j] = IO.readInteger();
			}
		}

		return zahl;

	}
	public static int[][] readIntegerTable(int anZahlzeile, int anZahlspalte)throws IOException{
		int [][] matrixInteger2 = new int[anZahlzeile][anZahlspalte];
		for (int i=0;i< matrixInteger2.length;i++) {
			for(int j=0;j< matrixInteger2[i].length;j++) {
				System.out.println("Erfassen Sie die Zahlen ["+ i + "] und ["+ j +"]");
				matrixInteger2[i][j] = IO.readInteger();
			}
		}
		return matrixInteger2;
	
	
}

public static void writeIntegerTable(int[][] zahl) {

	//Ausgabe in der Console
	for (int i=0;i<zahl.length;i++) {
		for(int j=0;j<zahl[i].length;j++) {
			System.out.print(zahl[i][j]+"\t");
		}
		System.out.println();
	}
}
public static String[][] readStringTable()throws IOException{

	System.out.println("Wie viele Zeile: ");
	int zeile=IO.readInteger();
	System.out.println("Wie viele Spalte: ");
	int spalte=IO.readInteger();
	String [][]text = new String [zeile][spalte];

	//Eingabe in der Console 
	for (int i=0;i<text.length;i++) {
		for(int j=0;j<text[i].length;j++) {
			System.out.println("Erfassen Sie die Zahlen ["+ i + "] und ["+ j +"]");
			text[i][j] = IO.readString();
		}
	}

	return text;

}

public static String[][] readStringTable(int anZahlzeile, int anZahlspalte)throws IOException{
	String [][]text = new String [anZahlzeile][anZahlspalte];
	for (int i=0;i<text.length;i++) {
		for(int j=0;j<text[i].length;j++) {
			System.out.println("Erfassen Sie die Zahlen ["+ i + "] und ["+ j +"]");
			text[i][j] = IO.readString();
		}
	}

	return text;
	
}
public static void writeStringTable(String[][] text) {

	//Ausgabe in der Console
	for (int i=0;i<text.length;i++) {
		for(int j=0;j<text[i].length;j++) {
			System.out.print(text[i][j]+"\t");
		}
		System.out.println();
	}


}
}



