package boletin27;

import java.awt.FlowLayout;
import javax.swing.*;

public class Paneles{

    private JFrame frame;
    private JPanel panel, panel2;
    private JButton boton1, boton2;
    private JTextArea tarea;
    private JTextField tfield1, tfield2;
    private JLabel label1, label2;
    private JList list;


    public void componentes(){
        frame = new JFrame("Boletin 26");
        panel = new JPanel();
        panel2 = new JPanel();
        boton1 = new JButton("PREMER");
        boton2 = new JButton("LIMPIAR");
        tarea = new JTextArea();
        tfield1 = new JTextField();
        tfield2 = new JTextField();
        label1 = new JLabel("NOME");
        label2 = new JLabel("PASSWORD");
        frame.setSize(700, 1200);
        panel.setSize(700, 600);
        panel2.setSize(700, 600);
    }

    public void carVentanta(){
        panel.setLayout(null);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    public void form(){
        this.componentes();
        boton1.setBounds(150, 470, 130, 45);
        boton2.setBounds(450, 470, 130, 45);
        tarea.setBounds(120, 300, 400, 100);
        label1.setBounds(130, 100, 100, 40);
        label2.setBounds(130, 170, 100, 40);
        tfield1.setBounds(330, 100, 200, 40);
        tfield2.setBounds(330, 170, 200, 40);
        list.setSize(100, 300);
        panel2.add(list);
        panel.add(tfield1);
        panel.add(tfield2);
        panel.add(tarea);
        panel.add(label1);
        panel.add(label2);
        panel.add(boton1);
        panel.add(boton2);
        frame.add(panel);
        frame.add(panel2);
        this.carVentanta();
    }
}
