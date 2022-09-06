package Innlevering_1;

import static java.lang.Integer.parseInt;

import java.util.Scanner;

public class oppgaveO2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		//for brukt for å repetere alt i kodeblokken, her vil den spørre 10 ganger om poengsummer fra 10 elever
			for (int i = 1; i <= 10; i++) {
		//inndata av poengsum
			System.out.println("Poengsum");
			String poengTxt = input.nextLine();
			
			int poeng = parseInt(poengTxt);
		
			
				//if else system som sjekker inndata og gir ut tektstreng utifra gitt poengsum
				if (poeng <= 100 && poeng >= 90) {
					System.out.println("Elev nr." + i + " Karakter A");
					
				} else if (poeng <= 89 && poeng >= 80) {
					System.out.println("Elev nr." + i + " Karakter B");
					
				}else if (poeng <= 79 && poeng >= 60) {
					System.out.println("Elev nr." + i + " Karakter C");
					
				}else if (poeng <= 59 && poeng >= 50) {
					System.out.println("Elev nr." + i + " Karakter D");
					
				}else if (poeng <= 49 && poeng >= 40) {
					System.out.println("Elev nr." + i + " Karakter E");
					
				}else if (poeng <= 39 && poeng >= 0) {
					System.out.println("Elev nr." + i + " Karakter F");	
				
				}else {
					System.out.println("Elev nr." + i + " Fikk en ugyldig poengsum");
					i = i - 1;
				}
			}	
	}
			

}
