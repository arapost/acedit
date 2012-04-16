/*
 * 
 */
package GSN1.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import GSN1.diagram.part.GSN1VisualIDRegistry;

/**
 * @generated
 */
public class GSN1NavigatorSorter extends ViewerSorter {

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
		if (element instanceof GSN1NavigatorItem) {
			GSN1NavigatorItem item = (GSN1NavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return GSN1VisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
