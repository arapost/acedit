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

import GSN1.ArgumentModule;
import GSN1.Assumption;
import GSN1.AwayContext;
import GSN1.AwayGoal;
import GSN1.AwaySolution;
import GSN1.Case;
import GSN1.Context;
import GSN1.ContractModule;
import GSN1.DecomposableSpinalElement;
import GSN1.GSN1Package;
import GSN1.Goal;
import GSN1.InContextOf;
import GSN1.InContextOfModular;
import GSN1.InTheContextOfTargetElement;
import GSN1.Justification;
import GSN1.ModelElement;
import GSN1.Module;
import GSN1.Solution;
import GSN1.SolvedBy;
import GSN1.SolvedByModular;
import GSN1.SolvedByTargetElement;
import GSN1.Strategy;
import GSN1.diagram.edit.parts.ArgumentModuleEditPart;
import GSN1.diagram.edit.parts.AssumptionEditPart;
import GSN1.diagram.edit.parts.AwayContextEditPart;
import GSN1.diagram.edit.parts.AwayGoalEditPart;
import GSN1.diagram.edit.parts.AwaySolutionEditPart;
import GSN1.diagram.edit.parts.CaseEditPart;
import GSN1.diagram.edit.parts.ContextEditPart;
import GSN1.diagram.edit.parts.ContractModuleEditPart;
import GSN1.diagram.edit.parts.GoalEditPart;
import GSN1.diagram.edit.parts.InContextOfEditPart;
import GSN1.diagram.edit.parts.InContextOfModularEditPart;
import GSN1.diagram.edit.parts.JustificationEditPart;
import GSN1.diagram.edit.parts.SolutionEditPart;
import GSN1.diagram.edit.parts.SolvedByEditPart;
import GSN1.diagram.edit.parts.SolvedByModularEditPart;
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
			if (visualID == AwayGoalEditPart.VISUAL_ID) {
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
			if (visualID == AwayContextEditPart.VISUAL_ID) {
				result.add(new GSN1NodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AwaySolutionEditPart.VISUAL_ID) {
				result.add(new GSN1NodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ArgumentModuleEditPart.VISUAL_ID) {
				result.add(new GSN1NodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ContractModuleEditPart.VISUAL_ID) {
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
		case AwayGoalEditPart.VISUAL_ID:
			return getAwayGoal_2003ContainedLinks(view);
		case SolutionEditPart.VISUAL_ID:
			return getSolution_2004ContainedLinks(view);
		case ContextEditPart.VISUAL_ID:
			return getContext_2005ContainedLinks(view);
		case JustificationEditPart.VISUAL_ID:
			return getJustification_2006ContainedLinks(view);
		case AssumptionEditPart.VISUAL_ID:
			return getAssumption_2007ContainedLinks(view);
		case AwayContextEditPart.VISUAL_ID:
			return getAwayContext_2008ContainedLinks(view);
		case AwaySolutionEditPart.VISUAL_ID:
			return getAwaySolution_2009ContainedLinks(view);
		case ArgumentModuleEditPart.VISUAL_ID:
			return getArgumentModule_2010ContainedLinks(view);
		case ContractModuleEditPart.VISUAL_ID:
			return getContractModule_2011ContainedLinks(view);
		case SolvedByModularEditPart.VISUAL_ID:
			return getSolvedByModular_4001ContainedLinks(view);
		case InContextOfModularEditPart.VISUAL_ID:
			return getInContextOfModular_4002ContainedLinks(view);
		case SolvedByEditPart.VISUAL_ID:
			return getSolvedBy_4003ContainedLinks(view);
		case InContextOfEditPart.VISUAL_ID:
			return getInContextOf_4004ContainedLinks(view);
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
		case AwayGoalEditPart.VISUAL_ID:
			return getAwayGoal_2003IncomingLinks(view);
		case SolutionEditPart.VISUAL_ID:
			return getSolution_2004IncomingLinks(view);
		case ContextEditPart.VISUAL_ID:
			return getContext_2005IncomingLinks(view);
		case JustificationEditPart.VISUAL_ID:
			return getJustification_2006IncomingLinks(view);
		case AssumptionEditPart.VISUAL_ID:
			return getAssumption_2007IncomingLinks(view);
		case AwayContextEditPart.VISUAL_ID:
			return getAwayContext_2008IncomingLinks(view);
		case AwaySolutionEditPart.VISUAL_ID:
			return getAwaySolution_2009IncomingLinks(view);
		case ArgumentModuleEditPart.VISUAL_ID:
			return getArgumentModule_2010IncomingLinks(view);
		case ContractModuleEditPart.VISUAL_ID:
			return getContractModule_2011IncomingLinks(view);
		case SolvedByModularEditPart.VISUAL_ID:
			return getSolvedByModular_4001IncomingLinks(view);
		case InContextOfModularEditPart.VISUAL_ID:
			return getInContextOfModular_4002IncomingLinks(view);
		case SolvedByEditPart.VISUAL_ID:
			return getSolvedBy_4003IncomingLinks(view);
		case InContextOfEditPart.VISUAL_ID:
			return getInContextOf_4004IncomingLinks(view);
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
		case AwayGoalEditPart.VISUAL_ID:
			return getAwayGoal_2003OutgoingLinks(view);
		case SolutionEditPart.VISUAL_ID:
			return getSolution_2004OutgoingLinks(view);
		case ContextEditPart.VISUAL_ID:
			return getContext_2005OutgoingLinks(view);
		case JustificationEditPart.VISUAL_ID:
			return getJustification_2006OutgoingLinks(view);
		case AssumptionEditPart.VISUAL_ID:
			return getAssumption_2007OutgoingLinks(view);
		case AwayContextEditPart.VISUAL_ID:
			return getAwayContext_2008OutgoingLinks(view);
		case AwaySolutionEditPart.VISUAL_ID:
			return getAwaySolution_2009OutgoingLinks(view);
		case ArgumentModuleEditPart.VISUAL_ID:
			return getArgumentModule_2010OutgoingLinks(view);
		case ContractModuleEditPart.VISUAL_ID:
			return getContractModule_2011OutgoingLinks(view);
		case SolvedByModularEditPart.VISUAL_ID:
			return getSolvedByModular_4001OutgoingLinks(view);
		case InContextOfModularEditPart.VISUAL_ID:
			return getInContextOfModular_4002OutgoingLinks(view);
		case SolvedByEditPart.VISUAL_ID:
			return getSolvedBy_4003OutgoingLinks(view);
		case InContextOfEditPart.VISUAL_ID:
			return getInContextOf_4004OutgoingLinks(view);
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
		result.addAll(getContainedTypeModelFacetLinks_SolvedBy_4003(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_InContextOf_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GSN1LinkDescriptor> getStrategy_2002ContainedLinks(
			View view) {
		Strategy modelElement = (Strategy) view.getElement();
		LinkedList<GSN1LinkDescriptor> result = new LinkedList<GSN1LinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_SolvedBy_4003(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_InContextOf_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GSN1LinkDescriptor> getAwayGoal_2003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GSN1LinkDescriptor> getSolution_2004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GSN1LinkDescriptor> getContext_2005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GSN1LinkDescriptor> getJustification_2006ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GSN1LinkDescriptor> getAssumption_2007ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GSN1LinkDescriptor> getAwayContext_2008ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GSN1LinkDescriptor> getAwaySolution_2009ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GSN1LinkDescriptor> getArgumentModule_2010ContainedLinks(
			View view) {
		ArgumentModule modelElement = (ArgumentModule) view.getElement();
		LinkedList<GSN1LinkDescriptor> result = new LinkedList<GSN1LinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_SolvedByModular_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_InContextOfModular_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GSN1LinkDescriptor> getContractModule_2011ContainedLinks(
			View view) {
		ContractModule modelElement = (ContractModule) view.getElement();
		LinkedList<GSN1LinkDescriptor> result = new LinkedList<GSN1LinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_SolvedByModular_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_InContextOfModular_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GSN1LinkDescriptor> getSolvedByModular_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GSN1LinkDescriptor> getInContextOfModular_4002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GSN1LinkDescriptor> getSolvedBy_4003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GSN1LinkDescriptor> getInContextOf_4004ContainedLinks(
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
		result.addAll(getIncomingTypeModelFacetLinks_SolvedBy_4003(
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
		result.addAll(getIncomingTypeModelFacetLinks_SolvedBy_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GSN1LinkDescriptor> getAwayGoal_2003IncomingLinks(
			View view) {
		AwayGoal modelElement = (AwayGoal) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<GSN1LinkDescriptor> result = new LinkedList<GSN1LinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_SolvedBy_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_InContextOf_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GSN1LinkDescriptor> getSolution_2004IncomingLinks(
			View view) {
		Solution modelElement = (Solution) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<GSN1LinkDescriptor> result = new LinkedList<GSN1LinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_SolvedBy_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GSN1LinkDescriptor> getContext_2005IncomingLinks(
			View view) {
		Context modelElement = (Context) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<GSN1LinkDescriptor> result = new LinkedList<GSN1LinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_InContextOf_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GSN1LinkDescriptor> getJustification_2006IncomingLinks(
			View view) {
		Justification modelElement = (Justification) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<GSN1LinkDescriptor> result = new LinkedList<GSN1LinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_InContextOf_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GSN1LinkDescriptor> getAssumption_2007IncomingLinks(
			View view) {
		Assumption modelElement = (Assumption) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<GSN1LinkDescriptor> result = new LinkedList<GSN1LinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_InContextOf_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GSN1LinkDescriptor> getAwayContext_2008IncomingLinks(
			View view) {
		AwayContext modelElement = (AwayContext) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<GSN1LinkDescriptor> result = new LinkedList<GSN1LinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_InContextOf_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GSN1LinkDescriptor> getAwaySolution_2009IncomingLinks(
			View view) {
		AwaySolution modelElement = (AwaySolution) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<GSN1LinkDescriptor> result = new LinkedList<GSN1LinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_SolvedBy_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GSN1LinkDescriptor> getArgumentModule_2010IncomingLinks(
			View view) {
		ArgumentModule modelElement = (ArgumentModule) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<GSN1LinkDescriptor> result = new LinkedList<GSN1LinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_SolvedByModular_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_InContextOfModular_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SolvedBy_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_InContextOf_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GSN1LinkDescriptor> getContractModule_2011IncomingLinks(
			View view) {
		ContractModule modelElement = (ContractModule) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<GSN1LinkDescriptor> result = new LinkedList<GSN1LinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_SolvedByModular_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_InContextOfModular_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SolvedBy_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GSN1LinkDescriptor> getSolvedByModular_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GSN1LinkDescriptor> getInContextOfModular_4002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GSN1LinkDescriptor> getSolvedBy_4003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GSN1LinkDescriptor> getInContextOf_4004IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GSN1LinkDescriptor> getGoal_2001OutgoingLinks(View view) {
		Goal modelElement = (Goal) view.getElement();
		LinkedList<GSN1LinkDescriptor> result = new LinkedList<GSN1LinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_SolvedBy_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_InContextOf_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GSN1LinkDescriptor> getStrategy_2002OutgoingLinks(
			View view) {
		Strategy modelElement = (Strategy) view.getElement();
		LinkedList<GSN1LinkDescriptor> result = new LinkedList<GSN1LinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_SolvedBy_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_InContextOf_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GSN1LinkDescriptor> getAwayGoal_2003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GSN1LinkDescriptor> getSolution_2004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GSN1LinkDescriptor> getContext_2005OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GSN1LinkDescriptor> getJustification_2006OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GSN1LinkDescriptor> getAssumption_2007OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GSN1LinkDescriptor> getAwayContext_2008OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GSN1LinkDescriptor> getAwaySolution_2009OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GSN1LinkDescriptor> getArgumentModule_2010OutgoingLinks(
			View view) {
		ArgumentModule modelElement = (ArgumentModule) view.getElement();
		LinkedList<GSN1LinkDescriptor> result = new LinkedList<GSN1LinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_SolvedByModular_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_InContextOfModular_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GSN1LinkDescriptor> getContractModule_2011OutgoingLinks(
			View view) {
		ContractModule modelElement = (ContractModule) view.getElement();
		LinkedList<GSN1LinkDescriptor> result = new LinkedList<GSN1LinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_SolvedByModular_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_InContextOfModular_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GSN1LinkDescriptor> getSolvedByModular_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GSN1LinkDescriptor> getInContextOfModular_4002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GSN1LinkDescriptor> getSolvedBy_4003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GSN1LinkDescriptor> getInContextOf_4004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<GSN1LinkDescriptor> getContainedTypeModelFacetLinks_SolvedByModular_4001(
			Module container) {
		LinkedList<GSN1LinkDescriptor> result = new LinkedList<GSN1LinkDescriptor>();
		for (Iterator<?> links = container.getParentSolvedByModular()
				.iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof SolvedByModular) {
				continue;
			}
			SolvedByModular link = (SolvedByModular) linkObject;
			if (SolvedByModularEditPart.VISUAL_ID != GSN1VisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Module dst = link.getChildSolvedByModular();
			result.add(new GSN1LinkDescriptor(container, dst, link,
					GSN1ElementTypes.SolvedByModular_4001,
					SolvedByModularEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<GSN1LinkDescriptor> getContainedTypeModelFacetLinks_InContextOfModular_4002(
			Module container) {
		LinkedList<GSN1LinkDescriptor> result = new LinkedList<GSN1LinkDescriptor>();
		for (Iterator<?> links = container.getHasContext().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof InContextOfModular) {
				continue;
			}
			InContextOfModular link = (InContextOfModular) linkObject;
			if (InContextOfModularEditPart.VISUAL_ID != GSN1VisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Module dst = link.getModularContextualElement();
			result.add(new GSN1LinkDescriptor(container, dst, link,
					GSN1ElementTypes.InContextOfModular_4002,
					InContextOfModularEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<GSN1LinkDescriptor> getContainedTypeModelFacetLinks_SolvedBy_4003(
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
			SolvedByTargetElement dst = link.getChildSpinalelement();
			DecomposableSpinalElement src = link.getParentSpinalElement();
			result.add(new GSN1LinkDescriptor(src, dst, link,
					GSN1ElementTypes.SolvedBy_4003, SolvedByEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<GSN1LinkDescriptor> getContainedTypeModelFacetLinks_InContextOf_4004(
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
			InTheContextOfTargetElement dst = link.getContextualElement();
			DecomposableSpinalElement src = link.getContextOfSpinalElement();
			result.add(new GSN1LinkDescriptor(src, dst, link,
					GSN1ElementTypes.InContextOf_4004,
					InContextOfEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<GSN1LinkDescriptor> getIncomingTypeModelFacetLinks_SolvedByModular_4001(
			Module target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<GSN1LinkDescriptor> result = new LinkedList<GSN1LinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != GSN1Package.eINSTANCE
					.getSolvedByModular_ChildSolvedByModular()
					|| false == setting.getEObject() instanceof SolvedByModular) {
				continue;
			}
			SolvedByModular link = (SolvedByModular) setting.getEObject();
			if (SolvedByModularEditPart.VISUAL_ID != GSN1VisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			if (false == link.eContainer() instanceof Module) {
				continue;
			}
			Module container = (Module) link.eContainer();
			result.add(new GSN1LinkDescriptor(container, target, link,
					GSN1ElementTypes.SolvedByModular_4001,
					SolvedByModularEditPart.VISUAL_ID));

		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<GSN1LinkDescriptor> getIncomingTypeModelFacetLinks_InContextOfModular_4002(
			Module target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<GSN1LinkDescriptor> result = new LinkedList<GSN1LinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != GSN1Package.eINSTANCE
					.getInContextOfModular_ModularContextualElement()
					|| false == setting.getEObject() instanceof InContextOfModular) {
				continue;
			}
			InContextOfModular link = (InContextOfModular) setting.getEObject();
			if (InContextOfModularEditPart.VISUAL_ID != GSN1VisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			if (false == link.eContainer() instanceof Module) {
				continue;
			}
			Module container = (Module) link.eContainer();
			result.add(new GSN1LinkDescriptor(container, target, link,
					GSN1ElementTypes.InContextOfModular_4002,
					InContextOfModularEditPart.VISUAL_ID));

		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<GSN1LinkDescriptor> getIncomingTypeModelFacetLinks_SolvedBy_4003(
			SolvedByTargetElement target,
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
					GSN1ElementTypes.SolvedBy_4003, SolvedByEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<GSN1LinkDescriptor> getIncomingTypeModelFacetLinks_InContextOf_4004(
			InTheContextOfTargetElement target,
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
					GSN1ElementTypes.InContextOf_4004,
					InContextOfEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<GSN1LinkDescriptor> getOutgoingTypeModelFacetLinks_SolvedBy_4003(
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
			SolvedByTargetElement dst = link.getChildSpinalelement();
			DecomposableSpinalElement src = link.getParentSpinalElement();
			if (src != source) {
				continue;
			}
			result.add(new GSN1LinkDescriptor(src, dst, link,
					GSN1ElementTypes.SolvedBy_4003, SolvedByEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<GSN1LinkDescriptor> getOutgoingTypeModelFacetLinks_InContextOf_4004(
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
			InTheContextOfTargetElement dst = link.getContextualElement();
			DecomposableSpinalElement src = link.getContextOfSpinalElement();
			if (src != source) {
				continue;
			}
			result.add(new GSN1LinkDescriptor(src, dst, link,
					GSN1ElementTypes.InContextOf_4004,
					InContextOfEditPart.VISUAL_ID));
		}
		return result;
	}

}
