package PaqG04;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Contenedores extends JFrame{
    private JButton button17;
    private JButton button19;
    private JButton button20;
    private JButton button18;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JTextField textField7;
    private JTextField textField8;
    private JTextField texto2;
    private JPanel Contenedores;

    Contenedores(){
        setTitle("Contenedores");
        setSize(400,300);
        setDefaultCloseOperation(JInternalFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setContentPane(Contenedores);

    }
    public static void main(String[] args) {
        Contenedores contenedores=new Contenedores();
    }
}
