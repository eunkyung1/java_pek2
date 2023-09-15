package p0914;

import java.util.ArrayList;

public class Buyer {

	Buyer(){}
	Buyer(String id,String name){
		this.id = id;
		this.name = name;
	}

	
	String id;
	String name;
	int money=10000000;
	int bonusPoint = 0;
//	Product[] cart = new Product[10];
	//컬렉션 프레임워크 선언
	ArrayList list = new ArrayList(); //**
	
	
//	int i=0;
	int buy(Product p) { //다형성 때문에 아래의 내용을 이와같이 생략가능
		//상품금액이 현재잔액보다 큰 경우
		if(money<p.price) {
			System.out.println("[알림] 잔액이 부족하여 구매할 수 없습니다.");
			System.out.println();
			return 0; //실패
		}
		money -= p.price;
		bonusPoint += p.bonusPoint; //부모의 객체로 자손의 변수를 다룰 수 있음
		list.add(p); //**
		return 1; //구매성공
//		cart[i] = p; //p를 Product []배열에 담음.
//		i++;
		}
	
	
	
	
	
	
	
//	void buy(Audio a) {
//		money -= a.price;
//		bonusPoint += a.bonusPoint;	
//	}
//		
//	void buy(Computer c) {
//		money -= c.price;
//		bonusPoint += c.bonusPoint;
//	}
//	
//	void buy(Washing w) {
//		money -= w.price;
//		bonusPoint += w.bonusPoint;
//	}
	
	
	
	
	
}//class
