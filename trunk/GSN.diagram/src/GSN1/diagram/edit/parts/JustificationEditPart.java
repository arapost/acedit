/*
 * 
 */
package GSN1.diagram.edit.parts;

import gsnfigures.GSNJustification;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;

import GSN1.Justification;
import GSN1.diagram.edit.policies.JustificationItemSemanticEditPolicy;
import GSN1.diagram.part.GSN1VisualIDRegistry;
import GSN1.diagram.providers.GSN1ElementTypes;

/**
 * @generated
 */
public class JustificationEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2006;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	/**
	 * @generated
	 */
	public JustificationEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new JustificationItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy lep = new org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				EditPolicy result = child
						.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
				if (result == null) {
					result = new NonResizableEditPolicy();
				}
				return result;
			}

			protected Command getMoveChildrenCommand(Request request) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	 * @generated NOT
	 */
	protected IFigure createNodeShape() {
		Justification justification = (Justification) ((Node) this.getModel())
				.getElement();
		if (justification.getTobeinstantiated() == true) {
			primaryShape = new JustificationFigure();
			((JustificationFigure) (primaryShape)).setShape(1);
		}

		else {
			primaryShape = new JustificationFigure();
		}
		return primaryShape;
	}

	/**
	 * @generated
	 */
	public JustificationFigure getPrimaryShape() {
		return (JustificationFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof JustificationIdentifierEditPart) {
			((JustificationIdentifierEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureJustificationLabelFigure());
			return true;
		}
		if (childEditPart instanceof JustificationDescriptionEditPart) {
			((JustificationDescriptionEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureModelElementDescriptionLabelFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof JustificationIdentifierEditPart) {
			return true;
		}
		if (childEditPart instanceof JustificationDescriptionEditPart) {
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	 * @generated
	 */
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	 * @generated
	 */
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(120, 80);
		return result;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane.
	 * Respects layout one may have set for generated figure.
	 * @param nodeShape instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(5);
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	 * @generated
	 */
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	 * @generated
	 */
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	 * @generated
	 */
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(GSN1VisualIDRegistry
				.getType(JustificationIdentifierEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(GSN1ElementTypes.InContextOf_4004);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == GSN1ElementTypes.InContextOf_4004) {
			types.add(GSN1ElementTypes.Goal_2001);
			types.add(GSN1ElementTypes.Strategy_2002);
		}
		return types;
	}

	@Override
	protected void handleNotificationEvent(Notification event) {
		if (event.getNotifier() == getModel()
				&& EcorePackage.eINSTANCE.getEModelElement_EAnnotations()
						.equals(event.getFeature())) {
			handleMajorSemanticChange();
		} else {

			if (event.getNotifier() instanceof Justification) {

				Justification justification = (Justification) ((Node) this
						.getModel()).getElement();

				if (justification.getTobeinstantiated() == true) {
					JustificationFigure figure = (JustificationFigure) this
							.getPrimaryShape();
					figure.setShape(1);
				} else {
					JustificationFigure figure = (JustificationFigure) this
							.getPrimaryShape();
					figure.setShape(0);
				}

			}
			super.handleNotificationEvent(event);
		}
	}

	/**
	 * @generated
	 */
	public class JustificationFigure extends GSNJustification {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureJustificationLabelFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureModelElementDescriptionLabelFigure;

		/**
		 * @generated
		 */
		public JustificationFigure() {

			this.setPreferredSize(new Dimension(getMapMode().DPtoLP(120),
					getMapMode().DPtoLP(80)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureJustificationLabelFigure = new WrappingLabel();
			fFigureJustificationLabelFigure.setText("Justification");

			fFigureJustificationLabelFigure
					.setFont(FFIGUREJUSTIFICATIONLABELFIGURE_FONT);

			this.add(fFigureJustificationLabelFigure);

			fFigureModelElementDescriptionLabelFigure = new WrappingLabel();
			fFigureModelElementDescriptionLabelFigure.setText("<description>");

			this.add(fFigureModelElementDescriptionLabelFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureJustificationLabelFigure() {
			return fFigureJustificationLabelFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureModelElementDescriptionLabelFigure() {
			return fFigureModelElementDescriptionLabelFigure;
		}

	}

	/**
	 * @generated
	 */
	static final Font FFIGUREJUSTIFICATIONLABELFIGURE_FONT = new Font(
			Display.getCurrent(), Display.getDefault().getSystemFont()
					.getFontData()[0].getName(), 9, SWT.BOLD);

}
