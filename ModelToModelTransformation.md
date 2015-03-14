# Introduction #

This section presents the Model-to-Model transformation of **acedit**. First the functionality and interaction of the transformation with the tool is explained, followed by the transformation code and instructions on how to add your own transformation rules.


# The transformation tool #

The transformation tool is an independent tool, since is not integrated directly to the editors. However it uses as input the GSN model which derives from the model view to construct an ARM model which results to the creation of an ARM model and diagram view. The figure below presents an activity diagram which presents the interaction between the users and the different components of the system at runtime in order to perform the transformation.

![http://acedit.googlecode.com/svn/acedit%20images/activity%20diagram%20transformation.jpg](http://acedit.googlecode.com/svn/acedit%20images/activity%20diagram%20transformation.jpg)

The user selects a created GSN diagram or GSN model from the project explorer in which the project, that contains the views, is located. After that the user selects the transformation action for the selected element. This action triggers the transformation tool to perform the transformation. The transformation tool requests the user-created GSN model in order to use it as input for the transformation. The GSN editor subsystem sends the requested GSN model in which the transformation tool will perform the transformation based on the GSN and ARM metamodels. The transformation tool generates an equivalent ARM model and results an ARM model and diagram view. The user is now able to see and manipulate the generated ARM editor.

# Transformation rules in ETL #

The transformation is implemented using the Epsilon Transformation Language ([ETL](http://www.eclipse.org/epsilon/doc/etl/)). The transformation is succeeding with the use of transformation rules. The transformation rules are based on the two metamodels by referencing to the metamodel elements and accept as input a source model (GSN in this case) and produce as output the other model (ARM in this case). The transformation rules were based on the provided relationship between the two models in the ARM specification document, the definition of GSN in the GSN standard and the semantics of the ARM metamodel in.

The transformation in ETL is presented below:
```
pre{
	//creates a global case which will contains all the elements that will be
	//transformed with the current transformation
	var c:= new ARM!Case;
}

//this rule transforms the GSNs TaggedValue to the ARMs TaggedValue
rule TaggedValue2TaggedValue

	transform s : GSN1!TaggedValue
	to t : ARM!TaggedValue {
	t.key := s.key;
	t.value := s.value;
}

//this rule transforms the GSNs Goal to the ARMs Claim
rule Goal2Claim
	transform s:GSN1!Goal
	to t : ARM!Claim{
	t.identifier:=s.identifier;
	t.description:=s.description;
 	s.addIsTagged(t);
 	
	if(s.toBeDeveloped==true){
		t.toBeSupported:=true;
	}
	else{
		t.toBeSupported:=false;
	}
 
	c.contains.add(t);
 		
	}
//this rule transforms the GSNs Solution to the ARMs InformationElement
rule Solution2InformationElement
	transform s : GSN1!Solution
	to t : ARM!InformationElement {
 	t.identifier:=s.identifier;
	t.description:=s.description;
  	s.addIsTagged(t);
	c.contains.add(t);
 
}
//this rule transforms the GSNs solvedBy(when the child element is not the solution) 
//to the ARMs AssertedInference
rule SolvedBy2AssertedInference
	transform s : GSN1!SolvedBy
	to t : ARM!AssertedInference  {
	guard : not s.childSpinalelement.isTypeOf(GSN1!Solution)
	t.source.add(s.parentSpinalElement.equivalent());
	t.target.add(s.childSpinalelement.equivalent());
	//set as identifier the name of the source spinalelement
	t.identifier=s.parentSpinalElement.equivalent().identifier;
	c.contains.add(t);
}

//this rule transforms the GSNs solvedBy(when the child element is a solution)
// to the ARMs AssertedEvidence
rule SolvedBy2AssertedEvidence
	transform s : GSN1!SolvedBy
	to t : ARM!AssertedEvidence  {
	
	guard : s.childSpinalelement.isTypeOf(GSN1!Solution)
 	t.source.add(s.parentSpinalElement.equivalent());
	t.target.add(s.childSpinalelement.equivalent());
	//set as identifier the name of the source spinalelement
	t.identifier=s.parentSpinalElement.equivalent().identifier;
	c.contains.add(t);

}
	
//this rule transforms the GSNs incontextOf to the ARMs AssertedContext
rule InContextOf2AssertedContext
	transform s : GSN1!InContextOf
	to t : ARM!AssertedContext {
	
	t.source.add(s.contextOfSpinalElement.equivalent());
 
	t.target.add(s.contextualElement.equivalent());
		//set as identifier the name of the source spinalelement
	t.identifier=s.contextOfSpinalElement.equivalent().identifier;
	c.contains.add(t);

}
//this rule transforms the GSNs Strategy to the ARMs ArgumentReasoning
rule Strategy2ArgumentReasoning
	transform s : GSN1!Strategy
	to t : ARM!ArgumentReasoning {
 	t.identifier:=s.identifier;
	t.description:=s.description;
	s.addIsTagged(t);
	for(i in s.parentSolvedBy){
		t.describes.add(i.equivalent());
	}
	c.contains.add(t);

}

//this rule transforms the GSNs Context to the ARMs InformationElement
rule Context2InformationElement
	transform s : GSN1!Context
	to t : ARM!InformationElement {
 	t.identifier:=s.identifier;
	t.description:=s.description;
	s.addIsTagged(t);
	c.contains.add(t);
	
}

//this rule transforms the GSNs Justification to the ARMs InformationElement
rule Justification2InformationElement
	transform s : GSN1!Justification
	to t : ARM!InformationElement {
 	t.identifier:=s.identifier;
	t.description:=s.description;
	s.addIsTagged(t);
	c.contains.add(t);
	
}

//this rule transforms the GSNs Assumption to the ARMs InformationElement
rule Assumption2InformationElement
	transform s : GSN1!Assumption
	to t : ARM!InformationElement {
 	t.identifier:=s.identifier;
	t.description:=s.description;
	s.addIsTagged(t);
	c.contains.add(t);
	
}
//this rule transforms the GSNs AwayGoal to the ARMs CitiationElement
rule AwayGoal2CitiationElement
	transform s: GSN1!AwayGoal
	to t: ARM!CitiationElement{
	t.identifier:=s.identifier;
	t.description:=s.description;
	s.addIsTagged(t);
	c.contains.add(t);
	t.refersToArgumentElement:=s.pointsTo.equivalent();
	}
//this rule transforms the GSNs AwaySolution to the ARMs CitiationElement
rule AwaySolution2CitiationElement
	transform s: GSN1!AwaySolution
	to t: ARM!CitiationElement{
	t.identifier:=s.identifier;
	t.description:=s.description;
	s.addIsTagged(t);
	c.contains.add(t);
	t.refersToArgumentElement:=s.pointsTo.equivalent();
	}
//this rule transforms the GSNs AwayContext to the ARMs CitiationElement
rule AwayContext2CitiationElement
	transform s: GSN1!AwayContext
	to t: ARM!CitiationElement{
	t.identifier:=s.identifier;
	t.description:=s.description;
	s.addIsTagged(t);
	c.contains.add(t);
	t.refersToArgumentElement:=s.pointsTo.equivalent();
	}
//this rule transforms the GSNs ArgumentModule to the ARMs Argument
rule ArgumentModule2Argument
	transform s : GSN1!ArgumentModule
	to t : ARM!Argument {
	
	t.identifier:=s.identifier;
	t.description:=s.description;
  	s.addIsTagged(t);
  	for(i in s.containsElement){
  		t.containsArgumentElement.add(i.equivalent());
  	}
  	for(i in s.parentModuleOf){
 		t.containsArgument.add(i.equivalent());
 	}
 	for(i in t.containsArgumentElement){
 		for(j in ARM!ArgumentLink.allInstances){
 			if(j.source.contains(i)){
 				t.containsArgumentLink.add(j);
 			}
 		}	
 	}
	c.contains.add(t);

}

//this rule transforms the GSNs ContractModule to the ARMs Argument
rule ContractModule2Argument
	transform s : GSN1!ContractModule
	to t : ARM!Argument {
	
	t.identifier:=s.identifier;
	t.description:=s.description;
  	s.addIsTagged(t);
  	for(i in s.containsElement){
  		t.containsArgumentElement.add(i.equivalent());
  	}
  	for(i in s.parentModuleOf){
 		t.containsArgument.add(i.equivalent());
 	}
 	for(i in t.containsArgumentElement){
 		for(j in ARM!ArgumentLink.allInstances){
 			if(j.source.contains(i)){
 				t.containsArgumentLink.add(j);
 			}
 		}
 		
 	}
	c.contains.add(t);

}

//if the current model element of the GSN model has tagged values,
//these tagged values are created and added to the equal ARM model element
operation GSN1!ModelElement addIsTagged(t: ARM!ModelElement){

	if(self.containsAdditional.isDefined()){
 		for(i in self.containsAdditional){
 			var isTagged := new ARM!TaggedValue;
 			isTagged.key:=self.containsAdditional[i].key;
 			isTagged.value:=self.containsAdditional[i].value;
 			t.isTagged.add(isTagged);
 		}
 	}
}
```

For example here is explained Goal2Claim rule. This rule defines how a Goal element of the input source GSN model will create a claim element of the ARM model. The rule Goal2Claim denotes the name of the rule. The transform instruction defines the source metamodel element (GSN Goal) and the target metamodel element (ARM Claim) which the transformation will affect. The rest of the code it refers to the transformation will take place for its element. For example, the identifier of the source model will be transformed to the identifier of the target model.

# Integration of the Transformation with the Tool #

The transformation integrates with the tool by extending the eclipse plug-in org.eclipse.ui.popupMenus for the files that are referring to the GSN diagram (ending with .gsn1 and .gsn1\_diagram).  The xml code which extends the plug-in is presented below:
```
<?xml version="1.0" encoding="UTF-8"?>
<?eclipse version="3.4"?>
<plugin>
   <extension
         point="org.eclipse.ui.popupMenus">
      <objectContribution
            id="GSN.transformation.plugin2.contribution1"
            nameFilter="*.gsn1*"
            objectClass="org.eclipse.core.resources.IFile">
         <menu
               label="GSN2ARM"
               path="additions"
               id="GSN.transformation.plugin2.menu1">
            <separator
                  name="group1">
            </separator>
         </menu>
         <action
               label="transform"
               class="gsn.transformation.plugin2.popup.actions.GSN2ARM"
               menubarPath="GSN.transformation.plugin2.menu1/group1"
               enablesFor="1"
               id="GSN.transformation.plugin2.newAction">
         </action>
      </objectContribution>
   </extension>
</plugin>

```
As a result at runtime, the user can create a GSN diagram and press right click on the created GSN file. A popup menu will be displayed with the option GSN2ARM. When the user selects the transformation, the transformation will be performed and a new ARM diagram and model file will be created in the same folder. The figure below shows the transformation procedure:

![http://acedit.googlecode.com/svn/acedit%20images/transformation%20plugin.png](http://acedit.googlecode.com/svn/acedit%20images/transformation%20plugin.png)

# Add your own rules #

It's very easy to add your own rules or modify the existing rules. What you have to do is to find the ETL file and modify it. Then you execute the code again and the modifications have to be applied.
  * The ETL code can be found in: GSN.transformation/src/gsn/transformation/core/GSN2ARM.
  * To execute the code follow the instruction in ToolInstructionsDeveloper