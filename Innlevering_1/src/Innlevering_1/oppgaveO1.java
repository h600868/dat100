package Innlevering_1;

import java.util.Scanner;
import static java.lang.Integer.parseInt;


public class oppgaveO1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
				
		
		//inndata av bruttoinntekt
		System.out.println("Bruttoinntekt i NOK:" );
		String bInntekt = input.nextLine();
		
		int bruttoInntekt = parseInt(bInntekt);
	
		
		// regner ut hilken trinnsaktt du har utifra bruttoinntekt mellom satte variabler.
		if (bruttoInntekt < 190349) {
			System.out.println("Ingen trinnskatt");
		// visst bruttoinntekten er mellom 190350,- og 267899,- vil systemet printe ut tekst linjen fra hvilket trinn du er	
		} else if (bruttoInntekt >= 190350 && bruttoInntekt <= 267899) {
			System.out.println("Trinn 1, 1,7% trinnskatt");
			
		} else if (bruttoInntekt >= 267900 && bruttoInntekt <= 643799) {
			System.out.println("Trinn 2, 4,0% trinnskatt");
			
		} else if (bruttoInntekt >= 643800 && bruttoInntekt <= 969199) {
			System.out.println("Trinn 3, 13,4% trinnskatt");
			
		} else if (bruttoInntekt >= 969200 && bruttoInntekt <= 1999999) {
			System.out.println("Trinn 4, 16,4% trinnskatt");
			
		} else if (bruttoInntekt >= 2000000) {
			System.out.println("Trinn 5, 17,4% trinnskatt");
			
		} else {
			System.out.println("feil");
		}
		
	
		
	}

	

}
