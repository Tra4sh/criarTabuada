package br.senai.sp.jandira.view;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class TelaTabuada {
    private JFrame frame = new JFrame();
    private JPanel painelTitulo = new JPanel();
    private JLabel labelTitulo = new JLabel("Tabuada Java");
    private JLabel labelNumero = new JLabel("Numero");
    private JTextField txtNumero = new JTextField();
    private JLabel labelMultiplicado = new JLabel("Multiplicado");
    private JTextField txtMultiplicado = new JTextField();
    private JButton btnCalcular = new JButton("Calcular");
    private JButton btnLimpar = new JButton("Limpar");
    private JTextArea linhasTabuada = new JTextArea();
    int peso = 0;
    double altura = 0.0;
    private boolean numero1;

    public TelaTabuada() {
        this.criarTela();
    }

    private void criarTela() {
        this.painelTitulo.setBounds(0, 0, 500, 50);
        this.painelTitulo.setBackground(new Color(0, 0, 0));
        this.painelTitulo.setLayout((LayoutManager)null);
        this.frame.setTitle("A Tabuada");
        this.frame.setSize(500, 500);
        this.frame.setLayout((LayoutManager)null);
        this.frame.setDefaultCloseOperation(2);
        this.labelTitulo.setBounds(150, 25, 1000, 20);
        this.labelTitulo.setFont(new Font("Arial", 1, 30));
        this.labelTitulo.setForeground(new Color(255, 255, 255));
        this.labelNumero.setBounds(10, 30, 100, 100);
        this.labelNumero.setFont(new Font("Arial", 1, 24));
        this.txtNumero.setBounds(10, 100, 250, 25);
        this.labelMultiplicado.setBounds(10, 95, 200, 100);
        this.labelMultiplicado.setFont(new Font("Arial", 1, 24));
        this.txtMultiplicado.setBounds(10, 170, 250, 25);
        this.btnCalcular.setBounds(10, 200, 130, 30);
        this.btnLimpar.setBounds(145, 200, 130, 30);
        this.frame.getContentPane().add(this.labelMultiplicado);
        this.frame.getContentPane().add(this.txtMultiplicado);
        this.frame.getContentPane().add(this.txtNumero);
        this.frame.getContentPane().add(this.labelNumero);
        this.frame.getContentPane().add(this.labelTitulo);
        this.frame.getContentPane().add(this.painelTitulo);
        this.frame.getContentPane().add(this.btnCalcular);
        this.frame.getContentPane().add(this.btnLimpar);
        this.frame.setVisible(true);
    }
    private void calcularTabuada() {
        try {
            int mutlipicando = Integer.parseInt(txtMultiplicado.getText());
            int numero01 = Integer.parseInt(txtNumero.getText());

            int contador = 0;
            criarTabuada.setMultiplicando(mutlipicando);
            criarTabuada.setNumero1(numero01);

            List<String> listaTabuada = criarTabuada.gerarTabuada();

            for (String linha : listaTabuada) {
                if (contador < 20) {
                    txtAreaTabuada1.append(linha + "\n");
                    contador++;
                }
            }
        }catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(
                    null,
                    "Insira um valor válido!",
                    "Erro de entrada",
                    JOptionPane.ERROR_MESSAGE
            );
        }

    }
}
