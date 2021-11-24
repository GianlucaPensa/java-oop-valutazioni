package it.corso.valutazioni;

public class CalcolaValutazione {
			
	int studentID;
	int percentualeAssenze;
	float mediaVoto;
	
	CalcolaValutazione(int studentID, int percentualeAssenze, float mediaVoto){
		this.studentID = studentID;
		this.percentualeAssenze = percentualeAssenze;
		this.mediaVoto = mediaVoto;
	}
		
	boolean calcoloPromozione(){
		if(percentualeAssenze>= 25 && percentualeAssenze <=50 && mediaVoto >2) {
			return true;
		}
		else if(percentualeAssenze<25 && mediaVoto>=2) {
			return true;
		}
		else {
			return false;
		}
	}
}
