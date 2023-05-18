package visual;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.*;




public class Main extends JFrame{

    private JTextField valor1;
    private JTextField valor2;

    private JLabel resultado;

    public Main() {
        setTitle("Interfaz sencilla");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);
    }

//    @Override
//    public void paint(Graphics g) {
//        super.paint(g);
//        g.drawOval(100, 100, 100, 100);
//    }

    public void agregarCajaTexto() {
        valor1 = new JTextField();
        valor1.setBounds(50, 70, 200, 30);
        add(valor1);

        valor2 = new JTextField();
        valor2.setBounds(50, 110, 200, 30);
        add(valor2);
    }

    public void agregarLabels() {
        resultado = new JLabel("Resultado: ?");
        resultado.setBounds(50, 30, 100, 30);
        add(resultado);
    }

    public void agregarBoton() {
        JButton boton = new JButton("Sumar");
        boton.setBounds(50, 160, 100, 30);
        add(boton);

        boton.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        int valorInt1 = Integer.parseInt(valor1.getText());
                        int valorInt2 = Integer.parseInt(valor2.getText());
                        int resultadoInt = valorInt1 + valorInt2;
                        resultado.setText("Resultado: " + resultadoInt);
                    }
                }
        );
    }



    public static void main(String[] args) {
        Main interfaz = new Main();
        interfaz.agregarCajaTexto();
        interfaz.agregarLabels();
        interfaz.agregarBoton();
    }

}
