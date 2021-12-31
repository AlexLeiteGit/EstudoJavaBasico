package br.com.javacodex.cap4;

import javax.swing.JFrame;

public class Figura4_20Test {

	public static void main(String[] args) {
		
		//cria um painel para o nosso desenho
		Figura4_20  panel = new Figura4_20() ;
				
				//cria uma janela
				JFrame app = new JFrame();
				
				//configura o frame para ser encerrado.
				app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
				//adicona  panel ao frame
				
				app.add(panel);//adicona panel ao frame
				app.setSize(250 , 250 ); //tamanho da janela
				app.setVisible(true);//torna o frame visivel
				app.setTitle("DrawPanel A");//adiciona titulo
				

	}

}
