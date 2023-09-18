package p0918;

public class J0918_04 {

	public static void main(String[] args) {
		
		
		A a = new A();
//		B b = new B(); 생략가능하며 아래와 같이 가능!
//		a.methodA(new B());  //a.methodA(b) 가능.
		a.methodA(new B());
		

	}

}
