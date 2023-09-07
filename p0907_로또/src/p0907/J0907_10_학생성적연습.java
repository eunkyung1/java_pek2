package p0907;

import java.util.Scanner;

public class J0907_10_학생성적연습 {

	public static void main(String[] args) {

		//선언
		Scanner scan = new Scanner(System.in);
		int choice = 0;
		int count = 0;
		String[] subject = {"국어","영어","수학"};
		String[] title = {"학번","이름","국어","영어","수학","합계","평균"};
		int[] stuNo = new int[10];
		String[] name = new String[10];
		int[][] score = new int[10][3];
		int[] total = new int[10];
		double[] avg = new double[10];
		
		loop:while(true) {
			System.out.println("------------------------------------");
			System.out.println("-----------학생성적 프로그램-------------");
			System.out.println("------------------------------------");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 성적수정");
			System.out.println("0. 종료");
			System.out.println("-----------------------------------");
			System.out.println("원하는 번호를 입력하시오.>>");
			choice = scan.nextInt();
			
		switch(choice) {	
		case 1:
			System.out.println("------------------------");
			System.out.println("[성적입력화면]");
			System.out.println("------------------------");
			
			for(int i=count;i<10;i++) {
				stuNo[i]= count +1;
				
				System.out.println((count+1)+"번째 이름을 입력하세요.(*0:이전화면)");
				name[i] = scan.next();
				if(name[i].equals("0")) {
					break;
				}
				
				for(int j=0;j<3;j++) {
					System.out.println(subject[j]+"점수를 입력하세요.");
					score [i][j] = scan.nextInt();
				}//for(j)
				
				//합계
				 total[i] = score[i][0]+score[i][1]+score[i][2];
				//평균
				 avg[i] = total[i]/3.0;
				 count++;
			}//for(i)
			
			System.out.println();
			break;

		case 2 :
			System.out.println("------------------------");
			System.out.println("[성적출력화면]");
			System.out.println("------------------------");
			System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\n",
					title[0],title[1],title[2],title[3],title[4],title[5],title[6]);
			System.out.println("-------------------------");
			for(int i=0;i<count;i++) {
				System.out.printf("%d\t",stuNo[i]);
				System.out.printf("%s\t",name[i]);
				for(int j=0;j<3;j++) {
					System.out.printf("%d\t",score[i][j]);
					
				}//for(j)
				System.out.printf("%d\t",total[i]);
				System.out.printf("%.2f\n",avg[i]);
		
			}//for(i)
			System.out.println();
			break;
			
			
			
			
		case 0 :
			System.out.println();
			System.out.println("프로그램을 종료합니다.");
			break loop;
				
				
			
			
		}//switch
			
		
		
		
		
		
	
	
	
		}//while
		
	
	
	
	
	
	
	}//main

}//class
