package src.ui;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import src.dominio.Cuadrado;
import src.dominio.Circulo;

import javax.swing.*;
import java.awt.*;
import src.util.Util;

public class JVentanaDibujo
{

    public static void main( String[] args )
    {
        Dibujo dibujo = new Dibujo();

        Lienzo lienzo = new Lienzo();
        lienzo.setSize(800,600);

        JButton botonCuadrado = new JButton("Cuadrado");  //añado un boton
        botonCuadrado.setBounds(540,20,100, 30); //le doy unas medidas
        JButton botonCirculo= new JButton("Circulo");  //añado un boton
        botonCirculo.setBounds(438,20,100, 30); //le doy unas medidas


        //los cuadros de texto de coordenadas
        JTextField textoX1 = new JTextField(3); //añado una caja de texto, el 3 es la cantidad de caract
        textoX1.setText("");
        textoX1.setBounds(405, 25, 30, 20);

        JTextField textoX2 = new JTextField(3);
        textoX2.setText("");
        textoX2.setBounds(305, 25, 30, 20);

        JTextField textoX3 = new JTextField(3);
        textoX3.setText("");
        textoX3.setBounds(250, 25, 30, 20);

        JTextField textoX4 = new JTextField(50);
        textoX4.setText("rojo/verde/azul");
        textoX4.setBounds(130, 25, 90, 20);

        JTextField textoX5= new JTextField(5);
        textoX5.setText("si/no");
        textoX5.setBounds(60, 25, 33, 20);


        //añadir texto
        JLabel etiquetaX1 = new JLabel("lado/radio:");
        etiquetaX1.setBounds(338, 20, 60, 30);
        etiquetaX1.setLabelFor(textoX1); //le añado la etiqueta

        JLabel etiquetaX2 = new JLabel("Y:");
        etiquetaX2.setBounds(288, 20, 20, 30);
        etiquetaX2.setLabelFor(textoX2); //le añado la etiqueta

        JLabel etiquetaX3 = new JLabel("X:");
        etiquetaX3.setBounds(230, 20, 20, 30);
        etiquetaX3.setLabelFor(textoX3); //le añado la etiqueta

        JLabel etiquetaX4 = new JLabel("Color:");
        etiquetaX4.setBounds(95, 20, 50, 30);
        etiquetaX4.setLabelFor(textoX4); //le añado la etiqueta

        JLabel etiquetaX5 = new JLabel("Relleno: :");
        etiquetaX5.setBounds(10, 20, 60, 30);
        etiquetaX5.setLabelFor(textoX5); //le añado la etiqueta


        //lista de colores (no hay más opción)
        //String[] colores = {"Rojo", "Verde", "Azul", "Amarillo"};
        //JComboBox cbcolor = new JComboBox(colores);


        dibujo.add(botonCuadrado);
        dibujo.add(botonCirculo);

        dibujo.add(textoX1);
        dibujo.add(textoX2);
        dibujo.add(textoX3);
        dibujo.add(textoX4);
        dibujo.add(textoX5);

        dibujo.add(etiquetaX1);
        dibujo.add(etiquetaX2);
        dibujo.add(etiquetaX3);
        dibujo.add(etiquetaX4);
        dibujo.add(etiquetaX5);

        dibujo.add(lienzo);
        dibujo.pack();
        dibujo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        dibujo.setVisible(true);
        botonCuadrado.setVisible(true);
        botonCirculo.setVisible(true);
        textoX1.setVisible(true);
        textoX2.setVisible(true);
        textoX3.setVisible(true);
        textoX4.setVisible(true);
        textoX5.setVisible(true);
        etiquetaX1.setVisible(true);
        etiquetaX2.setVisible(true);
        etiquetaX3.setVisible(true);
        etiquetaX4.setVisible(true);
        etiquetaX5.setVisible(true);





        //TODO anyadir la lógica para pintar circulos*/

        botonCuadrado.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                boolean relleno = textoX5.getText().equals("si"); //si es si = true , cualquier otra cosa=false
                Color color;
                if  (textoX4.getText().equalsIgnoreCase("rojo"))
                    color= Color.RED;
                else if  (textoX4.getText().equalsIgnoreCase("azul"))
                    color= Color.BLUE;
                else
                    color=Color.GREEN;


                Cuadrado cuadradoAPintar = new Cuadrado(Integer.valueOf(textoX3.getText()), Integer.valueOf(textoX2.getText()), relleno, color, Integer.valueOf(textoX1.getText()));
                dibujo.pintar(lienzo,"Grupo Rojo", cuadradoAPintar);
            }
        });

        botonCirculo.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                boolean relleno = textoX5.getText().equals("si"); //si es si = true , cualquier otra cosa=false
                Color color;
                if  (textoX4.getText().equalsIgnoreCase("rojo"))
                    color= Color.RED;
                else if  (textoX4.getText().equalsIgnoreCase("azul"))
                    color= Color.BLUE;
                else
                    color=Color.GREEN;


                Circulo circuloAPintar = new Circulo(Integer.valueOf(textoX3.getText()), Integer.valueOf(textoX2.getText()), relleno, color, Integer.valueOf(textoX1.getText()));
                dibujo.pintar(lienzo,"Grupo Rojo", circuloAPintar);
            }
        });


    }
}