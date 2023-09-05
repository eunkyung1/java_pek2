package p0831;

public class JA0831_08 {

	public static void main(String[] args) {
		int age = 20;
		String address = "서울특별시 구로구 구로동";
		
		System.out.println("당신의 나이는 "+age+"세, 사는 곳은 "+address+" 입니다");
		System.out.println("---------------------");
		System.out.printf("당신의 나이는 %d세, 사는 곳은 %s 입니다.\n",age,address);
		
		System.out.println("당신의 나이는 "+age+"세, 사는 곳은 "+address+" 입니다.");
		System.out.printf("당신의 나이는 %d세, 사는 곳은 %s 입니다.\n", age,address);
		
		//국어, 영어, 수학 평균을 출력 소수점 2자리까지 출력하시오.
		// 100 100. 99
		
		System.out.println("-------------practice-------------------");
		
		int kor2 = 100;
		int eng2 = 100;
		int mat2 = 99;
		int total2 = 0;
		double avg2 = 0;
		
		total2 = kor2 + eng2 + mat2;
		avg2 = total2/3.0;
		
		System.out.println("합계는 "+total2+"");
		System.out.println("평균은 "+avg2+"");
		System.out.printf("합계는 %d\n",total2);
		System.out.printf("평균은 %.2f\n",avg2);
		
		
		
		System.out.println("------------------------------");
		
		int kor = 100;
		int eng = 100;
		int mat = 99;
		int total =0;
		double avg=0;
		
		total = kor+eng+mat;
		avg = total/3.0;
		
		System.out.println(avg);
		System.out.printf("평균은 : %.2f. \n",avg);
		
		System.out.print("a");
		System.out.print("b");
		System.out.print("c");
		
		System.out.println();
		
		System.out.printf("%05.2f\n",5.8);
		
		
		
		
		
		

	}

}
