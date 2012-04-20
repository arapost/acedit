/*
 * 
 */
package GSN1.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

import GSN1.diagram.edit.commands.ArgumentModuleCreateCommand;
import GSN1.diagram.edit.commands.AssumptionCreateCommand;
import GSN1.diagram.edit.commands.AwayContextCreateCommand;
import GSN1.diagram.edit.commands.AwayGoalCreateCommand;
import GSN1.diagram.edit.commands.AwaySolutionCreateCommand;
import GSN1.diagram.edit.commands.ContextCreateCommand;
import GSN1.diagram.edit.commands.ContractModuleCreateCommand;
import GSN1.diagram.edit.commands.GoalCreateCommand;
import GSN1.diagram.edit.commands.JustificationCreateCommand;
import GSN1.diagram.edit.commands.SolutionCreateCommand;
import GSN1.diagram.edit.commands.StrategyCreateCommand;
import GSN1.diagram.providers.GSN1ElementTypes;

/**
 * @generated
 */
public class CaseItemSemanticEditPolicy extends GSN1BaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public CaseItemSemanticEditPolicy() {
		super(GSN1ElementTypes.Case_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (GSN1ElementTypes.Goal_2001 == req.getElementType()) {
			return getGEFWrapper(new GoalCreateCommand(req));
		}
		if (GSN1ElementTypes.Strategy_2002 == req.getElementType()) {
			return getGEFWrapper(new StrategyCreateCommand(req));
		}
		if (GSN1ElementTypes.AwayGoal_2003 == req.getElementType()) {
			return getGEFWrapper(new AwayGoalCreateCommand(req));
		}
		if (GSN1ElementTypes.Solution_2004 == req.getElementType()) {
			return getGEFWrapper(new SolutionCreateCommand(req));
		}
		if (GSN1ElementTypes.Context_2005 == req.getElementType()) {
			return getGEFWrapper(new ContextCreateCommand(req));
		}
		if (GSN1ElementTypes.Justification_2006 == req.getElementType()) {
			return getGEFWrapper(new JustificationCreateCommand(req));
		}
		if (GSN1ElementTypes.Assumption_2007 == req.getElementType()) {
			return getGEFWrapper(new AssumptionCreateCommand(req));
		}
		if (GSN1ElementTypes.AwayContext_2008 == req.getElementType()) {
			return getGEFWrapper(new AwayContextCreateCommand(req));
		}
		if (GSN1ElementTypes.AwaySolution_2009 == req.getElementType()) {
			return getGEFWrapper(new AwaySolutionCreateCommand(req));
		}
		if (GSN1ElementTypes.ArgumentModule_2010 == req.getElementType()) {
			return getGEFWrapper(new ArgumentModuleCreateCommand(req));
		}
		if (GSN1ElementTypes.ContractModule_2011 == req.getElementType()) {
			return getGEFWrapper(new ContractModuleCreateCommand(req));
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
