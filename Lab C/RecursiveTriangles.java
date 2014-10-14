//package lab_c;

import javax.swing.JApplet;
import java.awt.*;
import java.lang.Math;

public class RecursiveTriangles extends JApplet
{
	final static double ANGLE = Math.PI/6;
	int INIT_HALF_LENGTH = 150;
	int INIT_P = 400;
	final static int MIN_LENGTH = 5;
	
	public void paint(Graphics g)
	{
		this.setSize(800,800);
		drawTriangles(g, INIT_P, INIT_P, INIT_HALF_LENGTH);
	}
	public static void drawTriangles(Graphics g, int x, int y, int l)
	{
		if(l>MIN_LENGTH)
		{
			int s = (int)(l/Math.cos(ANGLE));		//s is length from center to corner
			int h = (int)(l*Math.tan(ANGLE));		//h is height from center to base
			
			//draw lines
			g.drawLine( x-l , y+h ,  x  , y-s);		//from bottom left to top
			g.drawLine(  x  , y-s , x+l , y+h);		//from top to bottom right
			g.drawLine( x+l , y+h , x-l , y+h);		//from bottom right to bottom left
			
			/*recursions in order:
			  top, right, and left triangles*/
			drawTriangles(g,  x  , y-s , l/2);
			drawTriangles(g, x-l , y+h , l/2);
			drawTriangles(g, x+l , y+h , l/2);
		}
	}
}