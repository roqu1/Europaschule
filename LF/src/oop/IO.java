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
}


