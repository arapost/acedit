/*
 * 
 */
package GSN1.diagram.providers;

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

import GSN1.GSN1Package;
import GSN1.diagram.edit.parts.ArgumentModuleDescriptionEditPart;
import GSN1.diagram.edit.parts.ArgumentModuleIdentifierEditPart;
import GSN1.diagram.edit.parts.AssumptionDescriptionEditPart;
import GSN1.diagram.edit.parts.AssumptionIdentifierEditPart;
import GSN1.diagram.edit.parts.ContextDescriptionEditPart;
import GSN1.diagram.edit.parts.ContextIdentifierEditPart;
import GSN1.diagram.edit.parts.ContractDescriptionEditPart;
import GSN1.diagram.edit.parts.ContractIdentifierEditPart;
import GSN1.diagram.edit.parts.GoalDescriptionEditPart;
import GSN1.diagram.edit.parts.GoalIdentifierEditPart;
import GSN1.diagram.edit.parts.JustificationDescriptionEditPart;
import GSN1.diagram.edit.parts.JustificationIdentifierEditPart;
import GSN1.diagram.edit.parts.SolutionDescriptionEditPart;
import GSN1.diagram.edit.parts.SolutionIdentifierEditPart;
import GSN1.diagram.edit.parts.StrategyDescriptionEditPart;
import GSN1.diagram.edit.parts.StrategyIdentifierEditPart;
import GSN1.diagram.parsers.MessageFormatParser;
import GSN1.diagram.part.GSN1VisualIDRegistry;

/**
 * @generated
 */
public class GSN1ParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser goalIdentifier_5001Parser;

	/**
	 * @generated
	 */
	private IParser getGoalIdentifier_5001Parser() {
		if (goalIdentifier_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { GSN1Package.eINSTANCE
					.getModelElement_Identifier() };
			MessageFormatParser parser = new MessageFormatParser(features);
			goalIdentifier_5001Parser = parser;
		}
		return goalIdentifier_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser goalDescription_5002Parser;

	/**
	 * @generated
	 */
	private IParser getGoalDescription_5002Parser() {
		if (goalDescription_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { GSN1Package.eINSTANCE
					.getModelElement_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			goalDescription_5002Parser = parser;
		}
		return goalDescription_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser strategyIdentifier_5003Parser;

	/**
	 * @generated
	 */
	private IParser getStrategyIdentifier_5003Parser() {
		if (strategyIdentifier_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { GSN1Package.eINSTANCE
					.getModelElement_Identifier() };
			MessageFormatParser parser = new MessageFormatParser(features);
			strategyIdentifier_5003Parser = parser;
		}
		return strategyIdentifier_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser strategyDescription_5004Parser;

	/**
	 * @generated
	 */
	private IParser getStrategyDescription_5004Parser() {
		if (strategyDescription_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { GSN1Package.eINSTANCE
					.getModelElement_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			strategyDescription_5004Parser = parser;
		}
		return strategyDescription_5004Parser;
	}

	/**
	 * @generated
	 */
	private IParser solutionIdentifier_5005Parser;

	/**
	 * @generated
	 */
	private IParser getSolutionIdentifier_5005Parser() {
		if (solutionIdentifier_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { GSN1Package.eINSTANCE
					.getModelElement_Identifier() };
			MessageFormatParser parser = new MessageFormatParser(features);
			solutionIdentifier_5005Parser = parser;
		}
		return solutionIdentifier_5005Parser;
	}

	/**
	 * @generated
	 */
	private IParser solutionDescription_5006Parser;

	/**
	 * @generated
	 */
	private IParser getSolutionDescription_5006Parser() {
		if (solutionDescription_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { GSN1Package.eINSTANCE
					.getModelElement_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			solutionDescription_5006Parser = parser;
		}
		return solutionDescription_5006Parser;
	}

	/**
	 * @generated
	 */
	private IParser contextIdentifier_5007Parser;

	/**
	 * @generated
	 */
	private IParser getContextIdentifier_5007Parser() {
		if (contextIdentifier_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { GSN1Package.eINSTANCE
					.getModelElement_Identifier() };
			MessageFormatParser parser = new MessageFormatParser(features);
			contextIdentifier_5007Parser = parser;
		}
		return contextIdentifier_5007Parser;
	}

	/**
	 * @generated
	 */
	private IParser contextDescription_5008Parser;

	/**
	 * @generated
	 */
	private IParser getContextDescription_5008Parser() {
		if (contextDescription_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { GSN1Package.eINSTANCE
					.getModelElement_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			contextDescription_5008Parser = parser;
		}
		return contextDescription_5008Parser;
	}

	/**
	 * @generated
	 */
	private IParser justificationIdentifier_5009Parser;

	/**
	 * @generated
	 */
	private IParser getJustificationIdentifier_5009Parser() {
		if (justificationIdentifier_5009Parser == null) {
			EAttribute[] features = new EAttribute[] { GSN1Package.eINSTANCE
					.getModelElement_Identifier() };
			MessageFormatParser parser = new MessageFormatParser(features);
			justificationIdentifier_5009Parser = parser;
		}
		return justificationIdentifier_5009Parser;
	}

	/**
	 * @generated
	 */
	private IParser justificationDescription_5010Parser;

	/**
	 * @generated
	 */
	private IParser getJustificationDescription_5010Parser() {
		if (justificationDescription_5010Parser == null) {
			EAttribute[] features = new EAttribute[] { GSN1Package.eINSTANCE
					.getModelElement_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			justificationDescription_5010Parser = parser;
		}
		return justificationDescription_5010Parser;
	}

	/**
	 * @generated
	 */
	private IParser assumptionIdentifier_5011Parser;

	/**
	 * @generated
	 */
	private IParser getAssumptionIdentifier_5011Parser() {
		if (assumptionIdentifier_5011Parser == null) {
			EAttribute[] features = new EAttribute[] { GSN1Package.eINSTANCE
					.getModelElement_Identifier() };
			MessageFormatParser parser = new MessageFormatParser(features);
			assumptionIdentifier_5011Parser = parser;
		}
		return assumptionIdentifier_5011Parser;
	}

	/**
	 * @generated
	 */
	private IParser assumptionDescription_5012Parser;

	/**
	 * @generated
	 */
	private IParser getAssumptionDescription_5012Parser() {
		if (assumptionDescription_5012Parser == null) {
			EAttribute[] features = new EAttribute[] { GSN1Package.eINSTANCE
					.getModelElement_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			assumptionDescription_5012Parser = parser;
		}
		return assumptionDescription_5012Parser;
	}

	/**
	 * @generated
	 */
	private IParser contractIdentifier_5013Parser;

	/**
	 * @generated
	 */
	private IParser getContractIdentifier_5013Parser() {
		if (contractIdentifier_5013Parser == null) {
			EAttribute[] features = new EAttribute[] { GSN1Package.eINSTANCE
					.getModelElement_Identifier() };
			MessageFormatParser parser = new MessageFormatParser(features);
			contractIdentifier_5013Parser = parser;
		}
		return contractIdentifier_5013Parser;
	}

	/**
	 * @generated
	 */
	private IParser contractDescription_5014Parser;

	/**
	 * @generated
	 */
	private IParser getContractDescription_5014Parser() {
		if (contractDescription_5014Parser == null) {
			EAttribute[] features = new EAttribute[] { GSN1Package.eINSTANCE
					.getModelElement_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			contractDescription_5014Parser = parser;
		}
		return contractDescription_5014Parser;
	}

	/**
	 * @generated
	 */
	private IParser argumentModuleIdentifier_5015Parser;

	/**
	 * @generated
	 */
	private IParser getArgumentModuleIdentifier_5015Parser() {
		if (argumentModuleIdentifier_5015Parser == null) {
			EAttribute[] features = new EAttribute[] { GSN1Package.eINSTANCE
					.getModelElement_Identifier() };
			MessageFormatParser parser = new MessageFormatParser(features);
			argumentModuleIdentifier_5015Parser = parser;
		}
		return argumentModuleIdentifier_5015Parser;
	}

	/**
	 * @generated
	 */
	private IParser argumentModuleDescription_5016Parser;

	/**
	 * @generated
	 */
	private IParser getArgumentModuleDescription_5016Parser() {
		if (argumentModuleDescription_5016Parser == null) {
			EAttribute[] features = new EAttribute[] { GSN1Package.eINSTANCE
					.getModelElement_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			argumentModuleDescription_5016Parser = parser;
		}
		return argumentModuleDescription_5016Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case GoalIdentifierEditPart.VISUAL_ID:
			return getGoalIdentifier_5001Parser();
		case GoalDescriptionEditPart.VISUAL_ID:
			return getGoalDescription_5002Parser();
		case StrategyIdentifierEditPart.VISUAL_ID:
			return getStrategyIdentifier_5003Parser();
		case StrategyDescriptionEditPart.VISUAL_ID:
			return getStrategyDescription_5004Parser();
		case SolutionIdentifierEditPart.VISUAL_ID:
			return getSolutionIdentifier_5005Parser();
		case SolutionDescriptionEditPart.VISUAL_ID:
			return getSolutionDescription_5006Parser();
		case ContextIdentifierEditPart.VISUAL_ID:
			return getContextIdentifier_5007Parser();
		case ContextDescriptionEditPart.VISUAL_ID:
			return getContextDescription_5008Parser();
		case JustificationIdentifierEditPart.VISUAL_ID:
			return getJustificationIdentifier_5009Parser();
		case JustificationDescriptionEditPart.VISUAL_ID:
			return getJustificationDescription_5010Parser();
		case AssumptionIdentifierEditPart.VISUAL_ID:
			return getAssumptionIdentifier_5011Parser();
		case AssumptionDescriptionEditPart.VISUAL_ID:
			return getAssumptionDescription_5012Parser();
		case ContractIdentifierEditPart.VISUAL_ID:
			return getContractIdentifier_5013Parser();
		case ContractDescriptionEditPart.VISUAL_ID:
			return getContractDescription_5014Parser();
		case ArgumentModuleIdentifierEditPart.VISUAL_ID:
			return getArgumentModuleIdentifier_5015Parser();
		case ArgumentModuleDescriptionEditPart.VISUAL_ID:
			return getArgumentModuleDescription_5016Parser();
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
			return getParser(GSN1VisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(GSN1VisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (GSN1ElementTypes.getElement(hint) == null) {
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
