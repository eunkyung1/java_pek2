package p0913;

public class Card {

	Card(){}
	Card(String kind,int number) {//기본생성자
		this.kind = kind;
		this.number = number;
	}
	
	String kind;
	int number;
	private int flag;  //private - 같은 클래스에서만 사용가능
	
	String[] cardShape = {"","1","2","3","4","5","6","7",
							"8","9","10","J","Q","K"};

	
	
	public String toString() {
		return String.format("[%s, %s]",kind,cardShape[number]);
	}
	
}
