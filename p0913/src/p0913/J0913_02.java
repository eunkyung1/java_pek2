package p0913;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
//import java.util.*; //한가지만 적어도 모두 생략가능.

public class J0913_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] a = {1,2,3,4,5};
		System.out.println(Arrays.toString(a));//java.lang패키지는 생략가능
		String str = new String ("a");
		//날짜 객체
		Date today = new Date();
		System.out.println(today);
		//fomat설정 - yyyy/MM/dd
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		System.out.println(sdf.format(today));

		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		System.out.println(sdf2.format(today));
	
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy년MM월dd일 hh시mm분ss초");
		System.out.println(sdf3.format(cal.getTime()));
	
	}

}
