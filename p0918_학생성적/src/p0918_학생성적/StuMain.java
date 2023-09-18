package p0918_학생성적;

import java.util.ArrayList;
import java.util.Scanner;

public class StuMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StuAction stuAction = new StuAction();
		ArrayList list = new ArrayList();
		int stuCount = 1;
		String[] title = {"번호","이름","국어","영어","수학","총점","평균","등수"};
		
		//메인화면 출력부분
		while(true) {
			int choice = stuAction.mainPrint();
			
			switch(choice) {
			
			case 1:
				//학생성적 입력메소드
				stuAction.stuInput(stuCount);
				break;
			case 2:
				//학생성적 출력메소드
				stuAction.stuOutput();
				break;
			case 3:
				//학생성적 수정메소드
				stuAction.stuUpdate();
				break;
			case 4:
				

	
			
			
			
		
		}//switch
		
		
		}//while	
		
		
		
		
		
	}//main

}//class
