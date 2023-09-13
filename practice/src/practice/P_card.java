package practice;

public class P_card {

	P_card(){}
	P_card(String kind, int number) {
		this.kind = kind;
		this.number = number;
	}
	
	
	String kind;
	int number;
	String[] cardShape = {"","1","2","3","4","5","6","7","8",
										"9","10","J","Q","K"}; 
	
	public String toString( ) {
		return String.format("[%s,%s]", kind,cardShape[number]);
	}
	
	
	
	
}
