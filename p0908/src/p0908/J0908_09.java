package p0908;

public class J0908_09 {

	public static void main(String[] args) {
		//Spade-13장, Heart-13장, Diamond-13장, Clover-13장
		//총 52장
		
		//배열선언
		Card[] c = new Card[52];
		String[] shape = {"Spade","Heart","Diamond","Clover"};
		//객체선언 후 사용가능
		
		for (int i=0;i<c.length;i++) {
			c[i] = new Card(); //객체 선언
			c[i].number = (i%13)+1;
			c[i].kind = shape[i/13]; //shape - 0-12까지는 Spade /13-25까지 Heart/26-38 Diamond/39-51 Clover
		}
		
		System.out.println("Card number : ");
		for(int i=0; i<c.length;i++) {
			System.out.printf("%d,%s \n",c[i].number,c[i].kind);
		}
		System.out.println();
		System.out.println("----------------------");
		
		
		

		
		
		
		
		
		
		
		//배열
//		int[] num = new int[13];
//		for(int i=0;i<13;i++) {
//			num[i] = i+1;
//			
//		}
//		
//		System.out.print("num : ");
//		for(int i=0;i<num.length;i++) {
//			System.out.printf("%d ",num[i]);
//		}
		
		
		
	}//main

}//class
