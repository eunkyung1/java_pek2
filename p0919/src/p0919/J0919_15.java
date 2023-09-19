package p0919;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class J0919_15 {

	public static void main(String[] args) throws Exception{
		//lee 1, lee 2 -> bbb 폴더를 보시오.
		
		File f = new File("c:/bbb");
		if(!f.exists()) {  //폴더가 없으면
			f.mkdir();     //폴더 생성
		}
		
		FileInputStream fis1 = new FileInputStream("c:/aaa/lee1.jpg"); //파일 읽기
		FileInputStream fis2 = new FileInputStream("c:/aaa/lee2.jpg");
		FileOutputStream fos1 = new FileOutputStream("c:/bbb/lee1.jpg"); //파일 저장
		FileOutputStream fos2 = new FileOutputStream("c:/bbb/lee2.jpg");
		
		while(true) {
			int read = fis1.read(); //파일을 byte단위로 읽어오기
			if(read==-1) break;		//파일이 더이상 읽을게 없으면 멈춤.		
			fos1.write(read);		//파일 byte단위로 저장
			
			read = fis2.read();
			if(read==-1) break;
			fos2.write(read);
			
		}
		
		fis1.close(); //끝
		fis2.close(); 
		fos1.close(); //끝
		fos2.close();
		
		System.out.println("파일이 복사되었습니다.");
		

	}

}
