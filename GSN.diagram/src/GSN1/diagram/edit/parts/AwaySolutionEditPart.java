/*
 * 
 */
package GSN1.diagram.edit.parts;

import gsnfigures.GSNAwaySolution;

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
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;

import GSN1.diagram.edit.policies.AwaySolutionItemSemanticEditPolicy;
import GSN1.diagram.part.GSN1VisualIDRegistry;
import GSN1.diagram.providers.GSN1ElementTypes;

/**
 * @generated
 */
public class AwaySolutionEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2009;

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
	public AwaySolutionEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new AwaySolutionItemSemanticEditPolicy());
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
	 * @generated
	 */
	protected IFigure createNodeShape() {
		return primaryShape = new AwaySolutionFigure();
	}

	/**
	 * @generated
	 */
	public AwaySolutionFigure getPrimaryShape() {
		return (AwaySolutionFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof AwaySolutionIdentifierEditPart) {
			((AwaySolutionIdentifierEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureAwaySolutionLabelFigure());
			return true;
		}
		if (childEditPart instanceof AwaySolutionDescriptionEditPart) {
			((AwaySolutionDescriptionEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureModelElementDescriptionLabelFigure());
			return true;
		}
		if (childEditPart instanceof AwaySolutionModuleIdentifierEditPart) {
			((AwaySolutionModuleIdentifierEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureAwaySolutionModuleIdentifierLabelFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof AwaySolutionIdentifierEditPart) {
			return true;
		}
		if (childEditPart instanceof AwaySolutionDescriptionEditPart) {
			return true;
		}
		if (childEditPart instanceof AwaySolutionModuleIdentifierEditPart) {
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
				.getType(AwaySolutionIdentifierEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(GSN1ElementTypes.SolvedBy_4003);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == GSN1ElementTypes.SolvedBy_4003) {
			types.add(GSN1ElementTypes.Goal_2001);
			types.add(GSN1ElementTypes.Strategy_2002);
		}
		return types;
	}

	/**
	 * @generated
	 */
	protected void handleNotificationEvent(Notification event) {
		if (event.getNotifier() == getModel()
				&& EcorePackage.eINSTANCE.getEModelElement_EAnnotations()
						.equals(event.getFeature())) {
			handleMajorSemanticChange();
		} else {
			super.handleNotificationEvent(event);
		}
	}

	/**
	 * @generated
	 */
	public class AwaySolutionFigure extends GSNAwaySolution {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureAwaySolutionLabelFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureModelElementDescriptionLabelFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureAwaySolutionModuleIdentifierLabelFigure;

		/**
		 * @generated
		 */
		public AwaySolutionFigure() {

			this.setPreferredSize(new Dimension(getMapMode().DPtoLP(120),
					getMapMode().DPtoLP(80)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureAwaySolutionLabelFigure = new WrappingLabel();
			fFigureAwaySolutionLabelFigure.setText("AwaySolution");

			fFigureAwaySolutionLabelFigure
					.setFont(FFIGUREAWAYSOLUTIONLABELFIGURE_FONT);

			this.add(fFigureAwaySolutionLabelFigure);

			fFigureModelElementDescriptionLabelFigure = new WrappingLabel();
			fFigureModelElementDescriptionLabelFigure.setText("<description>");

			this.add(fFigureModelElementDescriptionLabelFigure);

			fFigureAwaySolutionModuleIdentifierLabelFigure = new WrappingLabel();
			fFigureAwaySolutionModuleIdentifierLabelFigure
					.setText("<module id>");

			this.add(fFigureAwaySolutionModuleIdentifierLabelFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureAwaySolutionLabelFigure() {
			return fFigureAwaySolutionLabelFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureModelElementDescriptionLabelFigure() {
			return fFigureModelElementDescriptionLabelFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureAwaySolutionModuleIdentifierLabelFigure() {
			return fFigureAwaySolutionModuleIdentifierLabelFigure;
		}

	}

	/**
	 * @generated
	 */
	static final Font FFIGUREAWAYSOLUTIONLABELFIGURE_FONT = new Font(
			Display.getCurrent(), Display.getDefault().getSystemFont()
					.getFontData()[0].getName(), 9, SWT.BOLD);

}
