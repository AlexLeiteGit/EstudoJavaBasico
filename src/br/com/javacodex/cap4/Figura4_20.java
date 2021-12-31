package br.com.javacodex.cap4;

import java.awt.Graphics;

import javax.swing.JPanel;

public class Figura4_20 extends JPanel{
	
	public void paintComponent( Graphics g)
	{
		//Chama paintComponent para assegurar que o painel seja exibido corretamente
		super.paintComponent(g);
		
		int width = 0;// coordenados x
		int height = 0 ;// coordenadas y
		int linhas = 1 ; 
		
		while ( linhas <= 50) 
		{
			width += getWidth() / 15 ;
			g.drawLine(0, width, height, getHeight());
			height += getHeight() / 15 ;
			linhas++ ;
			
		}//fim do while
	}//fim do paintComponet

}
