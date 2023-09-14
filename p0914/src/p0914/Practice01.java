package p0914;

public class Practice01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//2. 전체 매개 변수 생성자
		StuScore s2 = new StuScore(1,"홍길동",100,80,30);
//		System.out.printf("%d,%s,%d,%d,%d\n",s2.getStuNo(),s2.getName(),s2.getKor(),s2.getEng(),s2.getMath());
		
		
		
		
		
		
//		1. 기본 생성자 호출하는 방법
		StuScore s1 = new StuScore();
		
		s1.setStuNo(1);
		s1.setName("홍길동");
		s1.setKor(100);
		s1.setEng(100);
		s1.setMath(99);
		s1.setTotal(s1.getKor() + s1.getEng() + s1.getMath());
		s1.setAvg(s1.getTotal()/3.0);
		
//		System.out.println("이름 :"+s1.getName());
		
		System.out.printf("%d,%s,%d,%d,%d,%d,%d",s1.getStuNo(),s1.getName(),s1.getKor(),s1.getEng(),s1.getMath(),s1.getTotal(),s1.getAvg());
	
	
	
	
	
	
	
	
	}//main

}//class
