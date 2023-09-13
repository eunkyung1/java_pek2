package practice;

public class P_deck {
	
	P_card[] c = new P_card[52];
	String[] shape = {"Spade","Heart","Diamond","Clover"};
	
	P_deck() {
		for(int i=0; i<c.length; i++) {
			c[i]=new P_card(shape[i/13],(i%13)+1);
		}
		
	}//기본생성자
	
	//특정번호 카드 가져오기
	 P_card pick(int no) {
		 if(no>52) {
			 System.out.println("숫자를 잘못 입력하셨습니다.");
			 
			 return c[0%52];
		 }//if
	 
	  return c[no];
	 }
	 
	 //랜덤으로 카드 가져오기
	 P_card pick() {
		 int random = (int)(Math.random()*52);
		 return c[random];
	 }
	 
	 void shuffle() {
		 P_card temp;
		 for(int i=0;i<1000;i++) {
			 int random = (int)(Math.random()*52);
			 temp = c[0];
			 c[0] = c[random];
			 c[random] = temp;
		 }
		 
	 }
	
	//모든 카드출력 메소드
	void CardPoint() {
		for(int i=0;i<c.length;i++) {
			System.out.println(c[i]); 
		}
	}
	
	

}
