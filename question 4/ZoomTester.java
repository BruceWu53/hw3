import java.awt.*;
import javax.swing.*;

public class ZoomTester {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		CarIcon car1 = new CarIcon(100);
		
		frame.setSize(1000, 1000);
		frame.setMinimumSize(new Dimension(25, 25));
		frame.setMaximumSize(new Dimension(1000, 1000));
		
		JLabel label = new JLabel(car1);
		label.setPreferredSize(new Dimension(500, 500));
		label.setMinimumSize(new Dimension(25, 25));
		label.setMaximumSize(new Dimension(700, 700));
		
		JButton ZoomIn = new JButton("Zoom In");
		ZoomIn.addActionListener(event -> {
			car1.ZoomIn();
			label.setPreferredSize(new Dimension(car1.setIconWidth(car1.getIconWidth() * 2), car1.setIconHeight(car1.getIconHeight() * 2)));
			frame.setPreferredSize(new Dimension(car1.getIconWidth() * 2,car1.getIconHeight() * 2));
			label.repaint();
		});
		JButton ZoomOut = new JButton("Zoom Out");
		ZoomOut.addActionListener(event -> {
			car1.ZoomOut();
			label.setPreferredSize(new Dimension(car1.setIconWidth(car1.getIconWidth() / 2), car1.setIconHeight(car1.getIconHeight() / 2)));
			frame.setPreferredSize(new Dimension(car1.getIconWidth() / 2,car1.getIconHeight() / 2));
			label.repaint();
		});
		
		frame.setLayout(new FlowLayout());
		frame.add(ZoomOut);
		frame.add(ZoomIn);
		frame.add(label);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

}
