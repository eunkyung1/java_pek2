package p0831;

import java.util.Scanner;

public class pra01 {

	public static void main(String[] args) {
	 Scanner scan = new Scanner(System.in);
			 
	 String name = "";
	 int kor = 0;
	 int eng = 0;
	 int mat = 0;
	 int total = 0;
	 double avg = 0;
	 
	 System.out.println("이름을 입력하시오");
	 name = scan.next();
	 
	 System.out.println("국어점수를 입력하시오");
	 kor = scan.nextInt();
	 
	 System.out.println("영어점수를 입력하시오");
	 eng = scan.nextInt();
	 
	 System.out.println("수학점수를 입력하시오");
	 mat = scan.nextInt();
	 
	 
	 total = kor + eng + mat;
	 avg = total / 3.0;
	 
	 System.out.println("합계 : "+total);
	 System.out.println("평균 : "+avg);
	 
	 System.out.printf("이름 : %s \n ",name);
	 System.out.printf("국어 : %d, 영어 : %d, 수학 : %d \n",kor,eng,mat);
	 System.out.printf("합계 : %d \n", total);
	 System.out.printf("평균 : %.2f \n",avg);
	 
	 
		
		
	}

}
