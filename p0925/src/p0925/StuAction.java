package p0925;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class StuAction {

	Scanner scan = new Scanner(System.in);
	ArrayList<StuScore> list = new ArrayList();
	
	
	
	//1.학생성적 입력
	void stuInput() {
		while(true) {
			
			int count = list.size()+1;
			System.out.println("[[ 1.  학생성적 입력 ]]");
			System.out.println("-------------------------------------------------");
			System.out.println(count+"번째 학생의 이름을 입력하세요.(0.이전 페이지)");
			String name = scan.next();
			if(name.equals("0")) {
				System.out.println("이전 페이지로 이동합니다.");
				System.out.println();
				break;
			}//if
			System.out.println("국어성적을 입력하세요.");
			int kor = scan.nextInt();
			System.out.println("영어성적을 입력하세요.");
			int eng = scan.nextInt();
			System.out.println("수학성적을 입력하세요.");
			int math = scan.nextInt();
			
			list.add(new StuScore(name,kor,eng,math));
			System.out.println("학생성적이 저장되었습니다.");
			System.out.println();
			
		}//while:case 1
		
	}//stuInput
	
	
	//2. 성적출력
	void stuOutput() {
		
		System.out.println("[[ 2. 학생성적 출력 ]]");
		System.out.println("------------------------------------------------------------------------------------");
		System.out.printf("학번\t이름\t국어\t영어\t수학\t총점\t평균\t등수\n");
		System.out.println("-----------------------------------------------------------------------------------");
		for(int i =0; i<list.size();i++) {
			StuScore st = list.get(i);
			System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",st.getStuNum(),st.getname(),
					st.getKor(),st.getEng(),st.getMath(),st.getTotal(),st.getAvg(),st.getRank());
			
		}//for
		System.out.println();
	}//stuOutput
	
	//3. 성적 수정
	void stuUpdate() {
		
		while(true) {
			System.out.println("[[3. 학생성적수정 ]]");
			System.out.println("수정을 원하는 이름을 입력하세요.(0.이전페이지 이동)");
			String inputName = scan.next();
			if(inputName.equals("0")) {
				System.out.println(">>이전페이지로 이동합니다.");
				System.out.println();
				break;
			}//if
			System.out.println("입력된 이름으로 검색중.......");
			int i =0;
			int count =0;
			for(i=0;i<list.size();i++) {
				StuScore st = list.get(i);
				if(inputName.equals(st.getname())) {
					System.out.println("입력된 이름의 학생이 검색되었습니다.");
					count = 1;
					break;
				}//if
			}//for
			if(count==0) {
				System.out.println("입력하신 학생이 검색되지 않습니다. 다시 검색하시길 바랍니다.");
				continue;
			}//if
			
			System.out.println("----------------------------------");
			System.out.println("1. 국어점수");
			System.out.println("2. 영어점수");
			System.out.println("3. 수학점수");
			System.out.println("----------------------------------");
			System.out.println("원하는 번호를 입력하세요.");
			int choice = scan.nextInt(); 
			StuScore st = list.get(i);
			
			switch(choice) {
			
			case 1 ://국어점수
				System.out.println("[[1. 국어점수 수정]]");
				System.out.println("----------------------------------");
				System.out.println("현재 국어 점수 : "+list.get(i).getKor());
				System.out.println("변경할 국어점수를 입력하세요.");
				st.setKor(scan.nextInt());
				st.setTotal(st.getKor()+st.getEng()+st.getMath());
				st.setAvg(st.getTotal()/3.0);
				System.out.println(st.getKor()+"점으로 국어성적이 변경되었습니다.");
				System.out.println();
				break;
			
			case 2:
			
				System.out.println("[[2. 영어점수 수정]]");
				System.out.println("----------------------------------");
				System.out.println("현재 영어 점수 : "+list.get(i).getEng());
				System.out.println("변경할 국어점수를 입력하세요.");
				st.setEng(scan.nextInt());
				st.setTotal(st.getKor()+st.getEng()+st.getMath());
				st.setAvg(st.getTotal()/3.0);
				System.out.println(st.getEng()+"점으로 영어성적이 변경되었습니다.");
				System.out.println();
				break;
				
			case 3:
				
				System.out.println("[[3. 수학점수 수정]]");
				System.out.println("----------------------------------");
				System.out.println("현재 수학 점수 : "+list.get(i).getMath());
				System.out.println("변경할 국어점수를 입력하세요.");
				st.setMath(scan.nextInt());
				st.setTotal(st.getKor()+st.getEng()+st.getMath());
				st.setAvg(st.getTotal()/3.0);
				System.out.println(st.getMath()+"점으로 수학성적이 변경되었습니다.");
				System.out.println();
				break;
				
			}//switch : 학생성적수정
		}//while : 학생성적수정
	}//stuUpdate
	
	void stuDelete () {
		while(true) {
			
			System.out.println("[[3. 학생성적삭제 ]]");
			System.out.println("삭제할 학생이름을 입력하세요.(0. 이전페이지 이동)");
			String inputName = scan.next();
			if(inputName.equals("0")) {
				System.out.println("이전페이지로 이동합니다.");
				System.out.println();
				break;
			}
			System.out.println("입력된 이름으로 검색중........");
			//list안에 이름이 모두 있음.
			int i =0; //검색되었을 때 위치점을 저장할 수 있는 변수
			int count = 0; //찾는 학생이 있는지 확인하는 변수
			for(i=0; i<list.size(); i++) {
				StuScore st = list.get(i);
				if(inputName.equals(st.getname())) {
					System.out.println("입력된 이름으로 학생이 검색되었습니다.");
					count =1;
					break;//for 빠져나오기
				}//if
				
			}//for
			
			if(count ==0) { //검색된 이름이 없으면 
				System.out.println("학생이 검색되지 않았습니다. 다시 입력하세요.");
				continue;//switch 빠져나오기
			}//if
			
			
			System.out.println("------------------------------------");
			System.out.println("1. 학생성적 삭제");
			System.out.println("2. 학생성적 삭제취소");
			System.out.println("------------------------------------");
			System.out.println("원하는 번호를 입력하세요.");
			int choice = scan.nextInt();
			switch(choice) {
			
			case 1 :
				System.out.println("[[ 1. 학생 성적 삭제 ]]");
				System.out.println("------------------------------------");
				list.remove(i);
				System.out.println(inputName +"학생의 성적이 삭제되었습니다.");
				break;
				
			case 2 :
				System.out.println("[[ 2. 학생 성적 삭제취소 ]]");
				System.out.println("------------------------------------");
				System.out.println(inputName +"학생의 성적이 삭제취소 되었습니다.");
				break;
				
			}//switch
			
		}//while
	}//stuDelete
	
	//5. 학생성적 이름순 정렬
	void stuNameSort() {
		Collections.sort(list,new Comparator<StuScore>() {

			@Override
			public int compare(StuScore s1, StuScore s2) {
				return s1.getname().compareTo(s2.getname());
			}
		});
		System.out.println("이름순으로 정렬되었습니다.");

	}//stuNumSort
	
	
	//6.학생 성적 낮은순
	
	void stuTotalLowSort () {
		Collections.sort(list,new Comparator<StuScore>() {

			public int compare(StuScore s1, StuScore s2) {
				return s1.getTotal()-s2.getTotal();
			}
			
		});
		System.out.println("학생 성적 낮은순으로 정렬되었습니다.");
	}//stuTotalLowSort
	
	//7.학생 성적 높은순
	
	void stuTotalHighSort() {
		Collections.sort(list,new Comparator<StuScore>() {
			public int compare(StuScore s1, StuScore s2) {
				return s2.getTotal() - s1.getTotal();
			}
		});
		System.out.println("학생 성적 높은순으로 정렬되었습니다.");
	}//stuTotalHighSort
	
	
	//8. 파일 가져오기
	
	void stuFOpen() throws Exception {
		FileReader fr = new FileReader("c:/aaa/stu1.txt");
		BufferedReader br = new BufferedReader(fr);
		while(true) {
			String line = br.readLine();
			if(line==null) break;
			String[] data = line.split(",");
			int sutNum = Integer.parseInt(data[0]);
			String Name = data[1];
			int kor = Integer.parseInt(data[2]);
			int eng = Integer.parseInt(data[3]);
			int math = Integer.parseInt(data[4]);
			int total = Integer.parseInt(data[5]);
			double avg = Double.parseDouble(data[6]);
			int rank = Integer.parseInt(data[7]);
			list.add(new StuScore(sutNum,Name,kor,eng,math,total,avg,rank));
		}
		br.close();
		System.out.println("입력된 파일이 가져왔습니다.");
		System.out.println();
		
	}//stuFOpen
	
	void stuFSave () throws Exception {
		FileWriter fw = new FileWriter("c:/aaa/stu1.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		String strData = "";
		for(int i =0;i<list.size();i++) {
			StuScore st = list.get(i);
			String line = String.format("%d,%s,%d,%d,%d,%d,%.2f,%d",
					st.getStuNum(),st.getname(),st.getKor(),st.getEng(),st.getMath(),st.getTotal(),st.getAvg(),st.getRank());
		strData += line+"\r\n";
		}//for
		
		bw.write(strData);
		bw.close();
		System.out.println("학생성적 파일에 저장하였습니다.");
		
	}//stuFOpen
	
	void stuTotalRank() {
		System.out.println("[[ 학생성적 등수처리 ]]");
		list.size();
		int count =1;
		for(int i=0;i<list.size();i++) {
			StuScore st1 = list.get(i);
			for(int j=0;j<list.size();j++) {
				StuScore st2 = list.get(j);
				if(st1.getTotal()<st2.getTotal()) count++;
			}
			st1.setRank(count);
			System.out.println("1명의 학생성적 등수 처리중...");
			count =1;
		}//for
		System.out.println("학생성적 등수처리 완료되었습니다.");
		System.out.println();
	}//stuTotalRank
	
	
	
	
	
	
}//class
