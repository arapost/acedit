/*
 * 
 */
package GSN1.diagram.edit.parts;

import gsnfigures.GSNSolvedBy;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.draw2d.PolylineDecoration;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.notation.View;

import GSN1.SolvedBy;
import GSN1.SolvedByMultiplicityExtension;
import GSN1.diagram.edit.policies.SolvedByItemSemanticEditPolicy;

/**
 * @generated
 */
public class SolvedByEditPart extends ConnectionNodeEditPart implements
		ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4003;

	/**
	 * @generated
	 */
	public SolvedByEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new SolvedByItemSemanticEditPolicy());
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated NOT
	 */

	protected Connection createConnectionFigure() {
		SolvedBy solvedBy = (SolvedBy) ((View) this.getModel()).getElement();
		SolvedByFigure figure;
		if (solvedBy.getMultiextension() == SolvedByMultiplicityExtension.OPTIONAL) {
			figure = new SolvedByFigure();
			figure.setShape(1);
		} else if (solvedBy.getMultiextension() == SolvedByMultiplicityExtension.MULTI) {
			figure = new SolvedByFigure();
			figure.setShape(2);
		} else {
			figure = new SolvedByFigure();
			figure.setShape(0);
		}
		return figure;
	}

	/**
	 * @generated
	 */
	public SolvedByFigure getPrimaryShape() {
		return (SolvedByFigure) getFigure();
	}

	/**
	 * @generated NOT
	 */
	@Override
	protected void handleNotificationEvent(Notification event) {
		if (event.getNotifier() == getModel()
				&& EcorePackage.eINSTANCE.getEModelElement_EAnnotations()
						.equals(event.getFeature())) {
			handleMajorSemanticChange();
		} else {

			if (event.getNotifier() instanceof SolvedBy) {

				SolvedBy solvedBy = (SolvedBy) ((View) this.getModel())
						.getElement();
				if (solvedBy.getMultiextension() == SolvedByMultiplicityExtension.OPTIONAL) {
					SolvedByFigure figure = (SolvedByFigure) this
							.getPrimaryShape();
					figure.setShape(1);
					solvedBy.setCardinality("");
				} else if (solvedBy.getMultiextension() == SolvedByMultiplicityExtension.MULTI) {
					SolvedByFigure figure = (SolvedByFigure) this
							.getPrimaryShape();
					figure.setShape(2);
				} else {
					SolvedByFigure figure = (SolvedByFigure) this
							.getPrimaryShape();
					figure.setShape(0);
					solvedBy.setCardinality("");
				}

			}
			super.handleNotificationEvent(event);
		}
	}

	/**
	 * @generated NOT
	 */
	public class SolvedByFigure extends GSNSolvedBy {

		/**
		 * @generated
		 */
		public SolvedByFigure() {

			setTargetDecoration(createTargetDecoration());
		}

		/**
		 * @generated
		 */
		private RotatableDecoration createTargetDecoration() {
			PolygonDecoration df = new PolygonDecoration();
			df.setFill(true);
			PointList pl = new PointList();
			pl.addPoint(getMapMode().DPtoLP(0), getMapMode().DPtoLP(0));
			pl.addPoint(getMapMode().DPtoLP(-2), getMapMode().DPtoLP(2));
			pl.addPoint(getMapMode().DPtoLP(-2), getMapMode().DPtoLP(-2));
			pl.addPoint(getMapMode().DPtoLP(0), getMapMode().DPtoLP(0));
			df.setTemplate(pl);
			df.setScale(getMapMode().DPtoLP(7), getMapMode().DPtoLP(3));
			return df;
		}

	}

}
