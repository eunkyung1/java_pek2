package p0918;

public class J0918_01 {

	public static void main(String[] args) {

//		Player p = new Player(); //추상메소드이기 때문에 불러올 수가 없음. 조상이 되어야함.
		
		AudioPlayer a = new AudioPlayer(); 	//미완성메소드 모두 구현, 객체선언 가능
		AAPlayer aa = new AAPlayer(); 		//미완성 메소드 모두 구현,객체선언 가능
		
		
//		Player p = new Player();        //미완성 매소드가 존재해서 사용불가!
//		AbsPlyer abs = new AbsPlyer(); //모두 구현(play stop) 하지 않으면 사용불가!
		
		

	}

}
