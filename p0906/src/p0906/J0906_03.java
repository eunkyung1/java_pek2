package p0906;

import java.util.Scanner;

public class J0906_03 {

	public static void main(String[] args) {
		// (arrKor) 5개를 입력 배열생성, 점수를 입력해서 출력하시오.
		Scanner scan = new Scanner(System.in);
		String[] name = new String[10];
		int[] arrKor = new int[10];
		int[] arrEng = new int[10];
		int[] arrMath = new int[10];
		int[] total = new int[10];
		double[] avg = new double[10];
		int count = 0; //입력된 학생수 변수
		
		//입력부분
		for (int i = 0; i < name.length; i++) {
			System.out.println((i + 1)+"번째 이름을 입력하시오.(중지하려면 : 0입력)");
			name[i] = scan.nextLine();  //String "0"
			if(name[i].equals("0")) {
				System.out.println("입력을 중지합니다.");
				break;
			}
			System.out.println((i + 1) + "번째 국어점수를 입력하시오.");
			arrKor[i] = scan.nextInt();
			System.out.println((i + 1) + "번째 영어점수를 입력하시오.");
			arrEng[i] = scan.nextInt();
			System.out.println((i + 1) + "번째 수학점수를 입력하시오.");
			arrMath[i] = scan.nextInt();
			scan.nextLine();
			total[i] = arrKor[i]+arrEng[i]+arrMath[i]; //합계입력
			avg[i] = total[i]/3.0;			//평균입력
			
			count++;
			
		} // for
		
		//출력부분
		System.out.println();
		System.out.println("[  학생 성적표  ]");
		System.out.printf("번호\t이름\t국어\t영어\t수학\t합계\t평균\n");
		System.out.println("--------------------------------------------------------");
		
		for(int i=0;i<count;i++) {
			System.out.printf("%d\t %s\t %d\t %d\t %d\t %d\t %.2f\n",
					i+1,name[i],arrKor[i],arrEng[i],arrMath[i],total[i],avg[i]);
		}
		
//		System.out.printf("%s\t%d\t%d\n",name[0],arrKor[0],arrEng[0]);
//		System.out.printf("%s\t%d\t%d\n",name[1],arrKor[1],arrEng[1]);
//		System.out.printf("%s\t%d\t%d\n",name[2],arrKor[2],arrEng[2]);
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		//		System.out.print("이름은 : ");
//		for (int i = 0; i < name.length; i++) {
//			if (i == 0) {
//				System.out.print(name[i]);
//				continue;
//			}
//			System.out.print(", " + name[i]);
//		} // for 이름
//		// -------------------------------------------------------------
//		System.out.println();
//		System.out.print("국어점수는 : ");
//		for (int i = 0; i < arrKor.length; i++) {
//			if (i == 0) {
//				System.out.print(arrKor[i]);
//				continue;
//			}
//			System.out.print(", " + arrKor[i]);
//		} // for 국어점수
//		// --------------------------------------------
//		System.out.println();
//		System.out.print("영어점수는 : ");
//		for (int i = 0; i < arrEng.length; i++) {
//			if (i == 0) {
//				System.out.print(arrEng[i]);
//				continue;
//			}
//			System.out.print(", " + arrEng[i]);
//
//		} // for
//		// -----------------------------------------------

	}// main

}// class
