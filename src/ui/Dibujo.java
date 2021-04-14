package src.ui;

import src.dominio.Figura;
import javax.swing.*;

public class Dibujo extends JFrame
{

	public Dibujo()
	{
		super("Dibujo");
	}

	/**
	 Pinta el cuadrado recibido por el App y actualiza el lienzo (canvas)
	 * @param figura para pintar
	 */
	public void pintar(Lienzo lienzo, String grupo, Figura figura)
	{
		lienzo.pintar(grupo, figura);
		lienzo.repaint();
	}


	public void ocultarGrupo(Lienzo lienzo, String grupo)
	{
		lienzo.setVisibleGrupo(grupo, false);
		lienzo.repaint();
	}

	public void mostrarGrupo(Lienzo lienzo, String grupo)
	{
		lienzo.setVisibleGrupo(grupo, true);
		lienzo.repaint();
	}

	public void ocultarTodasFiguras(Lienzo lienzo)
	{
		lienzo.setVisibleTodasFiguras(false);
		lienzo.repaint();
	}

	public void mostrarTodasFiguras(Lienzo lienzo)
	{
		lienzo.setVisibleTodasFiguras(true);
		lienzo.repaint();
	}


}