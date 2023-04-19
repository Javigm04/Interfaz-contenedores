package PaqG04;

import javax.swing.*;

public class Contenedores extends JFrame{
    private JButton mapaButton;
    private JButton desapilarButton;
    private JButton mostrarDatosButton;
    private JButton apilarButton;
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
    private JButton contenedorPorPaisButton;

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
