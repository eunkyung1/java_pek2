package p0922;

import java.util.ArrayList;

public class J0922_01 {

	public static void main(String[] args) {
		ArrayList<StuScore> list = new ArrayList();
		ArrayList<Car> list2 = new ArrayList(); //<> 지네릭스
 		String[] title = {"번호","이름","국어","영어","수학","총점","평균","등수"};
		list.add(new StuScore("홍길동",100,100,99));
		list.add(new StuScore("유관순",100,80,79));
		list.add(new StuScore("이순신",80,60,76));
//		list.add(new Car("while",5));
		list.add(new StuScore("강감찬",20,100,56));
		list.add(new StuScore("김구",30,61,76));
		
		System.out.println("                     [성적처리 프로그램]");
		System.out.println("----------------------------------------");
		
		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\n",title[0],title[1],title[2],
				title[3],title[4],title[5],title[6],title[7]);
		
		System.out.println("----------------------------------------");

		//출력
		for(int i =0;i<list.size();i++) {
		StuScore s= (StuScore) list.get(i); //형변환 생략가능 -> <StuScore>를 넣었기 때문
			System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",
					s.getStuNum(),s.getName(),s.getKor(),s.getEng(),s.getMath(),s.getTotal(),s.getAvg(),s.getTotal());
		}
		
		

	}

}
