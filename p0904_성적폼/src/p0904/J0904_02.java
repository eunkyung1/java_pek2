package p0904;

import java.util.Scanner;

public class J0904_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		
		
		
		//두수를 입력받아, 두수의 곱을 맞추는 프로그램을 구현하시오.
		// 두수를 입력받는 부분을 구현하시오.
		
//		System.out.println("1번째 숫자를 입력하시오.");
//		int num1 = scan.nextInt();
//		System.out.println("2번째 숫자를 입력하시오");
//		int num2 = scan.nextInt();
//		
//		System.out.printf("%d%d는 얼마일까요? \n",num1,num2);
//		int score = scan.nextInt();
//		if(score==(num1*num2)) {
//			System.out.println("정답입니다.");
//		} else {
//			System.out.println("오답입니다.");
//		}
		
		
		
		
		
//		System.out.println("5*4는 얼마일까요?");
//		int score = scan.nextInt();
//		if(score==20) {
//			System.out.println("정답입니다.");
//		}else {
//			System.out.println("오답입니다.");
//		}
		

		System.out.println("사랑을 영어로 무엇일까요?");
		String result = scan.next();
		if(result.equalsIgnoreCase("love")) {  //8가지 기본타입이 아닌 경우, equals명령어 사용
			System.out.println("정답입니다."); // equalsIgnoreCase : 대소문자 구분하지 않고 다른지 명령하기
		}else {
			System.out.println("오답입니다.");
		}

	} // 메일

}// class,
