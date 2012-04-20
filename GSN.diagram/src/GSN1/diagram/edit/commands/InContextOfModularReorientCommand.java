/*
 * 
 */
package GSN1.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import GSN1.InContextOfModular;
import GSN1.Module;
import GSN1.diagram.edit.policies.GSN1BaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class InContextOfModularReorientCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

	/**
	 * @generated
	 */
	private final EObject oldEnd;

	/**
	 * @generated
	 */
	private final EObject newEnd;

	/**
	 * @generated
	 */
	public InContextOfModularReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof InContextOfModular) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof Module && newEnd instanceof Module)) {
			return false;
		}
		Module target = getLink().getModularContextualElement();
		return GSN1BaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistInContextOfModular_4002(getLink(), getNewSource(),
						target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Module && newEnd instanceof Module)) {
			return false;
		}
		if (!(getLink().eContainer() instanceof Module)) {
			return false;
		}
		Module source = (Module) getLink().eContainer();
		return GSN1BaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistInContextOfModular_4002(getLink(), source,
						getNewTarget());
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientSource() throws ExecutionException {
		getOldSource().getHasContext().remove(getLink());
		getNewSource().getHasContext().add(getLink());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setModularContextualElement(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected InContextOfModular getLink() {
		return (InContextOfModular) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected Module getOldSource() {
		return (Module) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Module getNewSource() {
		return (Module) newEnd;
	}

	/**
	 * @generated
	 */
	protected Module getOldTarget() {
		return (Module) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Module getNewTarget() {
		return (Module) newEnd;
	}
}
