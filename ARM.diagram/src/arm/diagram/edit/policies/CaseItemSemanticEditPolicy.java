/*
 * 
 */
package arm.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

import arm.diagram.edit.commands.ArgumentCreateCommand;
import arm.diagram.edit.commands.ArgumentReasoningCreateCommand;
import arm.diagram.edit.commands.CitiationElementCreateCommand;
import arm.diagram.edit.commands.ClaimCreateCommand;
import arm.diagram.edit.commands.EvidenceAssertationCreateCommand;
import arm.diagram.edit.commands.InformationElementCreateCommand;
import arm.diagram.providers.ARMElementTypes;

/**
 * @generated
 */
public class CaseItemSemanticEditPolicy extends ARMBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public CaseItemSemanticEditPolicy() {
		super(ARMElementTypes.Case_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ARMElementTypes.EvidenceAssertation_2001 == req.getElementType()) {
			return getGEFWrapper(new EvidenceAssertationCreateCommand(req));
		}
		if (ARMElementTypes.Claim_2002 == req.getElementType()) {
			return getGEFWrapper(new ClaimCreateCommand(req));
		}
		if (ARMElementTypes.ArgumentReasoning_2003 == req.getElementType()) {
			return getGEFWrapper(new ArgumentReasoningCreateCommand(req));
		}
		if (ARMElementTypes.InformationElement_2004 == req.getElementType()) {
			return getGEFWrapper(new InformationElementCreateCommand(req));
		}
		if (ARMElementTypes.CitiationElement_2005 == req.getElementType()) {
			return getGEFWrapper(new CitiationElementCreateCommand(req));
		}
		if (ARMElementTypes.Argument_2006 == req.getElementType()) {
			return getGEFWrapper(new ArgumentCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
				.getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends
			DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(
				TransactionalEditingDomain editingDomain,
				DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req
					.getElementsToBeDuplicated(), req
					.getAllDuplicatedElementsMap());
		}

	}

}
