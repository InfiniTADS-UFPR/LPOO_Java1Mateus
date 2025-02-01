package br.ufpr.lpoo.tarefa08.exercicio2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Main {
    private JPanel panel1;
    private JTextField nome;
    private JTextField sobrenome;
    private JLabel nomeConcatenado;

    public Main() {
        KeyListener listener = new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                nomeConcatenado.setText(nome.getText() +" "+ sobrenome.getText());
            }
        };
        nome.addKeyListener(listener);
        sobrenome.addKeyListener(listener);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Main");
        frame.setContentPane(new Main().panel1);
        Dimension dimension = new Dimension(400,300);
        frame.setMinimumSize(dimension);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
