package ColorView;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics2D;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

import com.sun.javafx.geom.Rectangle;
import com.sun.prism.BasicStroke;
import com.sun.p
rism.Graphics;

public class DrawingPanel extends JPanel
{
	private ArrayList<Rectangle> RectangleList;
	private ArrayList<Rectangle> squareList;
	private DrawingController baseController;
	private Component shapePanel;
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
	this.add(addRectangleButton);//add all the buttons
	this.add(addPolygonButton);
	this.add(shapePanel);
	this.add(clearButton);
}

	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.WEST, addRectangleButton, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, addRectangleButton, -40, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, addPolygonButton, 10, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, addPolygonButton, -30, SpringLayout.NORTH, this);
		
		baseLayout.putConstraint(SpringLayout.NORTH, shapePanel, 50, SpringLayout.NORTH,this);
		baseLayout.putConstraint(SpringLayout.WEST, shapePanel, 50, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, shapePanel, 350, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, shapePanel, -50, SpringLayout.EAST, this);
	}

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