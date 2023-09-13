package p0913;

public class J0913_01 {
	public static void main(String[] args) {
	//카드를 52장을 생성해서 숫자와 모양을 입력하고, 카드를 섞은 후 처음부터 5장을 출력하시오.
		
		
		
		Deck d = new Deck();
		d.CardPrint();
		d.shuffle();
		System.out.println("----------------------");
		d.CardPrint();
		System.out.println("----------------------");
		System.out.println("카드 5장 출력 :");
		for (int i=0; i<5; i++) {
			System.out.println(d.pick(i));
		}
		//a : 5장 - a라는 배열을 만든 후 5장을 저장해서 출력
		//b : 5장 - b라는 배열을 만든 후 5장을 저장해서 출력
		
		 System.out.println("----------------------");
		 Card[] a = new Card[5];
		 Card[] b = new Card[5];
		
		 System.out.println("A의 5장 카드");
		 for(int i=0;i<5;i++) {
			 a[i] = d.pick(i);
			 System.out.println(a[i]);
		 }
		 System.out.println("B의 5장 카드");
		 for(int i=0;i<5;i++) {
			 b[i] = d.pick(i+5);
			 System.out.println(b[i]);
		 }
		
}
}

	