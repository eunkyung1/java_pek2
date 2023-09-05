package p0901;

public class JA0901_03 {

	public static void main(String[] args) {
//		int a = 1000000;
//		int b = 1000000;
//		long c = (long)a*b;
//		System.out.printf("%,d",c);

		char c1 = 'a';
		System.out.println(c1);
		char c2 = 97;
		System.out.println(c2);
		char c3 = 65;
		System.out.println(c3);
		
		char c4 = (char)(c2+1);  //c2를 불러올 경우는, (char)가 반드시 필요!
		System.out.println(c4);
		
		char c5 = ++c2;
		System.out.println(c5);
		
		char c6 = '0';           // 0은 숫자x, 문자o
		System.out.println(c6);
		System.out.println(c6+1);  
		//char -> int로 변환 되어지기 때문에 int 0 = 48(아스키코드)이므로 49의 값이 나옴
		System.out.println((char)(c6+1));
		
		int i = '4'- '0';
		System.out.println(i);
	
		int i2 = '7' - '0';
		System.out.println(i2);
		//문자형 숫자를 int타입으로 변경 방법 : '0'을 뺴주면 됨. int타입 변경.
		
		
		
		
		
	}

}
