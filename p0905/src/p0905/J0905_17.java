package p0905;

import java.util.Scanner;

public class J0905_17 {

	public static void main(String[] args) {
		//1-100랜덤숫자를 생성해서 맞추는 게임을 구현하시오.
		//1. 1-100랜덤숫자 생성
		//2. 입력
		//3. 비교
		//4. 출력
		
		Scanner scan = new Scanner(System.in);
		int[] arrNum = new int[10]; //입력된 숫자 저장배열
		int number = 0; //입력한 숫자
		int count = 0; //도전 횟수
		int random = 0; //랜덤숫자

		random = (int)(Math.random()*100)+1; //2~10 -> 10-2+1 //1-100 : 100개의 범위 랜덤숫자 생성
		
		
		while(true) {
			System.out.println((count+1)+"번재 숫자를 입력하세요.");
			number = scan.nextInt();
//			System.out.println("도전 횟수 :"+(count+1));
			arrNum[count] = number;  //배열에 입력한 숫자저장
//			System.out.println("입력한 숫자 : "+number);
			count++;
			if(count>9) { //입력한 횟수가 10번인지 확인
				System.out.println("10번 완료! 프로그램 종료합니다.");
				count--;
				break;
			}
		}//while
		

		//입력한 숫자 출력
		System.out.println();
		System.out.print("입력한 숫자 : ");
		for(int i=0;i<10;i++) {
			if(i==0) {
			System.out.print(arrNum[i]);
			continue;
			}
			System.out.print(","+arrNum[i]);
			
			
		}//for
		//도전횟수 출력
		System.out.println();
		System.out.println("도전횟수 : "+(count+1));
		//랜덤숫자 출력
		System.out.println("랜덤숫자 :"+random);
	
	}//main

}//class
