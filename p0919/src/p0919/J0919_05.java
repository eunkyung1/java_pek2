package p0919;

import java.io.File;
import java.io.IOException;

public class J0919_05 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(0/0);
		} catch (Exception e) { // Exception만 사용해도 됨. 나머지 포괄할 수 있음.(최고의 조상)
			e.printStackTrace();
		} finally {
			System.out.println("예외가 발생이 되어도, 예외가 발생이 되지 않아도 무조건 실행 됨");
		}
		
		
	
	}//main

}//class
