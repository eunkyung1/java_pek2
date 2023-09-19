package p0919;

import java.io.File;
import java.io.IOException;

public class J0919_08 {

	public static void main(String[] args)  {
		//파일을 1개 생성 - File객체는 폴더,파일을 생성할 수 있음.
		//폴더 생성
		File f = new File("c:/bbb");
		f.mkdir();
		System.out.println("폴더가 생성되었습니다.");
		
		
		File fFile = new File("c:/abc/1.txt"); //해당 폴더가 없다면 에러가 남.
		try {
			fFile.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			System.out.println("프로그램을 끝마칩니다.");
		}
	

		

	}

}
