package scratch2Java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Dreiecksungleichung {
	public static void main(String[] args) throws IOException { 
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Geben Sie bitte Ihre Werte für 'a' ein");
		String text = rd.readLine();
		double a = Double.parseDouble(text.trim().replace("," , ".").replace("%", ""));
		System.out.println("Geben Sie bitte Ihre Werte für 'b' ein");
	    text = rd.readLine();
	    double b = Double.parseDouble(text.trim().replace("," , ".").replace("%", ""));
		System.out.println("Geben Sie bitte Ihre Werte für 'c' ein");
		text = rd.readLine();
		double c = Double.parseDouble(text.trim().replace("," , ".").replace("%", ""));
		
    //a = 5 ;
    //b = 5 ;
    //c = 2 ;

    if (c>a+b) {
    	System.out.println("Geht nicht !");
	}
    else if (b>a+b) {
    	System.out.println("Geht nicht !");
    }
    else if (a>b+c) {
    	System.out.println("Geht nicht !");
    }
    else {
        double umfang = a+b+c;
		
		double s = (a+b+c)/2;
		double ergebnis5 ;
		
		ergebnis5=s*(s-a)*(s-b)*(s-c); //Formel 2
		double ergebnis32= Math.sqrt(ergebnis5); // Flächeinhalt berechnung mit würzel
    	System.out.println("Geht !");
    	System.out.println("Der Umfang ist "+umfang);
    	System.out.print("Der Flächeinhalt ist "+ergebnis32);System.out.print(" cm²");
    	
    }
  
 }
}



	