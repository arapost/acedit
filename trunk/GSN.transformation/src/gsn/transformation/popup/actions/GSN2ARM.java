package gsn.transformation.popup.actions;

import gsn.transformation.core.EtlStandaloneExample;


import java.io.File;
import java.io.IOException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.gmf.runtime.diagram.core.services.ViewService;

import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;



public class GSN2ARM implements IObjectActionDelegate {

private IFile file;
private String path="";	
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
		file=(IFile)selection.getFirstElement();
        IPath ipath = file.getLocation();
        //does not work correctly in the case of different names of model and diagram
        if(ipath.toPortableString().contains("_diagram")){
        	String[] s=ipath.toPortableString().split("_diagram");
        	path=s[0];
        }
        else
        	path=ipath.toPortableString();
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		

		try {
			EtlStandaloneExample.pathOfGSNModel=path;
			EtlStandaloneExample.createFile(path);
			EtlStandaloneExample.main(null);
			generateDiagram(EtlStandaloneExample.pathOfArmModel);
			IWorkspace workspace = ResourcesPlugin.getWorkspace();
			workspace.getRoot().refreshLocal(IResource.DEPTH_INFINITE, null);
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

	//generates a diagram for the given domain model file name
	public  void generateDiagram(String domainModelFileName) throws IOException {
		if(domainModelFileName.endsWith("/")){
			int length=domainModelFileName.length();
			domainModelFileName=domainModelFileName.substring(0,length-1);
		}
		String diagramModelFileName =domainModelFileName + "_diagram";
		EObject domainRoot = null;
	
		//load the domain model resource
		ResourceSet domainResourceSet =new ResourceSetImpl();
		domainResourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
		URI domainFileURI =URI.createFileURI(new File(domainModelFileName).getAbsolutePath());
		Resource domainResource =domainResourceSet.getResource(domainFileURI, true);

		//create the diagram model resource
		ResourceSet diagramResourceSet =new ResourceSetImpl();
		
		diagramResourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
		URI diagramFileURI =URI.createFileURI(new File(diagramModelFileName).getAbsolutePath());
		Resource diagramResource =diagramResourceSet.createResource(diagramFileURI);

		//create the diagram and save it to the file
		domainRoot =(EObject) domainResource.getContents().get(0);
		Diagram diagram =ViewService.createDiagram(domainRoot,arm.diagram.edit.parts.CaseEditPart.MODEL_ID,arm.diagram.part.ARMDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);


		diagramResource.getContents().add(diagram);
		diagramResource.save(arm.diagram.part.ARMDiagramEditorUtil.getSaveOptions());
	}

		

		
}
