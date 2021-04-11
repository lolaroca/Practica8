package src.ui;

import src.dominio.Figura;
import javax.swing.*;

public class Dibujo extends JFrame
{
	 Lienzo lienzo;

	public Dibujo()
	{
		super("Dibujo");
		lienzo = new Lienzo();
		lienzo.setSize(800,600);
		this.add(lienzo);
		this.pack();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	/** 
		Pinta el cuadrado recibido por el App y actualiza el lienzo (canvas)
	 * @param cuadrado cuadrado a pxºintar
	 */
	public void pintar(String grupo, Figura figura)
	{
		lienzo.pintar(grupo, figura);
		lienzo.repaint();
	}
	public void pintar(JButton boton)
	{
		lienzo.addButton(boton);
		lienzo.repaint();
	}


	public void ocultarGrupo(String grupo)
	{
		lienzo.setVisibleGrupo(grupo, false);
		lienzo.repaint();
	}

	public void mostrarGrupo(String grupo)
	{
		lienzo.setVisibleGrupo(grupo, true);
		lienzo.repaint();
	}	

	public void ocultarTodasFiguras()
	{
		lienzo.setVisibleTodasFiguras(false);
		lienzo.repaint();
	}

	public void mostrarTodasFiguras()
	{
		lienzo.setVisibleTodasFiguras(true);
		lienzo.repaint();
	}		
	

}