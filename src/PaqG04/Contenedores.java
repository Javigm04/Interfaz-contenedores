package PaqG04;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Contenedores extends JFrame{
    private JButton mapaButton;
    private JButton desapilarButton;
    private JButton mostrarDatosButton;
    private JButton apilarButton;
    private JTextField id;
    private JTextField peso;
    private JTextField prioridad;
    private JTextField resultados;
    private JTextField descripcion;
    private JTextField empresaenvia;
    private JTextField empresarecibe;
    private JTextField textField8;
    private JTextField texto2;
    private JPanel Contenedores;
    private JButton contenedorPorPaisButton;
    private JTextField pais;
    private JTextField aduana;
    private JTextPane textPane1;

    Contenedores(){
        setTitle("Contenedores");
        setSize(1000,700);
        setDefaultCloseOperation(JInternalFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setContentPane(Contenedores);
        Hub Valencia=new Hub(10,12);

        apilarButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
            }
        });
        mapaButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                textPane1.setText(Valencia.toString());
            }
        });
        mostrarDatosButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
            }
        });
        contenedorPorPaisButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                textPane1.setText(Valencia.calcularContenedoresDeterminadoPais(pais.getText()));
            }
        });
        desapilarButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }
        });
    }
    public static void main(String[] args) {
        Contenedores contenedores=new Contenedores();
    }
}
