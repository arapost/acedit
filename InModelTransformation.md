# Introduction #

This section presents the in-model transformation (wizards) of **acedit**. First the functionality and interaction of the wizards with tool is explained, followed by the wizards code and instructions on how to add your own wizards.



# The Wizards Tool #

The wizards tool is integrated with the GSN editor. Thus, when the wizards plug-in perform the in-model tranformation, the GSN editor is corresponding to its actions. As a result the wizards actions notify the controller which is responsible for the GSN views, which in turn manipulates the views.The following figure shows how the wizards tool works at runtime and integrates with the GSN editor:

![http://acedit.googlecode.com/svn/acedit%20images/activity%20diagram%20wizards.jpg](http://acedit.googlecode.com/svn/acedit%20images/activity%20diagram%20wizards.jpg)

The user performs an action in a selected element through a wizard and the wizard in turn triggers the GSN editor to change the status of the element and the way it displays.

# Wizards in EWL #

The Epsilon Wizard Language([EWL](http://www.eclipse.org/epsilon/doc/ewl/)) is used to extend the wizards built in mechanism. The wizards implement in-place model refactoring in the GSN elements by changing their values. The EWL code is presented below:
```
wizard visibility {

guard : self.isKindOf(Goal)or self.isKindOf(Solution) or self.isKindOf(Context)

 	title : 'change visibility from ' + self.visibility +' to ' + self.returnOppositeVisibility()

 	do {
		if(self.visibility==ElementVisibility#Public){
			self.visibility=ElementVisibility#Private;
		}
		else if (self.visibility==ElementVisibility#Private){
			self.visibility=ElementVisibility#Public;
		}
	}
 }
 
 wizard  tobedeveloped{

 	guard : self.isKindOf(Goal) or self.isKindOf(Strategy)

 	title : 'mark ' + self.identifier + ' as ' + self.returnDevelopedStatus()

 	do {
		self.toBeDeveloped=not self.toBeDeveloped;
		
 	}
 }
 wizard  tobesupportedbycontract{

 	guard : self.isKindOf(Goal)

 	title : 'mark ' + self.identifier + ' as ' + self.returnContractStatus()

 	do {
		self.toBeSupportedByContract=not self.toBeSupportedByContract;
		
 	}
 }
 
 wizard  tobeinstantiated{

 	guard : self.isKindOf(ArgumentElement)

 	title : 'mark ' + self.identifier + ' as ' + self.returnInstantiatedStatus()

	 do {
		self.tobeInstantiated=not self.tobeInstantiated;
 	}
 }
 
 wizard optional1{
 	guard: self.isKindOf(SolvedBy)
 	title : 'change solvedBy multiplicity to Normal'

	 do {
		self.multiextension=SolvedByMultiplicityExtension#Normal;
 	}
 	
 }
 wizard optional2{
 	guard: self.isKindOf(SolvedBy)
 	title : 'change solvedBy multiplicity to Optional'

	 do {
		self.multiextension=SolvedByMultiplicityExtension#Optional;
 	}
 	
 }
  wizard optional3{
 	guard: self.isKindOf(SolvedBy)
 	title : 'change solvedBy multiplicity to Multi'

	 do {
		self.multiextension=SolvedByMultiplicityExtension#Multi;
		
 	}
 	
 }
 operation ModelElement returnOppositeVisibility():ElementVisibility{
	if(self.visibility==ElementVisibility#Public){
		return ElementVisibility#Private;
	}
	else if (self.visibility==ElementVisibility#Private){
		return ElementVisibility#Public;

	}
}

operation ModelElement returnDevelopedStatus():String{
	if(self.toBeDeveloped){
		return "developed";
	}
	else{
		return "undeveloped";
	}
}

operation ModelElement returnContractStatus():String{
	if(self.toBeSupportedByContract){
		return "not supported by contract";
	}
	else{
		return "supported by contract";
	}
}
operation ModelElement returnInstantiatedStatus():String{
	if(self.tobeinstantiated){
		return "instantiated";
	}
	else{
		return "uninstatiated";
	}
} 

```

For example the visibility wizard (presented in the above code) is responsible to change the visibility attribute of a GSN element. Visibility applies to Goal, Solution and Context element and this is indicated in the guard part of the wizard. The title part indicates the text will appear as the wizard title. In this example the text is dynamic and depends on the current status of the element. The operation returnOppositeVisibility helps to print the correct message. Finally, the do part of the wizard specifies the action of the wizard which in this case will change the visibility attribute of the selected element.

# Integration of the in-model transformation with the tool #

The integration of the tool is succeeding be using the org.eclipse.epsilon.ewl.emf.wizards extension point. Below is presented the plug-in code. The code declares the extension point, the file which include the EWL code and the metamodel name (GSN).
```
<?xml version="1.0" encoding="UTF-8"?>
<?eclipse version="3.4"?>
<plugin>
   <extension
         point="org.eclipse.epsilon.ewl.emf.wizards">
      <wizards
            file="src/gsn/wizards/attributes.ewl"
            namespaceURI="GSN1">
      </wizards>
   </extension>

</plugin>
```

At runtime the user can use the tool by selecting the wizards submenu on a selected diagram element.  The below figure illustrates the result of the example EWL code explained in the previous section (Visibility). User presses right click on the desired element, selects the wizards submenu and in this case the option change visibility from Private to Public.

![http://acedit.googlecode.com/svn/acedit%20images/wizard%20exampl.png](http://acedit.googlecode.com/svn/acedit%20images/wizard%20exampl.png)

The below figure shows the result of the above action. The attribute visibility of the goal element changed, which result in the visual effect of adding the public indicator symbol on the top right of the element.

![http://acedit.googlecode.com/svn/acedit%20images/wizard%20example%20result.png](http://acedit.googlecode.com/svn/acedit%20images/wizard%20example%20result.png)

# Add your own wizards #

It's very easy to add your own wizards or modify the existing ones. What you have to do is to find the EWL file and modify it. Then you execute the code again and the modifications have to be applied.
  * The EWL code can be found in: GSN.wizards/src/gsn/wizards/attributes.ewl.
  * To execute the code follow the instruction in ToolInstructionsDeveloper