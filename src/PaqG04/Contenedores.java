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
    private JTextField Tpeso;
    private JTextField Tprioridad;
    private JTextField Tdescripcion;
    private JTextField Tempresaenvia;
    private JTextField Tempresarecibe;
    private JTextField textField8;
    private JTextField texto2;
    private JPanel Contenedores;
    private JButton contenedorPorPaisButton;
    private JTextField Tpais;
    private JTextPane textPane1;
    private JCheckBox checkPrueba;
    private JTextField Tcolumna;

    Contenedores(){
        setTitle("Contenedores");
        setSize(1000,700);
        setDefaultCloseOperation(JInternalFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setContentPane(Contenedores);
        //Creamos el hub con el que vamos a trabajar
        Hub Valencia=new Hub(10,12);

        apilarButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                //Pasamos los valores escritos a manos en la interfaz a su formato correspondiente
                int idCampo = Integer.parseInt(id.getText());
                double pesoCampo=Double.parseDouble(Tpeso.getText());
                String paisCampo=Tpais.getText();
                boolean aduanasCampo = checkPrueba.isSelected();
                int prioridadCampo = Integer.parseInt(Tprioridad.getText());
                String descripcionCampo=Tdescripcion.getText();
                String empresaEnviaCampo=Tempresaenvia.getText();
                String empresaRecibeCampo=Tempresarecibe.getText();
                Contenedor contenedor=new Contenedor(idCampo,pesoCampo,paisCampo,aduanasCampo,prioridadCampo,descripcionCampo,empresaEnviaCampo,empresaRecibeCampo);
                Valencia.apilarContenedor(contenedor);
                //Borramos los campos (preguntar mañana en clase)
                id.setText("");
                Tpeso.setText("");
                Tpais.setText("");
                Tprioridad.setText("");
                Tdescripcion.setText("");
                Tempresaenvia.setText("");
                Tempresarecibe.setText("");
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
                //Para mostrar los datos de un contenedor, cogemos el id del campo Id y llamamos a la función del hub
                int idCampo = Integer.parseInt(id.getText());
                textPane1.setText(Valencia.mostrarDatos(idCampo));
                id.setText("");
            }
        });
        contenedorPorPaisButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                //Para calcular el número de contenedores de un país, cogemos el texto del campo País y llamamos a la función
                //del hub.
                textPane1.setText(Valencia.calcularContenedoresDeterminadoPais(Tpais.getText()));
                Tpais.setText("");
            }
        });
        desapilarButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                //Paso columna string a int
                int columnaCampo=Integer.parseInt(Tcolumna.getText());
                //Llamo a desapilar
                Valencia.desapilar(columnaCampo);
                //Dejo campo vacío
                Tcolumna.setText("");
            }
        });
    }
    public static void main(String[] args) {
        Contenedores contenedores=new Contenedores();
    }
}
