package br.com.javacodex.cap4;

import javax.swing.JFrame;

public class Figura4_19 {

	public static void main(String[] args) {

		Figura4_18 panel = new Figura4_18();
		
		JFrame application = new JFrame();
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		application.add(panel);
		application.setSize(250, 250);
		application.setVisible(true);
	}

}
