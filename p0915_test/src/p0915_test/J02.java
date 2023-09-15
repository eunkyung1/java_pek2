package p0915_test;

import java.util.Scanner;

public class J02 {

	public static void main(String[] args) {
		//4개의 숫자를 입력받아 JMethod cal2를 만들어서 
		//4개 숫자 더하기와 곱하기를 한 결과 값을 main에서 출력하시오.
		
		Scanner scan = new Scanner(System.in);
	
				
//      1. 변수 사용				
//		System.out.println("첫번째 숫자를 입력하세요.");		
//		int n1 = scan.nextInt();
//		System.out.println("두번째 숫자를 입력하세요.");	
//		int n2 = scan.nextInt();
//		System.out.println("세번째 숫자를 입력하세요.");	
//		int n3 = scan.nextInt();
//		System.out.println("네번째 숫자를 입력하세요.");	
//		int n4 = scan.nextInt();
		
//		JMethod j = new JMethod();
//		int result = j.cal(n1, n2, n3, n4);
//		System.out.println("결과값 :"+result);
		

		
//		2. 배열 사용		
		int[] n = new int[4];
		for(int i=0;i<n.length;i++) {
			System.out.printf("%d번째 숫자를 입력하세요.\n",i+1);
			n[i] = scan.nextInt();
		}
		
		JMethod j = new JMethod();
//		int result = j.cal(n[0],n[1], n[2], n[3]);
		int result = j.cal(n);
		System.out.println("결과값 :"+result);
		
		

	}

}
