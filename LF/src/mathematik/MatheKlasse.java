package mathematik;

public class MatheKlasse {

	public static void main(String[] args) {
		int radius = 10;
		double flaeche = Math.pow(radius, 2) * Math.PI;
		double umsatzSteuer = 34506.74;
		System.out.println(flaeche);
		System.out.println(Math.floor(umsatzSteuer));
		System.out.println(Math.floor(umsatzSteuer * 10) / 10);
		System.out.println(Math.min(300, flaeche));
		System.out.println(Math.max(300, flaeche));
		System.out.println(umsatzSteuer * -1);
		System.out.println(Math.abs(umsatzSteuer * -1));
		System.out.println(Math.sqrt(2));


	}

}
