/*
 * 
 */
package arm.diagram.edit.parts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.draw2d.Ellipse;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
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
import org.eclipse.swt.graphics.Color;

import arm.diagram.edit.policies.InformationElementItemSemanticEditPolicy;
import arm.diagram.part.ARMVisualIDRegistry;
import arm.diagram.providers.ARMElementTypes;

/**
 * @generated
 */
public class InformationElementEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2004;

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
	public InformationElementEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new InformationElementItemSemanticEditPolicy());
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
		return primaryShape = new InformationElementFigure();
	}

	/**
	 * @generated
	 */
	public InformationElementFigure getPrimaryShape() {
		return (InformationElementFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof InformationElementIdentifierEditPart) {
			((InformationElementIdentifierEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureInformationElementLabelFigure());
			return true;
		}
		if (childEditPart instanceof InformationElementDescriptionEditPart) {
			((InformationElementDescriptionEditPart) childEditPart)
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
		if (childEditPart instanceof InformationElementIdentifierEditPart) {
			return true;
		}
		if (childEditPart instanceof InformationElementDescriptionEditPart) {
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
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(100, 70);
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
		return getChildBySemanticHint(ARMVisualIDRegistry
				.getType(InformationElementIdentifierEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(ARMElementTypes.AssertedInference_4001);
		types.add(ARMElementTypes.AssertedContext_4002);
		types.add(ARMElementTypes.AssertedEvidence_4003);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof EvidenceAssertationEditPart) {
			types.add(ARMElementTypes.AssertedInference_4001);
		}
		if (targetEditPart instanceof ClaimEditPart) {
			types.add(ARMElementTypes.AssertedInference_4001);
		}
		if (targetEditPart instanceof ArgumentReasoningEditPart) {
			types.add(ARMElementTypes.AssertedInference_4001);
		}
		if (targetEditPart instanceof arm.diagram.edit.parts.InformationElementEditPart) {
			types.add(ARMElementTypes.AssertedInference_4001);
		}
		if (targetEditPart instanceof CitiationElementEditPart) {
			types.add(ARMElementTypes.AssertedInference_4001);
		}
		if (targetEditPart instanceof ArgumentEditPart) {
			types.add(ARMElementTypes.AssertedInference_4001);
		}
		if (targetEditPart instanceof EvidenceAssertationEditPart) {
			types.add(ARMElementTypes.AssertedContext_4002);
		}
		if (targetEditPart instanceof ClaimEditPart) {
			types.add(ARMElementTypes.AssertedContext_4002);
		}
		if (targetEditPart instanceof ArgumentReasoningEditPart) {
			types.add(ARMElementTypes.AssertedContext_4002);
		}
		if (targetEditPart instanceof arm.diagram.edit.parts.InformationElementEditPart) {
			types.add(ARMElementTypes.AssertedContext_4002);
		}
		if (targetEditPart instanceof CitiationElementEditPart) {
			types.add(ARMElementTypes.AssertedContext_4002);
		}
		if (targetEditPart instanceof ArgumentEditPart) {
			types.add(ARMElementTypes.AssertedContext_4002);
		}
		if (targetEditPart instanceof EvidenceAssertationEditPart) {
			types.add(ARMElementTypes.AssertedEvidence_4003);
		}
		if (targetEditPart instanceof ClaimEditPart) {
			types.add(ARMElementTypes.AssertedEvidence_4003);
		}
		if (targetEditPart instanceof ArgumentReasoningEditPart) {
			types.add(ARMElementTypes.AssertedEvidence_4003);
		}
		if (targetEditPart instanceof arm.diagram.edit.parts.InformationElementEditPart) {
			types.add(ARMElementTypes.AssertedEvidence_4003);
		}
		if (targetEditPart instanceof CitiationElementEditPart) {
			types.add(ARMElementTypes.AssertedEvidence_4003);
		}
		if (targetEditPart instanceof ArgumentEditPart) {
			types.add(ARMElementTypes.AssertedEvidence_4003);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == ARMElementTypes.AssertedInference_4001) {
			types.add(ARMElementTypes.EvidenceAssertation_2001);
			types.add(ARMElementTypes.Claim_2002);
			types.add(ARMElementTypes.ArgumentReasoning_2003);
			types.add(ARMElementTypes.InformationElement_2004);
			types.add(ARMElementTypes.CitiationElement_2005);
			types.add(ARMElementTypes.Argument_2006);
		} else if (relationshipType == ARMElementTypes.AssertedContext_4002) {
			types.add(ARMElementTypes.EvidenceAssertation_2001);
			types.add(ARMElementTypes.Claim_2002);
			types.add(ARMElementTypes.ArgumentReasoning_2003);
			types.add(ARMElementTypes.InformationElement_2004);
			types.add(ARMElementTypes.CitiationElement_2005);
			types.add(ARMElementTypes.Argument_2006);
		} else if (relationshipType == ARMElementTypes.AssertedEvidence_4003) {
			types.add(ARMElementTypes.EvidenceAssertation_2001);
			types.add(ARMElementTypes.Claim_2002);
			types.add(ARMElementTypes.ArgumentReasoning_2003);
			types.add(ARMElementTypes.InformationElement_2004);
			types.add(ARMElementTypes.CitiationElement_2005);
			types.add(ARMElementTypes.Argument_2006);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(ARMElementTypes.AssertedInference_4001);
		types.add(ARMElementTypes.AssertedContext_4002);
		types.add(ARMElementTypes.AssertedEvidence_4003);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == ARMElementTypes.AssertedInference_4001) {
			types.add(ARMElementTypes.EvidenceAssertation_2001);
			types.add(ARMElementTypes.Claim_2002);
			types.add(ARMElementTypes.ArgumentReasoning_2003);
			types.add(ARMElementTypes.InformationElement_2004);
			types.add(ARMElementTypes.CitiationElement_2005);
			types.add(ARMElementTypes.Argument_2006);
		} else if (relationshipType == ARMElementTypes.AssertedContext_4002) {
			types.add(ARMElementTypes.EvidenceAssertation_2001);
			types.add(ARMElementTypes.Claim_2002);
			types.add(ARMElementTypes.ArgumentReasoning_2003);
			types.add(ARMElementTypes.InformationElement_2004);
			types.add(ARMElementTypes.CitiationElement_2005);
			types.add(ARMElementTypes.Argument_2006);
		} else if (relationshipType == ARMElementTypes.AssertedEvidence_4003) {
			types.add(ARMElementTypes.EvidenceAssertation_2001);
			types.add(ARMElementTypes.Claim_2002);
			types.add(ARMElementTypes.ArgumentReasoning_2003);
			types.add(ARMElementTypes.InformationElement_2004);
			types.add(ARMElementTypes.CitiationElement_2005);
			types.add(ARMElementTypes.Argument_2006);
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
	public class InformationElementFigure extends Ellipse {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureInformationElementLabelFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureModelElementDescriptionLabelFigure;

		/**
		 * @generated
		 */
		public InformationElementFigure() {
			this.setPreferredSize(new Dimension(getMapMode().DPtoLP(100),
					getMapMode().DPtoLP(70)));
			this.setBorder(new MarginBorder(getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5), getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureInformationElementLabelFigure = new WrappingLabel();
			fFigureInformationElementLabelFigure.setText("InformationElement");

			this.add(fFigureInformationElementLabelFigure);

			fFigureModelElementDescriptionLabelFigure = new WrappingLabel();
			fFigureModelElementDescriptionLabelFigure.setText("");

			this.add(fFigureModelElementDescriptionLabelFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureInformationElementLabelFigure() {
			return fFigureInformationElementLabelFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureModelElementDescriptionLabelFigure() {
			return fFigureModelElementDescriptionLabelFigure;
		}

	}

}
