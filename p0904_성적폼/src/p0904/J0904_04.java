package p0904;

import java.util.Scanner;

public class J0904_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//90점이상 A, 80점이상 B, 70점이상 C, 60점이상 D, F
		//98점이상 A+, 93점이하 A- 
		
		String grade = "";
		System.out.println("점수를 입력하시오.");
		int num = scan.nextInt();
		if(num>=90) {
//			System.out.print("A");
			grade = "A";
			if(num>=98) {
//				System.out.println("+");
				grade = grade + "+";
			}else if(num <=93) {
//				System.out.println("-");
				grade = grade + "-";
			}else { 
				System.out.println();
			}
			
		}else if(num>=80) {
//			System.out.print("B");
			grade = "B";
			if(num>=88) {
//				System.out.println("+");
				grade = grade + "+";
			}else if(num<=83) {
//				System.out.println("-");
				grade = grade + "-";
			}else {
				System.out.println();
			}
			
		}else if(num>=70) {
//			System.out.print("C");
			grade = "C";
			if(num>=78) {
//				System.out.println("+");
				grade = grade + "+";
			} else if(num<=73) {
//				System.out.println("-");
				grade = grade + "-"; // grade += "-"; 
			} else
				System.out.println();
			
		}else if(num>=60) {
			grade = "D";
			if(num>=68) {
				grade += "+";
			}else if(num<=63) {
				grade += "-";
			}else 
				System.out.println();
		
		}else {
//			System.out.print("F");
			grade = "F";
		}
		System.out.println();
		
		System.out.println("학점 : "+ grade);
		System.out.println("점수 : "+num);
		

	}//main

}//class
