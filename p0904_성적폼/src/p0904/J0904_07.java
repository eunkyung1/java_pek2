package p0904;

import java.util.Scanner;

public class J0904_07 {

	public static void main(String[] args) {
		Scanner scan = new  Scanner(System.in);
		//1부터 10까지의 랜덤숫자를 생성 후 출력하시오. 1개만 출력		
		// 3개의 숫자를 입력받아
		// 1개 입력받아 맞는 확인 정답, 오답
		// 3개의 입력값을 출력. 
		int num1=0;
		int num2=0;
		int num3=0;
		int random = (int)(Math.random()*10)+1;
		 
		//1번째
		System.out.println("첫번째 숫자를 입력하세요.");
		 num1 = scan.nextInt();
		
		if (num1 == random) {
			System.out.println("정답입니다.");
		}else {
			System.out.println("오답입니다.");
		}
		
		//2번째
		System.out.println("두번째 숫자를 입력하세요.");
		num2 = scan.nextInt();
		if (num2 == random) {
			System.out.println("정답입니다.");
		}else {
			System.out.println("오답입니다.");
		}
		
		//3번째
		System.out.println("세번쨰 숫자를 입력하세요.");
		num3 = scan.nextInt();
		if (num3 == random) {
			System.out.println("정답입니다.");
		}else {
			System.out.println("오답입니다.");
		}
		
		
		//입력한 숫자 출력
		System.out.printf("입력번호 : %d, %d, %d \n",num1,num2,num3);
		System.out.println("정답번호 : "+random);		
		
		
		//랜덤숫자 1-100까지 5개의 랜덤숫자를 생성해서 변수에 저장 후 출력하시오. 숫자 중복 가능
		
//		int num1 = (int)(Math.random()*100)+1;
//		int num2 = (int)(Math.random()*100)+1;
//		int num3 = (int)(Math.random()*100)+1;
//		int num4 = (int)(Math.random()*100)+1;
//		int num5 = (int)(Math.random()*100)+1;
//	
//		System.out.println("첫번째 숫자 :"+num1);
//		System.out.println("두번째 숫자 :"+num2);
//		System.out.println("세번째 숫자 :"+num3);
//		System.out.println("네번째 숫자 :"+num4);
//		System.out.println("다섯번째 숫자 :"+num5);
	}
}
