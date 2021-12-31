package br.com.javacodex.cap4;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Exerc4_17_Sobre  extends JFrame{
	
	private Container container;
	private Exerc4_17 janelaPrincipal;

	
	public Exerc4_17_Sobre(){
		super("Sobre..");
		
		container = this.getContentPane();
		
		container.setLayout(new GridLayout(3,1));
		container.add(new JLabel("Programa para calcular Autonomia de um Carro"));
		container.add(new JLabel("Desenvolvedor: Alex Ferreira Leite"));
		container.add(new JLabel("Email: alex.f.leite@gmail.com"));
		
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		//this.setSize(480, 120);
		this.pack();
		//this.setResizable(false);
		this.setLocationRelativeTo(null);
		
		//this.setExtendedState(JFrame.MAXIMIZED_BOTH);		
		this.setVisible(true);
		
	}
}
