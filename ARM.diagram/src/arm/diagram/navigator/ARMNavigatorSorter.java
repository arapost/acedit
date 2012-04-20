/*
 * 
 */
package arm.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import arm.diagram.part.ARMVisualIDRegistry;

/**
 * @generated
 */
public class ARMNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 4005;

	/**
	 * @generated
	 */
	private static final int SHORTCUTS_CATEGORY = 4004;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof ARMNavigatorItem) {
			ARMNavigatorItem item = (ARMNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return ARMVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
