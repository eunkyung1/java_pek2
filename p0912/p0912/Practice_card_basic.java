package p0912;

public class Practice_card_basic {

	
	public static void main(String[] args) {
		String[] shape = {"Spade","Heart","Diamond","Clover"};
				
		Card[] c= new Card[52];
		for(int i=0;i<c.length;i++) {
			c[i] = new Card();
			c[i].number = (i%13)+1;
			c[i].kind = shape[(i/13)];
			
		}
		for(int i=0;i<c.length;i++) {
			System.out.printf("[%s,%d]\n",c[i].kind,c[i].number);
			
		}
		
		
		
		
	}//main
}//class
