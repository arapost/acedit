# Introduction #

This page lists all the changes that were done over the generated GMF code for both the GSN and ARM diagrams. The purpose of the modification of the generated code was to satisfy the requirements in order to reach the desired result.

# Changes over the generated GMF code for GSN #

This sections lists the modifications over the generated code for GSN. The reasons of modifications are explained following by the code that was added/replaced in specific classes.

## Modifications over the GSN edit parts ##

The default functionality for modifying the displaying of GSN diagrams did not permit to change the appearance of an element according to changes in its attributes. That wasn’t sufficient, since elements such as the Goal has to render differently according to its status that is related with the GSN extensions (public, undeveloped etc ). The following modification were done:

### AssumptionEditPart.java ###
In package GSN1.diagram.edit.parts
Java file: AssumptionEditPart.java

  * the method: protected void handleNotificationEvent(Notification event) was replaced with the following:

```
@Override
	protected void handleNotificationEvent(Notification event) {
		  if (event.getNotifier() == getModel()
			      && EcorePackage.eINSTANCE.getEModelElement_EAnnotations()
			          .equals(event.getFeature())) {
			    handleMajorSemanticChange();
			  } else {

			    if (event.getNotifier() instanceof Assumption) {
			     
			    	Assumption assumption = (Assumption) ( (Node) this.getModel()).getElement();
			    	
			    	if (assumption.getTobeinstantiated()==true){ 
			    		AssumptionFigure figure = (AssumptionFigure) this.getPrimaryShape();
				    	  figure.setShape(1);
				  	}
			  		else{
			  			AssumptionFigure figure = (AssumptionFigure) this.getPrimaryShape();
				    	  figure.setShape(0);
			  		}
			    
			    }
			    super.handleNotificationEvent(event);
			  }
	}

```

  * the method: protected IFigure createNodeShape() was replaced with the following:

```
/**
	 * @generated NOT
	 */
	protected IFigure createNodeShape() {
		Assumption assumption = (Assumption) ( (Node) this.getModel()).getElement();
  		if (assumption.getTobeinstantiated()==true){ 
  			primaryShape = new AssumptionFigure();
  			((AssumptionFigure)(primaryShape)).setShape(1);
  		}
  		
  		else{
  			primaryShape = new AssumptionFigure();
  		}
  		return primaryShape;
	}
```

### ContextEditPart.java ###
In package GSN1.diagram.edit.parts
Java file: ContextEditPart.java

  * the method: protected void handleNotificationEvent(Notification event) was replaced with the following:
```
@Override
	protected void handleNotificationEvent(Notification event) {
		  if (event.getNotifier() == getModel()
			      && EcorePackage.eINSTANCE.getEModelElement_EAnnotations()
			          .equals(event.getFeature())) {
			    handleMajorSemanticChange();
			  } else {

			    if (event.getNotifier() instanceof Context) {
			     
			    	Context context = (Context) ( (Node) this.getModel()).getElement();
			    	
			    	if (context.getTobeinstantiated()==true){ 
			    		ContextFigure figure = (ContextFigure) this.getPrimaryShape();
				    	  figure.setShape(1);
				  	}
			  		else{
			  			ContextFigure figure = (ContextFigure) this.getPrimaryShape();
				    	  figure.setShape(0);
			  		}
			    	if(context.getVisibility()==ElementVisibility.PUBLIC){
			    		ContextFigure figure = (ContextFigure) this.getPrimaryShape();
			    		figure.setVisibility(true);
			    	}
			    	else{
			    		ContextFigure figure = (ContextFigure) this.getPrimaryShape();
			    		figure.setVisibility(false);
			    	}
			    }
			    super.handleNotificationEvent(event);
			  }
	}
```

  * the method: protected IFigure createNodeShape() was replaced with the following:
```

		/**
	 * @generated NOT
	 */
	protected IFigure createNodeShape() {
		Context context = (Context) ( (Node) this.getModel()).getElement();
  		if (context.getTobeinstantiated()==true){ 
  			primaryShape = new ContextFigure();
  			((ContextFigure)(primaryShape)).setShape(1);
  		}
  		
  		else{
  			primaryShape = new ContextFigure();
  		}
  		if(context.getVisibility()==ElementVisibility.PUBLIC)
  			((ContextFigure)(primaryShape)).setVisibility(true);

  		return primaryShape;
	}
```

### GoalEditPart.java ###
In package GSN1.diagram.edit.parts
Java file: GoalEditPart.java

  * the method: protected void handleNotificationEvent(Notification event) was replaced with the following:
```
@Override
	protected void handleNotificationEvent(Notification event) {
		if (event.getNotifier() == getModel()
				&& EcorePackage.eINSTANCE.getEModelElement_EAnnotations()
						.equals(event.getFeature())) {
			handleMajorSemanticChange();
		} else {

			if (event.getNotifier() instanceof Goal) {

				Goal goal = (Goal) ((Node) this.getModel()).getElement();
				if (goal.getToBeDeveloped() == true
						&& goal.getTobeinstantiated() == false) {
					GoalFigure figure = (GoalFigure) this.getPrimaryShape();
					figure.setShape(1);
				} else if (goal.getToBeDeveloped() == false
						&& goal.getTobeinstantiated() == true) {
					GoalFigure figure = (GoalFigure) this.getPrimaryShape();
					figure.setShape(2);
				} else if (goal.getToBeDeveloped() == true
						&& goal.getTobeinstantiated() == true) {
					GoalFigure figure = (GoalFigure) this.getPrimaryShape();
					figure.setShape(3);
				} else if(goal.getToBeSupportedByContract() == true){
					GoalFigure figure = (GoalFigure) this.getPrimaryShape();
					figure.setShape(4);
				}
				else {
					GoalFigure figure = (GoalFigure) this.getPrimaryShape();
					figure.setShape(0);
				}
				if (goal.getVisibility() == ElementVisibility.PUBLIC) {
					GoalFigure figure = (GoalFigure) this.getPrimaryShape();
					figure.setVisibility(true);
				} else {
					GoalFigure figure = (GoalFigure) this.getPrimaryShape();
					figure.setVisibility(false);
				}
			}
			super.handleNotificationEvent(event);
		}
	}
```

  * the method: protected IFigure createNodeShape() was replaced with the following:
```
/**
	 * @generated NOT
	 */
	protected IFigure createNodeShape() {
		Goal goal = (Goal) ( (Node) this.getModel()).getElement();
  		if (goal.getToBeDeveloped()==true && goal.getTobeinstantiated()==false){ 
  			primaryShape = new GoalFigure();
  			((GoalFigure)(primaryShape)).setShape(1);
  			
  		}
  		else if (goal.getTobeinstantiated()==true && goal.getToBeDeveloped()==false){ 
  			primaryShape = new GoalFigure();
  			((GoalFigure)(primaryShape)).setShape(2);

  		}
  		else if (goal.getToBeDeveloped()==true && goal.getTobeinstantiated()==true){ 
  			primaryShape = new GoalFigure();
  			((GoalFigure)(primaryShape)).setShape(3);
  		}
  		else if(goal.getToBeSupportedByContract()==true){
  			primaryShape = new GoalFigure();
  			((GoalFigure)(primaryShape)).setShape(4);
  		}
  		else{
  			primaryShape = new GoalFigure();
  		}
  		if(goal.getVisibility()==ElementVisibility.PUBLIC)
  			((GoalFigure)(primaryShape)).setVisibility(true);

  		return primaryShape;
	}
```

### JustificationEditPart.java ###
In package GSN1.diagram.edit.parts
Java file: JustificationEditPart.java

  * the method: protected void handleNotificationEvent(Notification event) was replaced with the following:
```
	@Override
	protected void handleNotificationEvent(Notification event) {
		  if (event.getNotifier() == getModel()
			      && EcorePackage.eINSTANCE.getEModelElement_EAnnotations()
			          .equals(event.getFeature())) {
			    handleMajorSemanticChange();
			  } else {

			    if (event.getNotifier() instanceof Justification) {
			     
			    	Justification justification = (Justification) ( (Node) this.getModel()).getElement();
			    	
			    	if (justification.getTobeinstantiated()==true){ 
			    		JustificationFigure figure = (JustificationFigure) this.getPrimaryShape();
				    	  figure.setShape(1);
				  	}
			  		else{
			  			JustificationFigure figure = (JustificationFigure) this.getPrimaryShape();
				    	  figure.setShape(0);
			  		}
			    
			    }
			    super.handleNotificationEvent(event);
			  }
	}

```

  * the method: protected IFigure createNodeShape() was replaced with the following:
```
/**
	 * @generated NOT
	 */
	protected IFigure createNodeShape() {
		Justification justification = (Justification) ( (Node) this.getModel()).getElement();
  		if (justification.getTobeinstantiated()==true){ 
  			primaryShape = new JustificationFigure();
  			((JustificationFigure)(primaryShape)).setShape(1);
  		}
  		
  		else{
  			primaryShape = new JustificationFigure();
  		}
  		return primaryShape;
	}
```

### SolutionEditPart.java ###
In package GSN1.diagram.edit.parts
Java file: SolutionEditPart.java

  * the method: protected void handleNotificationEvent(Notification event) was replaced with the following:
```
	@Override
	protected void handleNotificationEvent(Notification event) {
		  if (event.getNotifier() == getModel()
			      && EcorePackage.eINSTANCE.getEModelElement_EAnnotations()
			          .equals(event.getFeature())) {
			    handleMajorSemanticChange();
			  } else {

			    if (event.getNotifier() instanceof Solution) {
			     
			    	Solution solution = (Solution) ( (Node) this.getModel()).getElement();
			    	
			    	if (solution.getTobeinstantiated()==true){ 
			    		SolutionFigure figure = (SolutionFigure) this.getPrimaryShape();
				    	  figure.setShape(1);
				  	}
			  		else{
			  			SolutionFigure figure = (SolutionFigure) this.getPrimaryShape();
				    	  figure.setShape(0);
			  		}
			    	if(solution.getVisibility()==ElementVisibility.PUBLIC){
			    		SolutionFigure figure = (SolutionFigure) this.getPrimaryShape();
			    		figure.setVisibility(true);
			    	}
			    	else{
			    		SolutionFigure figure = (SolutionFigure) this.getPrimaryShape();
			    		figure.setVisibility(false);
			    	}
			    }
			    super.handleNotificationEvent(event);
			  }
	}

```

  * the method: protected IFigure createNodeShape() was replaced with the following:
```
/**
	 * @generated NOT
	 */
	protected IFigure createNodeShape() {
		Solution solution = (Solution) ( (Node) this.getModel()).getElement();
  		if (solution.getTobeinstantiated()==true){ 
  			primaryShape = new SolutionFigure();
  			((SolutionFigure)(primaryShape)).setShape(1);
  		}
  		
  		else{
  			primaryShape = new SolutionFigure();
  		}
  		if(solution.getVisibility()==ElementVisibility.PUBLIC)
  			((SolutionFigure)(primaryShape)).setVisibility(true);

  		return primaryShape;
	}
```


### StradegyEditPart.java ###
In package GSN1.diagram.edit.parts
Java file: StradegyEditPart.java

  * the method: protected void handleNotificationEvent(Notification event) was replaced with the following:
```
		@Override
	protected void handleNotificationEvent(Notification event) {
		  if (event.getNotifier() == getModel()
			      && EcorePackage.eINSTANCE.getEModelElement_EAnnotations()
			          .equals(event.getFeature())) {
			    handleMajorSemanticChange();
			  } else {

			    if (event.getNotifier() instanceof Strategy) {
			     
			    	Strategy strategy = (Strategy) ( (Node) this.getModel()).getElement();
			    	if (strategy.getToBeDeveloped()==true && strategy.getTobeinstantiated()==false){ 
			    	StrategyFigure figure = (StrategyFigure) this.getPrimaryShape();
			    	  figure.setShape(1);
			  		}
			    	else if (strategy.getToBeDeveloped()==false && strategy.getTobeinstantiated()==true){ 
			    		StrategyFigure figure = (StrategyFigure) this.getPrimaryShape();
				    	  figure.setShape(2);
				  	}
			    	else if (strategy.getToBeDeveloped()==true && strategy.getTobeinstantiated()==true){ 
			    		StrategyFigure figure = (StrategyFigure) this.getPrimaryShape();
				    	  figure.setShape(3);
				  	}
			  		else{
			  			StrategyFigure figure = (StrategyFigure) this.getPrimaryShape();
				    	  figure.setShape(0);
			  		}
			    	
			    }
			    super.handleNotificationEvent(event);
			  }
	}

```

  * the method: protected IFigure createNodeShape() was replaced with the following:
```
/**
	 * @generated NOT
	 */
	protected IFigure createNodeShape() {
		Strategy strategy = (Strategy) ( (Node) this.getModel()).getElement();
  		if (strategy.getToBeDeveloped()==true && strategy.getTobeinstantiated()==false){ 
  			primaryShape = new StrategyFigure();
  			((StrategyFigure)(primaryShape)).setShape(1);
  			
  		}
  		else if (strategy.getTobeinstantiated()==true && strategy.getToBeDeveloped()==false){ 
  			primaryShape = new StrategyFigure();
  			((StrategyFigure)(primaryShape)).setShape(2);

  		}
  		else if (strategy.getToBeDeveloped()==true && strategy.getTobeinstantiated()==true){ 
  			primaryShape = new StrategyFigure();
  			((StrategyFigure)(primaryShape)).setShape(3);
  		}
  		else{
  			primaryShape = new StrategyFigure();
  		}

  		return primaryShape;
	}
```

### SolvedByEditPart.java ###

In package GSN1.diagram.edit.parts
Java file: SolvedByEditPart.java

  * The following method was added:
```

/**
	 * @generated NOT
	 */
	@Override
	protected void handleNotificationEvent(Notification event) {
		  if (event.getNotifier() == getModel()
			      && EcorePackage.eINSTANCE.getEModelElement_EAnnotations()
			          .equals(event.getFeature())) {
			    handleMajorSemanticChange();
			  } else {

			    if (event.getNotifier() instanceof SolvedBy) {
			     
			    	SolvedBy solvedBy = (SolvedBy) ((View) this.getModel()).getElement();
			    	if (solvedBy.getMultiextension()==SolvedByMultiplicityExtension.OPTIONAL ){ 
			    		SolvedByFigure figure = (SolvedByFigure) this.getPrimaryShape();
			    	  figure.setShape(1);
			        solvedBy.setCardinality("");

			  		}
			    	else if (solvedBy.getMultiextension()==SolvedByMultiplicityExtension.MULTI ){ 
			    		SolvedByFigure figure = (SolvedByFigure) this.getPrimaryShape();
				    	  figure.setShape(2);
				

				  	}
			  		else{
			  			SolvedByFigure figure = (SolvedByFigure) this.getPrimaryShape();
				    	  figure.setShape(0);
					solvedBy.setCardinality("");

			  		}
			    
			    }
			    super.handleNotificationEvent(event);
			  }
	}

```

  * The method: protected Connection createConnectionFigure() was replaced by the following:
```
/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated NOT
	 */

	protected Connection createConnectionFigure() {
		SolvedBy solvedBy = (SolvedBy) ((View) this.getModel()).getElement();
		SolvedByFigure figure;
		if (solvedBy.getMultiextension()==SolvedByMultiplicityExtension.OPTIONAL ){ 
    		figure = new SolvedByFigure();
    		figure.setShape(1);
  		}
    	else if (solvedBy.getMultiextension()==SolvedByMultiplicityExtension.MULTI){ 
    		figure = new SolvedByFigure();
    		figure.setShape(2);
	  	}
  		else{
  			figure = new SolvedByFigure();
    		figure.setShape(0);
  		}
		return  figure;
	}
```

  * The lines:
```
/**
	 * @generated 
	 */
	public class SolvedByFigure extends PolylineConnectionEx{
```

> were replaced by:
```
/**
	 * @generated NOT
	 */
	public class SolvedByFigure extends GSNSolvedBy {

```

## Modifications for the default delete from keyboard behaviour ##

The default functionality for delete from the keyboard supported by the generated code wasn’t sufficient, since the element was deleted only from the diagram view and not from the model view delete. The following modification were done:

### GSN1DiagramEditor.java ###
In package GSN1.diagram.part
Java file: !GSN1DiagramEditor.java

the method protected void configureGraphicalViewer() was replaced by:
```
/**
	 * @generated NOT
	 */
	protected void configureGraphicalViewer() {
		super.configureGraphicalViewer();
		DiagramEditorContextMenuProvider provider = new DiagramEditorContextMenuProvider(
				this, getDiagramGraphicalViewer());
		getDiagramGraphicalViewer().setContextMenu(provider);
		getSite().registerContextMenu(ActionIds.DIAGRAM_EDITOR_CONTEXT_MENU,
				provider, getDiagramGraphicalViewer());
		KeyHandler keyHandler = getDiagramGraphicalViewer().getKeyHandler();
		keyHandler.put(
		    KeyStroke.getPressed(SWT.DEL, 127, 0),
		    getActionRegistry().getAction(
		        ActionIds.ACTION_DELETE_FROM_MODEL
		    )
		);
		keyHandler.put(
		    KeyStroke.getPressed(SWT.BS, 8, 0),
		    getActionRegistry().getAction(
		        ActionIds.ACTION_DELETE_FROM_MODEL
		    )
		);
	}
```

## Modifications for the delete behaviour when an Argument or Contract module is deleted ##

By default when the user deletes an element, including the ArgumentModule and the ContractModule elements, nothing else is deleted. In the case of GSN diagrams, we wanted to add the following functionality: when the user deletes an argument or contract module we want also the elements that belong to this modules to be deleted. The reason was that there is that it make sense when a user deletes an Argument module to also delete all the contained elements. For this reason the following modifications were done:

### ArgumentModuleItemSemanticEditPolicy.java ###

In package GSN1.diagram.edit.policies
Java file: ArgumentModuleItemSemanticEditPolicy.java

  * in the method protected Command getDestroyElementCommand(DestroyElementRequest req), the following code was added before the return statement:
```
ArgumentModule ar=(ArgumentModule)view.getElement();
		for(int i=0;i<ar.getContainsElement().size();i++){
			DestroyElementRequest r = new DestroyElementRequest(
					ar.getContainsElement().get(i), false);
			cmd.add(new DestroyElementCommand(r));
		}
```


### ContractModuleItemSemanticEditPolicy.java ###

In package GSN1.diagram.edit.policies
Java file: ContractModuleItemSemanticEditPolicy.java

  * in the method protected Command getDestroyElementCommand(DestroyElementRequest req), the following code was added before the return statement:
```
ContractModule ar=(ContractModule)view.getElement();
		for(int i=0;i<ar.getContainsElement().size();i++){
			DestroyElementRequest r = new DestroyElementRequest(
					ar.getContainsElement().get(i), false);
			cmd.add(new DestroyElementCommand(r));
		}
```

## Modifications for the open diagram functionality ##

The default generated GMF code for the functionality of open new diagram is not work correctly. In addition, in order to support different diagram views for each GSN model view, the default policy (Canonical edit policy) is assigned by GMF to the root element is not sufficient. As a result the following modifications were done.

### OpenDiagramEditPolicy.java ###

in package GSN1.diagram.edit.policies
Java file: OpenDiagramEditPolicy.java

  * the method protected Diagram intializeNewDiagram() throws ExecutionException, was replaced by:
```
		/**
		 * @generated NOT
		 */
		protected Diagram intializeNewDiagram() throws ExecutionException {

			EObject domainRoot = null;
			//load the domain model resource
			ResourceSet domainResourceSet = new ResourceSetImpl();
			domainResourceSet
					.getResourceFactoryRegistry()
					.getExtensionToFactoryMap()
					.put(Resource.Factory.Registry.DEFAULT_EXTENSION,
							new XMIResourceFactoryImpl());
			URI dU = getDiagramDomainElement().eResource().getURI();
			Resource domainResource = domainResourceSet.getResource(dU, true);
			domainRoot = (EObject) domainResource.getContents().get(0);
			Diagram d = ViewService.createDiagram(domainRoot, getDiagramKind(),
					getPreferencesHint());
			if (d == null) {
				throw new ExecutionException("Can't create diagram of '"
						+ getDiagramKind() + "' kind");
			}
			diagramFacet.setDiagramLink(d);
			assert diagramFacet.eResource() != null;
			diagramFacet.eResource().getContents().add(d);
			EObject container = diagramFacet.eContainer();
			while (container instanceof View) {
				((View) container).persist();
				container = container.eContainer();
			}
			try {
				new WorkspaceModifyOperation() {
					protected void execute(IProgressMonitor monitor)
							throws CoreException, InvocationTargetException,
							InterruptedException {
						try {
							for (Iterator it = diagramFacet.eResource()
									.getResourceSet().getResources().iterator(); it
									.hasNext();) {
								Resource nextResource = (Resource) it.next();
								if (nextResource.isLoaded()
										&& !getEditingDomain().isReadOnly(
												nextResource)) {
									nextResource.save(GSN1DiagramEditorUtil
											.getSaveOptions());
								}
							}
						} catch (IOException ex) {
							throw new InvocationTargetException(ex,
									"Save operation failed");
						}
					}
				}.run(null);
			} catch (InvocationTargetException e) {
				throw new ExecutionException("Can't create diagram of '"
						+ getDiagramKind() + "' kind", e);
			} catch (InterruptedException e) {
				throw new ExecutionException("Can't create diagram of '"
						+ getDiagramKind() + "' kind", e);
			}
			return d;
		}
```

### CaseEditPart.java ###
in package GSN1.diagram.edit.parts
Java file: CaseEditPart.java
in method protected void createDefaultEditPolicies()
the following line was put in comments:
```
installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,new CaseCanonicalEditPolicy());
```
## Modification for the drag and drop functionality ##

The default generated GMF code does not support drag and drop functionality from the toolbar to the diagram area. As a result the following modification was done:

### GSN1PaletteFactory.java ###
In package: GSN1.diagram.part
Java file: !GSN1PaletteFactory.java

  * the private class NodeToolEntry was replaced by:
```
/**
	 * @generated NOT
	 */
	@SuppressWarnings("restriction")
	private static class NodeToolEntry extends PaletteToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> elementTypes;

		/**
		 * @generated NOT
		 */
		private NodeToolEntry(String title, String description,
				List<IElementType> elementTypes) {
			super(null, title, null);
			this.setDescription(description);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
```

## Modification to enable to change line in labels ##

The default functionality of GMF when the user enter text in a label (e.g. when the user writes the description of a Goal element) is to render everything in the same row. In order to change line when the text is more than length of the label, the following modifications were done:

in Package GSN1.diagram.edit.parts
in the java files: !XXXIdentifierEditPart.java, !XXXModuleIdentifierEditPart.java and !XXXDescriptionEditPart.java

the method protected DirectEditManager getManager(), was replaced by:
```
/**
	 * @generated NOT
	 */
	protected DirectEditManager getManager() {
		  if (manager == null) {
		        setManager(new TextDirectEditManager(this, WrapTextCellEditor.class, GSN1EditPartFactory.getTextCellEditorLocator(this)));
		    }
		    return manager;
		}

```

# Changes over the generated GMF code for ARM #

Only one modification were done in the generated code for ARM. However as it is described in section FutureWork, it is trivial to enrich the ARM diagram with similar functionality as the GSN one.

## Modification for change the behaviour of the auto arrange elements ##

Project: ARM.diagram
file: plugin.xml

The following code was added:
```
<extension
point="org.eclipse.gmf.runtime.diagram.ui.layoutProviders">
<layoutProvider

class=" org.eclipse.gmf.runtime.diagram.ui.providers.TopDownProvider ">
<Priority
name="Highest">
</Priority>
</layoutProvider>
</extension>
```

