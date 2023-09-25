package p0922_02;

import java.util.ArrayList;
import java.util.Scanner;

public class StuMain {

	public static void main(String[] args) {


		StuAction s = new StuAction();
		Scanner scan = new Scanner(System.in);
		ArrayList<StuScore> list = new ArrayList();
		int choice = 0;
		
		while(true) {
			System.out.println("-----------------------------------------------");
			System.out.println("[[학생성적처리 프로그램]]");
			System.out.println("-----------------------------------------------");
			System.out.println("1. 학생성적입력");
			System.out.println("2. 학생성적출력");
			System.out.println("3. 학생성적수정");
			System.out.println("0. 프로그램종료");
			System.out.println("-----------------------------------------------");
			
			
			System.out.println("원하는 번호를 입력하세요.");
			choice = scan.nextInt();
			
			switch(choice) {
			
			case 1:
				while(true) {
					int count = s.list.size();
					System.out.println("[[1. 학생성적입력]]");
					System.out.println(count+"번째 학생의 이름을 입력하세요.");
					String name = scan.next();
					System.out.println("국어 점수를 입력하세요.");
					int kor = scan.nextInt();
					System.out.println("영어 점수를 입력하세요.");
					int eng = scan.nextInt();
					System.out.println("수학 점수를 입력하세요.");
					int math = scan.nextInt();
					list.add(new StuScore(name,kor,eng,math));
					System.out.println("학생성적이 저장되었습니다.");
					System.out.println();
				}//while:case1
		
			case 2:
				System.out.println("[[2. 학생성적출력]]");
				System.out.printf("학번\t이름\t국어\t영어\t수학\t총점\t평균\t등수\n");
				System.out.println("--------------------------------------------");
				for(int i = 0; i<list.size();i++) {
					StuScore s1 = s.list.get(i);
					System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",s1.getStuNum(),s1.getName(),s1.getKor()
							,s1.getEng(),s1.getMath(),s1.getTotal(),s1.getAvg(),s1.getRank());
				}
				
			
			
			
			
			
			
			}//switch(전체)
			
			
		
		}//while(전체)
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
