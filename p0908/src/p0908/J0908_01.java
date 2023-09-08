package p0908;

import java.util.Scanner;

public class J0908_01 {
	public static void main(String[] args) {
		
		//선언
		Scanner scan = new Scanner(System.in);
		int[] lotto = new int[45];
		int[] winNo = new int[6];
		int[] myNo = new int[6];
		int temp = 0, count =0;
		int[] win = new int[6]; //내가 당첨된 번호
		
		//로또번호 순차입력
		for(int i=0;i<lotto.length;i++) {
			lotto[i] = i+1;
			
		}
	
		//로또번호 섞기
		for(int i=0;i<400;i++) {
			int random = (int)(Math.random()*45);
			temp = lotto[0];
			lotto[0]=lotto[random];
			lotto[random]=temp;
		}
		//6개 당첨번호 추출
		for(int i=0;i<6;i++) {
			winNo[i] = lotto[i];
			System.out.printf("%d ",winNo[i]);
		}
		
		
		//직접입력
		System.out.println();
		for(int i=0;i<6;i++) {
			System.out.println("로또번호를 입력하세요.");
			myNo[i] = scan.nextInt();
		}
		//당첨번호출력
		
		System.out.println();
		System.out.print("당첨번호 :");
		for(int i=0;i<6;i++) {
			System.out.printf("%d ",winNo[i]);
		}
	
		//직접입력한 번호출력
		
		System.out.println();
		System.out.print("입력한 번호 :");
		for(int i=0;i<6;i++) {
			System.out.printf("%d ",myNo[i]);
		}
	
		//당첨갯수 확인
			System.out.println();
			for(int i=0;i<6;i++) {
				for(int j=0;j<6;j++) {
					if( winNo[i]==myNo[j]) {
						win[count] = myNo[j]; //[i] 번호가 똑바로 안들어감.
						count++;
						break;
					}
				}
			}//for
			
			System.out.println("당첨 갯수는 : "+count);		
			System.out.print("맞춘 번호 :");
			for(int i=0;i<count;i++) {
				System.out.printf("%d ",win[i]);
				
			}
			System.out.println();
			
			
			
	
	
	
	}//main
	}//class
	

