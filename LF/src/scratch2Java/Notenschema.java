package scratch2Java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Notenschema {

	public static void main(String[] args) throws IOException { 
	BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Geben Sie bitte Ihre Prozente ein");
	String text = rd.readLine();
	double prozent = Double.parseDouble(text.trim().replace("," , ".").replace("%", ""));

	
		if (prozent >=85) {
			System.out.println("Note 1");
		}
		else if (prozent >=73) {
			System.out.println("Note 2");
		}
		else if (prozent >=59) {
			System.out.println("Note 3");
		}
		else if (prozent >=45) {
			System.out.println("Note 4");
		}
		else if (prozent >=27) {
			System.out.println("Note 5");
		}
		else {System.out.println("Note 6");
		}
	}
}
