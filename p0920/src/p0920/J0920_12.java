package p0920;

import java.util.Scanner;

public class J0920_12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//16가1023456  -> 글자 '가' 앞과 뒤 랜덤숫자로 지정해서, 입력한 값과 비교해서 맞는 개수를 출력하시오.
		//26나2320411
		
		//앞자리 2자리 랜덤
		
		//랜덤번호 생성
		int random1 = (int)(Math.random()*100);
		String rno1 = String.format("%02d",random1);
		int random2 = (int)(Math.random()*1000000);
		String rno2 = String.format("%07d", random2);
		String randomNo = rno1 + "가" + rno2;
		//번호 입력
		while(true) {
//			System.out.println("랜덤 숫자 : "+randomNo);
			System.out.println("숫자를 입력하세요."); 
			String num2 = scan.next();
			if(num2.length()!=10) {
			 System.out.println("입력이 잘못 입력되었습니다. 다시 입력하세요.");	
			 continue;
			}//if
			
			
			
			System.out.println("랜덤 숫자 : "+randomNo);
			System.out.println("입력한 숫자 : "+num2);
			
			//비교
			//입력번호 1개 추출, 랜덤번호 1개 추출
			int count = 0;
			for(int i=0;i<10;i++) {
				if(randomNo.charAt(i)==num2.charAt(i)) {
					count++;
			}//if
			}//for
			
			System.out.println("맞은 갯수 :"+count);
			break;
		
		}//while
			

	
		

	}//main

}//class
