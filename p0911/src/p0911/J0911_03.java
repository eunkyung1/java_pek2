package p0911;

public class J0911_03 {

	public static void main(String[] args) {
		// Card 객체 4개를 선언해서, Heart1 Sapde1 Diamond1, Clover1 을 출력하시오.
		
		String[] shape = {"Heart", "Sapde", "Diamond","Clover"};
		
		Card[] c = new Card[52]; // 13장 카드를 Heart 1-13까지 입력
		for(int i=0;i<c.length;i++) {
			c[i] = new Card();
			c[i].number = (i%13)+1;
			c[i].kind = shape[(i/13)];
			c[i].cardPrint();
		}//for
		
//		System.out.println("카드 숫자 합 :");
//		int result = J0911_05.add
//				(c[0].number,c[5].number);
//		System.out.println(result);
}

	}

