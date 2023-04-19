package PaqG04;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Contenedores extends JFrame{
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
