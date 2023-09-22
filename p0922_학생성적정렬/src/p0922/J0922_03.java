package p0922;

import java.util.ArrayList;
import java.util.HashMap;

public class J0922_03 {

	public static void main(String[] args) {
//		********아주 중요함*************************
		int n1 = 1000;
		int n2 = 125;
		int a = 1;

		String color = "white";
		int door = 5;
		
		String[] color1 = {"white","red","blue"};
		int[] door1 = {5,4,5};
		
		
		String[] name = {"홍길동","유관순","이순신"};
		int[] kor = {100,100,99}; 
		int[] eng = {90,80,79}; 
		int[] math = {10,40,92}; 
		
		
		//n1,n2를 JAction cal()로 보내서 값 받아오기
		
		JAction j = new JAction(); //객체선언
		//매개변수 6개 -> 리턴 map타입으로 받기
		
		
//		Map<String, Object> map = j.map(color1,door1,name,kor,eng,math);
		HashMap<String, Object> map = j.map(color1,door1,name,kor,eng,math);
		ArrayList<Car> list = (ArrayList<Car>) map.get("list");
		for(int i=0;i<list.size();i++) {
			Car c = list.get(i); 
			System.out.println(c.getColor());
			System.out.println(c.getDoor());
		}
		ArrayList<StuScore> list2 = (ArrayList<StuScore>) map.get("list2");
		for(int i=0;i<list2.size();i++) {
			StuScore s = list2.get(i);
			System.out.println(s.getName()+","+s.getKor()+","+s.getEng()+","+s.getMath()+","+s.getTotal()+","+s.getAvg());
		}
		
		
		for(int i=0;i<list.size();i++) {
		
		
			
			
		}
		
		
		
		
		
		//매개변수 2개 -> list타입 받기
//		j.cal(color1, door1);
//		ArrayList<Car> list = j.cal(color1, door1);
//		for(int i=0;i<list.size();i++) {
//			Car c = list.get(i); 
//			System.out.println(c.getColor());
//			System.out.println(c.getDoor());
//		}
//		
		
		//매개변수 2개 -> 객체타입 받기
//		Car c = j.cal(color, door);
//		System.out.println(c.getColor());
//		System.out.println(c.getDoor());
		
	
		
		
		//매개변수 2개 -> 배열로 받기
		
//		int[] result = j.cal(n1,n2);
//		for(int i=0;i<result.length;i++) {
//			System.out.println(result[i]);
//		}
		
		
		
		//매개변수 2개 -> 리턴 int 타입 받음.
//		int result = j.cal(n1,n2);//호출&매개변수로 값을 넘겨줄 수 있음.
//		
//		System.out.println("결과값 :"+result);
		
		
		
		
		
		
		
		
		
		
		
		
		

	}//main

}//class
