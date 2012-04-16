/*
 * 
 */
package GSN1.diagram.part;

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

import GSN1.Assumption;
import GSN1.Case;
import GSN1.Context;
import GSN1.ContextualElement;
import GSN1.DecomposableSpinalElement;
import GSN1.GSN1Package;
import GSN1.Goal;
import GSN1.InContextOf;
import GSN1.Justification;
import GSN1.ModelElement;
import GSN1.Solution;
import GSN1.SolvedBy;
import GSN1.SolvedUsingContract;
import GSN1.SpinalElement;
import GSN1.Strategy;
import GSN1.diagram.edit.parts.ArgumentModuleEditPart;
import GSN1.diagram.edit.parts.AssumptionEditPart;
import GSN1.diagram.edit.parts.CaseEditPart;
import GSN1.diagram.edit.parts.ContextEditPart;
import GSN1.diagram.edit.parts.ContractEditPart;
import GSN1.diagram.edit.parts.GoalEditPart;
import GSN1.diagram.edit.parts.InContextOfEditPart;
import GSN1.diagram.edit.parts.JustificationEditPart;
import GSN1.diagram.edit.parts.SolutionEditPart;
import GSN1.diagram.edit.parts.SolvedByEditPart;
import GSN1.diagram.edit.parts.SolvedUsingContractEditPart;
import GSN1.diagram.edit.parts.StrategyEditPart;
import GSN1.diagram.providers.GSN1ElementTypes;

/**
 * @generated
 */
public class GSN1DiagramUpdater {

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
	public static List<GSN1NodeDescriptor> getSemanticChildren(View view) {
		switch (GSN1VisualIDRegistry.getVisualID(view)) {
		case CaseEditPart.VISUAL_ID:
			return getCase_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GSN1NodeDescriptor> getCase_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Case modelElement = (Case) view.getElement();
		LinkedList<GSN1NodeDescriptor> result = new LinkedList<GSN1NodeDescriptor>();
		for (Iterator<?> it = modelElement.getContains().iterator(); it
				.hasNext();) {
			ModelElement childElement = (ModelElement) it.next();
			int visualID = GSN1VisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == GoalEditPart.VISUAL_ID) {
				result.add(new GSN1NodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == StrategyEditPart.VISUAL_ID) {
				result.add(new GSN1NodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SolutionEditPart.VISUAL_ID) {
				result.add(new GSN1NodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ContextEditPart.VISUAL_ID) {
				result.add(new GSN1NodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == JustificationEditPart.VISUAL_ID) {
				result.add(new GSN1NodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AssumptionEditPart.VISUAL_ID) {
				result.add(new GSN1NodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ContractEditPart.VISUAL_ID) {
				result.add(new GSN1NodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ArgumentModuleEditPart.VISUAL_ID) {
				result.add(new GSN1NodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GSN1LinkDescriptor> getContainedLinks(View view) {
		switch (GSN1VisualIDRegistry.getVisualID(view)) {
		case CaseEditPart.VISUAL_ID:
			return getCase_1000ContainedLinks(view);
		case GoalEditPart.VISUAL_ID:
			return getGoal_2001ContainedLinks(view);
		case StrategyEditPart.VISUAL_ID:
			return getStrategy_2002ContainedLinks(view);
		case SolutionEditPart.VISUAL_ID:
			return getSolution_2003ContainedLinks(view);
		case ContextEditPart.VISUAL_ID:
			return getContext_2004ContainedLinks(view);
		case JustificationEditPart.VISUAL_ID:
			return getJustification_2005ContainedLinks(view);
		case AssumptionEditPart.VISUAL_ID:
			return getAssumption_2006ContainedLinks(view);
		case ContractEditPart.VISUAL_ID:
			return getContract_2007ContainedLinks(view);
		case ArgumentModuleEditPart.VISUAL_ID:
			return getArgumentModule_2008ContainedLinks(view);
		case SolvedUsingContractEditPart.VISUAL_ID:
			return getSolvedUsingContract_4001ContainedLinks(view);
		case SolvedByEditPart.VISUAL_ID:
			return getSolvedBy_4002ContainedLinks(view);
		case InContextOfEditPart.VISUAL_ID:
			return getInContextOf_4003ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GSN1LinkDescriptor> getIncomingLinks(View view) {
		switch (GSN1VisualIDRegistry.getVisualID(view)) {
		case GoalEditPart.VISUAL_ID:
			return getGoal_2001IncomingLinks(view);
		case StrategyEditPart.VISUAL_ID:
			return getStrategy_2002IncomingLinks(view);
		case SolutionEditPart.VISUAL_ID:
			return getSolution_2003IncomingLinks(view);
		case ContextEditPart.VISUAL_ID:
			return getContext_2004IncomingLinks(view);
		case JustificationEditPart.VISUAL_ID:
			return getJustification_2005IncomingLinks(view);
		case AssumptionEditPart.VISUAL_ID:
			return getAssumption_2006IncomingLinks(view);
		case ContractEditPart.VISUAL_ID:
			return getContract_2007IncomingLinks(view);
		case ArgumentModuleEditPart.VISUAL_ID:
			return getArgumentModule_2008IncomingLinks(view);
		case SolvedUsingContractEditPart.VISUAL_ID:
			return getSolvedUsingContract_4001IncomingLinks(view);
		case SolvedByEditPart.VISUAL_ID:
			return getSolvedBy_4002IncomingLinks(view);
		case InContextOfEditPart.VISUAL_ID:
			return getInContextOf_4003IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GSN1LinkDescriptor> getOutgoingLinks(View view) {
		switch (GSN1VisualIDRegistry.getVisualID(view)) {
		case GoalEditPart.VISUAL_ID:
			return getGoal_2001OutgoingLinks(view);
		case StrategyEditPart.VISUAL_ID:
			return getStrategy_2002OutgoingLinks(view);
		case SolutionEditPart.VISUAL_ID:
			return getSolution_2003OutgoingLinks(view);
		case ContextEditPart.VISUAL_ID:
			return getContext_2004OutgoingLinks(view);
		case JustificationEditPart.VISUAL_ID:
			return getJustification_2005OutgoingLinks(view);
		case AssumptionEditPart.VISUAL_ID:
			return getAssumption_2006OutgoingLinks(view);
		case ContractEditPart.VISUAL_ID:
			return getContract_2007OutgoingLinks(view);
		case ArgumentModuleEditPart.VISUAL_ID:
			return getArgumentModule_2008OutgoingLinks(view);
		case SolvedUsingContractEditPart.VISUAL_ID:
			return getSolvedUsingContract_4001OutgoingLinks(view);
		case SolvedByEditPart.VISUAL_ID:
			return getSolvedBy_4002OutgoingLinks(view);
		case InContextOfEditPart.VISUAL_ID:
			return getInContextOf_4003OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GSN1LinkDescriptor> getCase_1000ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GSN1LinkDescriptor> getGoal_2001ContainedLinks(View view) {
		Goal modelElement = (Goal) view.getElement();
		LinkedList<GSN1LinkDescriptor> result = new LinkedList<GSN1LinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_SolvedUsingContract_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_SolvedBy_4002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_InContextOf_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GSN1LinkDescriptor> getStrategy_2002ContainedLinks(
			View view) {
		Strategy modelElement = (Strategy) view.getElement();
		LinkedList<GSN1LinkDescriptor> result = new LinkedList<GSN1LinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_SolvedUsingContract_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_SolvedBy_4002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_InContextOf_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GSN1LinkDescriptor> getSolution_2003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GSN1LinkDescriptor> getContext_2004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GSN1LinkDescriptor> getJustification_2005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GSN1LinkDescriptor> getAssumption_2006ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GSN1LinkDescriptor> getContract_2007ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GSN1LinkDescriptor> getArgumentModule_2008ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GSN1LinkDescriptor> getSolvedUsingContract_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GSN1LinkDescriptor> getSolvedBy_4002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GSN1LinkDescriptor> getInContextOf_4003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GSN1LinkDescriptor> getGoal_2001IncomingLinks(View view) {
		Goal modelElement = (Goal) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<GSN1LinkDescriptor> result = new LinkedList<GSN1LinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_SolvedUsingContract_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SolvedBy_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GSN1LinkDescriptor> getStrategy_2002IncomingLinks(
			View view) {
		Strategy modelElement = (Strategy) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<GSN1LinkDescriptor> result = new LinkedList<GSN1LinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_SolvedUsingContract_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SolvedBy_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GSN1LinkDescriptor> getSolution_2003IncomingLinks(
			View view) {
		Solution modelElement = (Solution) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<GSN1LinkDescriptor> result = new LinkedList<GSN1LinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_SolvedUsingContract_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SolvedBy_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GSN1LinkDescriptor> getContext_2004IncomingLinks(
			View view) {
		Context modelElement = (Context) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<GSN1LinkDescriptor> result = new LinkedList<GSN1LinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_InContextOf_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GSN1LinkDescriptor> getJustification_2005IncomingLinks(
			View view) {
		Justification modelElement = (Justification) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<GSN1LinkDescriptor> result = new LinkedList<GSN1LinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_InContextOf_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GSN1LinkDescriptor> getAssumption_2006IncomingLinks(
			View view) {
		Assumption modelElement = (Assumption) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<GSN1LinkDescriptor> result = new LinkedList<GSN1LinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_InContextOf_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GSN1LinkDescriptor> getContract_2007IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GSN1LinkDescriptor> getArgumentModule_2008IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GSN1LinkDescriptor> getSolvedUsingContract_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GSN1LinkDescriptor> getSolvedBy_4002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GSN1LinkDescriptor> getInContextOf_4003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GSN1LinkDescriptor> getGoal_2001OutgoingLinks(View view) {
		Goal modelElement = (Goal) view.getElement();
		LinkedList<GSN1LinkDescriptor> result = new LinkedList<GSN1LinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_SolvedUsingContract_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_SolvedBy_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_InContextOf_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GSN1LinkDescriptor> getStrategy_2002OutgoingLinks(
			View view) {
		Strategy modelElement = (Strategy) view.getElement();
		LinkedList<GSN1LinkDescriptor> result = new LinkedList<GSN1LinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_SolvedUsingContract_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_SolvedBy_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_InContextOf_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GSN1LinkDescriptor> getSolution_2003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GSN1LinkDescriptor> getContext_2004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GSN1LinkDescriptor> getJustification_2005OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GSN1LinkDescriptor> getAssumption_2006OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GSN1LinkDescriptor> getContract_2007OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GSN1LinkDescriptor> getArgumentModule_2008OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GSN1LinkDescriptor> getSolvedUsingContract_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GSN1LinkDescriptor> getSolvedBy_4002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GSN1LinkDescriptor> getInContextOf_4003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<GSN1LinkDescriptor> getContainedTypeModelFacetLinks_SolvedUsingContract_4001(
			DecomposableSpinalElement container) {
		LinkedList<GSN1LinkDescriptor> result = new LinkedList<GSN1LinkDescriptor>();
		for (Iterator<?> links = container.getChildSolvedBy().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof SolvedUsingContract) {
				continue;
			}
			SolvedUsingContract link = (SolvedUsingContract) linkObject;
			if (SolvedUsingContractEditPart.VISUAL_ID != GSN1VisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			SpinalElement dst = link.getChildSpinalelement();
			DecomposableSpinalElement src = link.getParentSpinalElement();
			result.add(new GSN1LinkDescriptor(src, dst, link,
					GSN1ElementTypes.SolvedUsingContract_4001,
					SolvedUsingContractEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<GSN1LinkDescriptor> getContainedTypeModelFacetLinks_SolvedBy_4002(
			DecomposableSpinalElement container) {
		LinkedList<GSN1LinkDescriptor> result = new LinkedList<GSN1LinkDescriptor>();
		for (Iterator<?> links = container.getChildSolvedBy().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof SolvedBy) {
				continue;
			}
			SolvedBy link = (SolvedBy) linkObject;
			if (SolvedByEditPart.VISUAL_ID != GSN1VisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			SpinalElement dst = link.getChildSpinalelement();
			DecomposableSpinalElement src = link.getParentSpinalElement();
			result.add(new GSN1LinkDescriptor(src, dst, link,
					GSN1ElementTypes.SolvedBy_4002, SolvedByEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<GSN1LinkDescriptor> getContainedTypeModelFacetLinks_InContextOf_4003(
			DecomposableSpinalElement container) {
		LinkedList<GSN1LinkDescriptor> result = new LinkedList<GSN1LinkDescriptor>();
		for (Iterator<?> links = container.getHasContext().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof InContextOf) {
				continue;
			}
			InContextOf link = (InContextOf) linkObject;
			if (InContextOfEditPart.VISUAL_ID != GSN1VisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ContextualElement dst = link.getContextualElement();
			DecomposableSpinalElement src = link.getContextOfSpinalElement();
			result.add(new GSN1LinkDescriptor(src, dst, link,
					GSN1ElementTypes.InContextOf_4003,
					InContextOfEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<GSN1LinkDescriptor> getIncomingTypeModelFacetLinks_SolvedUsingContract_4001(
			SpinalElement target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<GSN1LinkDescriptor> result = new LinkedList<GSN1LinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != GSN1Package.eINSTANCE
					.getSolvedBy_ChildSpinalelement()
					|| false == setting.getEObject() instanceof SolvedUsingContract) {
				continue;
			}
			SolvedUsingContract link = (SolvedUsingContract) setting
					.getEObject();
			if (SolvedUsingContractEditPart.VISUAL_ID != GSN1VisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			DecomposableSpinalElement src = link.getParentSpinalElement();
			result.add(new GSN1LinkDescriptor(src, target, link,
					GSN1ElementTypes.SolvedUsingContract_4001,
					SolvedUsingContractEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<GSN1LinkDescriptor> getIncomingTypeModelFacetLinks_SolvedBy_4002(
			SpinalElement target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<GSN1LinkDescriptor> result = new LinkedList<GSN1LinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != GSN1Package.eINSTANCE
					.getSolvedBy_ChildSpinalelement()
					|| false == setting.getEObject() instanceof SolvedBy) {
				continue;
			}
			SolvedBy link = (SolvedBy) setting.getEObject();
			if (SolvedByEditPart.VISUAL_ID != GSN1VisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			DecomposableSpinalElement src = link.getParentSpinalElement();
			result.add(new GSN1LinkDescriptor(src, target, link,
					GSN1ElementTypes.SolvedBy_4002, SolvedByEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<GSN1LinkDescriptor> getIncomingTypeModelFacetLinks_InContextOf_4003(
			ContextualElement target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<GSN1LinkDescriptor> result = new LinkedList<GSN1LinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != GSN1Package.eINSTANCE
					.getInContextOf_ContextualElement()
					|| false == setting.getEObject() instanceof InContextOf) {
				continue;
			}
			InContextOf link = (InContextOf) setting.getEObject();
			if (InContextOfEditPart.VISUAL_ID != GSN1VisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			DecomposableSpinalElement src = link.getContextOfSpinalElement();
			result.add(new GSN1LinkDescriptor(src, target, link,
					GSN1ElementTypes.InContextOf_4003,
					InContextOfEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<GSN1LinkDescriptor> getOutgoingTypeModelFacetLinks_SolvedUsingContract_4001(
			DecomposableSpinalElement source) {
		DecomposableSpinalElement container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof DecomposableSpinalElement) {
				container = (DecomposableSpinalElement) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<GSN1LinkDescriptor> result = new LinkedList<GSN1LinkDescriptor>();
		for (Iterator<?> links = container.getChildSolvedBy().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof SolvedUsingContract) {
				continue;
			}
			SolvedUsingContract link = (SolvedUsingContract) linkObject;
			if (SolvedUsingContractEditPart.VISUAL_ID != GSN1VisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			SpinalElement dst = link.getChildSpinalelement();
			DecomposableSpinalElement src = link.getParentSpinalElement();
			if (src != source) {
				continue;
			}
			result.add(new GSN1LinkDescriptor(src, dst, link,
					GSN1ElementTypes.SolvedUsingContract_4001,
					SolvedUsingContractEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<GSN1LinkDescriptor> getOutgoingTypeModelFacetLinks_SolvedBy_4002(
			DecomposableSpinalElement source) {
		DecomposableSpinalElement container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof DecomposableSpinalElement) {
				container = (DecomposableSpinalElement) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<GSN1LinkDescriptor> result = new LinkedList<GSN1LinkDescriptor>();
		for (Iterator<?> links = container.getChildSolvedBy().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof SolvedBy) {
				continue;
			}
			SolvedBy link = (SolvedBy) linkObject;
			if (SolvedByEditPart.VISUAL_ID != GSN1VisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			SpinalElement dst = link.getChildSpinalelement();
			DecomposableSpinalElement src = link.getParentSpinalElement();
			if (src != source) {
				continue;
			}
			result.add(new GSN1LinkDescriptor(src, dst, link,
					GSN1ElementTypes.SolvedBy_4002, SolvedByEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<GSN1LinkDescriptor> getOutgoingTypeModelFacetLinks_InContextOf_4003(
			DecomposableSpinalElement source) {
		DecomposableSpinalElement container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof DecomposableSpinalElement) {
				container = (DecomposableSpinalElement) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<GSN1LinkDescriptor> result = new LinkedList<GSN1LinkDescriptor>();
		for (Iterator<?> links = container.getHasContext().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof InContextOf) {
				continue;
			}
			InContextOf link = (InContextOf) linkObject;
			if (InContextOfEditPart.VISUAL_ID != GSN1VisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ContextualElement dst = link.getContextualElement();
			DecomposableSpinalElement src = link.getContextOfSpinalElement();
			if (src != source) {
				continue;
			}
			result.add(new GSN1LinkDescriptor(src, dst, link,
					GSN1ElementTypes.InContextOf_4003,
					InContextOfEditPart.VISUAL_ID));
		}
		return result;
	}

}
