/*
 * 
 */
package arm.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

import arm.diagram.edit.commands.AssertedContextCreateCommand;
import arm.diagram.edit.commands.AssertedContextReorientCommand;
import arm.diagram.edit.commands.AssertedEvidenceCreateCommand;
import arm.diagram.edit.commands.AssertedEvidenceReorientCommand;
import arm.diagram.edit.commands.AssertedInferenceCreateCommand;
import arm.diagram.edit.commands.AssertedInferenceReorientCommand;
import arm.diagram.edit.parts.AssertedContextEditPart;
import arm.diagram.edit.parts.AssertedEvidenceEditPart;
import arm.diagram.edit.parts.AssertedInferenceEditPart;
import arm.diagram.part.ARMVisualIDRegistry;
import arm.diagram.providers.ARMElementTypes;

/**
 * @generated
 */
public class EvidenceAssertationItemSemanticEditPolicy extends
		ARMBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public EvidenceAssertationItemSemanticEditPolicy() {
		super(ARMElementTypes.EvidenceAssertation_2001);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(
				getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (ARMVisualIDRegistry.getVisualID(incomingLink) == AssertedInferenceEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (ARMVisualIDRegistry.getVisualID(incomingLink) == AssertedContextEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (ARMVisualIDRegistry.getVisualID(incomingLink) == AssertedEvidenceEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (ARMVisualIDRegistry.getVisualID(outgoingLink) == AssertedInferenceEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (ARMVisualIDRegistry.getVisualID(outgoingLink) == AssertedContextEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (ARMVisualIDRegistry.getVisualID(outgoingLink) == AssertedEvidenceEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super
				.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (ARMElementTypes.AssertedInference_4001 == req.getElementType()) {
			return getGEFWrapper(new AssertedInferenceCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (ARMElementTypes.AssertedContext_4002 == req.getElementType()) {
			return getGEFWrapper(new AssertedContextCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (ARMElementTypes.AssertedEvidence_4003 == req.getElementType()) {
			return getGEFWrapper(new AssertedEvidenceCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (ARMElementTypes.AssertedInference_4001 == req.getElementType()) {
			return getGEFWrapper(new AssertedInferenceCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (ARMElementTypes.AssertedContext_4002 == req.getElementType()) {
			return getGEFWrapper(new AssertedContextCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (ARMElementTypes.AssertedEvidence_4003 == req.getElementType()) {
			return getGEFWrapper(new AssertedEvidenceCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EClass based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(
			ReorientRelationshipRequest req) {
		switch (getVisualID(req)) {
		case AssertedInferenceEditPart.VISUAL_ID:
			return getGEFWrapper(new AssertedInferenceReorientCommand(req));
		case AssertedContextEditPart.VISUAL_ID:
			return getGEFWrapper(new AssertedContextReorientCommand(req));
		case AssertedEvidenceEditPart.VISUAL_ID:
			return getGEFWrapper(new AssertedEvidenceReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

}
