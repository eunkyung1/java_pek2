package p0904;

public class J0904_08 {

	public static void main(String[] args) {
		int num = 6;
		switch (num) {  //switch -> if문보다는 빠르게 결과를 얻을 수 있음. switch문은 if절로 대체 가능
		case 1: case 7: //나란히 정렬 가능
			System.out.println("SK");
			break;
		case 6:
		case 8:			//2줄 나눠서 정렬 가능
			System.out.println("KTF");
			break;
		case 9:
			System.out.println("LG");
			break;
			
		default:
			System.out.println("해당사항 없음");
			
			break;
		}//switch 
		
		if(num==1 || num==7) {
			System.out.println("SK");
		}else if(num==6 || num==8) {
			System.out.println("KTF");
		}else if(num==9) {
			System.out.println("LG");
		}else {
			System.out.println("해당사항 없음.");
		}
		

	}//main

}//class
