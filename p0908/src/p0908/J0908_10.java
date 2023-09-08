package p0908;

public class J0908_10 {

//	int result =0; //인스턴트 변수
	
	
	public static void main(String[] args) {
	 int result = 0;//지역변수

	 
	 System.out.println(add(10,3));

	 System.out.println(add(222,234));
	 
	 result = 21+99;
	 System.out.println(add(24,99));
	 
	 result = 878+676;
	 System.out.println(add(878,676));
	 
	 result = 1127+458;
	 System.out.println(add(1127,458));
	 
	 
	}//main

	//메소드 정의
	static int add(int a, int b) {
		int result = 0; //메소드
		result = a + b;
		return result;
	}//add
	
	
	
	
	
}
