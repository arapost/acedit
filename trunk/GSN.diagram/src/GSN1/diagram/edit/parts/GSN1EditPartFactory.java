/*
 * 
 */
package GSN1.diagram.edit.parts;

import org.eclipse.draw2d.FigureUtilities;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;

import GSN1.diagram.part.GSN1VisualIDRegistry;

/**
 * @generated
 */
public class GSN1EditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (GSN1VisualIDRegistry.getVisualID(view)) {

			case CaseEditPart.VISUAL_ID:
				return new CaseEditPart(view);

			case GoalEditPart.VISUAL_ID:
				return new GoalEditPart(view);

			case GoalIdentifierEditPart.VISUAL_ID:
				return new GoalIdentifierEditPart(view);

			case GoalDescriptionEditPart.VISUAL_ID:
				return new GoalDescriptionEditPart(view);

			case StrategyEditPart.VISUAL_ID:
				return new StrategyEditPart(view);

			case StrategyIdentifierEditPart.VISUAL_ID:
				return new StrategyIdentifierEditPart(view);

			case StrategyDescriptionEditPart.VISUAL_ID:
				return new StrategyDescriptionEditPart(view);

			case AwayGoalEditPart.VISUAL_ID:
				return new AwayGoalEditPart(view);

			case AwayGoalIdentifierEditPart.VISUAL_ID:
				return new AwayGoalIdentifierEditPart(view);

			case AwayGoalDescriptionEditPart.VISUAL_ID:
				return new AwayGoalDescriptionEditPart(view);

			case AwayGoalModuleIdentifierEditPart.VISUAL_ID:
				return new AwayGoalModuleIdentifierEditPart(view);

			case SolutionEditPart.VISUAL_ID:
				return new SolutionEditPart(view);

			case SolutionIdentifierEditPart.VISUAL_ID:
				return new SolutionIdentifierEditPart(view);

			case SolutionDescriptionEditPart.VISUAL_ID:
				return new SolutionDescriptionEditPart(view);

			case ContextEditPart.VISUAL_ID:
				return new ContextEditPart(view);

			case ContextIdentifierEditPart.VISUAL_ID:
				return new ContextIdentifierEditPart(view);

			case ContextDescriptionEditPart.VISUAL_ID:
				return new ContextDescriptionEditPart(view);

			case JustificationEditPart.VISUAL_ID:
				return new JustificationEditPart(view);

			case JustificationIdentifierEditPart.VISUAL_ID:
				return new JustificationIdentifierEditPart(view);

			case JustificationDescriptionEditPart.VISUAL_ID:
				return new JustificationDescriptionEditPart(view);

			case AssumptionEditPart.VISUAL_ID:
				return new AssumptionEditPart(view);

			case AssumptionIdentifierEditPart.VISUAL_ID:
				return new AssumptionIdentifierEditPart(view);

			case AssumptionDescriptionEditPart.VISUAL_ID:
				return new AssumptionDescriptionEditPart(view);

			case AwayContextEditPart.VISUAL_ID:
				return new AwayContextEditPart(view);

			case AwayContextIdentifierEditPart.VISUAL_ID:
				return new AwayContextIdentifierEditPart(view);

			case AwayContextDescriptionEditPart.VISUAL_ID:
				return new AwayContextDescriptionEditPart(view);

			case AwayContextModuleIdentifierEditPart.VISUAL_ID:
				return new AwayContextModuleIdentifierEditPart(view);

			case AwaySolutionEditPart.VISUAL_ID:
				return new AwaySolutionEditPart(view);

			case AwaySolutionIdentifierEditPart.VISUAL_ID:
				return new AwaySolutionIdentifierEditPart(view);

			case AwaySolutionDescriptionEditPart.VISUAL_ID:
				return new AwaySolutionDescriptionEditPart(view);

			case AwaySolutionModuleIdentifierEditPart.VISUAL_ID:
				return new AwaySolutionModuleIdentifierEditPart(view);

			case ArgumentModuleEditPart.VISUAL_ID:
				return new ArgumentModuleEditPart(view);

			case ArgumentModuleIdentifierEditPart.VISUAL_ID:
				return new ArgumentModuleIdentifierEditPart(view);

			case ArgumentModuleDescriptionEditPart.VISUAL_ID:
				return new ArgumentModuleDescriptionEditPart(view);

			case ContractModuleEditPart.VISUAL_ID:
				return new ContractModuleEditPart(view);

			case ContractModuleIdentifierEditPart.VISUAL_ID:
				return new ContractModuleIdentifierEditPart(view);

			case ContractModuleDescriptionEditPart.VISUAL_ID:
				return new ContractModuleDescriptionEditPart(view);

			case SolvedByModularEditPart.VISUAL_ID:
				return new SolvedByModularEditPart(view);

			case InContextOfModularEditPart.VISUAL_ID:
				return new InContextOfModularEditPart(view);

			case SolvedByEditPart.VISUAL_ID:
				return new SolvedByEditPart(view);

			case SolvedByCardinalityEditPart.VISUAL_ID:
				return new SolvedByCardinalityEditPart(view);

			case InContextOfEditPart.VISUAL_ID:
				return new InContextOfEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		if (source.getFigure() instanceof WrappingLabel)
			return new TextCellEditorLocator((WrappingLabel) source.getFigure());
		else {
			return new LabelCellEditorLocator((Label) source.getFigure());
		}
	}

	/**
	 * @generated
	 */
	static private class TextCellEditorLocator implements CellEditorLocator {

		/**
		 * @generated
		 */
		private WrappingLabel wrapLabel;

		/**
		 * @generated
		 */
		public TextCellEditorLocator(WrappingLabel wrapLabel) {
			this.wrapLabel = wrapLabel;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getWrapLabel() {
			return wrapLabel;
		}

		/**
		 * @generated
		 */
		public void relocate(CellEditor celleditor) {
			Text text = (Text) celleditor.getControl();
			Rectangle rect = getWrapLabel().getTextBounds().getCopy();
			getWrapLabel().translateToAbsolute(rect);
			if (!text.getFont().isDisposed()) {
				if (getWrapLabel().isTextWrapOn()
						&& getWrapLabel().getText().length() > 0) {
					rect.setSize(new Dimension(text.computeSize(rect.width,
							SWT.DEFAULT)));
				} else {
					int avr = FigureUtilities.getFontMetrics(text.getFont())
							.getAverageCharWidth();
					rect.setSize(new Dimension(text.computeSize(SWT.DEFAULT,
							SWT.DEFAULT)).expand(avr * 2, 0));
				}
			}
			if (!rect.equals(new Rectangle(text.getBounds()))) {
				text.setBounds(rect.x, rect.y, rect.width, rect.height);
			}
		}
	}

	/**
	 * @generated
	 */
	private static class LabelCellEditorLocator implements CellEditorLocator {

		/**
		 * @generated
		 */
		private Label label;

		/**
		 * @generated
		 */
		public LabelCellEditorLocator(Label label) {
			this.label = label;
		}

		/**
		 * @generated
		 */
		public Label getLabel() {
			return label;
		}

		/**
		 * @generated
		 */
		public void relocate(CellEditor celleditor) {
			Text text = (Text) celleditor.getControl();
			Rectangle rect = getLabel().getTextBounds().getCopy();
			getLabel().translateToAbsolute(rect);
			if (!text.getFont().isDisposed()) {
				int avr = FigureUtilities.getFontMetrics(text.getFont())
						.getAverageCharWidth();
				rect.setSize(new Dimension(text.computeSize(SWT.DEFAULT,
						SWT.DEFAULT)).expand(avr * 2, 0));
			}
			if (!rect.equals(new Rectangle(text.getBounds()))) {
				text.setBounds(rect.x, rect.y, rect.width, rect.height);
			}
		}
	}
}
