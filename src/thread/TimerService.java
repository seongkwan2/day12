package thread;

import java.util.Scanner;

public class TimerService {

	Scanner scan = new Scanner(System.in);
	TimerDTO dto = new TimerDTO();


	public void login() {
		System.out.println("===로그인===");
		System.out.println("아이디 입력: ");
		String checkId = scan.next();
		System.out.println("비밀번호 입력: ");
		String checkPw = scan.next();
		if(dto.getPw().equals(checkPw)){
			System.out.println("인증 통과");
			System.out.println("==== 환 영 합 니 다 ====");
			Timer ti = new Timer();
			ti.start();
			option();
		}else {
			System.out.println("인증 실패");
		}
	}


	public void sign() {
		System.out.println("===가입===");
		System.out.println("아이디 입력: ");
		String NewId = scan.next();
		System.out.println("비밀번호 입력: ");
		String NewPw = scan.next();
		System.out.println("계정 생성");
		dto.setId(NewId);
		dto.setPw(NewPw);
	}



	public void option() {
		while(true) {
			System.out.println("1.기능\n2.off\n입력>>>>");
			int num = scan.nextInt();
			switch(num) {
			case 1:
				System.out.println("1번 기능입니다.\n");
				break;
			case 2:
				System.out.println("off 기능입니다.");
				System.out.println("초기화면으로 돌아갑니다.\n");
				return;
			default:
				System.out.println("다시 입력해주세요");
			}

		}

	}

	public void logout() {
		System.out.println("로그아웃 합니다.");
		System.exit(0);
	}

}














