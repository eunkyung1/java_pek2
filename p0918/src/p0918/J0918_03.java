package p0918;

public class J0918_03 {

	public static void main(String[] args) {
		
		Tank t = new Tank(); //탱크1
		System.out.println("탱크가 폭탄 맞음");
		t.hitPoint -=10; 
		System.out.println("탱크가 폭탄 맞음");
		t.hitPoint -=10; 
		System.out.println("총알 맞음");
		t.hitPoint -=2;
		System.out.println("탱크의 체력 : "+t.hitPoint);
		Scv s = new Scv(); //SCV
		Marine m = new Marine();  //Marine
		s.repair(t); //탱크수리
		System.out.println("탱크의 체력 : "+t.hitPoint);
		DropShip d = new DropShip();
		d.hitPoint -= 20;
		System.out.println("DropShip 체력 :"+d.hitPoint);
		s.repair(d); //수송선수리
		System.out.println("Marine 총알 맞음");
		m.hitPoint -= 30;
		System.out.println("Marine 체력 :" +m.hitPoint );
//		s.repair(m); //마린수리 //기계가 아니기 때문에 Repairable에 해당되지 않음.
		System.out.println("Marine 체력 :" +m.hitPoint );
		

	}

}
