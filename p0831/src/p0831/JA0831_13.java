package p0831;

public class JA0831_13 {

	public static void main(String[] args) {
		int a = 1;
		a++;
		a++;
		a++;
		a++;
		a++;
		a++;
		a++;
		a++;
		a++;
		//system.out.println(a);
		
		int b = 10;
		int c = 10;
		b--;
		b--;
		--b;
		--b;
		--b;
		b--; //c:5 b:4
		c = b;
		
		//System.out.println(b); //4
		//System.out.println(c);
		
		boolean power = true;
		System.out.println(power); //true
		power = !power;
		System.out.println(power); //false
		power = !power;
		System.out.println(power); //true
		
		
		//System.out.println(!power);
		
		
		char ch = 'A'; //62
		char ch2 = 'a'; //97
		System.out.println(ch+ch2); //65+97 = 162
		System.out.printf("%c,%c \n",ch,ch2);
		

		
		

	}

}
