package p0911;

import java.util.Scanner;

public class J0911_05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//2개의 숫자를 입력받아, 더하기, 빼기, 곱하기 나누기를 출력하시오.
		
//		int a = 0;
//		int b = 0;
//		int c = 0;
//		int d = 0;
//		int e = 0;
		
		int[] n = new int[7];
		int result = 0;
		
		for(int i=0;i<n.length;i++) {
			System.out.println((i+1)+"번째 숫자를 입력하세요.");
			n[i] = scan.nextInt();
		}
		
		
		//		System.out.println("첫 번째 숫자를 입력하시오.");
//		a = scan.nextInt();
//		System.out.println("두 번째 숫자를 입력하시오.");
//		b = scan.nextInt();
//		System.out.println("세 번째 숫자를 입력하시오.");
//		c = scan.nextInt();
//		System.out.println("네 번째 숫자를 입력하시오.");
//		d = scan.nextInt();
//		System.out.println("다섯 번째 숫자를 입력하시오.");
//		e = scan.nextInt();

		
		
		System.out.print("더하기 결과값 : ");
//		result = add(n[0],n[1],n[2],n[3],n[4],n[5],n[6]); //클래스명 생략가능
		result = add(n); 
		System.out.println(result);
		
		System.out.print("빼기 결과값 : ");
		result = subtract(n); //클래스명 생략가능
		System.out.println(result);
		
		System.out.print("곱하기 결과값 :");
		result = multiply(n);//int[] n배열의 주소값을 매개변수로 보냄.
		System.out.println(result);
		
		System.out.print("나누기 결과값 :");
		result = divide(n);
		System.out.println(result);
		

	}//main

	static int add(int[] n) {
		int result = n[0];
		for(int i=1;i<n.length;i++) 
			result = result + n[i];
				
		return result;
		
	}
	
	static int subtract(int[] n) {
		int result = n[0];
		for(int i=1;i<n.length;i++) 
			result = result - n[i];
		
		return result;
		
	}
	
	static int multiply(int[] n) {
		int result = n[0];
		for(int i=1;i<n.length;i++)
			result = result * n[i];
		
		return result;
	}
	
	static int divide(int[] n) {
		int result = n[0];
		for(int i=1;i<n.length;i++) 
			result = result /  n[i];
		return result;
	}
	
}//class
