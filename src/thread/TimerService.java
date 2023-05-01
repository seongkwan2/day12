package thread;

import java.util.Scanner;

public class TimerService {

	Scanner scan = new Scanner(System.in);
	TimerDTO dto = new TimerDTO();
	
	public void login() {
		System.out.println("===로그인===");
		System.out.println("아이디 입력: ");
		String checkId = scan.next();
		if(checkId(dto.getId())) {
			
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
}
