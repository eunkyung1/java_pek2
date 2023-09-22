package p0922;

import java.util.ArrayList;
import java.util.HashMap;

public class JAction {
	ArrayList<Car> list = new ArrayList();
	ArrayList<StuScore> list2 = new ArrayList();
	HashMap<String, Object> map = new HashMap();
	
	
	
	//리턴타입 : Map 컬렉션프라임
	HashMap<String, Object> map(String[] color1,int[] door1,
			String[] name, int[] kor, int[] eng, int[] math ) {	//인스턴스 메소드
		list.add(new Car(color1[0],door1[0]));
		list.add(new Car(color1[1],door1[1]));
		list.add(new Car(color1[2],door1[2]));
		
		
		list2.add(new StuScore(name[0],kor[0],eng[0],math[0]));
		list2.add(new StuScore(name[1],kor[1],eng[1],math[1]));
		list2.add(new StuScore(name[2],kor[2],eng[2],math[2]));
	
		
		map.put("list", list);
		map.put("list2", list2);
		
		
		return map;  //리턴은 1개만 보낼 수 있음.
	}
	
	//리턴타임 :list 컬렉션프레임웍
//	ArrayList<Car> cal(String[] color1,int[] door1) {	//인스턴스 메소드
//		list.add(new Car(color1[0],door1[0]));
//		list.add(new Car(color1[1],door1[1]));
//		list.add(new Car(color1[2],door1[2]));
//		
//		return list;  //리턴은 1개만 보낼 수 있음.
//	}
//	
	
	//리턴 타입 : 객체
//	Car cal(String color,int door) {	//인스턴스 메소드
//		Car c = new Car(color,door);
//		
//		return c;  //리턴은 1개만 보낼 수 있음.
//	}
	
	
	//리턴타입 : int[](배열)
//	int[] cal(int n1, int n2) {	//인스턴스 메소드
//		
//		int[] result = new int[4];
//		result[0] = n1 + n2;
//		result[1] = n1 -n2;
//		result[2] = n1 * n2;
//		result[3] = n1 / n2;
//		
//		
//		return result;  //리턴은 1개만 보낼 수 있음.
//	}
	//리턴타입 : int
//	int cal(int n1, int n2) {	//인스턴스 메소드
//		int result = n1 * n2;
//		return result;
//	}//cal
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}//class
