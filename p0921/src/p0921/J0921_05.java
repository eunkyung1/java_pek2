package p0921;

import java.util.ArrayList;
import java.util.Vector;

public class J0921_05 {

	public static void main(String[] args) {

		ArrayList<Card> list = new ArrayList();
		list.add(new Card(1, "Spade"));  //list.add(Object o)
		list.add(new Card(2, "Spade"));
		list.add(new Card(3, "Spade"));
		list.add(new Card(4, "Spade"));
		list.add(new Card(1, "Spade"));
		
		//list를 출력하시오.
		
		for(int i=0;i<list.size();i++) {
//			Card c = (Card)list.get(i);
//			System.out.println(c.getNumber()+","+c.getKind());
			System.out.print(list.get(i).getKind());
			System.out.print(list.get(i).getNumber());
			
		}
		
		
		
		
		
		
		
		
		
		
		
//		ArrayList list = new ArrayList();//싱글쓰래드를 지원 //훨씬 더 많이 사용
//		Vector list2 = new Vector();  //ArrayList 와 같은 명령어 //단지 멀티쓰래드를 지원		
//		list.add(1);
//		list.add(2);
//		list.add(3);
//		list.add(1);
//		list.add(2);
//		list.add(5);
//		
//		for(int i=0;i<list.size();i++) {
//			System.out.println(list.get(i));
//		}
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
	}

}
