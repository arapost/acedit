/*
 * 
 */
package arm.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;

import arm.Argument;
import arm.ArgumentReasoning;
import arm.ArmPackage;
import arm.AssertedContext;
import arm.AssertedEvidence;
import arm.AssertedInference;
import arm.Case;
import arm.CitiationElement;
import arm.Claim;
import arm.EvidenceAssertation;
import arm.InformationElement;
import arm.ModelElement;
import arm.diagram.edit.parts.ArgumentEditPart;
import arm.diagram.edit.parts.ArgumentReasoningEditPart;
import arm.diagram.edit.parts.AssertedContextEditPart;
import arm.diagram.edit.parts.AssertedEvidenceEditPart;
import arm.diagram.edit.parts.AssertedInferenceEditPart;
import arm.diagram.edit.parts.CaseEditPart;
import arm.diagram.edit.parts.CitiationElementEditPart;
import arm.diagram.edit.parts.ClaimEditPart;
import arm.diagram.edit.parts.EvidenceAssertationEditPart;
import arm.diagram.edit.parts.InformationElementEditPart;
import arm.diagram.providers.ARMElementTypes;

/**
 * @generated
 */
public class ARMDiagramUpdater {

	/**
	 * @generated
	 */
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null
				|| view.getElement().eIsProxy();
	}

	/**
	 * @generated
	 */
	public static List<ARMNodeDescriptor> getSemanticChildren(View view) {
		switch (ARMVisualIDRegistry.getVisualID(view)) {
		case CaseEditPart.VISUAL_ID:
			return getCase_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ARMNodeDescriptor> getCase_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Case modelElement = (Case) view.getElement();
		LinkedList<ARMNodeDescriptor> result = new LinkedList<ARMNodeDescriptor>();
		for (Iterator<?> it = modelElement.getContains().iterator(); it
				.hasNext();) {
			ModelElement childElement = (ModelElement) it.next();
			int visualID = ARMVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == EvidenceAssertationEditPart.VISUAL_ID) {
				result.add(new ARMNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ClaimEditPart.VISUAL_ID) {
				result.add(new ARMNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ArgumentReasoningEditPart.VISUAL_ID) {
				result.add(new ARMNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == InformationElementEditPart.VISUAL_ID) {
				result.add(new ARMNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CitiationElementEditPart.VISUAL_ID) {
				result.add(new ARMNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ArgumentEditPart.VISUAL_ID) {
				result.add(new ARMNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ARMLinkDescriptor> getContainedLinks(View view) {
		switch (ARMVisualIDRegistry.getVisualID(view)) {
		case CaseEditPart.VISUAL_ID:
			return getCase_1000ContainedLinks(view);
		case EvidenceAssertationEditPart.VISUAL_ID:
			return getEvidenceAssertation_2001ContainedLinks(view);
		case ClaimEditPart.VISUAL_ID:
			return getClaim_2002ContainedLinks(view);
		case ArgumentReasoningEditPart.VISUAL_ID:
			return getArgumentReasoning_2003ContainedLinks(view);
		case InformationElementEditPart.VISUAL_ID:
			return getInformationElement_2004ContainedLinks(view);
		case CitiationElementEditPart.VISUAL_ID:
			return getCitiationElement_2005ContainedLinks(view);
		case ArgumentEditPart.VISUAL_ID:
			return getArgument_2006ContainedLinks(view);
		case AssertedInferenceEditPart.VISUAL_ID:
			return getAssertedInference_4001ContainedLinks(view);
		case AssertedContextEditPart.VISUAL_ID:
			return getAssertedContext_4002ContainedLinks(view);
		case AssertedEvidenceEditPart.VISUAL_ID:
			return getAssertedEvidence_4003ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ARMLinkDescriptor> getIncomingLinks(View view) {
		switch (ARMVisualIDRegistry.getVisualID(view)) {
		case EvidenceAssertationEditPart.VISUAL_ID:
			return getEvidenceAssertation_2001IncomingLinks(view);
		case ClaimEditPart.VISUAL_ID:
			return getClaim_2002IncomingLinks(view);
		case ArgumentReasoningEditPart.VISUAL_ID:
			return getArgumentReasoning_2003IncomingLinks(view);
		case InformationElementEditPart.VISUAL_ID:
			return getInformationElement_2004IncomingLinks(view);
		case CitiationElementEditPart.VISUAL_ID:
			return getCitiationElement_2005IncomingLinks(view);
		case ArgumentEditPart.VISUAL_ID:
			return getArgument_2006IncomingLinks(view);
		case AssertedInferenceEditPart.VISUAL_ID:
			return getAssertedInference_4001IncomingLinks(view);
		case AssertedContextEditPart.VISUAL_ID:
			return getAssertedContext_4002IncomingLinks(view);
		case AssertedEvidenceEditPart.VISUAL_ID:
			return getAssertedEvidence_4003IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ARMLinkDescriptor> getOutgoingLinks(View view) {
		switch (ARMVisualIDRegistry.getVisualID(view)) {
		case EvidenceAssertationEditPart.VISUAL_ID:
			return getEvidenceAssertation_2001OutgoingLinks(view);
		case ClaimEditPart.VISUAL_ID:
			return getClaim_2002OutgoingLinks(view);
		case ArgumentReasoningEditPart.VISUAL_ID:
			return getArgumentReasoning_2003OutgoingLinks(view);
		case InformationElementEditPart.VISUAL_ID:
			return getInformationElement_2004OutgoingLinks(view);
		case CitiationElementEditPart.VISUAL_ID:
			return getCitiationElement_2005OutgoingLinks(view);
		case ArgumentEditPart.VISUAL_ID:
			return getArgument_2006OutgoingLinks(view);
		case AssertedInferenceEditPart.VISUAL_ID:
			return getAssertedInference_4001OutgoingLinks(view);
		case AssertedContextEditPart.VISUAL_ID:
			return getAssertedContext_4002OutgoingLinks(view);
		case AssertedEvidenceEditPart.VISUAL_ID:
			return getAssertedEvidence_4003OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ARMLinkDescriptor> getCase_1000ContainedLinks(View view) {
		Case modelElement = (Case) view.getElement();
		LinkedList<ARMLinkDescriptor> result = new LinkedList<ARMLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_AssertedInference_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_AssertedContext_4002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_AssertedEvidence_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ARMLinkDescriptor> getEvidenceAssertation_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ARMLinkDescriptor> getClaim_2002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ARMLinkDescriptor> getArgumentReasoning_2003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ARMLinkDescriptor> getInformationElement_2004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ARMLinkDescriptor> getCitiationElement_2005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ARMLinkDescriptor> getArgument_2006ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ARMLinkDescriptor> getAssertedInference_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ARMLinkDescriptor> getAssertedContext_4002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ARMLinkDescriptor> getAssertedEvidence_4003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ARMLinkDescriptor> getEvidenceAssertation_2001IncomingLinks(
			View view) {
		EvidenceAssertation modelElement = (EvidenceAssertation) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ARMLinkDescriptor> result = new LinkedList<ARMLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_AssertedInference_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AssertedContext_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AssertedEvidence_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ARMLinkDescriptor> getClaim_2002IncomingLinks(View view) {
		Claim modelElement = (Claim) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ARMLinkDescriptor> result = new LinkedList<ARMLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_AssertedInference_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AssertedContext_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AssertedEvidence_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ARMLinkDescriptor> getArgumentReasoning_2003IncomingLinks(
			View view) {
		ArgumentReasoning modelElement = (ArgumentReasoning) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ARMLinkDescriptor> result = new LinkedList<ARMLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_AssertedInference_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AssertedContext_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AssertedEvidence_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ARMLinkDescriptor> getInformationElement_2004IncomingLinks(
			View view) {
		InformationElement modelElement = (InformationElement) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ARMLinkDescriptor> result = new LinkedList<ARMLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_AssertedInference_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AssertedContext_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AssertedEvidence_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ARMLinkDescriptor> getCitiationElement_2005IncomingLinks(
			View view) {
		CitiationElement modelElement = (CitiationElement) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ARMLinkDescriptor> result = new LinkedList<ARMLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_AssertedInference_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AssertedContext_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AssertedEvidence_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ARMLinkDescriptor> getArgument_2006IncomingLinks(
			View view) {
		Argument modelElement = (Argument) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ARMLinkDescriptor> result = new LinkedList<ARMLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_AssertedInference_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AssertedContext_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AssertedEvidence_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ARMLinkDescriptor> getAssertedInference_4001IncomingLinks(
			View view) {
		AssertedInference modelElement = (AssertedInference) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ARMLinkDescriptor> result = new LinkedList<ARMLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_AssertedInference_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AssertedContext_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AssertedEvidence_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ARMLinkDescriptor> getAssertedContext_4002IncomingLinks(
			View view) {
		AssertedContext modelElement = (AssertedContext) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ARMLinkDescriptor> result = new LinkedList<ARMLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_AssertedInference_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AssertedContext_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AssertedEvidence_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ARMLinkDescriptor> getAssertedEvidence_4003IncomingLinks(
			View view) {
		AssertedEvidence modelElement = (AssertedEvidence) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ARMLinkDescriptor> result = new LinkedList<ARMLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_AssertedInference_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AssertedContext_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AssertedEvidence_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ARMLinkDescriptor> getEvidenceAssertation_2001OutgoingLinks(
			View view) {
		EvidenceAssertation modelElement = (EvidenceAssertation) view
				.getElement();
		LinkedList<ARMLinkDescriptor> result = new LinkedList<ARMLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_AssertedInference_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_AssertedContext_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_AssertedEvidence_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ARMLinkDescriptor> getClaim_2002OutgoingLinks(View view) {
		Claim modelElement = (Claim) view.getElement();
		LinkedList<ARMLinkDescriptor> result = new LinkedList<ARMLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_AssertedInference_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_AssertedContext_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_AssertedEvidence_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ARMLinkDescriptor> getArgumentReasoning_2003OutgoingLinks(
			View view) {
		ArgumentReasoning modelElement = (ArgumentReasoning) view.getElement();
		LinkedList<ARMLinkDescriptor> result = new LinkedList<ARMLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_AssertedInference_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_AssertedContext_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_AssertedEvidence_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ARMLinkDescriptor> getInformationElement_2004OutgoingLinks(
			View view) {
		InformationElement modelElement = (InformationElement) view
				.getElement();
		LinkedList<ARMLinkDescriptor> result = new LinkedList<ARMLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_AssertedInference_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_AssertedContext_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_AssertedEvidence_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ARMLinkDescriptor> getCitiationElement_2005OutgoingLinks(
			View view) {
		CitiationElement modelElement = (CitiationElement) view.getElement();
		LinkedList<ARMLinkDescriptor> result = new LinkedList<ARMLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_AssertedInference_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_AssertedContext_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_AssertedEvidence_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ARMLinkDescriptor> getArgument_2006OutgoingLinks(
			View view) {
		Argument modelElement = (Argument) view.getElement();
		LinkedList<ARMLinkDescriptor> result = new LinkedList<ARMLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_AssertedInference_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_AssertedContext_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_AssertedEvidence_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ARMLinkDescriptor> getAssertedInference_4001OutgoingLinks(
			View view) {
		AssertedInference modelElement = (AssertedInference) view.getElement();
		LinkedList<ARMLinkDescriptor> result = new LinkedList<ARMLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_AssertedInference_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_AssertedContext_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_AssertedEvidence_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ARMLinkDescriptor> getAssertedContext_4002OutgoingLinks(
			View view) {
		AssertedContext modelElement = (AssertedContext) view.getElement();
		LinkedList<ARMLinkDescriptor> result = new LinkedList<ARMLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_AssertedInference_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_AssertedContext_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_AssertedEvidence_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ARMLinkDescriptor> getAssertedEvidence_4003OutgoingLinks(
			View view) {
		AssertedEvidence modelElement = (AssertedEvidence) view.getElement();
		LinkedList<ARMLinkDescriptor> result = new LinkedList<ARMLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_AssertedInference_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_AssertedContext_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_AssertedEvidence_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ARMLinkDescriptor> getContainedTypeModelFacetLinks_AssertedInference_4001(
			Case container) {
		LinkedList<ARMLinkDescriptor> result = new LinkedList<ARMLinkDescriptor>();
		for (Iterator<?> links = container.getContains().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof AssertedInference) {
				continue;
			}
			AssertedInference link = (AssertedInference) linkObject;
			if (AssertedInferenceEditPart.VISUAL_ID != ARMVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getTarget();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof ModelElement) {
				continue;
			}
			ModelElement dst = (ModelElement) theTarget;
			List sources = link.getSource();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof ModelElement) {
				continue;
			}
			ModelElement src = (ModelElement) theSource;
			result.add(new ARMLinkDescriptor(src, dst, link,
					ARMElementTypes.AssertedInference_4001,
					AssertedInferenceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ARMLinkDescriptor> getContainedTypeModelFacetLinks_AssertedContext_4002(
			Case container) {
		LinkedList<ARMLinkDescriptor> result = new LinkedList<ARMLinkDescriptor>();
		for (Iterator<?> links = container.getContains().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof AssertedContext) {
				continue;
			}
			AssertedContext link = (AssertedContext) linkObject;
			if (AssertedContextEditPart.VISUAL_ID != ARMVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getTarget();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof ModelElement) {
				continue;
			}
			ModelElement dst = (ModelElement) theTarget;
			List sources = link.getSource();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof ModelElement) {
				continue;
			}
			ModelElement src = (ModelElement) theSource;
			result.add(new ARMLinkDescriptor(src, dst, link,
					ARMElementTypes.AssertedContext_4002,
					AssertedContextEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ARMLinkDescriptor> getContainedTypeModelFacetLinks_AssertedEvidence_4003(
			Case container) {
		LinkedList<ARMLinkDescriptor> result = new LinkedList<ARMLinkDescriptor>();
		for (Iterator<?> links = container.getContains().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof AssertedEvidence) {
				continue;
			}
			AssertedEvidence link = (AssertedEvidence) linkObject;
			if (AssertedEvidenceEditPart.VISUAL_ID != ARMVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getTarget();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof ModelElement) {
				continue;
			}
			ModelElement dst = (ModelElement) theTarget;
			List sources = link.getSource();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof ModelElement) {
				continue;
			}
			ModelElement src = (ModelElement) theSource;
			result.add(new ARMLinkDescriptor(src, dst, link,
					ARMElementTypes.AssertedEvidence_4003,
					AssertedEvidenceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ARMLinkDescriptor> getIncomingTypeModelFacetLinks_AssertedInference_4001(
			ModelElement target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ARMLinkDescriptor> result = new LinkedList<ARMLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ArmPackage.eINSTANCE
					.getArgumentLink_Target()
					|| false == setting.getEObject() instanceof AssertedInference) {
				continue;
			}
			AssertedInference link = (AssertedInference) setting.getEObject();
			if (AssertedInferenceEditPart.VISUAL_ID != ARMVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List sources = link.getSource();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof ModelElement) {
				continue;
			}
			ModelElement src = (ModelElement) theSource;
			result.add(new ARMLinkDescriptor(src, target, link,
					ARMElementTypes.AssertedInference_4001,
					AssertedInferenceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ARMLinkDescriptor> getIncomingTypeModelFacetLinks_AssertedContext_4002(
			ModelElement target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ARMLinkDescriptor> result = new LinkedList<ARMLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ArmPackage.eINSTANCE
					.getArgumentLink_Target()
					|| false == setting.getEObject() instanceof AssertedContext) {
				continue;
			}
			AssertedContext link = (AssertedContext) setting.getEObject();
			if (AssertedContextEditPart.VISUAL_ID != ARMVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List sources = link.getSource();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof ModelElement) {
				continue;
			}
			ModelElement src = (ModelElement) theSource;
			result.add(new ARMLinkDescriptor(src, target, link,
					ARMElementTypes.AssertedContext_4002,
					AssertedContextEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ARMLinkDescriptor> getIncomingTypeModelFacetLinks_AssertedEvidence_4003(
			ModelElement target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ARMLinkDescriptor> result = new LinkedList<ARMLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ArmPackage.eINSTANCE
					.getArgumentLink_Target()
					|| false == setting.getEObject() instanceof AssertedEvidence) {
				continue;
			}
			AssertedEvidence link = (AssertedEvidence) setting.getEObject();
			if (AssertedEvidenceEditPart.VISUAL_ID != ARMVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List sources = link.getSource();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof ModelElement) {
				continue;
			}
			ModelElement src = (ModelElement) theSource;
			result.add(new ARMLinkDescriptor(src, target, link,
					ARMElementTypes.AssertedEvidence_4003,
					AssertedEvidenceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ARMLinkDescriptor> getOutgoingTypeModelFacetLinks_AssertedInference_4001(
			ModelElement source) {
		Case container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Case) {
				container = (Case) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<ARMLinkDescriptor> result = new LinkedList<ARMLinkDescriptor>();
		for (Iterator<?> links = container.getContains().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof AssertedInference) {
				continue;
			}
			AssertedInference link = (AssertedInference) linkObject;
			if (AssertedInferenceEditPart.VISUAL_ID != ARMVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getTarget();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof ModelElement) {
				continue;
			}
			ModelElement dst = (ModelElement) theTarget;
			List sources = link.getSource();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof ModelElement) {
				continue;
			}
			ModelElement src = (ModelElement) theSource;
			if (src != source) {
				continue;
			}
			result.add(new ARMLinkDescriptor(src, dst, link,
					ARMElementTypes.AssertedInference_4001,
					AssertedInferenceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ARMLinkDescriptor> getOutgoingTypeModelFacetLinks_AssertedContext_4002(
			ModelElement source) {
		Case container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Case) {
				container = (Case) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<ARMLinkDescriptor> result = new LinkedList<ARMLinkDescriptor>();
		for (Iterator<?> links = container.getContains().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof AssertedContext) {
				continue;
			}
			AssertedContext link = (AssertedContext) linkObject;
			if (AssertedContextEditPart.VISUAL_ID != ARMVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getTarget();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof ModelElement) {
				continue;
			}
			ModelElement dst = (ModelElement) theTarget;
			List sources = link.getSource();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof ModelElement) {
				continue;
			}
			ModelElement src = (ModelElement) theSource;
			if (src != source) {
				continue;
			}
			result.add(new ARMLinkDescriptor(src, dst, link,
					ARMElementTypes.AssertedContext_4002,
					AssertedContextEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ARMLinkDescriptor> getOutgoingTypeModelFacetLinks_AssertedEvidence_4003(
			ModelElement source) {
		Case container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Case) {
				container = (Case) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<ARMLinkDescriptor> result = new LinkedList<ARMLinkDescriptor>();
		for (Iterator<?> links = container.getContains().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof AssertedEvidence) {
				continue;
			}
			AssertedEvidence link = (AssertedEvidence) linkObject;
			if (AssertedEvidenceEditPart.VISUAL_ID != ARMVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getTarget();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof ModelElement) {
				continue;
			}
			ModelElement dst = (ModelElement) theTarget;
			List sources = link.getSource();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof ModelElement) {
				continue;
			}
			ModelElement src = (ModelElement) theSource;
			if (src != source) {
				continue;
			}
			result.add(new ARMLinkDescriptor(src, dst, link,
					ARMElementTypes.AssertedEvidence_4003,
					AssertedEvidenceEditPart.VISUAL_ID));
		}
		return result;
	}

}
