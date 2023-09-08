package p0908;

import java.util.Scanner;

public class J0908_02 {

	public static void main(String[] args) {
		//시분초
		Scanner scan = new Scanner(System.in);
		
		int[] hour = new int[3];
		int[] minute = new int[3];
		double[] second = new double[3];
		int count = 0; 
		
		for(int i=0;i<3;i++) {
			System.out.println("시간 중 시를 입력하세요.");
			hour[i] = scan.nextInt();
			System.out.println("시간 중 분을 입력하세요.");
			minute[i] = scan.nextInt();
			System.out.println("시간 중 초를 입력하세요. (예:45.02)");
			second[i] = scan.nextDouble();
			
		}//for
		
		
		//2번째 것만 입력한 시간을 출력하시오.
		//12:12:12.05
		
		
		System.out.print("2번째 시간 :");
		System.out.printf("%d시 %d분 %.2f초\n",hour[1],minute[1],second[1]);
	
		
		//2번째 시간을 14:14:14.55 로 변경해서 출력하시오.
		//변경
		
		System.out.print("2번째 변경시간 :");
		hour[1]=14;
		minute[1]=14;
		second[1]=14.55;
		System.out.printf("%d시 %d분 %.2f초\n",hour[1],minute[1],second[1]);	

		
		//3번째 시간 중 second를 59.10으로 변경해서 출력하시오.
		
		System.out.print("3번째 변경시간 :");
		second[2] = 59.10;
		System.out.printf("%d시 %d분 %.2f초\n",hour[2],minute[2],second[2]);	
		

	}

}
