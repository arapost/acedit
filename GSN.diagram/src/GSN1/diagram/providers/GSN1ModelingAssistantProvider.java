/*
 * 
 */
package GSN1.diagram.providers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.modelingassistant.ModelingAssistantProvider;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;

import GSN1.diagram.edit.parts.ArgumentModuleEditPart;
import GSN1.diagram.edit.parts.AssumptionEditPart;
import GSN1.diagram.edit.parts.AwayContextEditPart;
import GSN1.diagram.edit.parts.AwayGoalEditPart;
import GSN1.diagram.edit.parts.AwaySolutionEditPart;
import GSN1.diagram.edit.parts.CaseEditPart;
import GSN1.diagram.edit.parts.ContextEditPart;
import GSN1.diagram.edit.parts.ContractModuleEditPart;
import GSN1.diagram.edit.parts.GoalEditPart;
import GSN1.diagram.edit.parts.JustificationEditPart;
import GSN1.diagram.edit.parts.SolutionEditPart;
import GSN1.diagram.edit.parts.StrategyEditPart;
import GSN1.diagram.part.GSN1DiagramEditorPlugin;
import GSN1.diagram.part.Messages;

/**
 * @generated
 */
public class GSN1ModelingAssistantProvider extends ModelingAssistantProvider {

	/**
	 * @generated
	 */
	public List getTypesForPopupBar(IAdaptable host) {
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart instanceof CaseEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(11);
			types.add(GSN1ElementTypes.Goal_2001);
			types.add(GSN1ElementTypes.Strategy_2002);
			types.add(GSN1ElementTypes.AwayGoal_2003);
			types.add(GSN1ElementTypes.Solution_2004);
			types.add(GSN1ElementTypes.Context_2005);
			types.add(GSN1ElementTypes.Justification_2006);
			types.add(GSN1ElementTypes.Assumption_2007);
			types.add(GSN1ElementTypes.AwayContext_2008);
			types.add(GSN1ElementTypes.AwaySolution_2009);
			types.add(GSN1ElementTypes.ArgumentModule_2010);
			types.add(GSN1ElementTypes.ContractModule_2011);
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof GoalEditPart) {
			return ((GoalEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof StrategyEditPart) {
			return ((StrategyEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ArgumentModuleEditPart) {
			return ((ArgumentModuleEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ContractModuleEditPart) {
			return ((ContractModuleEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof GoalEditPart) {
			return ((GoalEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof StrategyEditPart) {
			return ((StrategyEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof AwayGoalEditPart) {
			return ((AwayGoalEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof SolutionEditPart) {
			return ((SolutionEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof ContextEditPart) {
			return ((ContextEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof JustificationEditPart) {
			return ((JustificationEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof AssumptionEditPart) {
			return ((AssumptionEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof AwayContextEditPart) {
			return ((AwayContextEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof AwaySolutionEditPart) {
			return ((AwaySolutionEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof ArgumentModuleEditPart) {
			return ((ArgumentModuleEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof ContractModuleEditPart) {
			return ((ContractModuleEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSourceAndTarget(IAdaptable source,
			IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof GoalEditPart) {
			return ((GoalEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof StrategyEditPart) {
			return ((StrategyEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ArgumentModuleEditPart) {
			return ((ArgumentModuleEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ContractModuleEditPart) {
			return ((ContractModuleEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForSource(IAdaptable target,
			IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof GoalEditPart) {
			return ((GoalEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof StrategyEditPart) {
			return ((StrategyEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof AwayGoalEditPart) {
			return ((AwayGoalEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof SolutionEditPart) {
			return ((SolutionEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof ContextEditPart) {
			return ((ContextEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof JustificationEditPart) {
			return ((JustificationEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof AssumptionEditPart) {
			return ((AssumptionEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof AwayContextEditPart) {
			return ((AwayContextEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof AwaySolutionEditPart) {
			return ((AwaySolutionEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof ArgumentModuleEditPart) {
			return ((ArgumentModuleEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof ContractModuleEditPart) {
			return ((ContractModuleEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForTarget(IAdaptable source,
			IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof GoalEditPart) {
			return ((GoalEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof StrategyEditPart) {
			return ((StrategyEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ArgumentModuleEditPart) {
			return ((ArgumentModuleEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ContractModuleEditPart) {
			return ((ContractModuleEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForSource(IAdaptable target,
			IElementType relationshipType) {
		return selectExistingElement(target,
				getTypesForSource(target, relationshipType));
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForTarget(IAdaptable source,
			IElementType relationshipType) {
		return selectExistingElement(source,
				getTypesForTarget(source, relationshipType));
	}

	/**
	 * @generated
	 */
	protected EObject selectExistingElement(IAdaptable host, Collection types) {
		if (types.isEmpty()) {
			return null;
		}
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart == null) {
			return null;
		}
		Diagram diagram = (Diagram) editPart.getRoot().getContents().getModel();
		HashSet<EObject> elements = new HashSet<EObject>();
		for (Iterator<EObject> it = diagram.getElement().eAllContents(); it
				.hasNext();) {
			EObject element = it.next();
			if (isApplicableElement(element, types)) {
				elements.add(element);
			}
		}
		if (elements.isEmpty()) {
			return null;
		}
		return selectElement((EObject[]) elements.toArray(new EObject[elements
				.size()]));
	}

	/**
	 * @generated
	 */
	protected boolean isApplicableElement(EObject element, Collection types) {
		IElementType type = ElementTypeRegistry.getInstance().getElementType(
				element);
		return types.contains(type);
	}

	/**
	 * @generated
	 */
	protected EObject selectElement(EObject[] elements) {
		Shell shell = Display.getCurrent().getActiveShell();
		ILabelProvider labelProvider = new AdapterFactoryLabelProvider(
				GSN1DiagramEditorPlugin.getInstance()
						.getItemProvidersAdapterFactory());
		ElementListSelectionDialog dialog = new ElementListSelectionDialog(
				shell, labelProvider);
		dialog.setMessage(Messages.GSN1ModelingAssistantProviderMessage);
		dialog.setTitle(Messages.GSN1ModelingAssistantProviderTitle);
		dialog.setMultipleSelection(false);
		dialog.setElements(elements);
		EObject selected = null;
		if (dialog.open() == Window.OK) {
			selected = (EObject) dialog.getFirstResult();
		}
		return selected;
	}
}
