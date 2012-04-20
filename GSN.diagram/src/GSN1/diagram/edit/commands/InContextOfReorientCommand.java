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

import GSN1.DecomposableSpinalElement;
import GSN1.InContextOf;
import GSN1.InTheContextOfTargetElement;
import GSN1.diagram.edit.policies.GSN1BaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class InContextOfReorientCommand extends EditElementCommand {

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
	public InContextOfReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof InContextOf) {
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
		if (!(oldEnd instanceof DecomposableSpinalElement && newEnd instanceof DecomposableSpinalElement)) {
			return false;
		}
		InTheContextOfTargetElement target = getLink().getContextualElement();
		if (!(getLink().eContainer() instanceof DecomposableSpinalElement)) {
			return false;
		}
		DecomposableSpinalElement container = (DecomposableSpinalElement) getLink()
				.eContainer();
		return GSN1BaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistInContextOf_4004(container, getLink(), getNewSource(),
						target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof InTheContextOfTargetElement && newEnd instanceof InTheContextOfTargetElement)) {
			return false;
		}
		DecomposableSpinalElement source = getLink()
				.getContextOfSpinalElement();
		if (!(getLink().eContainer() instanceof DecomposableSpinalElement)) {
			return false;
		}
		DecomposableSpinalElement container = (DecomposableSpinalElement) getLink()
				.eContainer();
		return GSN1BaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistInContextOf_4004(container, getLink(), source,
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
		getLink().setContextOfSpinalElement(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setContextualElement(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected InContextOf getLink() {
		return (InContextOf) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected DecomposableSpinalElement getOldSource() {
		return (DecomposableSpinalElement) oldEnd;
	}

	/**
	 * @generated
	 */
	protected DecomposableSpinalElement getNewSource() {
		return (DecomposableSpinalElement) newEnd;
	}

	/**
	 * @generated
	 */
	protected InTheContextOfTargetElement getOldTarget() {
		return (InTheContextOfTargetElement) oldEnd;
	}

	/**
	 * @generated
	 */
	protected InTheContextOfTargetElement getNewTarget() {
		return (InTheContextOfTargetElement) newEnd;
	}
}
