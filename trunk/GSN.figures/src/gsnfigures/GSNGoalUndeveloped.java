package gsnfigures;

import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;

public class GSNGoalUndeveloped extends Figure {
	
	@Override
	public void paint(Graphics graphics) {
		
		Rectangle r = getBounds();
		
		// Define the points of a parallelogram
		Point p1 = new Point(r.x+r.width/8, r.y);
		Point p2 = new Point(r.x + r.width, r.y);
		Point p3 = new Point(r.x, r.y + r.height);
		Point p4 = new Point(r.x + 7*r.width/8, r.y + r.height);
		
		Point p5 = new Point(r.x+3*r.width/8, r.y+r.height);
		Point p6 = new Point(r.x + 5*r.width/8, r.y+r.height);
		Point p7 = new Point(r.x+3*r.width/8, r.y + r.height/2);
		Point p8 = new Point(r.x + 5*r.width/8, r.y + r.height/2);
		
		PointList pointList = new PointList();
		pointList.addPoint(p1);
		pointList.addPoint(p2);
		pointList.addPoint(p3);
		pointList.addPoint(p4);		

		pointList.addPoint(p5);
		pointList.addPoint(p6);
		pointList.addPoint(p7);
		pointList.addPoint(p8);	
		// Fill the shape
		graphics.fillPolygon(pointList);
		
		// Draw the outline
		graphics.drawLine(p1, p2);
		graphics.drawLine(p1, p3);
		graphics.drawLine(p3, p4);
		graphics.drawLine(p2, p4);
	
		// Draw the outline
		graphics.drawLine(p5, p6);
		graphics.drawLine(p5, p8);
		graphics.drawLine(p7, p8);
		graphics.drawLine(p6, p8);
		
		
		
		// Move the first label to the center of the parallelogram
		WrappingLabel label = (WrappingLabel) getChildren().get(0);
		LayoutUtil.moveToCenterAndUp(label, this, graphics);
		label.paint(graphics);
		// Move the second label to the center of the parallelogram
		label = (WrappingLabel) getChildren().get(1);
		LayoutUtil.moveToCenterAndDown(label, this, graphics);
		label.paint(graphics);
		
		
		
	}	
	}
	