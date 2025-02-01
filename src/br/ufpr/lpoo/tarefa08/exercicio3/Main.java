package br.ufpr.lpoo.tarefa08.exercicio3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    private JTextField textField1;
    private JButton converterButton;
    private double medidaLitros;
    private double medidaGaloes;
    private JLabel conversao;
    public JPanel content;

    public Main() {
        converterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    medidaLitros = Double.parseDouble(textField1.getText());
                    medidaGaloes = medidaLitros/3.785;
                    conversao.setText(medidaGaloes+" galões");
                } catch (NumberFormatException exception){
                    JOptionPane.showMessageDialog(null, "Valor inserido inválido!");
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Main");
        frame.setContentPane(new Main().content);
        Dimension dimension = new Dimension(350,300);
        frame.setMinimumSize(dimension);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
