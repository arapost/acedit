/*
 * 
 */
package arm.diagram.edit.parts;

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

import arm.diagram.part.ARMVisualIDRegistry;

/**
 * @generated
 */
public class ARMEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (ARMVisualIDRegistry.getVisualID(view)) {

			case CaseEditPart.VISUAL_ID:
				return new CaseEditPart(view);

			case EvidenceAssertationEditPart.VISUAL_ID:
				return new EvidenceAssertationEditPart(view);

			case EvidenceAssertationIdentifierEditPart.VISUAL_ID:
				return new EvidenceAssertationIdentifierEditPart(view);

			case EvidenceAssertationDescriptionEditPart.VISUAL_ID:
				return new EvidenceAssertationDescriptionEditPart(view);

			case ClaimEditPart.VISUAL_ID:
				return new ClaimEditPart(view);

			case ClaimIdentifierEditPart.VISUAL_ID:
				return new ClaimIdentifierEditPart(view);

			case ClaimDescriptionEditPart.VISUAL_ID:
				return new ClaimDescriptionEditPart(view);

			case ArgumentReasoningEditPart.VISUAL_ID:
				return new ArgumentReasoningEditPart(view);

			case ArgumentReasoningIdentifierEditPart.VISUAL_ID:
				return new ArgumentReasoningIdentifierEditPart(view);

			case ArgumentReasoningDescriptionEditPart.VISUAL_ID:
				return new ArgumentReasoningDescriptionEditPart(view);

			case InformationElementEditPart.VISUAL_ID:
				return new InformationElementEditPart(view);

			case InformationElementIdentifierEditPart.VISUAL_ID:
				return new InformationElementIdentifierEditPart(view);

			case InformationElementDescriptionEditPart.VISUAL_ID:
				return new InformationElementDescriptionEditPart(view);

			case CitiationElementEditPart.VISUAL_ID:
				return new CitiationElementEditPart(view);

			case CitiationElementIdentifierEditPart.VISUAL_ID:
				return new CitiationElementIdentifierEditPart(view);

			case CitiationElementDescriptionEditPart.VISUAL_ID:
				return new CitiationElementDescriptionEditPart(view);

			case ArgumentEditPart.VISUAL_ID:
				return new ArgumentEditPart(view);

			case ArgumentIdentifierEditPart.VISUAL_ID:
				return new ArgumentIdentifierEditPart(view);

			case ArgumentDescriptionEditPart.VISUAL_ID:
				return new ArgumentDescriptionEditPart(view);

			case AssertedInferenceEditPart.VISUAL_ID:
				return new AssertedInferenceEditPart(view);

			case AssertedContextEditPart.VISUAL_ID:
				return new AssertedContextEditPart(view);

			case AssertedEvidenceEditPart.VISUAL_ID:
				return new AssertedEvidenceEditPart(view);

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
