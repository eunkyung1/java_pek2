package p0912;

public class J0912_08_card {

	public static void main(String[] args) {
		
		
		Deck d = new Deck();	
		d.CardPrint();
		d.shuffle();
		System.out.println("-----------------");
		d.CardPrint();
		System.out.println("---------------------");
		System.out.printf("카드 한장 출력 : ");
		System.out.println(d.pick(3));
		System.out.println("=======================");
		System.out.print("카드 임의 출력 : ");
		System.out.println(d.pick());
		
		
		
	}

}
