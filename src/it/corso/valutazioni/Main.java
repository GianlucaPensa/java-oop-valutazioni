package it.corso.valutazioni;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		CalcolaValutazione[] valutazioni = new CalcolaValutazione[20];
		
		Random generatore = new Random();
		
		int studentID, percentualeAssenze;
		float mediaVoto;
		boolean promozione;
		
		for(int i = 0; i < valutazioni.length; i++) {
			studentID = i +1;
			percentualeAssenze = generatore.nextInt(100) + 1;
			mediaVoto = generatore.nextFloat() * 5;
			
			valutazioni[i] = new CalcolaValutazione(studentID, percentualeAssenze, mediaVoto);
			
			System.out.println("Il tuo id è : " + studentID);
			promozione = valutazioni[i].calcoloPromozione();
			if(promozione) {
				System.out.println("Sei promosso!");
			}
			else{
				System.out.println("Sei bocciato");
			}

		}

	}

}
