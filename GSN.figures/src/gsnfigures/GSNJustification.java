package gsnfigures;

import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;

public class GSNJustification extends Figure{
	//says if the element is related with any entity abstraction extension
	private  int shape;
	public GSNJustification(){
		this.setShape(0);
		this.setMinimumSize(new Dimension(80,60));
	}
	
	@Override
	public void paint(Graphics graphics) {
		Rectangle r = getBounds();
		
		if (getShape()==0){		
			graphics.drawOval(r.x, r.y, r.width, r.height);
			graphics.drawText("J", new Point(r.x+18*r.width/20,r.y+5*r.height/6));
		}
		else{
			graphics.drawOval(r.x, r.y, r.width, 3*r.height/4);
			graphics.drawText("J", new Point(r.x+18*r.width/20,r.y+2*r.height/3));
			
			Point p5 = new Point(r.x+r.width/2, r.y+3*r.height/4);
			Point p6 = new Point(r.x + 5*r.width/8, r.y+7*r.height/8);
			Point p7 = new Point(r.x+r.width/2, r.y + r.height);
			Point p8 = new Point(r.x + 3*r.width/8, r.y + 7*r.height/8);		
			PointList pointList = new PointList();
			pointList.addPoint(p5);
			pointList.addPoint(p6);
			pointList.addPoint(p7);
			pointList.addPoint(p8);	
			// Fill the shape
			graphics.fillPolygon(pointList);
			
			// Draw the outline
			graphics.drawLine(p5, p6);
			graphics.drawLine(p6, p8);
			graphics.drawLine(p5, p8);
		}
		// Move the first label to the center of the parallelogram
		WrappingLabel label = (WrappingLabel) getChildren().get(0);
		LayoutUtil.moveToCenterAndUp(label, this, graphics);
		label.paint(graphics);
		// Move the second label to the center of the parallelogram
		label = (WrappingLabel) getChildren().get(1);
		LayoutUtil.moveToCenterAndDown(label, this, graphics);
		label.paint(graphics);
		
	}	
	public  void setShape(int shape) {
		this.shape = shape;
	}
	public  int getShape() {
		return shape;
	}
}