/*
 * 
 */
package GSN1.diagram.providers;

import GSN1.diagram.part.GSN1DiagramEditorPlugin;

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
		ElementInitializers cached = GSN1DiagramEditorPlugin.getInstance()
				.getElementInitializers();
		if (cached == null) {
			GSN1DiagramEditorPlugin.getInstance().setElementInitializers(
					cached = new ElementInitializers());
		}
		return cached;
	}
}
