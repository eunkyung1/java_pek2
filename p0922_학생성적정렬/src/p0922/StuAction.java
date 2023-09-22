package p0922;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class StuAction {
	ArrayList<StuScore> list = new ArrayList();
	Scanner scan = new Scanner (System.in);
	
	//1.학생성적입력
	void stuInput() {
		while(true) {
			int count = list.size()+1;
			System.out.println("[[1. 학생성적입력 ]]");
			System.out.println(count+"번째 이름을 입력하세요.(0.이전페이지 이동)");
			String name = scan.next();
			if(name.equals("0")) {
				System.out.println(">>이전페이지로 이동합니다.");
				break;
			}//if
			System.out.println("국어 점수를 입력하세요.");
			int kor = scan.nextInt();
			System.out.println("영어 점수를 입력하세요.");
			int eng = scan.nextInt();
			System.out.println("수학 점수를 ㄴ입력하세요.");
			int math = scan.nextInt();
			list.add(new StuScore(name,kor,eng,math));
			System.out.println("학생성적이 저장되었습니다.");
			System.out.println();
			
		}//while
	}//stuInput
	
	
	//2. 학생성적출력
	void stuOutput() {
		System.out.println("[[1. 학생성적출력 ]]");
		System.out.printf("학번\t이름\t국어\t영어\t수학\t총점\t평균\t등수\n");
		System.out.println("-------------------------------------------------");
		for(int i=0;i<list.size();i++) {
			StuScore t = list.get(i);
			System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",
					t.getStuNum(),t.getName(),t.getKor(),t.getEng(),t.getMath(),t.getTotal(),t.getAvg(),t.getRank());
			
		}//for
		System.out.println();
	}//stuOutput
	
		//3. 학생성적수정
	void stuUpdate() {
		
	}
	
	
	
	
	
	
	
	
		//8. 파일가져오기
		void stuFOpen() throws Exception {
			FileReader fr = new FileReader("c:/aaa/stu1.txt");
			BufferedReader br = new BufferedReader(fr);
			while(true) {
				String line = br.readLine();
				if(line == null) break;
				String[] data = line.split(","); //각 데이터값을 분리
				int stuNum = Integer.parseInt(data[0]);
				String name = data[1];
				int kor = Integer.parseInt(data[2]);
				int eng = Integer.parseInt(data[3]);
				int math = Integer.parseInt(data[4]);
				int total = Integer.parseInt(data[5]);
				double avg = Double.parseDouble(data[6]);
				int rank = Integer.parseInt(data[7]);
				list.add(new StuScore(stuNum,name,kor,eng,math,total,avg,rank));
				
			}
			br.close();
			System.out.println("입력된 파일을 가져왔습니다.");
			System.out.println();
		}//stuFOpen
		
		//9. 파일저장하기
		void stuFSave () throws Exception {
			FileWriter fw = new FileWriter("c:/aaa/stu1.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			String strData ="";
			for(int i =0; i<list.size();i++) {
				StuScore st =list.get(i);
				String line = String.format("%d,%s,%d,%d,%d,%d,%.2f,%d",
						st.getStuNum(),st.getName(),st.getKor(),st.getEng(),st.getMath(),st.getTotal(),st.getAvg(),st.getRank());
			strData += line +"\r\n";  //1명의 학생성적을 String으로 변환 후 strData추가 해줌.
			}//for
			bw.write(strData);
			bw.close();
			System.out.println("학생성적을 파일에 저장하였습니다.");
			
			
			
		}//stuFSave
	
		//7. 높은순 점수로 정렬
		void stuTotalHighSort() {
		Collections.sort(list,new Comparator<StuScore>() {

			public int compare(StuScore s1, StuScore s2) {
				return s2.getTotal()-s1.getTotal();
			}
		}); 
		System.out.println("성적이 높은 순 정렬이 완료되었습니다."); //작은 수 s1-s2
	
	}//stuTotalHighSort;
	
		//6.낮은순 점수로 정렬
		void stuTotalLowSort() {
		Collections.sort(list,new Comparator<StuScore>() {
			public int compare(StuScore s1,StuScore s2) {
				return s1.getTotal() - s2.getTotal();
			}
		});
		
		
		
	}//stuTotalLowSort
	
	//5. 이름순 정렬
	void stuNameSort() {
		Collections.sort(list,new Comparator<StuScore>() {

			@Override
			public int compare(StuScore s1, StuScore s2) {
				return s1.getName().compareTo(s2.getName());
			}
		});
		System.out.println("이름순으로 정렬되었습니다.");
	
	}//stuNameSort
	
	
	
	
	
	
	
	
	
}//class
