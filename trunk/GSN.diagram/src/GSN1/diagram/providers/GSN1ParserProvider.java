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
import GSN1.diagram.edit.parts.AwayContextDescriptionEditPart;
import GSN1.diagram.edit.parts.AwayContextIdentifierEditPart;
import GSN1.diagram.edit.parts.AwayContextModuleIdentifierEditPart;
import GSN1.diagram.edit.parts.AwayGoalDescriptionEditPart;
import GSN1.diagram.edit.parts.AwayGoalIdentifierEditPart;
import GSN1.diagram.edit.parts.AwayGoalModuleIdentifierEditPart;
import GSN1.diagram.edit.parts.AwaySolutionDescriptionEditPart;
import GSN1.diagram.edit.parts.AwaySolutionIdentifierEditPart;
import GSN1.diagram.edit.parts.AwaySolutionModuleIdentifierEditPart;
import GSN1.diagram.edit.parts.ContextDescriptionEditPart;
import GSN1.diagram.edit.parts.ContextIdentifierEditPart;
import GSN1.diagram.edit.parts.ContractModuleDescriptionEditPart;
import GSN1.diagram.edit.parts.ContractModuleIdentifierEditPart;
import GSN1.diagram.edit.parts.GoalDescriptionEditPart;
import GSN1.diagram.edit.parts.GoalIdentifierEditPart;
import GSN1.diagram.edit.parts.JustificationDescriptionEditPart;
import GSN1.diagram.edit.parts.JustificationIdentifierEditPart;
import GSN1.diagram.edit.parts.SolutionDescriptionEditPart;
import GSN1.diagram.edit.parts.SolutionIdentifierEditPart;
import GSN1.diagram.edit.parts.SolvedByCardinalityEditPart;
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
	private IParser awayGoalIdentifier_5005Parser;

	/**
	 * @generated
	 */
	private IParser getAwayGoalIdentifier_5005Parser() {
		if (awayGoalIdentifier_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { GSN1Package.eINSTANCE
					.getModelElement_Identifier() };
			MessageFormatParser parser = new MessageFormatParser(features);
			awayGoalIdentifier_5005Parser = parser;
		}
		return awayGoalIdentifier_5005Parser;
	}

	/**
	 * @generated
	 */
	private IParser awayGoalDescription_5006Parser;

	/**
	 * @generated
	 */
	private IParser getAwayGoalDescription_5006Parser() {
		if (awayGoalDescription_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { GSN1Package.eINSTANCE
					.getModelElement_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			awayGoalDescription_5006Parser = parser;
		}
		return awayGoalDescription_5006Parser;
	}

	/**
	 * @generated
	 */
	private IParser awayGoalModuleIdentifier_5007Parser;

	/**
	 * @generated
	 */
	private IParser getAwayGoalModuleIdentifier_5007Parser() {
		if (awayGoalModuleIdentifier_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { GSN1Package.eINSTANCE
					.getAwayGoal_ModuleIdentifier() };
			MessageFormatParser parser = new MessageFormatParser(features);
			awayGoalModuleIdentifier_5007Parser = parser;
		}
		return awayGoalModuleIdentifier_5007Parser;
	}

	/**
	 * @generated
	 */
	private IParser solutionIdentifier_5008Parser;

	/**
	 * @generated
	 */
	private IParser getSolutionIdentifier_5008Parser() {
		if (solutionIdentifier_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { GSN1Package.eINSTANCE
					.getModelElement_Identifier() };
			MessageFormatParser parser = new MessageFormatParser(features);
			solutionIdentifier_5008Parser = parser;
		}
		return solutionIdentifier_5008Parser;
	}

	/**
	 * @generated
	 */
	private IParser solutionDescription_5009Parser;

	/**
	 * @generated
	 */
	private IParser getSolutionDescription_5009Parser() {
		if (solutionDescription_5009Parser == null) {
			EAttribute[] features = new EAttribute[] { GSN1Package.eINSTANCE
					.getModelElement_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			solutionDescription_5009Parser = parser;
		}
		return solutionDescription_5009Parser;
	}

	/**
	 * @generated
	 */
	private IParser contextIdentifier_5010Parser;

	/**
	 * @generated
	 */
	private IParser getContextIdentifier_5010Parser() {
		if (contextIdentifier_5010Parser == null) {
			EAttribute[] features = new EAttribute[] { GSN1Package.eINSTANCE
					.getModelElement_Identifier() };
			MessageFormatParser parser = new MessageFormatParser(features);
			contextIdentifier_5010Parser = parser;
		}
		return contextIdentifier_5010Parser;
	}

	/**
	 * @generated
	 */
	private IParser contextDescription_5011Parser;

	/**
	 * @generated
	 */
	private IParser getContextDescription_5011Parser() {
		if (contextDescription_5011Parser == null) {
			EAttribute[] features = new EAttribute[] { GSN1Package.eINSTANCE
					.getModelElement_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			contextDescription_5011Parser = parser;
		}
		return contextDescription_5011Parser;
	}

	/**
	 * @generated
	 */
	private IParser justificationIdentifier_5012Parser;

	/**
	 * @generated
	 */
	private IParser getJustificationIdentifier_5012Parser() {
		if (justificationIdentifier_5012Parser == null) {
			EAttribute[] features = new EAttribute[] { GSN1Package.eINSTANCE
					.getModelElement_Identifier() };
			MessageFormatParser parser = new MessageFormatParser(features);
			justificationIdentifier_5012Parser = parser;
		}
		return justificationIdentifier_5012Parser;
	}

	/**
	 * @generated
	 */
	private IParser justificationDescription_5013Parser;

	/**
	 * @generated
	 */
	private IParser getJustificationDescription_5013Parser() {
		if (justificationDescription_5013Parser == null) {
			EAttribute[] features = new EAttribute[] { GSN1Package.eINSTANCE
					.getModelElement_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			justificationDescription_5013Parser = parser;
		}
		return justificationDescription_5013Parser;
	}

	/**
	 * @generated
	 */
	private IParser assumptionIdentifier_5014Parser;

	/**
	 * @generated
	 */
	private IParser getAssumptionIdentifier_5014Parser() {
		if (assumptionIdentifier_5014Parser == null) {
			EAttribute[] features = new EAttribute[] { GSN1Package.eINSTANCE
					.getModelElement_Identifier() };
			MessageFormatParser parser = new MessageFormatParser(features);
			assumptionIdentifier_5014Parser = parser;
		}
		return assumptionIdentifier_5014Parser;
	}

	/**
	 * @generated
	 */
	private IParser assumptionDescription_5015Parser;

	/**
	 * @generated
	 */
	private IParser getAssumptionDescription_5015Parser() {
		if (assumptionDescription_5015Parser == null) {
			EAttribute[] features = new EAttribute[] { GSN1Package.eINSTANCE
					.getModelElement_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			assumptionDescription_5015Parser = parser;
		}
		return assumptionDescription_5015Parser;
	}

	/**
	 * @generated
	 */
	private IParser awayContextIdentifier_5016Parser;

	/**
	 * @generated
	 */
	private IParser getAwayContextIdentifier_5016Parser() {
		if (awayContextIdentifier_5016Parser == null) {
			EAttribute[] features = new EAttribute[] { GSN1Package.eINSTANCE
					.getModelElement_Identifier() };
			MessageFormatParser parser = new MessageFormatParser(features);
			awayContextIdentifier_5016Parser = parser;
		}
		return awayContextIdentifier_5016Parser;
	}

	/**
	 * @generated
	 */
	private IParser awayContextDescription_5017Parser;

	/**
	 * @generated
	 */
	private IParser getAwayContextDescription_5017Parser() {
		if (awayContextDescription_5017Parser == null) {
			EAttribute[] features = new EAttribute[] { GSN1Package.eINSTANCE
					.getModelElement_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			awayContextDescription_5017Parser = parser;
		}
		return awayContextDescription_5017Parser;
	}

	/**
	 * @generated
	 */
	private IParser awayContextModuleIdentifier_5018Parser;

	/**
	 * @generated
	 */
	private IParser getAwayContextModuleIdentifier_5018Parser() {
		if (awayContextModuleIdentifier_5018Parser == null) {
			EAttribute[] features = new EAttribute[] { GSN1Package.eINSTANCE
					.getAwayContext_ModuleIdentifier() };
			MessageFormatParser parser = new MessageFormatParser(features);
			awayContextModuleIdentifier_5018Parser = parser;
		}
		return awayContextModuleIdentifier_5018Parser;
	}

	/**
	 * @generated
	 */
	private IParser awaySolutionIdentifier_5019Parser;

	/**
	 * @generated
	 */
	private IParser getAwaySolutionIdentifier_5019Parser() {
		if (awaySolutionIdentifier_5019Parser == null) {
			EAttribute[] features = new EAttribute[] { GSN1Package.eINSTANCE
					.getModelElement_Identifier() };
			MessageFormatParser parser = new MessageFormatParser(features);
			awaySolutionIdentifier_5019Parser = parser;
		}
		return awaySolutionIdentifier_5019Parser;
	}

	/**
	 * @generated
	 */
	private IParser awaySolutionDescription_5020Parser;

	/**
	 * @generated
	 */
	private IParser getAwaySolutionDescription_5020Parser() {
		if (awaySolutionDescription_5020Parser == null) {
			EAttribute[] features = new EAttribute[] { GSN1Package.eINSTANCE
					.getModelElement_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			awaySolutionDescription_5020Parser = parser;
		}
		return awaySolutionDescription_5020Parser;
	}

	/**
	 * @generated
	 */
	private IParser awaySolutionModuleIdentifier_5021Parser;

	/**
	 * @generated
	 */
	private IParser getAwaySolutionModuleIdentifier_5021Parser() {
		if (awaySolutionModuleIdentifier_5021Parser == null) {
			EAttribute[] features = new EAttribute[] { GSN1Package.eINSTANCE
					.getAwaySolution_ModuleIdentifier() };
			MessageFormatParser parser = new MessageFormatParser(features);
			awaySolutionModuleIdentifier_5021Parser = parser;
		}
		return awaySolutionModuleIdentifier_5021Parser;
	}

	/**
	 * @generated
	 */
	private IParser argumentModuleIdentifier_5022Parser;

	/**
	 * @generated
	 */
	private IParser getArgumentModuleIdentifier_5022Parser() {
		if (argumentModuleIdentifier_5022Parser == null) {
			EAttribute[] features = new EAttribute[] { GSN1Package.eINSTANCE
					.getModelElement_Identifier() };
			MessageFormatParser parser = new MessageFormatParser(features);
			argumentModuleIdentifier_5022Parser = parser;
		}
		return argumentModuleIdentifier_5022Parser;
	}

	/**
	 * @generated
	 */
	private IParser argumentModuleDescription_5023Parser;

	/**
	 * @generated
	 */
	private IParser getArgumentModuleDescription_5023Parser() {
		if (argumentModuleDescription_5023Parser == null) {
			EAttribute[] features = new EAttribute[] { GSN1Package.eINSTANCE
					.getModelElement_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			argumentModuleDescription_5023Parser = parser;
		}
		return argumentModuleDescription_5023Parser;
	}

	/**
	 * @generated
	 */
	private IParser contractModuleIdentifier_5024Parser;

	/**
	 * @generated
	 */
	private IParser getContractModuleIdentifier_5024Parser() {
		if (contractModuleIdentifier_5024Parser == null) {
			EAttribute[] features = new EAttribute[] { GSN1Package.eINSTANCE
					.getModelElement_Identifier() };
			MessageFormatParser parser = new MessageFormatParser(features);
			contractModuleIdentifier_5024Parser = parser;
		}
		return contractModuleIdentifier_5024Parser;
	}

	/**
	 * @generated
	 */
	private IParser contractModuleDescription_5025Parser;

	/**
	 * @generated
	 */
	private IParser getContractModuleDescription_5025Parser() {
		if (contractModuleDescription_5025Parser == null) {
			EAttribute[] features = new EAttribute[] { GSN1Package.eINSTANCE
					.getModelElement_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			contractModuleDescription_5025Parser = parser;
		}
		return contractModuleDescription_5025Parser;
	}

	/**
	 * @generated
	 */
	private IParser solvedByCardinality_6001Parser;

	/**
	 * @generated
	 */
	private IParser getSolvedByCardinality_6001Parser() {
		if (solvedByCardinality_6001Parser == null) {
			EAttribute[] features = new EAttribute[] { GSN1Package.eINSTANCE
					.getSolvedBy_Cardinality() };
			MessageFormatParser parser = new MessageFormatParser(features);
			solvedByCardinality_6001Parser = parser;
		}
		return solvedByCardinality_6001Parser;
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
		case AwayGoalIdentifierEditPart.VISUAL_ID:
			return getAwayGoalIdentifier_5005Parser();
		case AwayGoalDescriptionEditPart.VISUAL_ID:
			return getAwayGoalDescription_5006Parser();
		case AwayGoalModuleIdentifierEditPart.VISUAL_ID:
			return getAwayGoalModuleIdentifier_5007Parser();
		case SolutionIdentifierEditPart.VISUAL_ID:
			return getSolutionIdentifier_5008Parser();
		case SolutionDescriptionEditPart.VISUAL_ID:
			return getSolutionDescription_5009Parser();
		case ContextIdentifierEditPart.VISUAL_ID:
			return getContextIdentifier_5010Parser();
		case ContextDescriptionEditPart.VISUAL_ID:
			return getContextDescription_5011Parser();
		case JustificationIdentifierEditPart.VISUAL_ID:
			return getJustificationIdentifier_5012Parser();
		case JustificationDescriptionEditPart.VISUAL_ID:
			return getJustificationDescription_5013Parser();
		case AssumptionIdentifierEditPart.VISUAL_ID:
			return getAssumptionIdentifier_5014Parser();
		case AssumptionDescriptionEditPart.VISUAL_ID:
			return getAssumptionDescription_5015Parser();
		case AwayContextIdentifierEditPart.VISUAL_ID:
			return getAwayContextIdentifier_5016Parser();
		case AwayContextDescriptionEditPart.VISUAL_ID:
			return getAwayContextDescription_5017Parser();
		case AwayContextModuleIdentifierEditPart.VISUAL_ID:
			return getAwayContextModuleIdentifier_5018Parser();
		case AwaySolutionIdentifierEditPart.VISUAL_ID:
			return getAwaySolutionIdentifier_5019Parser();
		case AwaySolutionDescriptionEditPart.VISUAL_ID:
			return getAwaySolutionDescription_5020Parser();
		case AwaySolutionModuleIdentifierEditPart.VISUAL_ID:
			return getAwaySolutionModuleIdentifier_5021Parser();
		case ArgumentModuleIdentifierEditPart.VISUAL_ID:
			return getArgumentModuleIdentifier_5022Parser();
		case ArgumentModuleDescriptionEditPart.VISUAL_ID:
			return getArgumentModuleDescription_5023Parser();
		case ContractModuleIdentifierEditPart.VISUAL_ID:
			return getContractModuleIdentifier_5024Parser();
		case ContractModuleDescriptionEditPart.VISUAL_ID:
			return getContractModuleDescription_5025Parser();
		case SolvedByCardinalityEditPart.VISUAL_ID:
			return getSolvedByCardinality_6001Parser();
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
