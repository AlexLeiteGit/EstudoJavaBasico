package br.com.javacodex.cap4;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Exerc4_19 extends JFrame implements ActionListener{
	
	private JButton btIncluir;
	private JButton btCalcular;
	private JButton btLimpar;	
	
	private JTextField tfItem;
	private JTextField tfNome;
	
	private JLabel lbResultado;
	
	private JMenuBar barraMenu;
	
	private JMenu mnArquivo;
	private JMenu mnAjuda;
	
	private JMenuItem miNovo;
	private JMenuItem miSair;
	private JMenuItem miSobre;
	
	private Container container;
	
	ArrayList<Exerc4_19_Vendas> lista = new ArrayList<Exerc4_19_Vendas>();
	
	public Exerc4_19() {
		super("Controle de Comissões");
		
		JFrame painelPrincipal = new JFrame();
		
		container = this.getContentPane();
		container.setLayout(new FlowLayout());
		
		btIncluir = new JButton("INCLUIR");
		btCalcular = new JButton("CALCULAR");
		btLimpar = new JButton("LIMPAR");
		
		tfItem = new JTextField(15);
//		tfNome = new JTextField(15);
		
		lbResultado = new JLabel("0.0");
		
		barraMenu = new JMenuBar();
		mnArquivo = new JMenu("ARQUIVO");
		mnAjuda = new JMenu("AJUDA");
		miNovo = new JMenuItem("Novo");
		miSair = new JMenuItem("Sair");
		miSobre = new JMenuItem("Sobre");
		
		barraMenu.add(mnArquivo);
		barraMenu.add(mnAjuda);
		mnArquivo.add(miNovo);
		mnArquivo.add(miSair);
		mnAjuda.add(miSobre);
		
		this.setJMenuBar(barraMenu);
		
		lbResultado.setForeground(Color.WHITE);
		JLabel item = new JLabel("Item: ");
		item.setForeground(Color.WHITE);
		container.add(item);
		container.add(tfItem);
		
//		JLabel nome = new JLabel("Nome: ");
//		nome.setForeground(Color.WHITE);
//		container.add(nome);
//		container.add(tfNome);
		
		container.add(btIncluir);
		container.add(btCalcular);
		
		container.add(lbResultado);
		
		container.add(btLimpar);
		
		container.setBackground(Color.ORANGE);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		btIncluir.addActionListener(this);
		btCalcular.addActionListener(this);
		btLimpar.addActionListener(this);
		miNovo.addActionListener(this);
		miSair.addActionListener(this);
		miSobre.addActionListener(this);
		
		this.setSize(640,480);
//		this.pack();
		this.setLocationRelativeTo(null);
		
		this.setVisible(true);
	}
	

	public static void main(String[] args) {
		
		new Exerc4_19();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btIncluir) {
			incluir();
		} if (e.getSource() == btCalcular) {
			calcular();
		} if (e.getSource() == btLimpar || e.getSource() == miNovo) {
			limpar();
		} if (e.getSource() == miSair) {
			System.exit(0);
		} if (e.getSource() == miSobre) {
			sobre();
		}
		
	}


	private void sobre() {
		String sobre = String.format("%n%nProgramador: Alex Ferreira Leite %nEmail: alex.f.leite@gmail.com%n%n");
		JOptionPane.showMessageDialog(null,sobre);
	}


	private void limpar() {
//		tfNome.setText("");
		tfItem.setText("");		
	}


	private void calcular() {
		
		double soma = demonstrar();
		
		double comissao = (soma * 0.09);
		
		double remuneracaoTotal = 200.00 + comissao;
		
		lbResultado.setText(String.valueOf(remuneracaoTotal));
		
 
		
		JOptionPane.showMessageDialog(null, remuneracaoTotal);
		
	}
	
	public double demonstrar() {
		
		
		double soma = 0.0;
		
		for(Exerc4_19_Vendas objeto : lista) {
			soma += objeto.getValor();
		}
		
		System.out.println(soma);
		
		return soma;
	}



	private void incluir() {
		
		String item = null;

		do {
			item = JOptionPane.showInputDialog("Inseria o item vendido: ");
			if(item.isBlank() || item.isEmpty()) {
				item = JOptionPane.showInputDialog("Inseria o item vendido: ");
			} else {
				int comprado = Integer.parseInt(item);
				Exerc4_19_Vendas objeto = new Exerc4_19_Vendas(comprado);
				lista.add(objeto);
				tfItem.setText("");
//				tfNome.setText("");
//				item = null;
			}			
		} while (!item.equals("-1"));
		
		for(Exerc4_19_Vendas objeto : lista) {
			System.out.println(objeto);
		}
		
	}

}
