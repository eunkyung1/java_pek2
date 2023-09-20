package p0920;

public class J0920_13 {

	public static void main(String[] args) {
		
		int no =0;
		for(int i=0;i<10;i++) {
			no+= i;
		}
		
		System.out.println(no);
		
		
		//2. String 객체 반복 - 반복횟수만큼 메모리공간 사용
		String str = "aaa"; //예외
//		String str2 = new String("aaa"); //정석
		for(int i=0;i<10;i++) {
			str += "" +i;
		}

		System.out.println(str);
		
		//3. StringBuffer객체 반복 - 1개 메모리공간 사용
		StringBuffer sb = new StringBuffer("aaa");  //예외불가
//		StringBuffer s = "aaa"; //사용불가
		for(int i = 0;i<10;i++) {
			sb.append(i); //문자를 추가 - append 사용
		}
		
		System.out.println(sb);
		
		//4. StringBuffer 비교 
//		- equals() 정의되어 있지 않음. 비교할 경우 string으로 형변환 필요
		StringBuffer sb1 = new StringBuffer("abc"); //StingBuffer
		StringBuffer sb2 = new StringBuffer("abc");
		
		if(sb1.equals(sb2)) {
			System.out.println("s1,s2는 같음.");
		}else {
			System.err.println("s1,s2는 다름");
		}//
		
		//String 비교 - equals()가 정의되어 있음.
		String s1 = sb1.toString(); //String
		String s2 = sb2.toString();
		if(s1.equals(s2)) {
			System.out.println("s1,s2는 같음.");
		}else {
			System.err.println("s1,s2는 다름");
		}//
		
		
		
		
		
		
		
		
	}

}
