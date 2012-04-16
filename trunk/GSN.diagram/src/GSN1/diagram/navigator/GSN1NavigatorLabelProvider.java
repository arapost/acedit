/*
 * 
 */
package GSN1.diagram.navigator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import GSN1.Case;
import GSN1.SolvedBy;
import GSN1.SolvedUsingContract;
import GSN1.diagram.edit.parts.ArgumentModuleEditPart;
import GSN1.diagram.edit.parts.ArgumentModuleIdentifierEditPart;
import GSN1.diagram.edit.parts.AssumptionEditPart;
import GSN1.diagram.edit.parts.AssumptionIdentifierEditPart;
import GSN1.diagram.edit.parts.CaseEditPart;
import GSN1.diagram.edit.parts.ContextEditPart;
import GSN1.diagram.edit.parts.ContextIdentifierEditPart;
import GSN1.diagram.edit.parts.ContractEditPart;
import GSN1.diagram.edit.parts.ContractIdentifierEditPart;
import GSN1.diagram.edit.parts.GoalEditPart;
import GSN1.diagram.edit.parts.GoalIdentifierEditPart;
import GSN1.diagram.edit.parts.InContextOfEditPart;
import GSN1.diagram.edit.parts.JustificationEditPart;
import GSN1.diagram.edit.parts.JustificationIdentifierEditPart;
import GSN1.diagram.edit.parts.SolutionEditPart;
import GSN1.diagram.edit.parts.SolutionIdentifierEditPart;
import GSN1.diagram.edit.parts.SolvedByEditPart;
import GSN1.diagram.edit.parts.SolvedUsingContractEditPart;
import GSN1.diagram.edit.parts.StrategyEditPart;
import GSN1.diagram.edit.parts.StrategyIdentifierEditPart;
import GSN1.diagram.part.GSN1DiagramEditorPlugin;
import GSN1.diagram.part.GSN1VisualIDRegistry;
import GSN1.diagram.providers.GSN1ElementTypes;
import GSN1.diagram.providers.GSN1ParserProvider;

/**
 * @generated
 */
public class GSN1NavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		GSN1DiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		GSN1DiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof GSN1NavigatorItem
				&& !isOwnView(((GSN1NavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof GSN1NavigatorGroup) {
			GSN1NavigatorGroup group = (GSN1NavigatorGroup) element;
			return GSN1DiagramEditorPlugin.getInstance().getBundledImage(
					group.getIcon());
		}

		if (element instanceof GSN1NavigatorItem) {
			GSN1NavigatorItem navigatorItem = (GSN1NavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getImage(view);
			}
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (GSN1VisualIDRegistry.getVisualID(view)) {
		case AssumptionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?GSN1?Assumption", GSN1ElementTypes.Assumption_2006); //$NON-NLS-1$
		case GoalEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?GSN1?Goal", GSN1ElementTypes.Goal_2001); //$NON-NLS-1$
		case SolvedUsingContractEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?GSN1?SolvedUsingContract", GSN1ElementTypes.SolvedUsingContract_4001); //$NON-NLS-1$
		case ArgumentModuleEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?GSN1?ArgumentModule", GSN1ElementTypes.ArgumentModule_2008); //$NON-NLS-1$
		case ContextEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?GSN1?Context", GSN1ElementTypes.Context_2004); //$NON-NLS-1$
		case StrategyEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?GSN1?Strategy", GSN1ElementTypes.Strategy_2002); //$NON-NLS-1$
		case InContextOfEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?GSN1?InContextOf", GSN1ElementTypes.InContextOf_4003); //$NON-NLS-1$
		case SolvedByEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?GSN1?SolvedBy", GSN1ElementTypes.SolvedBy_4002); //$NON-NLS-1$
		case ContractEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?GSN1?Contract", GSN1ElementTypes.Contract_2007); //$NON-NLS-1$
		case SolutionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?GSN1?Solution", GSN1ElementTypes.Solution_2003); //$NON-NLS-1$
		case CaseEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?GSN1?Case", GSN1ElementTypes.Case_1000); //$NON-NLS-1$
		case JustificationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?GSN1?Justification", GSN1ElementTypes.Justification_2005); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = GSN1DiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& GSN1ElementTypes.isKnownElementType(elementType)) {
			image = GSN1ElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof GSN1NavigatorGroup) {
			GSN1NavigatorGroup group = (GSN1NavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof GSN1NavigatorItem) {
			GSN1NavigatorItem navigatorItem = (GSN1NavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getText(view);
			}
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (GSN1VisualIDRegistry.getVisualID(view)) {
		case AssumptionEditPart.VISUAL_ID:
			return getAssumption_2006Text(view);
		case GoalEditPart.VISUAL_ID:
			return getGoal_2001Text(view);
		case SolvedUsingContractEditPart.VISUAL_ID:
			return getSolvedUsingContract_4001Text(view);
		case ArgumentModuleEditPart.VISUAL_ID:
			return getArgumentModule_2008Text(view);
		case ContextEditPart.VISUAL_ID:
			return getContext_2004Text(view);
		case StrategyEditPart.VISUAL_ID:
			return getStrategy_2002Text(view);
		case InContextOfEditPart.VISUAL_ID:
			return getInContextOf_4003Text(view);
		case SolvedByEditPart.VISUAL_ID:
			return getSolvedBy_4002Text(view);
		case ContractEditPart.VISUAL_ID:
			return getContract_2007Text(view);
		case SolutionEditPart.VISUAL_ID:
			return getSolution_2003Text(view);
		case CaseEditPart.VISUAL_ID:
			return getCase_1000Text(view);
		case JustificationEditPart.VISUAL_ID:
			return getJustification_2005Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getAssumption_2006Text(View view) {
		IParser parser = GSN1ParserProvider.getParser(
				GSN1ElementTypes.Assumption_2006,
				view.getElement() != null ? view.getElement() : view,
				GSN1VisualIDRegistry
						.getType(AssumptionIdentifierEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GSN1DiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getGoal_2001Text(View view) {
		IParser parser = GSN1ParserProvider.getParser(
				GSN1ElementTypes.Goal_2001,
				view.getElement() != null ? view.getElement() : view,
				GSN1VisualIDRegistry.getType(GoalIdentifierEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GSN1DiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSolvedUsingContract_4001Text(View view) {
		SolvedUsingContract domainModelElement = (SolvedUsingContract) view
				.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getCardinality());
		} else {
			GSN1DiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getArgumentModule_2008Text(View view) {
		IParser parser = GSN1ParserProvider.getParser(
				GSN1ElementTypes.ArgumentModule_2008,
				view.getElement() != null ? view.getElement() : view,
				GSN1VisualIDRegistry
						.getType(ArgumentModuleIdentifierEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GSN1DiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5015); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getContext_2004Text(View view) {
		IParser parser = GSN1ParserProvider.getParser(
				GSN1ElementTypes.Context_2004,
				view.getElement() != null ? view.getElement() : view,
				GSN1VisualIDRegistry
						.getType(ContextIdentifierEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GSN1DiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getStrategy_2002Text(View view) {
		IParser parser = GSN1ParserProvider.getParser(
				GSN1ElementTypes.Strategy_2002,
				view.getElement() != null ? view.getElement() : view,
				GSN1VisualIDRegistry
						.getType(StrategyIdentifierEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GSN1DiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInContextOf_4003Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getSolvedBy_4002Text(View view) {
		SolvedBy domainModelElement = (SolvedBy) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getCardinality());
		} else {
			GSN1DiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getContract_2007Text(View view) {
		IParser parser = GSN1ParserProvider.getParser(
				GSN1ElementTypes.Contract_2007,
				view.getElement() != null ? view.getElement() : view,
				GSN1VisualIDRegistry
						.getType(ContractIdentifierEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GSN1DiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5013); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSolution_2003Text(View view) {
		IParser parser = GSN1ParserProvider.getParser(
				GSN1ElementTypes.Solution_2003,
				view.getElement() != null ? view.getElement() : view,
				GSN1VisualIDRegistry
						.getType(SolutionIdentifierEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GSN1DiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCase_1000Text(View view) {
		Case domainModelElement = (Case) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getAutoID());
		} else {
			GSN1DiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getJustification_2005Text(View view) {
		IParser parser = GSN1ParserProvider.getParser(
				GSN1ElementTypes.Justification_2005,
				view.getElement() != null ? view.getElement() : view,
				GSN1VisualIDRegistry
						.getType(JustificationIdentifierEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GSN1DiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return CaseEditPart.MODEL_ID.equals(GSN1VisualIDRegistry
				.getModelID(view));
	}

}
