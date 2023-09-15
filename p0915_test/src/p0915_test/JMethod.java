package p0915_test;

public class JMethod {
	
	JMethod(){ //생성자 : 객체선언 후 사용하기.
		
	}

	//인스턴스메소드
	int cal(int n1, int n2, int n3, int n4) {   
		//^^ 받은 매개변수 갯수만큼 똑같이 함. // n1,n2와 안 같아됨. n1->a, n2->b 순서가 중요!!
		//입력받은 2개의 숫자를 4칙연산
		int result1 = n1 +n2+n3+n4;
		int result2 = n1*n2*n3*n4;
		return result1+result2;
		
	}
	
	int cal(int[] n) {
		int result1 = (n[0]+n[1] +n[2]+n[3]);
		int result2 = n[0]*n[1]*n[2]*n[3];
		return result1+result2;
	}
	
	
}
