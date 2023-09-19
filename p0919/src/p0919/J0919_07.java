package p0919;

import java.io.File;

public class J0919_07 {

	//1. main 메소드
	public static void main(String[] args) {
		String aName = "";
		File f = createFile(aName);
		

	}//main

	static File createFile(String fileName) {
		if(fileName==null || fileName=="") {
			fileName = "c:/aaa/제목없음.txt";
		}
		
		
		
		
		
		
		File f = new File(fileName);
		try {
			f.createNewFile();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(fileName+"파일생성이 되었습니다.");
		return f;
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

	}//class
