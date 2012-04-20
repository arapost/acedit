/*
 * 
 */
package GSN1.diagram.providers;

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

import GSN1.GSN1Package;
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
import GSN1.diagram.part.GSN1DiagramEditorPlugin;

/**
 * @generated
 */
public class GSN1ElementTypes {

	/**
	 * @generated
	 */
	private GSN1ElementTypes() {
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
	public static final IElementType Case_1000 = getElementType("GSN.diagram.Case_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Goal_2001 = getElementType("GSN.diagram.Goal_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Strategy_2002 = getElementType("GSN.diagram.Strategy_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AwayGoal_2003 = getElementType("GSN.diagram.AwayGoal_2003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Solution_2004 = getElementType("GSN.diagram.Solution_2004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Context_2005 = getElementType("GSN.diagram.Context_2005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Justification_2006 = getElementType("GSN.diagram.Justification_2006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Assumption_2007 = getElementType("GSN.diagram.Assumption_2007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AwayContext_2008 = getElementType("GSN.diagram.AwayContext_2008"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AwaySolution_2009 = getElementType("GSN.diagram.AwaySolution_2009"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ArgumentModule_2010 = getElementType("GSN.diagram.ArgumentModule_2010"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ContractModule_2011 = getElementType("GSN.diagram.ContractModule_2011"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SolvedByModular_4001 = getElementType("GSN.diagram.SolvedByModular_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType InContextOfModular_4002 = getElementType("GSN.diagram.InContextOfModular_4002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SolvedBy_4003 = getElementType("GSN.diagram.SolvedBy_4003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType InContextOf_4004 = getElementType("GSN.diagram.InContextOf_4004"); //$NON-NLS-1$

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
				return GSN1DiagramEditorPlugin.getInstance()
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

			elements.put(Case_1000, GSN1Package.eINSTANCE.getCase());

			elements.put(Goal_2001, GSN1Package.eINSTANCE.getGoal());

			elements.put(Strategy_2002, GSN1Package.eINSTANCE.getStrategy());

			elements.put(AwayGoal_2003, GSN1Package.eINSTANCE.getAwayGoal());

			elements.put(Solution_2004, GSN1Package.eINSTANCE.getSolution());

			elements.put(Context_2005, GSN1Package.eINSTANCE.getContext());

			elements.put(Justification_2006,
					GSN1Package.eINSTANCE.getJustification());

			elements.put(Assumption_2007, GSN1Package.eINSTANCE.getAssumption());

			elements.put(AwayContext_2008,
					GSN1Package.eINSTANCE.getAwayContext());

			elements.put(AwaySolution_2009,
					GSN1Package.eINSTANCE.getAwaySolution());

			elements.put(ArgumentModule_2010,
					GSN1Package.eINSTANCE.getArgumentModule());

			elements.put(ContractModule_2011,
					GSN1Package.eINSTANCE.getContractModule());

			elements.put(SolvedByModular_4001,
					GSN1Package.eINSTANCE.getSolvedByModular());

			elements.put(InContextOfModular_4002,
					GSN1Package.eINSTANCE.getInContextOfModular());

			elements.put(SolvedBy_4003, GSN1Package.eINSTANCE.getSolvedBy());

			elements.put(InContextOf_4004,
					GSN1Package.eINSTANCE.getInContextOf());
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
			KNOWN_ELEMENT_TYPES.add(Goal_2001);
			KNOWN_ELEMENT_TYPES.add(Strategy_2002);
			KNOWN_ELEMENT_TYPES.add(AwayGoal_2003);
			KNOWN_ELEMENT_TYPES.add(Solution_2004);
			KNOWN_ELEMENT_TYPES.add(Context_2005);
			KNOWN_ELEMENT_TYPES.add(Justification_2006);
			KNOWN_ELEMENT_TYPES.add(Assumption_2007);
			KNOWN_ELEMENT_TYPES.add(AwayContext_2008);
			KNOWN_ELEMENT_TYPES.add(AwaySolution_2009);
			KNOWN_ELEMENT_TYPES.add(ArgumentModule_2010);
			KNOWN_ELEMENT_TYPES.add(ContractModule_2011);
			KNOWN_ELEMENT_TYPES.add(SolvedByModular_4001);
			KNOWN_ELEMENT_TYPES.add(InContextOfModular_4002);
			KNOWN_ELEMENT_TYPES.add(SolvedBy_4003);
			KNOWN_ELEMENT_TYPES.add(InContextOf_4004);
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
		case GoalEditPart.VISUAL_ID:
			return Goal_2001;
		case StrategyEditPart.VISUAL_ID:
			return Strategy_2002;
		case AwayGoalEditPart.VISUAL_ID:
			return AwayGoal_2003;
		case SolutionEditPart.VISUAL_ID:
			return Solution_2004;
		case ContextEditPart.VISUAL_ID:
			return Context_2005;
		case JustificationEditPart.VISUAL_ID:
			return Justification_2006;
		case AssumptionEditPart.VISUAL_ID:
			return Assumption_2007;
		case AwayContextEditPart.VISUAL_ID:
			return AwayContext_2008;
		case AwaySolutionEditPart.VISUAL_ID:
			return AwaySolution_2009;
		case ArgumentModuleEditPart.VISUAL_ID:
			return ArgumentModule_2010;
		case ContractModuleEditPart.VISUAL_ID:
			return ContractModule_2011;
		case SolvedByModularEditPart.VISUAL_ID:
			return SolvedByModular_4001;
		case InContextOfModularEditPart.VISUAL_ID:
			return InContextOfModular_4002;
		case SolvedByEditPart.VISUAL_ID:
			return SolvedBy_4003;
		case InContextOfEditPart.VISUAL_ID:
			return InContextOf_4004;
		}
		return null;
	}

}
