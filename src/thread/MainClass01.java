package thread;
//쓰레드를 상속하면 개별적으로 돌아간다.

class A01 extends Thread{	//쓰레드상속
	public void run() {
		for(int i = 0; i<100; i++) {
			System.out.println(i+".A01");
		}
	}
}

class B01 extends Thread{	//쓰레드상속
	public void run() {
		for(int i = 0; i<100; i++) {
			System.out.println(i+".BBB01");
		}
	}
}
public class MainClass01 {
	public static void main(String[] args) {
		A01 a = new A01();
		B01 b = new B01();
		//a.run();
		//b.run();
		a.start();
		b.start();
		System.out.println("main 종료 ===");

	}
}