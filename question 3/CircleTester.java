import java.awt.*;
import javax.swing.*;

public class CircleTester {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		final int FIELD_WIDTH = 20;
		JTextField textField = new JTextField(FIELD_WIDTH);
		frame.setSize(500, 500);
		
		CircleIcon aCircle = new CircleIcon(50);
		JLabel label = new JLabel(aCircle);
		label.setPreferredSize(new Dimension(100, 100));
		
		JButton green = new JButton("Green");
		green.addActionListener(event -> {
			aCircle.setColor(Color.green);
			label.repaint();
		});
		JButton red = new JButton("Red");
		red.addActionListener(event -> {
			aCircle.setColor(Color.red);
			label.repaint();
		});
		JButton blue = new JButton("Blue");
		blue.addActionListener(event -> {
			aCircle.setColor(Color.blue);
			label.repaint();
		});
		

		textField.setText("Choose a Color!");
		
		frame.setLayout(new FlowLayout());
		frame.add(green);
		frame.add(red);
		frame.add(blue);
		frame.add(textField);
		frame.add(label);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}

}
