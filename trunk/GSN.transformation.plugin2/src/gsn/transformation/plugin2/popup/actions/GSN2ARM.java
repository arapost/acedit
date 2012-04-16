package gsn.transformation.plugin2.popup.actions;

import gsn.transformation.standalone.etl.EtlStandaloneExample;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

public class GSN2ARM implements IObjectActionDelegate {

private String path;	
	/**
	 * Constructor for Action1.
	 */
	public GSN2ARM() {
		super();
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		
		IStructuredSelection selection = (IStructuredSelection) targetPart.getSite().getPage().getSelection();
	//	 IFile file = (IFile) targetPart.getSite().getPage().getActiveEditor()
      //   .getEditorInput().getAdapter(IFile.class);

		IFile file=(IFile)selection.getFirstElement();
         IPath ipath = file.getLocation();
         path=ipath.toPortableString();
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		

		try {
			EtlStandaloneExample.transformToEMFModel(path);
			EtlStandaloneExample.main(null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
	}

}
