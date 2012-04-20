/*
 * 
 */
package arm.diagram.navigator;

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

import arm.AssertedContext;
import arm.AssertedEvidence;
import arm.AssertedInference;
import arm.diagram.edit.parts.ArgumentEditPart;
import arm.diagram.edit.parts.ArgumentIdentifierEditPart;
import arm.diagram.edit.parts.ArgumentReasoningEditPart;
import arm.diagram.edit.parts.ArgumentReasoningIdentifierEditPart;
import arm.diagram.edit.parts.AssertedContextEditPart;
import arm.diagram.edit.parts.AssertedEvidenceEditPart;
import arm.diagram.edit.parts.AssertedInferenceEditPart;
import arm.diagram.edit.parts.CaseEditPart;
import arm.diagram.edit.parts.CitiationElementEditPart;
import arm.diagram.edit.parts.CitiationElementIdentifierEditPart;
import arm.diagram.edit.parts.ClaimEditPart;
import arm.diagram.edit.parts.ClaimIdentifierEditPart;
import arm.diagram.edit.parts.EvidenceAssertationEditPart;
import arm.diagram.edit.parts.EvidenceAssertationIdentifierEditPart;
import arm.diagram.edit.parts.InformationElementEditPart;
import arm.diagram.edit.parts.InformationElementIdentifierEditPart;
import arm.diagram.part.ARMDiagramEditorPlugin;
import arm.diagram.part.ARMVisualIDRegistry;
import arm.diagram.providers.ARMElementTypes;
import arm.diagram.providers.ARMParserProvider;

/**
 * @generated
 */
public class ARMNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		ARMDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		ARMDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof ARMNavigatorItem
				&& !isOwnView(((ARMNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof ARMNavigatorGroup) {
			ARMNavigatorGroup group = (ARMNavigatorGroup) element;
			return ARMDiagramEditorPlugin.getInstance().getBundledImage(
					group.getIcon());
		}

		if (element instanceof ARMNavigatorItem) {
			ARMNavigatorItem navigatorItem = (ARMNavigatorItem) element;
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
		switch (ARMVisualIDRegistry.getVisualID(view)) {
		case CitiationElementEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?ARM?CitiationElement", ARMElementTypes.CitiationElement_2005); //$NON-NLS-1$
		case ArgumentReasoningEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?ARM?ArgumentReasoning", ARMElementTypes.ArgumentReasoning_2003); //$NON-NLS-1$
		case ArgumentEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?ARM?Argument", ARMElementTypes.Argument_2006); //$NON-NLS-1$
		case AssertedInferenceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?ARM?AssertedInference", ARMElementTypes.AssertedInference_4001); //$NON-NLS-1$
		case ClaimEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?ARM?Claim", ARMElementTypes.Claim_2002); //$NON-NLS-1$
		case InformationElementEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?ARM?InformationElement", ARMElementTypes.InformationElement_2004); //$NON-NLS-1$
		case EvidenceAssertationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?ARM?EvidenceAssertation", ARMElementTypes.EvidenceAssertation_2001); //$NON-NLS-1$
		case CaseEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?ARM?Case", ARMElementTypes.Case_1000); //$NON-NLS-1$
		case AssertedContextEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?ARM?AssertedContext", ARMElementTypes.AssertedContext_4002); //$NON-NLS-1$
		case AssertedEvidenceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?ARM?AssertedEvidence", ARMElementTypes.AssertedEvidence_4003); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = ARMDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& ARMElementTypes.isKnownElementType(elementType)) {
			image = ARMElementTypes.getImage(elementType);
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
		if (element instanceof ARMNavigatorGroup) {
			ARMNavigatorGroup group = (ARMNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof ARMNavigatorItem) {
			ARMNavigatorItem navigatorItem = (ARMNavigatorItem) element;
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
		switch (ARMVisualIDRegistry.getVisualID(view)) {
		case CitiationElementEditPart.VISUAL_ID:
			return getCitiationElement_2005Text(view);
		case ArgumentReasoningEditPart.VISUAL_ID:
			return getArgumentReasoning_2003Text(view);
		case ArgumentEditPart.VISUAL_ID:
			return getArgument_2006Text(view);
		case AssertedInferenceEditPart.VISUAL_ID:
			return getAssertedInference_4001Text(view);
		case ClaimEditPart.VISUAL_ID:
			return getClaim_2002Text(view);
		case InformationElementEditPart.VISUAL_ID:
			return getInformationElement_2004Text(view);
		case EvidenceAssertationEditPart.VISUAL_ID:
			return getEvidenceAssertation_2001Text(view);
		case CaseEditPart.VISUAL_ID:
			return getCase_1000Text(view);
		case AssertedContextEditPart.VISUAL_ID:
			return getAssertedContext_4002Text(view);
		case AssertedEvidenceEditPart.VISUAL_ID:
			return getAssertedEvidence_4003Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getClaim_2002Text(View view) {
		IParser parser = ARMParserProvider.getParser(
				ARMElementTypes.Claim_2002,
				view.getElement() != null ? view.getElement() : view,
				ARMVisualIDRegistry.getType(ClaimIdentifierEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ARMDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAssertedInference_4001Text(View view) {
		AssertedInference domainModelElement = (AssertedInference) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getIdentifier();
		} else {
			ARMDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getArgumentReasoning_2003Text(View view) {
		IParser parser = ARMParserProvider
				.getParser(
						ARMElementTypes.ArgumentReasoning_2003,
						view.getElement() != null ? view.getElement() : view,
						ARMVisualIDRegistry
								.getType(ArgumentReasoningIdentifierEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ARMDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAssertedEvidence_4003Text(View view) {
		AssertedEvidence domainModelElement = (AssertedEvidence) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getIdentifier();
		} else {
			ARMDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInformationElement_2004Text(View view) {
		IParser parser = ARMParserProvider
				.getParser(
						ARMElementTypes.InformationElement_2004,
						view.getElement() != null ? view.getElement() : view,
						ARMVisualIDRegistry
								.getType(InformationElementIdentifierEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ARMDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEvidenceAssertation_2001Text(View view) {
		IParser parser = ARMParserProvider
				.getParser(
						ARMElementTypes.EvidenceAssertation_2001,
						view.getElement() != null ? view.getElement() : view,
						ARMVisualIDRegistry
								.getType(EvidenceAssertationIdentifierEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ARMDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCitiationElement_2005Text(View view) {
		IParser parser = ARMParserProvider.getParser(
				ARMElementTypes.CitiationElement_2005,
				view.getElement() != null ? view.getElement() : view,
				ARMVisualIDRegistry
						.getType(CitiationElementIdentifierEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ARMDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCase_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getArgument_2006Text(View view) {
		IParser parser = ARMParserProvider.getParser(
				ARMElementTypes.Argument_2006,
				view.getElement() != null ? view.getElement() : view,
				ARMVisualIDRegistry
						.getType(ArgumentIdentifierEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ARMDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAssertedContext_4002Text(View view) {
		AssertedContext domainModelElement = (AssertedContext) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getIdentifier();
		} else {
			ARMDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4002); //$NON-NLS-1$
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
		return CaseEditPart.MODEL_ID.equals(ARMVisualIDRegistry
				.getModelID(view));
	}

}
