package matrix;

import java.io.IOException;

import oop.IO;

public class Aufgabe4 {

	public static void main(String[] args) throws IOException {
		System.out.println("Wir brauchen 3 Matrizen von dir");
		int[][] matriz1 = IO.readIntegerTable();
		System.out.println("Wir brauchen jetzt mit Double");
		double[][] matriz2 = IO.readDoubleTable();
		System.out.println("Als letztes wir brauchen eine Text-tabelle");
		String matriz3[][] = IO.readStringTable();
		IO.writeIntegerTable(matriz1);
		IO.writeDoubleTable(matriz2);
		IO.writeStringTable(matriz3);
		
	}

}
