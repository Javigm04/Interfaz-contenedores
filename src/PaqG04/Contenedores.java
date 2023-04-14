package PaqG04;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Contenedores extends JFrame{
    private JButton boton1;
    private JButton boton2;
    private JTextField texto1;
    private JTextField texto2;
    private JLabel titulo;
    private JPanel Contenedores;
    private JLabel Contenedor;
    private JButton apilarButton;

    Contenedores(){
        setTitle("Contenedores");
        setSize(400,300);
        setDefaultCloseOperation(JInternalFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setContentPane(Contenedores);
        boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        apilarButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                System.out.println("Me has clikado");
            }
        });
    }


    public static void main(String[] args) {
        Contenedores contenedores=new Contenedores();
    }
}
