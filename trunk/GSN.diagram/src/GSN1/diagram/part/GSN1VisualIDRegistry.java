/*
 * 
 */
package GSN1.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;

import GSN1.Case;
import GSN1.GSN1Package;
import GSN1.diagram.edit.parts.ArgumentModuleDescriptionEditPart;
import GSN1.diagram.edit.parts.ArgumentModuleEditPart;
import GSN1.diagram.edit.parts.ArgumentModuleIdentifierEditPart;
import GSN1.diagram.edit.parts.AssumptionDescriptionEditPart;
import GSN1.diagram.edit.parts.AssumptionEditPart;
import GSN1.diagram.edit.parts.AssumptionIdentifierEditPart;
import GSN1.diagram.edit.parts.AwayContextDescriptionEditPart;
import GSN1.diagram.edit.parts.AwayContextEditPart;
import GSN1.diagram.edit.parts.AwayContextIdentifierEditPart;
import GSN1.diagram.edit.parts.AwayContextModuleIdentifierEditPart;
import GSN1.diagram.edit.parts.AwayGoalDescriptionEditPart;
import GSN1.diagram.edit.parts.AwayGoalEditPart;
import GSN1.diagram.edit.parts.AwayGoalIdentifierEditPart;
import GSN1.diagram.edit.parts.AwayGoalModuleIdentifierEditPart;
import GSN1.diagram.edit.parts.AwaySolutionDescriptionEditPart;
import GSN1.diagram.edit.parts.AwaySolutionEditPart;
import GSN1.diagram.edit.parts.AwaySolutionIdentifierEditPart;
import GSN1.diagram.edit.parts.AwaySolutionModuleIdentifierEditPart;
import GSN1.diagram.edit.parts.CaseEditPart;
import GSN1.diagram.edit.parts.ContextDescriptionEditPart;
import GSN1.diagram.edit.parts.ContextEditPart;
import GSN1.diagram.edit.parts.ContextIdentifierEditPart;
import GSN1.diagram.edit.parts.ContractModuleDescriptionEditPart;
import GSN1.diagram.edit.parts.ContractModuleEditPart;
import GSN1.diagram.edit.parts.ContractModuleIdentifierEditPart;
import GSN1.diagram.edit.parts.GoalDescriptionEditPart;
import GSN1.diagram.edit.parts.GoalEditPart;
import GSN1.diagram.edit.parts.GoalIdentifierEditPart;
import GSN1.diagram.edit.parts.InContextOfEditPart;
import GSN1.diagram.edit.parts.InContextOfModularEditPart;
import GSN1.diagram.edit.parts.JustificationDescriptionEditPart;
import GSN1.diagram.edit.parts.JustificationEditPart;
import GSN1.diagram.edit.parts.JustificationIdentifierEditPart;
import GSN1.diagram.edit.parts.SolutionDescriptionEditPart;
import GSN1.diagram.edit.parts.SolutionEditPart;
import GSN1.diagram.edit.parts.SolutionIdentifierEditPart;
import GSN1.diagram.edit.parts.SolvedByCardinalityEditPart;
import GSN1.diagram.edit.parts.SolvedByEditPart;
import GSN1.diagram.edit.parts.SolvedByModularEditPart;
import GSN1.diagram.edit.parts.StrategyDescriptionEditPart;
import GSN1.diagram.edit.parts.StrategyEditPart;
import GSN1.diagram.edit.parts.StrategyIdentifierEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class GSN1VisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "GSN.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (CaseEditPart.MODEL_ID.equals(view.getType())) {
				return CaseEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return GSN1.diagram.part.GSN1VisualIDRegistry.getVisualID(view
				.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				GSN1DiagramEditorPlugin.getInstance().logError(
						"Unable to parse view type as a visualID number: "
								+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (GSN1Package.eINSTANCE.getCase().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((Case) domainElement)) {
			return CaseEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = GSN1.diagram.part.GSN1VisualIDRegistry
				.getModelID(containerView);
		if (!CaseEditPart.MODEL_ID.equals(containerModelID)
				&& !"GSN1".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (CaseEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = GSN1.diagram.part.GSN1VisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = CaseEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case CaseEditPart.VISUAL_ID:
			if (GSN1Package.eINSTANCE.getGoal().isSuperTypeOf(
					domainElement.eClass())) {
				return GoalEditPart.VISUAL_ID;
			}
			if (GSN1Package.eINSTANCE.getStrategy().isSuperTypeOf(
					domainElement.eClass())) {
				return StrategyEditPart.VISUAL_ID;
			}
			if (GSN1Package.eINSTANCE.getAwayGoal().isSuperTypeOf(
					domainElement.eClass())) {
				return AwayGoalEditPart.VISUAL_ID;
			}
			if (GSN1Package.eINSTANCE.getSolution().isSuperTypeOf(
					domainElement.eClass())) {
				return SolutionEditPart.VISUAL_ID;
			}
			if (GSN1Package.eINSTANCE.getContext().isSuperTypeOf(
					domainElement.eClass())) {
				return ContextEditPart.VISUAL_ID;
			}
			if (GSN1Package.eINSTANCE.getJustification().isSuperTypeOf(
					domainElement.eClass())) {
				return JustificationEditPart.VISUAL_ID;
			}
			if (GSN1Package.eINSTANCE.getAssumption().isSuperTypeOf(
					domainElement.eClass())) {
				return AssumptionEditPart.VISUAL_ID;
			}
			if (GSN1Package.eINSTANCE.getAwayContext().isSuperTypeOf(
					domainElement.eClass())) {
				return AwayContextEditPart.VISUAL_ID;
			}
			if (GSN1Package.eINSTANCE.getAwaySolution().isSuperTypeOf(
					domainElement.eClass())) {
				return AwaySolutionEditPart.VISUAL_ID;
			}
			if (GSN1Package.eINSTANCE.getArgumentModule().isSuperTypeOf(
					domainElement.eClass())) {
				return ArgumentModuleEditPart.VISUAL_ID;
			}
			if (GSN1Package.eINSTANCE.getContractModule().isSuperTypeOf(
					domainElement.eClass())) {
				return ContractModuleEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = GSN1.diagram.part.GSN1VisualIDRegistry
				.getModelID(containerView);
		if (!CaseEditPart.MODEL_ID.equals(containerModelID)
				&& !"GSN1".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (CaseEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = GSN1.diagram.part.GSN1VisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = CaseEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case CaseEditPart.VISUAL_ID:
			if (GoalEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StrategyEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AwayGoalEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SolutionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ContextEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (JustificationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AssumptionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AwayContextEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AwaySolutionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ArgumentModuleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ContractModuleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GoalEditPart.VISUAL_ID:
			if (GoalIdentifierEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GoalDescriptionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StrategyEditPart.VISUAL_ID:
			if (StrategyIdentifierEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StrategyDescriptionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AwayGoalEditPart.VISUAL_ID:
			if (AwayGoalIdentifierEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AwayGoalDescriptionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AwayGoalModuleIdentifierEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SolutionEditPart.VISUAL_ID:
			if (SolutionIdentifierEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SolutionDescriptionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ContextEditPart.VISUAL_ID:
			if (ContextIdentifierEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ContextDescriptionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case JustificationEditPart.VISUAL_ID:
			if (JustificationIdentifierEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (JustificationDescriptionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AssumptionEditPart.VISUAL_ID:
			if (AssumptionIdentifierEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AssumptionDescriptionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AwayContextEditPart.VISUAL_ID:
			if (AwayContextIdentifierEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AwayContextDescriptionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AwayContextModuleIdentifierEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AwaySolutionEditPart.VISUAL_ID:
			if (AwaySolutionIdentifierEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AwaySolutionDescriptionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AwaySolutionModuleIdentifierEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ArgumentModuleEditPart.VISUAL_ID:
			if (ArgumentModuleIdentifierEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ArgumentModuleDescriptionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ContractModuleEditPart.VISUAL_ID:
			if (ContractModuleIdentifierEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ContractModuleDescriptionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SolvedByEditPart.VISUAL_ID:
			if (SolvedByCardinalityEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (GSN1Package.eINSTANCE.getSolvedByModular().isSuperTypeOf(
				domainElement.eClass())) {
			return SolvedByModularEditPart.VISUAL_ID;
		}
		if (GSN1Package.eINSTANCE.getInContextOfModular().isSuperTypeOf(
				domainElement.eClass())) {
			return InContextOfModularEditPart.VISUAL_ID;
		}
		if (GSN1Package.eINSTANCE.getSolvedBy().isSuperTypeOf(
				domainElement.eClass())) {
			return SolvedByEditPart.VISUAL_ID;
		}
		if (GSN1Package.eINSTANCE.getInContextOf().isSuperTypeOf(
				domainElement.eClass())) {
			return InContextOfEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(Case element) {
		return true;
	}

}
