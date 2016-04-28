package ColorView;
import java.awt.*;
import java.awt.geom.*;
import java.util.ArrayList;
/**
 * 
 * @author ftha4681
 * @version 0.x 4/25/16
 */

public class ShapePanel extends JPanel
{
	private ArrayList<Rectangle> rectangleList;
	private ArrayList<Ellipse2D> ellipseList;
	private ArrayList<Ellipse2D> circleList;
	private ArrayList<Polygon> triangleList;
	private ArrayList<Polygon> polygonList;
	
	public ShapePanel()
	{
		triangleList = new ArrayList<Polygon>();
		polygonList = new ArrayList<Polygon>();
		rectangleList = new ArrayList<Rectangle>();
		squareList = new ArrayList<Rectangle>();
		circleList  new ArrayList<Ellipse2D>();
		ellipseList = new ArrayList<Ellipse2D>();
	}
	
}

setupPanel();
{
	
}

setupListeners();
{
	
}

setupLayout();
{
	
}


public void AddRectangle()
{
	
}

public void addSquare()
{
	
}

public void addEllipse()
{
	int xPosition = (int)(Math.random() * 1500);
	int yPosition = (int)(Math.random() * 1000);
}

public void addCircle()
{
	
}

public void addTriangle()
{
	int [] xPoints = new int[3];
	xPoints[0] = (int)(Math.random() * 150);
	xPoints[1] = (int)(Math.random() * 250);
	xPoints[2] = (int)(Math.random() * 350);
	
	int [] yPoints = {(int)(Math.random() * 450), (int)(Math.random() * 250)};
	
	Polygon triangle = new Polygon(xPoints, yPoints, 3);
	triangleList.add(triangle);
}


public void addPolygon()
{
	int numberOfSides = (int)(Math.random() *9 + 3);
	int [] xPoints = new int [numberOfSides];
	int [] yPoints = new int [numberOfSides];
	
	for(int side)
}

@Override
protected void paintComponent(Graphics currentGraphics)
{
	super.paintComponent(currentGraphics);
	Graphics2D mainGraphics = (Graphics2D) currentGraphics;
	//Loops to do lists.
	
	for(Polygon currentTriangle : triangleList)
	{
		int red = (int)(Math.random() * 256);
		int green = (int)(Math.random() * 256);
	}
}

public void clear()
{
	
	
}
