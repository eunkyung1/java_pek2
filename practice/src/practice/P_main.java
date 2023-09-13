package practice;

public class P_main {

	public static void main(String[] args) {
		
		P_deck d = new P_deck();
		d.CardPoint();
		d.shuffle();
		System.out.println("----------------");
		d.CardPoint();
	}

}
