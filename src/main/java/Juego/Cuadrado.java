package Juego;
import javax.swing.*;
import java.awt.*;

public class Cuadrado extends Canvas {
    private int widthCuadrado = 100;
    private int heightCuadrado = 100;

    private int incremento = 20;
    private int movimientoIncremento = 0;

    int posicionInicialX, posicionInicialY;

    public Cuadrado(int widthPanel, int heightPanel) {
        setPreferredSize(new Dimension(widthPanel, heightPanel));
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.red);

        posicionInicialX = (getWidth() - movimientoIncremento) - widthCuadrado - 1;
        posicionInicialY = getHeight() - heightCuadrado - 1;

//        System.out.println("GetAncho: " + getWidth());
//        System.out.println("GetAlto: " + getHeight());

//        System.out.println("Pos y:" + posicionInicialY);


        int ancho = Math.min(widthCuadrado, getWidth());
        int altura = Math.min(heightCuadrado, getHeight());
//        System.out.println("Ancho del cuadrado: " + ancho);
//        System.out.println("Alto del cuadrado: " + altura);

        System.out.println("Posicion x:" + posicionInicialX);
        g.fillRect(posicionInicialX, posicionInicialY, ancho, altura);
        movimientoIncremento += incremento;
    }
}
