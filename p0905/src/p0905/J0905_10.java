package p0905;

public class J0905_10 {

	public static void main(String[] args) {

		//구구단을 for문을 구현하시오.
		for(int i=2;i<=9;i++) {
//			if(i%2==1 ) {
//				continue;
//			}
			for(int j=1;j<=9;j++) {
				if(j%2==0) {
					continue;
				}//if
				System.out.printf("%d * %d = %d\n",i,j,(i*j));
			}//for
			System.out.println("------------");
		}//for
		
		
//		for(int i=1;i<=10;i++) {
//			if(i%3==0) {
//				//break; : 해당사항에 true가 되면 명령문을 빠져나감 // 반복문을 완전히 멈춤
//				continue; // 해당사항만 진행하지 않고 나머지 실행함 //1번 멈춤
//				
//			}//if
//			System.out.println(i);
//		}//for
		
		
		
		
		
		
		
		

	}

}
