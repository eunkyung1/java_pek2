package p0905;

import java.util.Scanner;

public class practice1 {

	public static void main(String[] args) {
// 1-100까지의 랜덤숫자를 생성해서 맞추는 프로그램을 구현하시오.
		Scanner scan = new Scanner(System.in);
		int [] num = new int[10];
		int random =(int)(Math.random()*100)+1;
		int i = 0;
		
		while(i<10) {
			System.out.println("숫자를 입력하시오.");
			int n1 = scan.nextInt();
			num[i] = n1;
			
			if(random==n1) {
				System.out.println("정답입니다.");
				break;
			}else if(random>n1) {
				System.out.println("입력한 수보다 큰수 입니다.");
			}else {
				System.out.println("입력한 수보다 작은수 입니다.");
			}//if
			i++;
			
		}//while
		System.out.println("입력한 숫자는 :");
		for(int j=0;j<i;j++) {
			System.out.printf(" %d ",num[j]);
		}
		System.out.println();
		System.out.println("랜덤 숫자는 : "+random);
			
	}//main
	
}//class
		
		
		//구구단 출력
//		for(int i=2;i<=9;i++) {
//			System.out.printf("  %d 단 \n",i);
//		
//			for(int j=1;j<=9;j++) {
//				System.out.printf("%d * %d = %d\n",i,j,(i*j));
//				
//			}
//		System.out.println("-------------");
//		}
		


	
	

