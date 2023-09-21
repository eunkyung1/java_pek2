package p0921;

public class ColAction2 {

	//52장의 카드를 출력하시오.
	
	Card[] card = new Card[52];
	String[] shape = {"Spade","Heart","Diamond","Clover"};
	
	
	void cardAll() {
		for(int i=0;i<card.length;i++) {
			int number = i%13+1;
			String kind = shape[i/13];
			card[i] = new Card(number,kind);
		}//for
	}//cardAll
	
	Card[] cardInsert() {
		cardAll();
		return card;
		
	}
	
	
	
	
	
}//class
