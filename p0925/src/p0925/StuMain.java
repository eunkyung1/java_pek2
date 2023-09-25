package p0925;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import p0925.StuScore;

public class StuMain {

	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		ArrayList<StuScore> list = new ArrayList();
		StuAction s = new StuAction();
		int choice = 0;

		loop: while(true) {
		
		System.out.println("-------------------------------------------------");
		System.out.println("[학생성적처리 프로그램]");
		System.out.println("-------------------------------------------------");
		System.out.println("1. 학생성적입력");
		System.out.println("2. 학생성적출력");
		System.out.println("3. 학생성적수정");
		System.out.println("4. 학생성적삭제");
		System.out.println("5. 이름순 정렬");
		System.out.println("6. 성적낮은순 정렬");
		System.out.println("7. 성적높은순 정렬");
		System.out.println("8. 파일가져오기");
		System.out.println("9. 파일저장");
		System.out.println("10. 등수처리");
		System.out.println("0. 프로그램 종료");
		System.out.println("-------------------------------------------------");
		
			
			System.out.println("원하는 번호를 입력하세요.");
			choice = scan.nextInt();
			System.out.println();
			
			switch(choice) {
			
			case 1 : //학생성적입력
				s.stuInput();
				break;
				
			case 2: //학생성적출력	
				s.stuOutput();
				break;
			
			case 3 ://학생성적수정
				s.stuUpdate();
				break;
				
			case 4:
				s.stuDelete();
				break;
				
			case 5:
				s.stuNameSort();
				break;
				
			case 6:
				s.stuTotalLowSort();
				break;
			case 7:
				s.stuTotalHighSort();
				break;
			case 8:
				s.stuFOpen();
				break;
			case 9:
				s.stuFSave();
				break;
			case 10:
				s.stuTotalRank();
				break;
			case 0:
				System.out.println("시스템을 종료합니다.");
				break loop;
				
				
				
				
				
			}//switch:전체
			
			
		}//while : 전체

	} //main

}//class
