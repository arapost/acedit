/*
 * 
 */
package arm.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import arm.AssertedInference;
import arm.Case;
import arm.ModelElement;
import arm.diagram.edit.policies.ARMBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class AssertedInferenceReorientCommand extends EditElementCommand {

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
	public AssertedInferenceReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof AssertedInference) {
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
		if (!(oldEnd instanceof ModelElement && newEnd instanceof ModelElement)) {
			return false;
		}
		if (getLink().getTarget().size() != 1) {
			return false;
		}
		ModelElement target = (ModelElement) getLink().getTarget().get(0);
		if (!(getLink().eContainer() instanceof Case)) {
			return false;
		}
		Case container = (Case) getLink().eContainer();
		return ARMBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistAssertedInference_4001(container, getLink(),
						getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof ModelElement && newEnd instanceof ModelElement)) {
			return false;
		}
		if (getLink().getSource().size() != 1) {
			return false;
		}
		ModelElement source = (ModelElement) getLink().getSource().get(0);
		if (!(getLink().eContainer() instanceof Case)) {
			return false;
		}
		Case container = (Case) getLink().eContainer();
		return ARMBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistAssertedInference_4001(container, getLink(), source,
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
		getLink().getSource().remove(getOldSource());
		getLink().getSource().add(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().getTarget().remove(getOldTarget());
		getLink().getTarget().add(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected AssertedInference getLink() {
		return (AssertedInference) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected ModelElement getOldSource() {
		return (ModelElement) oldEnd;
	}

	/**
	 * @generated
	 */
	protected ModelElement getNewSource() {
		return (ModelElement) newEnd;
	}

	/**
	 * @generated
	 */
	protected ModelElement getOldTarget() {
		return (ModelElement) oldEnd;
	}

	/**
	 * @generated
	 */
	protected ModelElement getNewTarget() {
		return (ModelElement) newEnd;
	}
}
