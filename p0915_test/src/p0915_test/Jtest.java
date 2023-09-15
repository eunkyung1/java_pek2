package p0915_test;

import java.util.ArrayList;
import java.util.Scanner;

public class Jtest {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		ArrayList list = new ArrayList();
		StuAction stuAction = new StuAction();
		int stuCount=1;
		String[] title = {"번호","이름","국어","영어","수학","합계","평균"};
		
		
		while(true) {
			int choice = stuAction.mainPrint();
			
			switch(choice) {
			
			case 1:
				stuCount = stuAction.stuInput(stuCount);
				int t = stuCount;
				break;
			
			case 2:
				stuAction.stuOutput();
				break;
				
				
				
				
				
				
				
			}//switch
			
		}//while
		
	
		
		
		
	}//main
}
