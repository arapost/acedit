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
public class InContextOfModularItemSemanticEditPolicy extends
		GSN1BaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public InContextOfModularItemSemanticEditPolicy() {
		super(GSN1ElementTypes.InContextOfModular_4002);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
