import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class CircleIcon implements Icon{
	private int width;
	private Color aColor;
	
	public void setColor(Color newColor) {
		aColor = newColor;
	}
	public CircleIcon(int aWidth) {
		width = aWidth;
		aColor = Color.red;
	}
	
	public int getIconWidth() {
		return width;
	}
	
	public int getIconHeight() {
		return width / 2;
	}

	public void paintIcon(Component c, Graphics g, int x, int y) {
		Graphics2D g2 = (Graphics2D) g;
		Ellipse2D.Double circle = new Ellipse2D.Double(x, y, 50, 50);
		g2.setPaint(aColor);
		g2.fill(circle);
	}

	
}
