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
		loop :while(true) {
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
				//학생성적 삭제메소드
				stuAction.stuDelete();
				break;
				
			case 5:
				//학생성적 검색메소드
				stuAction.stuSearch();
				break;
				
			case 6:
				//학생성적 등수메소드
				System.out.println("[ 학생 성적 등수처리 ]");
				System.out.println("등수처리를 진행할까요? \n");
				System.out.println("1.예");
				System.out.println("2.아니요");
				System.out.println("0.이전페이지로 이동");
				choice = scan.nextInt();
				
				switch(choice) {
					
				case 1:
					for(int i=0;i<stuAction.list.size();i++) {
						int  count =1;
						StuScore s = (StuScore)stuAction.list.get(i);
						for(int j=0;j<stuAction.list.size();j++) {
							StuScore s2 = (StuScore)stuAction.list.get(j);
							if(s.getTotal()<s2.getTotal()) {
								count++;
							}//if
						}//for j
						s.setRank(count);
					}//for i
					System.out.println("등수처리가 완료되었습니다.");
					System.out.println();
					
				case 2:
					System.out.println("등수처리가 취소되었습니다.");
					System.out.println();
					break;
				case 0:
					System.out.println("이전페이지로 이동합니다.");
					System.out.println();
					break;
				}//switch
				break;	
				
			case 0 :
				System.out.println("[ 프로그램 종료 ]");
				System.out.println("프로그램을 종료합니다.");
				break loop;
			
			
			
			}//switch
		
		
		}//while	
		
	}//main

}//class
