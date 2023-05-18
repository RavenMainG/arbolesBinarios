package Juego;
import javax.swing.*;
import java.awt.*;
import java.awt.Graphics;

public class Main {
    public static void main(String[] args) {
        int tamX = 1200;
        int tamY = 600;

        JFrame juego = new JFrame();
        juego.setTitle("Juego");
        juego.setSize(tamX, tamY);
        juego.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        juego.setVisible(true);
        juego.setResizable(false);

        Cuadrado c = new Cuadrado(tamX, tamY);
        juego.add(c);
        while(true) {
            c.repaint();

            try {
                Thread.sleep(500);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
