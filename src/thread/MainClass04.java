package thread;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;

class A04 extends Thread{
	JFrame frame;
	JLabel label;

	public A04() {
		frame = new JFrame("label example");//시멘트바닥개념
		Container con = frame.getContentPane();	//장판개념

		label = new JLabel("안녕하세요"); //글자를 사용하겠다 선언
		label.setText("aaaaA"); //안에있는 글자 변경
		Font font = new Font("고딕", Font.ITALIC, 32); //글씨체, 기울임, 사이즈
		label.setFont(font);//위에서 설정한 폰트를 저장

		con.add(label);

		frame.setLocation(1000,200);	//창을 띄울 위치
		frame.setPreferredSize(new Dimension(500,200));	//창의 사이즈
		frame.pack();	//이걸 써줘야 setPreferredSize가 적용됨


		//frame.setVisible(true);	//창 띄우기
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//X버튼 누르면 동작 종료
		/*
		for(int i = 0; ;i++) {
			label.setText(i+".변경");
		}*/
	}
	public void run() {//무조건 run()이라는 이름을 사용해야함
		frame.setVisible(true);
		for(int i = 0; ;i++) {
			label.setText(i+".변경");

		}
	}
}
public class MainClass04{
	public static void main(String[] args) {
		A04 a = new A04();
		a.start();

		while(true) {
			System.out.println("입력");
			String s = new Scanner(System.in).next();
			System.out.println("출력 : "+s);

		}
	}
}



