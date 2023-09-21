package p0920;

public class J0920_15 {

	public static void main(String[] args) {
		int a = -5;
		System.out.println(Math.abs(a)); //절대값
		
		
		double b = 12.912;
		System.out.println(Math.ceil(b));  //소수점 첫째자리 올림
		System.out.println(Math.floor(b)); //소수점 첫째자리 버림
		System.out.println(Math.round(b));  //반올림 소수점 없는 long

		
		int no1 = 5;
		int no2 = 15;
		int no3 = 2;
		
		System.out.println(Math.max(no1, no2)); //최대값추출
		System.out.println(Math.min(no1, no2)); //최소값추출
		
		int max;
		int min;
		
		//no1,no2,no3 최대값과 최소값을 출력하시오.
//		if(no1>=no2 && no1 >= no3) {
//			max = no1;
//		} else if (no2 >= no1 && no2 >= no3) {
//			max = no2;
//		} else {
//			max = no3;
//		}//if
//		System.out.println("가장 큰 수는 "+ max);
//		
//		if(no1<=no2 && no1 <= no3) {
//			min = no1;
//		} else if (no2 <= no1 && no2 <= no3) {
//			min = no2;
//		} else {
//			min = no3;
//		}//if
//		System.out.println("가장 큰 수는 "+ max);
//		System.out.println("가장 작은 수는 "+ min);
//		
	
		System.out.println("세개 수의 최댓값 : "+Math.max(Math.max(no1,no2),no3));
		System.out.println("세개 수의 작은값 : "+Math.min(Math.min(no1,no2),no3));
		
		//no1,no2,no3  적은숫자 순으로 출력하시오.
		String low = "";
		
		if(no1<no2 && no1<no3 && no2<no3) {
			low = no1+"<"+no2+"<"+no3;
		}else if (no1 <no2 && no1<no3 && no3<no2) {
			low = no1+"<"+no3+"<"+no2;
		}else if(no2<no1 && no2<no3 && no1<no3) {
			low = no2+"<"+no1+"<"+no3;
		}else if(no2<no1 && no2<no3 && no3<no1) {
			low = no2+"<"+no3+"<"+no1;
		}else if(no3<no1 && no3<no2 && no1<no2) {
			low = no3+"<"+no2+"<"+no1;
		}else
			low = no3+"<"+no2+"<"+no1;
		
		System.out.println("가장 작은 수부터 나열 : "+low);
		
	
	
	
	
	
	}//main

}//class
