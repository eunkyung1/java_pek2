package p0914;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class J0914_02 {

	public static void main(String[] args) {
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		SimpleDateFormat sdf3 = new SimpleDateFormat("yy-MM-dd hh시mm분ss초");
		
		System.out.println(sdf3.format(d));
		
		
//		Calendar c = new Calendar();  //객체선언 에러
		Calendar cal = Calendar.getInstance(); //클래스명.메소드명() 
		//싱글톤 패턴 - 모든 사람들이 한가지만 바라볼 수 있게 하기 위해
		System.out.println(sdf.format(cal.getTime()));

	}

}
