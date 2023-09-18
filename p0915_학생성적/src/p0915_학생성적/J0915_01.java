package p0915_학생성적;

import java.util.Scanner;

public class J0915_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println(" [하이마켓 쇼핑몰 로그인] ");
		String id = "aaa";
		String pw = "1111";
		String name = "홍박사";
		
		Buyer b1 = new Buyer(id,name);
		int choice = 0;
		programLoop :while (true) {
			System.out.println("[하이마켓 가전 쇼핑몰 ]");
			System.out.println("1. TV");
			System.out.println("2. 컴퓨터");
			System.out.println("3. 오디오");
			System.out.println("4. 세탁기");
			System.out.println("5. 현재잔액조회");
			System.out.println("8. 총 구매목록");
			System.out.println("9. 금액 충전");
			System.out.println("0. 프로그램종료");
			System.out.println("------------------------------");
			System.out.println("구매를 원하는 번호를 입력하세요.");
			choice = scan.nextInt();
			
		switch(choice) {
		
		case 1 :
			System.out.println("[ TV 구매 ]");
			System.out.println("결제를 구매하시겠습니까?(1.예 2.아니오)");
			choice = scan.nextInt();
			if(choice == 1) {
				int check = b1.buy(new Tv());
				if(check==0) break;
				System.out.println("TV를 구매하셨습니다.");
				System.out.printf("구매 후 잔액 : %d \n",b1.money);
				System.out.println();
				
				
			}else {
				System.out.println("TV구매를 취소하셨습니다.");
				System.out.println();
			}//if
			
			break;
		case 2 :
			System.out.println("[ 컴퓨터 구매 ]");
			System.out.println("결제를 구매하시겠습니까?(1.예 2.아니오)");
			choice = scan.nextInt();
			if(choice == 1) {
				int check = b1.buy(new Computer());
				if(check==0) break;
				System.out.println("컴퓨터를 구매하셨습니다.");
				System.out.printf("구매 후 잔액 : %d \n",b1.money);
				System.out.println();
				
				
			}else {
				System.out.println("컴퓨터 구매를 취소하셨습니다.");
				System.out.println();
			}//if
			
			break;
			
		case 3 :
			System.out.println("[ 세탁기 구매 ]");
			System.out.println("결제를 구매하시겠습니까?(1.예 2.아니오)");
			choice = scan.nextInt();
			if(choice == 1) {
				int check = b1.buy(new Washing());
				if(check==0) break;
				System.out.println("세탁기를 구매하셨습니다.");
				System.out.printf("구매 후 잔액 : %d \n",b1.money);
				System.out.println();
				
				
			}else {
				System.out.println("세탁기 구매를 취소하셨습니다.");
				System.out.println();
			}//if
			
			break;
		case 4 :
			System.out.println("[ 오디오 구매 ]");
			System.out.println("결제를 구매하시겠습니까?(1.예 2.아니오)");
			choice = scan.nextInt();
			if(choice == 1) {
				int check = b1.buy(new Audio());
				if(check==0) break;
				System.out.println("컴퓨터를 구매하셨습니다.");
				System.out.printf("구매 후 잔액 : %d \n",b1.money);
				System.out.println();
				
				
			}else {
				System.out.println("오디오 구매를 취소하셨습니다.");
				System.out.println();
			}//if
			
			break;
			
		case 5 :
			System.out.println(" [ 현재잔액조회 ]");
			System.out.println("----------------------------");
			System.out.printf("%s 님의 현재 잔액 : %,d 원 \n",b1.name,b1.money);
			System.out.println();
			break;
		
		case 8:
			System.out.println("[ 상품 구매목록 ]");
			System.out.println("------------------------");
			for(int i=0;i<b1.list.size();i++) {
				Product p = (Product)b1.list.get(i); 
				if(i==0) {
					System.out.printf("%s",p.name);
					continue;
				}
				System.out.printf(",%s",p.name);
				
			}
			System.out.println();
			System.out.println("-------------------------");
			System.out.println();
			break;
			
		case 9 :
			System.out.println("[ 금액 충전 ]");
			System.out.println("------------------------------");
			System.out.println("충전할 금액을 입력하세요.");
			int coin = scan.nextInt();
			b1.money += coin;
			System.out.println("--------------------------------");
			System.out.println("충전 금액 : "+coin);
			System.out.println("충전 후 금액 : "+b1.money);
			System.out.println("--------------------------------");
			System.out.println();
			break ;
			
		case 0 :
			System.out.println(" [프로그램 종료]");
			System.out.println("--------------------------------");
			System.out.println("프로그램을 종료합니다.");
			break programLoop;
		
		
		}//switch
		
			
			
		}//while
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
