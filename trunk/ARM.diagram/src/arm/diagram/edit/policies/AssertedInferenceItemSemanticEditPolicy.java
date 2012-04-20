/*
 * 
 */
package arm.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import arm.diagram.edit.commands.AssertedContextCreateCommand;
import arm.diagram.edit.commands.AssertedContextReorientCommand;
import arm.diagram.edit.commands.AssertedEvidenceCreateCommand;
import arm.diagram.edit.commands.AssertedEvidenceReorientCommand;
import arm.diagram.edit.commands.AssertedInferenceCreateCommand;
import arm.diagram.edit.commands.AssertedInferenceReorientCommand;
import arm.diagram.edit.parts.AssertedContextEditPart;
import arm.diagram.edit.parts.AssertedEvidenceEditPart;
import arm.diagram.edit.parts.AssertedInferenceEditPart;
import arm.diagram.providers.ARMElementTypes;

/**
 * @generated
 */
public class AssertedInferenceItemSemanticEditPolicy extends
		ARMBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public AssertedInferenceItemSemanticEditPolicy() {
		super(ARMElementTypes.AssertedInference_4001);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
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
