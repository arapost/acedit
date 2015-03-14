# Introduction #

This section presents the Model validation of **acedit**. First the functionality and interaction of the validation with tool is explained, followed by the validation code and instructions on how to add your own validation rules.


# The Validation Tool #


The validation tool is integrated with the GSN editor. Thus, when the validation plug-in perform the model validation, the GSN editor is corresponding to its actions. As a result the validation actions notify the controller which is responsible for the GSN views, which in turn manipulates the views.The following figure shows how the validation works at runtime and integrates with the GSN editor:

![http://acedit.googlecode.com/svn/acedit%20images/activity%20diagram%20validation.jpg](http://acedit.googlecode.com/svn/acedit%20images/activity%20diagram%20validation.jpg)

User selects the validation action for the created GSN diagram. The validation tool requests from the GSN editor the GSN model. The GSN editor sends the model to the validation tool which in turns performs the validation to the model and notifies the controller. The controller manipulates the GSN editor by displaying validation errors in the diagram elements and adding quick fixes suggestions to the diagram. Finally the user performs the quick fixes that wants and the fixes are displayed in the editor.

# Constrains in EVL #

Constraints were written in the Epsilon Validation Language ([EVL](http://www.eclipse.org/epsilon/doc/evl/)). The constraints in the current project were used to capture additional constraints in a GSN model, that the metamodel itself does not include and to suggest specific fixes in validation errors with the aim to improve the usability of the tool and the correctness of the generated models. For example, in the case of the away goal, the user has to give the id of the module that the away goal belongs to. Since module id’s type is String, is easy for the user to give an id for a module that does not exist. The EVL code is presented below:
```
context ModelElement {

  constraint HasName {

      check : self.identifier.isDefined()

      message : 'Unnamed ' + self.eClass().name + ' not allowed'
	  fix{
			title:'Give an identifier to '+self.eClass.name
			do{
			var target := UserInput.prompt('Type an identifier: ');
			if(target.isDefined){
				self.identifier:=target;
			}
			}
		}	
		
  }
  constraint HasDescription {

      check : self.description.isDefined()

      message : 'Description of ' + self.eClass().name + ' must be set'
	  fix{
			title:'Give an description to '+self.eClass.name
			do{
			var target := UserInput.prompt('Type a description: ');
			if(target.isDefined){
				self.description:=target;
			}
			}
		}	
		
  }
 
  constraint HasUniqueIdentifier{
  	check: ModelElement.allInstances().forAll(i|i.identifier=self.identifier implies i=self)
  	message: 'The ' +self.eClass.name+' must have unique identifier'
  	fix{
  		title: 'Give unique identifier'
  		do{
  			var target:= UserInput.prompt('Give a unique name');
  			if(target.isDefined){
  				self.identifier:=target;
  			}
  		}
  	}
  }

  
}


context ArgumentElement{
constraint HasPartOf {

      check : self.isPartOf.isDefined()

      message : 'The ' + self.eClass().name + ' must be assigned to a module'
	  fix{
			title:'Assign a module to '+self.eClass.name
			do{
			var target := UserInput.choose('Select Module: ',
			Module.allInstances());
			if(target.isDefined){
				self.isPartOf:=target;
			}
			}
		}	
		
  }
}

context AwayGoal{
	
	constraint correctModuleId{
		check : self.moduleIdExists(self.moduleIdentifier)
	    message : 'Does not exist any module with identifier: ' + self.moduleIdentifier + ' '
		fix{
			title:'Change the name of the moduleIdentifier'
			do{
			var target := UserInput.choose('Select Module: ',
			Module.allInstances());
			if(target.isDefined){
				self.moduleIdentifier:=target.identifier;
			}
			}
		}	
	}
	
}

context AwaySolution{
	
	constraint correctModuleId{
		check : self.moduleIdExists(self.moduleIdentifier)
	    message : 'Does not exist any module with identifier: ' + self.moduleIdentifier + ' '
		fix{
			title:'Change the name of the moduleIdentifier'
			do{
			var target := UserInput.choose('Select Module: ',
			Module.allInstances());
			if(target.isDefined){
				self.moduleIdentifier:=target.identifier;
			}
			}
		}	
	}
	
	
}

context AwayContext{
	
	constraint correctModuleId{
		check : self.moduleIdExists(self.moduleIdentifier)
	    message : 'Does not exist any module with identifier: ' + self.moduleIdentifier + ' '
		fix{
			title:'Change the name of the moduleIdentifier'
			do{
			var target := UserInput.choose('Select Module: ',
			Module.allInstances());
			if(target.isDefined){
				self.moduleIdentifier:=target.identifier;
			}
			}
		}	
	}
	
	
}
operation ModelElement moduleIdExists(name:String ):Boolean{
	if(Module.allInstances.exists(f|f.identifier.equals(name))){
		return true;
	}
	else{
		return false;
	}
}
```

The keyword context specifies the element of the metamodel on which the contained constraints will be evaluated (AwayGoal in this example). The keyword constraint defines the name of the constraint and a body on which the invariants will be included. The keyword check defines the invariant to be evaluated by the constraint (in this case is the module id that the user gave exists). The message specifies the error message which is related with the failed invariant, followed by the fix which contains the title of the recommendation to fix the mistake and the do part, which provide the functionality of correcting the user’s mistake. In the above case, the user is prompt to choose one of the available modules and the appropriate identifier is assigned to AwayGoal.

# Integration of the Validation with the tool #

The validation integrates with the tool by adding extensions in the following eclipse plug-ins: org.eclipse.epsilon.evl.emf.validation (specifies the EVL file which contains the constraints) and the org.eclipse.ui.ide.markerResolution (specifies the points of the user interface that the validation failures will be displayed). The code below shows the plug-in code in XML which includes the above extensions.
```
<?xml version="1.0" encoding="UTF-8"?>
<?eclipse version="3.4"?>
<plugin>
   <extension
         point="org.eclipse.epsilon.evl.emf.validation">
      <constraintsBinding
            constraints="src/gsn/validation/validation.evl"
            namespaceURI="GSN1">
      </constraintsBinding>
   </extension>
   <extension
         point="org.eclipse.ui.ide.markerResolution">
      <markerResolutionGenerator
            class="org.eclipse.epsilon.evl.emf.validation.EvlMarkerResolutionGenerator"
            markerType="org.eclipse.emf.ecore.diagnostic">
      </markerResolutionGenerator>
      <markerResolutionGenerator
            class="org.eclipse.epsilon.evl.emf.validation.EvlMarkerResolutionGenerator"
            markerType="GSN.diagram.diagnostic">
      </markerResolutionGenerator>
   </extension>

</plugin>


```


At runtime the user can validate a created model by choosing Edit->Validate from the eclipse menu. The below figure shows an example of the result of validation in a diagram. The example refers to the constraint described in the previous section (correct module id).

![http://acedit.googlecode.com/svn/acedit%20images/validation%20example.png](http://acedit.googlecode.com/svn/acedit%20images/validation%20example.png)

The node that is related with the failed constraint is displayed with a red circle that indicates the validation failure. When the user put the mouse over the red circle the validation message provided in the EVL constraint is displayed. In this example the module identifier wrong id does not exist. The generated error also appears in the Problems view as it can be shown in the below figure:

![http://acedit.googlecode.com/svn/acedit%20images/problem%20tab%20show%20validation%20error.png](http://acedit.googlecode.com/svn/acedit%20images/problem%20tab%20show%20validation%20error.png)

At this point the user can use the fix part of the constraint. User has to press right click on the error and to choose from the popup menu the option quick fix. A dialog appears in which the user can choose one of the available fixes for the validation error. The below figure shows this dialog:

![http://acedit.googlecode.com/svn/acedit%20images/quick%20fix%20example.png](http://acedit.googlecode.com/svn/acedit%20images/quick%20fix%20example.png)

When the user selects the recommended fix and press the finish button another dialog appears that prompts the user to choose one of the available modules. The below figure shows the dialog:

![http://acedit.googlecode.com/svn/acedit%20images/quick%20fix%20recomendation.png](http://acedit.googlecode.com/svn/acedit%20images/quick%20fix%20recomendation.png)

Finally, the user can choose the argument module with identifier Arg1 and press the button OK. The result is presented in the below figure: the GSN element, on which the validation error was detected, is displayed without the error icon (red circle) and with modified module id. In addition the error was removed from the problems view.

![http://acedit.googlecode.com/svn/acedit%20images/editor%20after%20validation%20correction.png](http://acedit.googlecode.com/svn/acedit%20images/editor%20after%20validation%20correction.png)

# Add your own constrains #

It's very easy to add your own constrains or modify the existing constrains. What you have to do is to find the EVL file and modify it. Then you execute the code again and the modifications have to be applied.
  * The EVL code can be found in: GSN.validation/src/gsn/validation/validation.evl.
  * To execute the code follow the instruction in ToolInstructionsDeveloper