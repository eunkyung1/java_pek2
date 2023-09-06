package p0906;

import java.util.Arrays;

public class J0906_07 {
	public static void main(String[] args) {
		int[] score = new int[5];
		int[] num = {1,2,3}; //{}사용가능, 값을 넣을 경우 에러!
		num = score; //주소를 복사 -> 값을 복사한 것은 아니다. // num의 공간을 사용하지 않고 score 의 공간을 사용.
		
		
		System.out.println(Arrays.toString(score));
		System.out.println(Arrays.toString(num));
		
		System.out.println("score : "+score);
		System.out.println("num :"+num);
		
		
//		for(int i=0;i<score.length;i++) {
//			System.out.println(score[i]);
//		}
//		System.out.println(score); //주소값
//		System.out.println(num);
//		
//		num[0]=10000;
//		System.out.println(num[0]);
//		System.out.println(score[0]);
//		
		
		
		
		
		
	}//main
}//class
