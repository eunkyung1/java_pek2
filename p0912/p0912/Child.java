package p0912;

public class Child extends Parent {

	int y = 20;//인스턴스 변수
	void method() { //인스턴스 변수
		int x = 100;
		System.out.println("y :"+y);	
		System.out.println("this.x : "+this.x);
		System.out.println("super.x : "+super.x);
	}
	
	
	
}
