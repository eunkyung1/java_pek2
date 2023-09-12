package practice;

public class P_deck {
	
	P_card[] c = new P_card[52];
	String[] shape = {"Spade","Heart","Diamond","Clover"}
	
	P_deck() {
		for(int i=0; i<c.length; i++) {
			c[i]=new P_card()
		}
		
	}//기본생성자
	
	

}
