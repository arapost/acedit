/*
 * 
 */
package arm.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;

import arm.ArmPackage;
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
import arm.diagram.part.ARMDiagramEditorPlugin;

/**
 * @generated
 */
public class ARMElementTypes {

	/**
	 * @generated
	 */
	private ARMElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static ImageRegistry imageRegistry;

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType Case_1000 = getElementType("ARM.diagram.Case_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType EvidenceAssertation_2001 = getElementType("ARM.diagram.EvidenceAssertation_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Claim_2002 = getElementType("ARM.diagram.Claim_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ArgumentReasoning_2003 = getElementType("ARM.diagram.ArgumentReasoning_2003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType InformationElement_2004 = getElementType("ARM.diagram.InformationElement_2004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CitiationElement_2005 = getElementType("ARM.diagram.CitiationElement_2005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Argument_2006 = getElementType("ARM.diagram.Argument_2006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AssertedInference_4001 = getElementType("ARM.diagram.AssertedInference_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AssertedContext_4002 = getElementType("ARM.diagram.AssertedContext_4002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AssertedEvidence_4003 = getElementType("ARM.diagram.AssertedEvidence_4003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	private static ImageRegistry getImageRegistry() {
		if (imageRegistry == null) {
			imageRegistry = new ImageRegistry();
		}
		return imageRegistry;
	}

	/**
	 * @generated
	 */
	private static String getImageRegistryKey(ENamedElement element) {
		return element.getName();
	}

	/**
	 * @generated
	 */
	private static ImageDescriptor getProvidedImageDescriptor(
			ENamedElement element) {
		if (element instanceof EStructuralFeature) {
			EStructuralFeature feature = ((EStructuralFeature) element);
			EClass eContainingClass = feature.getEContainingClass();
			EClassifier eType = feature.getEType();
			if (eContainingClass != null && !eContainingClass.isAbstract()) {
				element = eContainingClass;
			} else if (eType instanceof EClass
					&& !((EClass) eType).isAbstract()) {
				element = eType;
			}
		}
		if (element instanceof EClass) {
			EClass eClass = (EClass) element;
			if (!eClass.isAbstract()) {
				return ARMDiagramEditorPlugin.getInstance()
						.getItemImageDescriptor(
								eClass.getEPackage().getEFactoryInstance()
										.create(eClass));
			}
		}
		// TODO : support structural features
		return null;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		String key = getImageRegistryKey(element);
		ImageDescriptor imageDescriptor = getImageRegistry().getDescriptor(key);
		if (imageDescriptor == null) {
			imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
		}
		return imageDescriptor;
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		String key = getImageRegistryKey(element);
		Image image = getImageRegistry().get(key);
		if (image == null) {
			ImageDescriptor imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
			image = getImageRegistry().get(key);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImage(element);
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(Case_1000, ArmPackage.eINSTANCE.getCase());

			elements.put(EvidenceAssertation_2001,
					ArmPackage.eINSTANCE.getEvidenceAssertation());

			elements.put(Claim_2002, ArmPackage.eINSTANCE.getClaim());

			elements.put(ArgumentReasoning_2003,
					ArmPackage.eINSTANCE.getArgumentReasoning());

			elements.put(InformationElement_2004,
					ArmPackage.eINSTANCE.getInformationElement());

			elements.put(CitiationElement_2005,
					ArmPackage.eINSTANCE.getCitiationElement());

			elements.put(Argument_2006, ArmPackage.eINSTANCE.getArgument());

			elements.put(AssertedInference_4001,
					ArmPackage.eINSTANCE.getAssertedInference());

			elements.put(AssertedContext_4002,
					ArmPackage.eINSTANCE.getAssertedContext());

			elements.put(AssertedEvidence_4003,
					ArmPackage.eINSTANCE.getAssertedEvidence());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(Case_1000);
			KNOWN_ELEMENT_TYPES.add(EvidenceAssertation_2001);
			KNOWN_ELEMENT_TYPES.add(Claim_2002);
			KNOWN_ELEMENT_TYPES.add(ArgumentReasoning_2003);
			KNOWN_ELEMENT_TYPES.add(InformationElement_2004);
			KNOWN_ELEMENT_TYPES.add(CitiationElement_2005);
			KNOWN_ELEMENT_TYPES.add(Argument_2006);
			KNOWN_ELEMENT_TYPES.add(AssertedInference_4001);
			KNOWN_ELEMENT_TYPES.add(AssertedContext_4002);
			KNOWN_ELEMENT_TYPES.add(AssertedEvidence_4003);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case CaseEditPart.VISUAL_ID:
			return Case_1000;
		case EvidenceAssertationEditPart.VISUAL_ID:
			return EvidenceAssertation_2001;
		case ClaimEditPart.VISUAL_ID:
			return Claim_2002;
		case ArgumentReasoningEditPart.VISUAL_ID:
			return ArgumentReasoning_2003;
		case InformationElementEditPart.VISUAL_ID:
			return InformationElement_2004;
		case CitiationElementEditPart.VISUAL_ID:
			return CitiationElement_2005;
		case ArgumentEditPart.VISUAL_ID:
			return Argument_2006;
		case AssertedInferenceEditPart.VISUAL_ID:
			return AssertedInference_4001;
		case AssertedContextEditPart.VISUAL_ID:
			return AssertedContext_4002;
		case AssertedEvidenceEditPart.VISUAL_ID:
			return AssertedEvidence_4003;
		}
		return null;
	}

}
