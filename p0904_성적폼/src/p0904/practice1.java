package p0904;

import java.util.Scanner;

public class practice1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		//1.
		//두수를 입력받아, 두수의 곱을 맞추는 프로그램을 구현하시오.
		// 두수를 입력받는 부분을 구현하시오.
//		
//		int num1 = 0;
//		int num2 = 0;
//		int result = 0;
//		
//		System.out.println("첫번째 숫자를 입력하시오.");
//		 num1 = scan.nextInt();
//		System.out.println("두번째 숫자를 입력하시오. ");
//		 num2 = scan.nextInt();
//				
//		result = num1 * num2;
//		System.out.printf("두 수의 곱은 %d \n",result);
//		
		//2.
		// 알파벳 x,X를 입력하면 프로그램을 종료합니다. 라고 출력하시오.
	
//		System.out.println("알파벳 x,X를 입력하면 프로그램을 종료합니다.");
//		char result1 = scan.next().charAt(0);
//		if (result1 == 'x' || result1 == 'X' )
//			System.out.println("프로그램을 종료합니다.");
		
		//3.
		//90점이상 A, 80점이상 B, 70점이상 C, 60점이상 D, F
		//98점이상 A+, 93점이하 A- 
		
		String grade = "";
		int score = 0;
		
		System.out.println("점수를 입력하시오.");
		score = scan.nextInt();
		if (score >= 90) {
			System.out.print("A");
			if(score>=98) {
				System.out.println("+");
			}else if(score <=93) {
				System.out.println("-");
			}else
				System.out.println("A");
			
			
			
		}else if (score >= 80) {
			grade = "B";
			if(score>=88) {
				System.out.println(grade+"+");
			}else if (score <=83) {
				System.out.println(grade+"-");
			}else
				System.out.println(grade);
			
		}else if (score >= 70) {
			System.out.print("C");
			if (score >=78) {
				System.out.println("+");
			}else if (score <=73) {
				System.out.println("-");
			}else 
				System.out.println("");
			
		}else if (score>= 60) {
			
		}else {
			System.out.println("F");
		}
		System.out.println();
				
				
		
	}
}
