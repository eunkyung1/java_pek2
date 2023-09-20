package p0920_입출력;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.stream.FileCacheImageInputStream;


public class J0920_inputStream {

	public static void main(String[] args) {
		
		
		//파일을 읽어올 때 사용

		
		
		//byte 배열단위로 가져옴.
		byte[] b = new byte[1024];
		 
		try {
			FileInputStream	fis = new FileInputStream("c:/aaa/11.txt");
			fis.read(b);
			System.out.println(new String(b));

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("파일을 읽어 왔습니다.");

		
		//1byte단위 가져옴
//		File f = new File("c:/aaa/11.txt");
//		try {
//			FileInputStream fis = new FileInputStream("c:/aaa/11.txt");
//			int read = 0;
//			while((read=fis.read()) != -1) { // 읽을 파일이 있으면 아래와 같이 실행하라.
//				System.out.println((char)read);  //2byte -> 한글지원이 안됨.
//				
//				
//			}//while
//		} catch (Exception e) {
//			e.printStackTrace();
//		}//catch
		
			

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//main

}//class
