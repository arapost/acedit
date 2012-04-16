package gsnfigures;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;

public class GSNRectangleFigure extends RectangleFigure {
	
	@Override
	public void paint(Graphics graphics) {
		// Fill shape and draw outline
		super.paint(graphics);

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