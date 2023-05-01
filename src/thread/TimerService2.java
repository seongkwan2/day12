package thread;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JLabel;

class Timer extends Thread {
	JFrame frame;
	JLabel label;

	public Timer() {

		frame = new JFrame("label example");
		Container con = frame.getContentPane();

		label = new JLabel("안녕하세요");
		Font font = new Font("고딕", Font.BOLD, 32);
		label.setFont(font);

		con.add(label);

		frame.setLocation(1000,200);
		frame.setPreferredSize(new Dimension(500,200));
		frame.pack();


		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	public void run() {
	
		frame.setVisible(true);
		
		while(true) {
			long t = System.currentTimeMillis();
			SimpleDateFormat s = new SimpleDateFormat("aa hh시 mm분 ss초");
			String s_t = s.format(t);
			label.setText(s_t);
		}

	}
}













