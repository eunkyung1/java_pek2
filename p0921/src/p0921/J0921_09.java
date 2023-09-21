package p0921;

import java.util.ArrayList;
import java.util.HashMap;

public class J0921_09 {

	public static void main(String[] args) {
	
		
		ColAction col = new ColAction();
		
		//list출력, list2 출력
		HashMap<String, Object> map = col.scoreAll();
		ArrayList<StuScore> list = (ArrayList<StuScore>) map.get("list");

		for (int i = 0; i < list.size(); i++) {

			StuScore s = list.get(i);
			System.out.printf("%d,%s,%d,%d,%d,%d,%.2f,%d\n", 
					s.getStuNum(), s.getName(), s.getKor(), s.getEng(),
					s.getMath(), s.getTotal(), s.getAvg(), s.getRank());
		}
		
		ArrayList<Car> list2 = (ArrayList<Car>) map.get("list2");
		for(int i=0;i<list2.size();i++) {
		Car c = list2.get(i);
		System.out.println(c.getColor()+","+ c.getDoor());

		}
		
		
		
		
		
		//list2를 전달받아, 출력하시오.
//		ArrayList<Car> list2 = col.scoreAll();
//		
//		for(int i=0;i<list2.size();i++) {
//			Car c = list2.get(i);
////			System.out.println(c.getColor()+","+ c.getDoor());
////			System.out.printf("%d",1);
//			System.out.printf("%s,%d\n",c.getColor(),c.getDoor());
//			
//		}//for
		
		//list를 전달받아, 출력하시오.
//		ArrayList<StuScore> list = col.scoreAll();
//		for(int i=0;i<list.size();i++) {
//			StuScore s = list.get(i);
//			System.out.printf("%d,%s,%d,%d,%d,%d,%.2f,%d\n",
//					s.getStuNum(),s.getName(),s.getKor(),s.getEng(),
//					s.getMath(),s.getTotal(),s.getAvg(),s.getRank());
//			
//			System.out.printf("");
			
			
		
//		//52장카드 출력
//		Card[] card = col.cardInsert();
//		System.out.println(card[0].getKind()); 
//		System.out.println(card[0].getNumber()); 
//		
//		for(int i=0;i<card.length;i++) {
//			System.out.println(card[i].getKind());
//			System.out.println(card[i].getNumber());
//				
//		}
		
		
		
		
//		카드 1장 출력	
//		Card c = col.cardInsert();
//		System.out.println(c.getNumber());
//		System.out.println(c.getKind());
		
		
		
	
		
		
		
	}//main

}//class
