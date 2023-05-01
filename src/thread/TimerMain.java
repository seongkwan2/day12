package thread;

import java.util.Scanner;

public class TimerMain {
	public static void main(String[] args) {
		
		TimerService tm = new TimerService();
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("1.로그인 2.가 입 3.로그아웃\n>>>");
			int num = scan.nextInt();
			
			switch(num) {
			case 1:
				tm.login();
				break;
			case 2:
				tm.sign();
				break;
			case 3:
				tm.logout();
			default :
				System.out.println("다시 입력해주세요");
			}
			
			
			
		}
		
	}
}
