/*
 * 
 */
package arm.diagram.providers;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.notation.View;

import arm.diagram.edit.parts.CaseEditPart;
import arm.diagram.part.ARMDiagramEditorPlugin;
import arm.diagram.part.ARMVisualIDRegistry;

/**
 * @generated
 */
public class ARMValidationProvider {

	/**
	 * @generated
	 */
	private static boolean constraintsActive = false;

	/**
	 * @generated
	 */
	public static boolean shouldConstraintsBePrivate() {
		return false;
	}

	/**
	 * @generated
	 */
	public static void runWithConstraints(
			TransactionalEditingDomain editingDomain, Runnable operation) {
		final Runnable op = operation;
		Runnable task = new Runnable() {
			public void run() {
				try {
					constraintsActive = true;
					op.run();
				} finally {
					constraintsActive = false;
				}
			}
		};
		if (editingDomain != null) {
			try {
				editingDomain.runExclusive(task);
			} catch (Exception e) {
				ARMDiagramEditorPlugin.getInstance().logError(
						"Validation failed", e); //$NON-NLS-1$
			}
		} else {
			task.run();
		}
	}

	/**
	 * @generated
	 */
	static boolean isInDefaultEditorContext(Object object) {
		if (shouldConstraintsBePrivate() && !constraintsActive) {
			return false;
		}
		if (object instanceof View) {
			return constraintsActive
					&& CaseEditPart.MODEL_ID.equals(ARMVisualIDRegistry
							.getModelID((View) object));
		}
		return true;
	}

}
