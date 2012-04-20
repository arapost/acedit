/*
 * 
 */
package arm.diagram.providers;

import arm.diagram.part.ARMDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = ARMDiagramEditorPlugin.getInstance()
				.getElementInitializers();
		if (cached == null) {
			ARMDiagramEditorPlugin.getInstance().setElementInitializers(
					cached = new ElementInitializers());
		}
		return cached;
	}
}
