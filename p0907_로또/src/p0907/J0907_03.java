package p0907;

import java.util.Arrays;

public class J0907_03 {

	public static void main(String[] args) {
		int[] num = {1,2,3,4,5};
		int[] score = new int[5];  // 0,0,0,0,0
		
		// score = num; //얕은 복사, 주소값 복사
		
		//1. 배열 복사 방법 - for문사용, 데이터값 전체를 다른 장소에 복사
//		for(int i=0;i<num.length;i++) {
//			 score[i] = num[i] ;
//		}
		
		
		//2. 배열 복사 방법 - arraycopy메소드사용, 데이터값 전체를 다른 장소에 복산
		//1)원본배열 2)위치 3)복사대상 4)위치 5)복사개수
		System.arraycopy(num, 1, score, 2, 3);
		//num[0] = 20;
		
		System.out.println(num);
		System.out.println(score);
		System.out.println(Arrays.toString(num)); //Arrays.toString : 주소값의 내용을 출력해달라는 명령어
		System.out.println(Arrays.toString(score));

	}

}
