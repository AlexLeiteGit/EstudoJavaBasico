package br.com.javacodex.cap4;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class Exerc4_17 extends JFrame implements ActionListener{
		
	private JButton btCalcular;
    private JButton btLimpar;
    private JTextField tfGasolina;
    private JTextField tfKilometros;
    private JLabel lbResultCalculo;
    private JMenuBar barraMenu;
    private JMenu mnArquivo;
    private JMenu mnAjuda;
    private JMenuItem miNovo;
    private JMenuItem miSair;
    private JMenuItem miSobre;
		
		private Container container;
		
		public Exerc4_17() {
			
			super("Kilometros Por Litro");
			
			container = this.getContentPane();
			container.setLayout(new FlowLayout());
			
			btCalcular = new JButton("Calcular");
			btLimpar = new JButton ("Limpar");
			
			tfGasolina = new JTextField(10);
			tfKilometros = new JTextField(10);
			
			lbResultCalculo = new JLabel ("0.0");
			
			barraMenu = new JMenuBar();
			mnArquivo = new JMenu("Arquivo");
			mnAjuda = new JMenu("Ajuda");
			miNovo = new JMenuItem("Novo");
			miSair = new JMenuItem("Sair");
			miSobre = new JMenuItem("Sobre");
			barraMenu.add(mnArquivo);
			barraMenu.add(mnAjuda);
			mnArquivo.add(miNovo);
			mnArquivo.add(miSair);
			mnAjuda.add(miSobre);
			
			this.setJMenuBar(barraMenu);
			
			lbResultCalculo.setForeground(Color.WHITE);
			JLabel gas = new JLabel("Gasolina: ");
			gas.setForeground(Color.WHITE);
			container.add(gas);
			container.add(tfGasolina);
			JLabel km = new JLabel("Kilometros: ");
			km.setForeground(Color.WHITE);
			container.add(km);
			container.add(tfKilometros);
			container.add(btCalcular);
			JLabel auto = new JLabel("Autonomia: ");
			auto.setForeground(Color.WHITE);
			container.add(auto);
			container.add(lbResultCalculo);
			container.add(btLimpar);
			
			container.setBackground(Color.BLUE);
			
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			btCalcular.addActionListener(this);
			btLimpar.addActionListener(this);
			miNovo.addActionListener(this);
			miSair.addActionListener(this);
			miSobre.addActionListener(this);
			
			this.pack();
			this.setLocationRelativeTo(null);
			
			this.setVisible(true);
		}
		
		public static void main(String[] args) {
			new Exerc4_17();
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == btCalcular) {
				calcular();
			} else if(e.getSource() == btLimpar || e.getSource() == miNovo) {
				limpar();
			} else if(e.getSource() == miSair) {
				System.exit(0);
			} else if (e.getSource() == miSobre) {
				//JanelaSobre js = new JanelaSobre();
				Exerc4_17_Sobre sobre = new Exerc4_17_Sobre();
			}
			
		}
		
		private void limpar() {
			tfGasolina.setText("");
			tfKilometros.setText("");
			lbResultCalculo.setText("");
			
		}

		private void calcular() {
			
			if(isCamposConsistentes()) {
			//entrada
			int a = Integer.parseInt(tfGasolina.getText());
			int b = Integer.parseInt(tfKilometros.getText());
					
			if (a <= 0 || b <= 0 ) {
				JOptionPane.showMessageDialog(this, "Impossível calcular a autonomia de seu veículo");
			} else {
				//processamento
				double autonomia = a / b;
				//saída
				lbResultCalculo.setText(String.valueOf(autonomia));
			}
			} else {
				JOptionPane.showMessageDialog(this, "Campos Inconsistentes");
			}
		}

		private boolean isCamposConsistentes() {
			String a = tfGasolina.getText().trim();
			String b = tfKilometros.getText().trim();

			
			if(a.equals("")) {
				tfGasolina.requestFocus();
				return false;
			} else if (b.equals("")) {
				tfKilometros.requestFocus();
				return false;
			}
			
			try {
				Double.parseDouble(a);
				Double.parseDouble(b);
			} catch (Exception e) {
				tfGasolina.requestFocus();
				tfKilometros.requestFocus();
				return false;
			}
			
			return true;
		}

		public JTextField getTfGasolina() {
			return tfGasolina;
		}

		public JTextField getTfKilometros() {
			return tfKilometros;
		}

		public JLabel getLbResultCalculo() {
			return lbResultCalculo;
		}

		
}
