/**
 * MickyBox.java
 */
package assignment1_Graphics;

/**
 * @author Nora P.
 * @version 14.04.20
 * ITC 155 Data Systems
 * Description: Building Java Programs, 5th ed. Pg 232 Ex. 1 
 * 				Utilizes DrawingPanel class to display a window with a yellow background,
 * 				a red box with two blue circles & a black line across the middle.
 */

import java.awt.*; // for Color class and Graphics object
public class MickyBox {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// instantiate new DrawingPanel, set background and get Graphics class instance 
		DrawingPanel panel = new DrawingPanel(220, 150);
		panel.setBackground(Color.YELLOW);
		Graphics g = panel.getGraphics();
		
		//set colors for each element prior to using fill/draw methods
		g.setColor(Color.BLUE);
		g.fillOval(50,  25, 40, 40);
		g.fillOval(130,  25, 40, 40);
		g.setColor(Color.RED);
		g.fillRect(70, 45, 80, 80);
		g.setColor(Color.BLACK);
		g.drawLine(70, 85, 150, 85);	

	}
}
	

