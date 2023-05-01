package quiz;

import java.util.Scanner;

public class SignService {
	private String num;

	public void Sign() {
		Scanner scan = new Scanner(System.in);
		System.out.println("인증 프로그램 입니다.");

		while(true) {
			System.out.println("90년생 이상은 '가입불가'");
			System.out.println("89년생 이하는 '가입가능'");
			System.out.println("A,ㅁ,ㅋ 문자는 잘못 입력");
			System.out.print("주민번호 입력(앞6자리): ");


			try{
				
				num = scan.next();
				Integer.parseInt(num); //여기서 검증이 들어가야 try~catch문에 잡힘
				//문자열을 정수형으로 바꿈 (문자가 섞여들어오면 예외발생)
				
				if(num.length() != 6) {
					System.out.println("길이가 틀렸습니다.\n");
				}else {
					int n = Integer.parseInt(num.substring(0,1));
					if(n<=8) {
						System.out.println("가입 가능\n");
					}else{
						System.out.println("가입 불가\n");
					}
				}
				
			}catch(NumberFormatException e) {
				System.err.println("숫자를 입력 하세요!!!\n");
			}
		}
	}
}












