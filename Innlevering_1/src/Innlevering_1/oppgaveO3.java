package Innlevering_1;

import java.util.Scanner;
import static java.lang.Integer.*;

public class oppgaveO3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		//input fra bruker
		System.out.println("Gi en verdi for å regne ut fakultet");
		String nTxt = input.nextLine();
		int n = parseInt(nTxt);
		
		//visst n <= 0 gis en feilmelding
		if (n > 0)
			System.out.println(n + "! = " + fakultet(n));
		else
			System.out.println("ugyldig verdi");

	}
	//kalkuleringen
	public static int fakultet(int tall) {
		int nFakultet = 1;
		for (int nummer = 1; nummer <= tall; nummer++) {
			nFakultet = nFakultet * nummer;
		}
		return nFakultet;
	}

}
