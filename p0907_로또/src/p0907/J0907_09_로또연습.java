package p0907;

import java.util.Scanner;

public class J0907_09_로또연습 {

	public static void main(String[] args) {
		         //1. 선언
				//2. 로또번호 순차입력
				//3. 로똗번호 섞기
				//4. 6개 당청번호 적기
				//5. 번호 직접입력
				//6. 당첨번호 출력
				//7. 직접 입력한 번호 출력
				//8. 당첨갯수 확인
				
		//선언
		Scanner scan = new Scanner(System.in);
		int[] lotto = new int[45];
		int[] myNum = new int [6];
		int[] winNum = new int[6];
		int temp = 0, count = 0;
		
		//로또번호 순차입력
		for(int i=0;i<lotto.length;i++) {
			lotto[i] = i+1;
		}
		
		//로또번호 섞기
		for(int i=0;i<400;i++) {
			int random = (int)(Math.random()*45);
			temp = lotto[0]; 
			lotto[0]=lotto[random];
			lotto[random]= temp;
					
		}
		
		//6개의 당첨번호 적기
		for(int i=0;i<6;i++) {
			winNum[i] = lotto[i];
		}//for
		
		//번호 직접 입력하기
		for(int i=0;i<6;i++) {
			System.out.println("숫자를 입력하세요.");
			myNum[i] = scan.nextInt();
			
		}//for

		//당첨번호 출력
		System.out.print("당첨번호는 :  ");
		for(int i=0;i<6;i++) {
			System.out.printf("%d ",winNum[i]);
		}
		System.out.println();
		
		//직접 입력 출력
		System.out.print("직접 입력한 번호는 :");
		for(int i=0;i<6;i++) {
			System.out.printf("%d ",myNum[i]);
		}
		//당첨갯수확인
		for(int i=0;i<6;i++) {
			for(int j=0;j<6;j++) {
				if(myNum[i]==winNum[j]) {
					count++;
					break;
				}//if
						
			}//for
		}//for
		
		System.out.println();
		System.out.println("당첨 갯수는 : "+count);
		
		
		
	}//main
}//class
