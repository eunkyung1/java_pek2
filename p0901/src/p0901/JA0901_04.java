package p0901;

import java.util.Scanner;

public class JA0901_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자2개를 입력하세요."); //27-> 2, 7를 분리 해야 함.
		String number = scan.next(); // string은 각각의 주소값을 매겨줌. 왼쪽 맨 앞자리를 0부터 순서대로 값이 매겨짐 
		
		//String 분리 
		char ch1 = number.charAt(0);   // 0번째 있는 문자를 가져옴 //String에서 해당주소값을 char타입으로 가져옴.
		char ch2 = number.charAt(1);   // 1번째 있는 문자를 가져옴

		//char타입을 int타입으로 변경
		int n1 = ch1 - '0'; //'0': 48
		int n2 = ch2 - '0';
		int result = n1 + n2;
		
		
		//char ch3 ='2'; //'0' -> 48
		
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println("두수 더하기값 : "+result);
		
		
		

	}

}
