		package taschenrechner;
		
		import java.io.BufferedReader;
		import java.io.IOException;
		import java.io.InputStreamReader;
		
		public class Taschenrechner {
		
			public static void main(String[] args) throws IOException { 
				
				// Eingabe in Console
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Geben Sie x ein");
				String eingabe = br.readLine();
				double x = Double.parseDouble(eingabe) ;
				System.out.println("Geben Sie y ein");
				eingabe = br.readLine();
				double y = Double.parseDouble(eingabe) ;
				
				
				double summe = x + y ;
				double produkt = x * y ;
				double differenz = x - y ;
				double quotient = x / y ;
				
				// Ausgabe in Console
				
				if (x<=100 && x>=0) { 
					if (y<=100 && y>=0) {
				
				System.out.println("x = "+x);
				System.out.println("y = "+y);
				System.out.println("Summe = "+summe);
				System.out.println("Produkt = "+produkt);
				System.out.println("Differenz = "+differenz);
				System.out.println("Quotient = "+quotient);
					
				} else 	{
					System.out.println("Geht nicht da y zu groﬂ ist!");
						}
				} else {
					System.out.println("Geht nicht da x zu groﬂ ist!");
				}
		}
}	
	
				
