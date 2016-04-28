package ColorView;

import java.awt.Color;
import java.awt.Graphics2D;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

import com.sun.javafx.geom.Rectangle;

public class DrawingPanel extends JPanel
{
	private ArrayList<Rectangle> RectangleList;
	private ArrayList<Rectangle> squareList;
	private DrawingController baseController;
	private ShapePanel shapePanel;
	private JButton addRectangleButton;
	private SpringLayout baseLayout;
}

public DrawingPanel(DrawingController baseController)
{
	this.baseController = baseController;
	baseLayout = new SpringLayout();
	addRectangleButton = new JButton("Add a Rectangle");
	
	setupPanel();
	setupLayout();
	setupListeners();
}

private void setupPanel()
{
	this.setLayout(baseLayout);
	this.setBackground(Color.DARK_GRAY);
	this.add(addRectangleButton);
}

	private void setupLayout()

	private void setupListeners()
	{
	
	}

	@Override
	protected void paintComponent(Graphics currentGraphics)
	{
		super.paintComponent(currentGraphics);
		
		Graphics2D mainGraphics = (Graphics2D) currentGraphics;
		mainGraphics.setStroke(new BasicStroke(20));
		mainGraphics.setColor(Color.ORANGE);
		mainGraphics.drawRect(50, 70, 200, 400);
		
		for(Rectangle current : rectangleList)
		{
			int red = (int)(Math.random() * 256);
			int green = (int)(Math.random() * 256);
			int blue = (int)(Math.random() * 256);
			
			mainGraphics.setColor(new Color(red, green, blue));
			mainGraphics.fill(current);
	}

}