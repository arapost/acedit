/*
 * 
 */
package arm.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

import arm.ArmPackage;
import arm.diagram.edit.parts.ArgumentDescriptionEditPart;
import arm.diagram.edit.parts.ArgumentIdentifierEditPart;
import arm.diagram.edit.parts.ArgumentReasoningDescriptionEditPart;
import arm.diagram.edit.parts.ArgumentReasoningIdentifierEditPart;
import arm.diagram.edit.parts.CitiationElementDescriptionEditPart;
import arm.diagram.edit.parts.CitiationElementIdentifierEditPart;
import arm.diagram.edit.parts.ClaimDescriptionEditPart;
import arm.diagram.edit.parts.ClaimIdentifierEditPart;
import arm.diagram.edit.parts.EvidenceAssertationDescriptionEditPart;
import arm.diagram.edit.parts.EvidenceAssertationIdentifierEditPart;
import arm.diagram.edit.parts.InformationElementDescriptionEditPart;
import arm.diagram.edit.parts.InformationElementIdentifierEditPart;
import arm.diagram.parsers.MessageFormatParser;
import arm.diagram.part.ARMVisualIDRegistry;

/**
 * @generated
 */
public class ARMParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser evidenceAssertationIdentifier_5001Parser;

	/**
	 * @generated
	 */
	private IParser getEvidenceAssertationIdentifier_5001Parser() {
		if (evidenceAssertationIdentifier_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { ArmPackage.eINSTANCE
					.getModelElement_Identifier() };
			MessageFormatParser parser = new MessageFormatParser(features);
			evidenceAssertationIdentifier_5001Parser = parser;
		}
		return evidenceAssertationIdentifier_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser evidenceAssertationDescription_5002Parser;

	/**
	 * @generated
	 */
	private IParser getEvidenceAssertationDescription_5002Parser() {
		if (evidenceAssertationDescription_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { ArmPackage.eINSTANCE
					.getModelElement_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			evidenceAssertationDescription_5002Parser = parser;
		}
		return evidenceAssertationDescription_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser claimIdentifier_5003Parser;

	/**
	 * @generated
	 */
	private IParser getClaimIdentifier_5003Parser() {
		if (claimIdentifier_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { ArmPackage.eINSTANCE
					.getModelElement_Identifier() };
			MessageFormatParser parser = new MessageFormatParser(features);
			claimIdentifier_5003Parser = parser;
		}
		return claimIdentifier_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser claimDescription_5004Parser;

	/**
	 * @generated
	 */
	private IParser getClaimDescription_5004Parser() {
		if (claimDescription_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { ArmPackage.eINSTANCE
					.getModelElement_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			claimDescription_5004Parser = parser;
		}
		return claimDescription_5004Parser;
	}

	/**
	 * @generated
	 */
	private IParser argumentReasoningIdentifier_5005Parser;

	/**
	 * @generated
	 */
	private IParser getArgumentReasoningIdentifier_5005Parser() {
		if (argumentReasoningIdentifier_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { ArmPackage.eINSTANCE
					.getModelElement_Identifier() };
			MessageFormatParser parser = new MessageFormatParser(features);
			argumentReasoningIdentifier_5005Parser = parser;
		}
		return argumentReasoningIdentifier_5005Parser;
	}

	/**
	 * @generated
	 */
	private IParser argumentReasoningDescription_5006Parser;

	/**
	 * @generated
	 */
	private IParser getArgumentReasoningDescription_5006Parser() {
		if (argumentReasoningDescription_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { ArmPackage.eINSTANCE
					.getModelElement_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			argumentReasoningDescription_5006Parser = parser;
		}
		return argumentReasoningDescription_5006Parser;
	}

	/**
	 * @generated
	 */
	private IParser informationElementIdentifier_5007Parser;

	/**
	 * @generated
	 */
	private IParser getInformationElementIdentifier_5007Parser() {
		if (informationElementIdentifier_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { ArmPackage.eINSTANCE
					.getModelElement_Identifier() };
			MessageFormatParser parser = new MessageFormatParser(features);
			informationElementIdentifier_5007Parser = parser;
		}
		return informationElementIdentifier_5007Parser;
	}

	/**
	 * @generated
	 */
	private IParser informationElementDescription_5008Parser;

	/**
	 * @generated
	 */
	private IParser getInformationElementDescription_5008Parser() {
		if (informationElementDescription_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { ArmPackage.eINSTANCE
					.getModelElement_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			informationElementDescription_5008Parser = parser;
		}
		return informationElementDescription_5008Parser;
	}

	/**
	 * @generated
	 */
	private IParser citiationElementIdentifier_5009Parser;

	/**
	 * @generated
	 */
	private IParser getCitiationElementIdentifier_5009Parser() {
		if (citiationElementIdentifier_5009Parser == null) {
			EAttribute[] features = new EAttribute[] { ArmPackage.eINSTANCE
					.getModelElement_Identifier() };
			MessageFormatParser parser = new MessageFormatParser(features);
			citiationElementIdentifier_5009Parser = parser;
		}
		return citiationElementIdentifier_5009Parser;
	}

	/**
	 * @generated
	 */
	private IParser citiationElementDescription_5010Parser;

	/**
	 * @generated
	 */
	private IParser getCitiationElementDescription_5010Parser() {
		if (citiationElementDescription_5010Parser == null) {
			EAttribute[] features = new EAttribute[] { ArmPackage.eINSTANCE
					.getModelElement_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			citiationElementDescription_5010Parser = parser;
		}
		return citiationElementDescription_5010Parser;
	}

	/**
	 * @generated
	 */
	private IParser argumentIdentifier_5011Parser;

	/**
	 * @generated
	 */
	private IParser getArgumentIdentifier_5011Parser() {
		if (argumentIdentifier_5011Parser == null) {
			EAttribute[] features = new EAttribute[] { ArmPackage.eINSTANCE
					.getModelElement_Identifier() };
			MessageFormatParser parser = new MessageFormatParser(features);
			argumentIdentifier_5011Parser = parser;
		}
		return argumentIdentifier_5011Parser;
	}

	/**
	 * @generated
	 */
	private IParser argumentDescription_5012Parser;

	/**
	 * @generated
	 */
	private IParser getArgumentDescription_5012Parser() {
		if (argumentDescription_5012Parser == null) {
			EAttribute[] features = new EAttribute[] { ArmPackage.eINSTANCE
					.getModelElement_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			argumentDescription_5012Parser = parser;
		}
		return argumentDescription_5012Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case EvidenceAssertationIdentifierEditPart.VISUAL_ID:
			return getEvidenceAssertationIdentifier_5001Parser();
		case EvidenceAssertationDescriptionEditPart.VISUAL_ID:
			return getEvidenceAssertationDescription_5002Parser();
		case ClaimIdentifierEditPart.VISUAL_ID:
			return getClaimIdentifier_5003Parser();
		case ClaimDescriptionEditPart.VISUAL_ID:
			return getClaimDescription_5004Parser();
		case ArgumentReasoningIdentifierEditPart.VISUAL_ID:
			return getArgumentReasoningIdentifier_5005Parser();
		case ArgumentReasoningDescriptionEditPart.VISUAL_ID:
			return getArgumentReasoningDescription_5006Parser();
		case InformationElementIdentifierEditPart.VISUAL_ID:
			return getInformationElementIdentifier_5007Parser();
		case InformationElementDescriptionEditPart.VISUAL_ID:
			return getInformationElementDescription_5008Parser();
		case CitiationElementIdentifierEditPart.VISUAL_ID:
			return getCitiationElementIdentifier_5009Parser();
		case CitiationElementDescriptionEditPart.VISUAL_ID:
			return getCitiationElementDescription_5010Parser();
		case ArgumentIdentifierEditPart.VISUAL_ID:
			return getArgumentIdentifier_5011Parser();
		case ArgumentDescriptionEditPart.VISUAL_ID:
			return getArgumentDescription_5012Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(ARMVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(ARMVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (ARMElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
