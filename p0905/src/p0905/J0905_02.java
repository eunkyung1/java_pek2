package p0905;

public class J0905_02 {
	public static void main(String[] args) {
		
		//1부터 10까지의 순번과 합을 출력하시오.
		int i=0; //순번
		int sum=0;
		
		for(i=1;i<=100;i++) {
			sum = sum + i;
			System.out.printf("순번 : %d ",i);
			System.out.println("합계 : "+sum);
			if(sum>=300) {
				break; //반복을 멈추는 명령어
			
			
			}//if
		}//for
	
	}//main
	
}//class
