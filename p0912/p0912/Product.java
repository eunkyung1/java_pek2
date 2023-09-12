package p0912;

public class Product {

	static int count =1000; //클라스변수
	int serialNo; //인스턴스변수
	String pName;
	int price;
	{
	count++;
	serialNo = count;
	}//인스턴스 초기화 블럭 : 모든 생성자에서 공통적으로 수행될 코드
	
	Product(){} //기본생성자 
	
	Product(String pName){
			this.pName = pName;
	}
	
	
	Product(String pName,int price){
		this.pName = pName;
		this.price = price;
	}
	
}
