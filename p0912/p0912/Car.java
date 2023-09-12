package p0912;

public class Car {

	
	String color;
	String gearType;
	int door;
	
	Car(){//기본생성장
		this("white","auto",5);//다른생성자 호출시 this()
	} 
	
	Car(Car c){
		this(c.color,c.gearType,c.door);  //this() : 다른 생성자 호출
	}
	
	
	
	
	Car(String color,String gearType,int door) {
		this.color = color; //this를 부를 경우 인스턴스의 color를 가져올 수 있음.
		//인스턴스 변수   //지역변수
		this.gearType = gearType;
		this.door = door;
	}
}
