package p0905;

import java.util.Scanner;

public class J0905_15 {

	public static void main(String[] args) {
		//1-100 랜덤숫자를 생성해서 맞추는 프로그램을 구현하시오.
		Scanner scan = new Scanner(System.in);
		int [] num = new int[10];
		int random = (int)(Math.random()*100)+1;
		int i=0;
		
		while(i<10) {
			System.out.println("숫자를 입력하세요.");
			int n1 = scan.nextInt();
			num[i]= n1;
			
		
			if (random==n1) {
				System.out.println("정답입니다.");
				break;
			}else if(random>n1) {
				System.out.println("입력한 숫자보다 큰수 입니다.");
			}else {
				System.out.println("입력한 숫자보다 작은수 입니다.");
			}
			
			
		 i++;
		
		}//while
		 
		 System.out.println("입력한 숫자는 : ");
		 for(int j=0;j<i;j++) {
			 System.out.printf(" %d ",num[j]);
		}//for
			
		 System.out.println();
		 System.out.println("랜덤 숫자 : "+random);
		
		
	}//main

}//class
