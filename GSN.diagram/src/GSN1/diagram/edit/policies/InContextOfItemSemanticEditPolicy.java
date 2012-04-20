/*
 * 
 */
package GSN1.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

import GSN1.diagram.providers.GSN1ElementTypes;

/**
 * @generated
 */
public class InContextOfItemSemanticEditPolicy extends
		GSN1BaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public InContextOfItemSemanticEditPolicy() {
		super(GSN1ElementTypes.InContextOf_4004);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
