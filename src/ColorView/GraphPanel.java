package ColorView;

import java.awt.*;
import javax.swing.JPanel;

/**
 * 
 * @author ftha4681
 *
 */
public class GraphPanel  extends JPanel
{
	//initialize graphSource here
	graphSource = new int [] {2, 4, 213, 10, 20, 12, 75};
	setupPanel();
	
}

private void setupPanel()
{
	
}

@Override
protected void paintComponent(Graphics currentGraphics)
{
	super.paintComponent(currentGraphics);
	
	Graphics2D mainGraphics = < graphSource.length; index++)
	{
		int height = this.getHeight()/graphSource.length;
		int width = graphSource[index];
		int xPosition = width * index;
		int yPosition = 0;
		
		int red = (int)(Math.random() * 256);
		int green = (int)(Math.random() * 256);
		int blue = (int)(Math.random() * 256);
		int alpha = (int)(Math.random() * 256);
		
		mainGraphics.setColor(new Color(red, green, blue, alpha));
		
		mainGraphics.fill(new Rectangle(xPosition, yPosition, width, height));
	}
}
}