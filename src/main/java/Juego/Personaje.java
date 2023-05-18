package Juego;

import java.awt.*;

public class Personaje extends Canvas {

    private int widthPersonaje = 50;
    private int heigthPersonaje = 100;

    private int posicionPersonajeX, posicionPersonajeY;

    public Personaje(int widthPanel, int heigthPanel) {
        setPreferredSize(new Dimension(widthPanel, heigthPanel));
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.green);



    }
}
