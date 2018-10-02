import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class CarIcon implements Icon{
	private int width;
	private int height = width / 2;
	private double ZoomMultiplier = 1;
	
	public void ZoomIn() {
		ZoomMultiplier = ZoomMultiplier * 2;

	}
	public void ZoomOut() {
		ZoomMultiplier = ZoomMultiplier / 2;
	}
	public CarIcon(int aWidth) {
		width = aWidth;
	}
	
	public int getIconWidth() {
		return width;
	}
	
	public int getIconHeight() {
		return width / 2;
	}
	
	public int setIconHeight(int height) {
		this.height = height / 2;
		System.out.println("height: " + this.height);
		return this.height;
	}
	
	public int setIconWidth(int width) {
		this.width = width;
		System.out.println("width: " + this.width);
		return this.width;
	}
	

	public void paintIcon(Component c, Graphics g, int x, int y) {
		Graphics2D g2 = (Graphics2D) g;
		Rectangle2D.Double body = new Rectangle2D.Double(x * ZoomMultiplier, (y + width / 6) * ZoomMultiplier, (width - 1) * ZoomMultiplier, (width / 6) * ZoomMultiplier);
		Ellipse2D.Double frontTire = new Ellipse2D.Double((x + width / 6) * ZoomMultiplier, (y + width / 3) * ZoomMultiplier, (width / 6) * ZoomMultiplier, (width / 6) * ZoomMultiplier);
		Ellipse2D.Double rearTire = new Ellipse2D.Double((x + width * 2 / 3) * ZoomMultiplier, (y + width / 3) * ZoomMultiplier, (width / 6) * ZoomMultiplier, (width / 6) * ZoomMultiplier);

		// The bottom of the front windshield
		Point2D.Double r1 = new Point2D.Double((x + width / 6) * ZoomMultiplier, (y + width / 6) * ZoomMultiplier);
		// The front of the roof
		Point2D.Double r2 = new Point2D.Double((x + width / 3) * ZoomMultiplier, y * ZoomMultiplier);
		// The rear of the roof
		Point2D.Double r3 = new Point2D.Double((x + width * 2 / 3) * ZoomMultiplier, y * ZoomMultiplier);
		// The bottom of the rear windshield
		Point2D.Double r4 = new Point2D.Double((x + width * 5 / 6) * ZoomMultiplier, (y + width / 6) * ZoomMultiplier);
		Line2D.Double frontWindshield = new Line2D.Double(r1, r2);
		Line2D.Double roofTop = new Line2D.Double(r2, r3);
		Line2D.Double rearWindshield = new Line2D.Double(r3, r4);

		g2.draw(body);
		g2.setColor(Color.blue);
		g2.fill(body);
		g2.draw(frontTire);
		g2.setColor(Color.black);
		g2.fill(frontTire);
		g2.draw(rearTire);
		g2.fill(rearTire);
		g2.draw(frontWindshield);
		g2.draw(roofTop);
		g2.draw(rearWindshield);
	}

	
}
