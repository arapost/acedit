/*
 * 
 */
package arm.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;

import arm.ArmPackage;
import arm.Case;
import arm.diagram.edit.parts.ArgumentDescriptionEditPart;
import arm.diagram.edit.parts.ArgumentEditPart;
import arm.diagram.edit.parts.ArgumentIdentifierEditPart;
import arm.diagram.edit.parts.ArgumentReasoningDescriptionEditPart;
import arm.diagram.edit.parts.ArgumentReasoningEditPart;
import arm.diagram.edit.parts.ArgumentReasoningIdentifierEditPart;
import arm.diagram.edit.parts.AssertedContextEditPart;
import arm.diagram.edit.parts.AssertedEvidenceEditPart;
import arm.diagram.edit.parts.AssertedInferenceEditPart;
import arm.diagram.edit.parts.CaseEditPart;
import arm.diagram.edit.parts.CitiationElementDescriptionEditPart;
import arm.diagram.edit.parts.CitiationElementEditPart;
import arm.diagram.edit.parts.CitiationElementIdentifierEditPart;
import arm.diagram.edit.parts.ClaimDescriptionEditPart;
import arm.diagram.edit.parts.ClaimEditPart;
import arm.diagram.edit.parts.ClaimIdentifierEditPart;
import arm.diagram.edit.parts.EvidenceAssertationDescriptionEditPart;
import arm.diagram.edit.parts.EvidenceAssertationEditPart;
import arm.diagram.edit.parts.EvidenceAssertationIdentifierEditPart;
import arm.diagram.edit.parts.InformationElementDescriptionEditPart;
import arm.diagram.edit.parts.InformationElementEditPart;
import arm.diagram.edit.parts.InformationElementIdentifierEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class ARMVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "ARM.diagram/debug/visualID"; //$NON-NLS-1$

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
		return arm.diagram.part.ARMVisualIDRegistry.getVisualID(view.getType());
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
				ARMDiagramEditorPlugin.getInstance().logError(
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
		if (ArmPackage.eINSTANCE.getCase()
				.isSuperTypeOf(domainElement.eClass())
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
		String containerModelID = arm.diagram.part.ARMVisualIDRegistry
				.getModelID(containerView);
		if (!CaseEditPart.MODEL_ID.equals(containerModelID)
				&& !"arm".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (CaseEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = arm.diagram.part.ARMVisualIDRegistry
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
			if (ArmPackage.eINSTANCE.getEvidenceAssertation().isSuperTypeOf(
					domainElement.eClass())) {
				return EvidenceAssertationEditPart.VISUAL_ID;
			}
			if (ArmPackage.eINSTANCE.getClaim().isSuperTypeOf(
					domainElement.eClass())) {
				return ClaimEditPart.VISUAL_ID;
			}
			if (ArmPackage.eINSTANCE.getArgumentReasoning().isSuperTypeOf(
					domainElement.eClass())) {
				return ArgumentReasoningEditPart.VISUAL_ID;
			}
			if (ArmPackage.eINSTANCE.getInformationElement().isSuperTypeOf(
					domainElement.eClass())) {
				return InformationElementEditPart.VISUAL_ID;
			}
			if (ArmPackage.eINSTANCE.getCitiationElement().isSuperTypeOf(
					domainElement.eClass())) {
				return CitiationElementEditPart.VISUAL_ID;
			}
			if (ArmPackage.eINSTANCE.getArgument().isSuperTypeOf(
					domainElement.eClass())) {
				return ArgumentEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = arm.diagram.part.ARMVisualIDRegistry
				.getModelID(containerView);
		if (!CaseEditPart.MODEL_ID.equals(containerModelID)
				&& !"arm".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (CaseEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = arm.diagram.part.ARMVisualIDRegistry
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
			if (EvidenceAssertationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ClaimEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ArgumentReasoningEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InformationElementEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CitiationElementEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ArgumentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EvidenceAssertationEditPart.VISUAL_ID:
			if (EvidenceAssertationIdentifierEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EvidenceAssertationDescriptionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ClaimEditPart.VISUAL_ID:
			if (ClaimIdentifierEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ClaimDescriptionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ArgumentReasoningEditPart.VISUAL_ID:
			if (ArgumentReasoningIdentifierEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ArgumentReasoningDescriptionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InformationElementEditPart.VISUAL_ID:
			if (InformationElementIdentifierEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InformationElementDescriptionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CitiationElementEditPart.VISUAL_ID:
			if (CitiationElementIdentifierEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CitiationElementDescriptionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ArgumentEditPart.VISUAL_ID:
			if (ArgumentIdentifierEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ArgumentDescriptionEditPart.VISUAL_ID == nodeVisualID) {
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
		if (ArmPackage.eINSTANCE.getAssertedInference().isSuperTypeOf(
				domainElement.eClass())) {
			return AssertedInferenceEditPart.VISUAL_ID;
		}
		if (ArmPackage.eINSTANCE.getAssertedContext().isSuperTypeOf(
				domainElement.eClass())) {
			return AssertedContextEditPart.VISUAL_ID;
		}
		if (ArmPackage.eINSTANCE.getAssertedEvidence().isSuperTypeOf(
				domainElement.eClass())) {
			return AssertedEvidenceEditPart.VISUAL_ID;
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
