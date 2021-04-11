package src.ui;
import src.dominio.Cuadrado;
import src.dominio.Circulo;

import javax.swing.*;
import java.awt.*;

public class JVentanaDibujo
{

    public static void main( String[] args )
    {
        Dibujo dibujo = new Dibujo();
        JButton bc = new JButton("Cuadrado");
        bc.setBounds(130,100,100, 40);//x axis, y axis, width, height
        dibujo.add(bc);
        dibujo.pintar(bc);
        bc.setVisible(true);

        Cuadrado c1 = new Cuadrado(500, 50, true, Color.RED, 200);
        dibujo.pintar("Grupo Rojo", c1);
        dibujo.pintar("Grupo Rojo", new Circulo(100, 20, true, Color.RED, 200));
        dibujo.pintar("Grupo Azul", new Cuadrado(100, 350, false, Color.BLUE, 200));
        dibujo.pintar("Grupo Azul", new Circulo(500, 350, true, Color.BLUE, 200));
        dibujo.pintar("Grupo Verde", new Cuadrado(10, 10, true, Color.GREEN, 70));
    }
}
