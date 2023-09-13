package p0913;

public class Deck {

	Card[] c = new Card[52];
	String[] shape = {"Spade","Heart","Diamond","Clover"};
	
	Deck(){
		for(int i=0;i<c.length;i++) {
			c[i]  = new Card(shape[(i/13)],(i%13)+1);

			
		}
	}//Deck
	
	//특정번호 카드 가져오기
	Card pick(int no) {
		if(no>52) {
			System.out.println("숫자를 잘못 선택하셨습니다.");

			return c[0%52];
		}
		return c[no];
		
	}
	
	
	//랜덤으로 카드 가져오기
	Card pick() {
		int random = (int)(Math.random()*52);
		 	return c[random];
	}
	
	void shuffle() {
		Card temp;
		for(int i=0;i<c.length;i++) {
			int random = (int)(Math.random()*52);
			 temp = c[0];
			c[0] = c[random];
			c[random] = temp;
		}
	}
	
	//모든 카드출력 메소드
	void CardPrint() {
		for(int i=0;i<c.length;i++)
			System.out.println(c[i]);
		
	
	}
}
