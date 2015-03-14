# Introduction #

This section presents the GSN and ARM metamodels as they are used in **acedit**.


# Definition of the metamodels #

The graphical editors of **acedit** are based on the definition of GSN and ARM metamodels. For the definition of the metamodels the EMFatic language is used.

EMFatic is a language designed to support navigation and editing of Ecore models. EMFatic has a similar to Java syntax which helps to define metamodels in a textual form. A description about the EMFatic language and its elements can be found at: http://www.eclipse.org/epsilon/doc/articles/emfatic/

# GSN metamodel in EMFatic #

Below is presented the GSN metamodel in EMFatic:
```

package GSN1 ; 

class Case{
	val ModelElement [*] contains;
	attr Boolean autoID = true;
}

abstract class ArgumentElement extends ModelElement {
	attr Boolean tobeinstantiated=false;
	ref Module [1] #containsElement isPartOf;
}

abstract class SolvedByTargetElement {
	ref SolvedBy [*] #childSpinalelement parentSolvedBy; 
}

abstract class InTheContextOfTargetElement{
	   
}

class SolvedByModular{
	ref Module [1] childSolvedByModular;
	ref Module [1] #parentSolvedByModular parentSolvedByModuleElement;
}

class InContextOfModular{
	ref Module [1] #hasContext parentInConextOfModuleElement;
	ref Module [1] modularContextualElement;
}
	
abstract class SpinalElement extends ArgumentElement,SolvedByTargetElement {
}

abstract class DecomposableSpinalElement extends SpinalElement {
	attr Boolean toBeDeveloped=false;
	val SolvedBy [*] #parentSpinalElement childSolvedBy;
	val InContextOf [*] #contextOfSpinalElement hasContext;
}
abstract class ContextualElement extends ArgumentElement,InTheContextOfTargetElement {
}


class SolvedBy {
	ref DecomposableSpinalElement [1] #childSolvedBy parentSpinalElement;
	ref SolvedByTargetElement [1] #parentSolvedBy childSpinalelement;
	attr String cardinality; 
	attr SolvedByMultiplicityExtension multiextension;
}

class InContextOf {
	ref InTheContextOfTargetElement [1] contextualElement;
	ref DecomposableSpinalElement [1] #hasContext contextOfSpinalElement;
}

class Goal extends DecomposableSpinalElement  {
	attr ElementVisibility visibility;
	ref Module [0..1] #hasTopLevel isTopLevelGoalOf;
	attr Boolean toBeSupportedByContract=false;
}


class Strategy extends DecomposableSpinalElement  {
	
}

class Solution extends SpinalElement  {
	attr ElementVisibility visibility;
}


class Context extends ContextualElement {
	attr ElementVisibility visibility;
}


class Justification extends ContextualElement {
	
}

	
class Assumption extends ContextualElement {

}	


class AwayContext extends ContextualElement {
	ref Goal [1] pointsTo;
	attr String [1] moduleIdentifier;
		
}


class AwaySolution extends SpinalElement{
	ref Solution[1] pointsTo;
	attr String [1] moduleIdentifier;
}


class AwayGoal extends SpinalElement,InTheContextOfTargetElement {
	ref Goal [1] pointsTo;
	attr String [1] moduleIdentifier;
}
	
abstract class Module extends ModelElement,SolvedByTargetElement{
	ref Module [*] parentModuleOf;
	ref Module [*] associatedWithOther;
val Goal [*] #isTopLevelGoalOf hasTopLevel; 
	ref ArgumentElement [*] #isPartOf containsElement;
      val SolvedByModular [*] #parentSolvedByModuleElement parentSolvedByModular;
	val InContextOfModular [*] #parentInConextOfModuleElement hasContext;
} 
	

class ArgumentModule extends Module,InTheContextOfTargetElement {
		
}


class ContractModule extends Module {
	
}

abstract class ModelElement {
	attr String [1] identifier;
	attr String [1] description;
	val TaggedValue [*] containsAdditional;
		
}

class TaggedValue {
	attr String [1] key;
	attr String [1] value;
}
	
enum ElementVisibility {
	Private;
	Public;
}
	
enum SolvedByMultiplicityExtension{
	Normal;
	Optional;
	Multi;
}

 


```

# ARM metamodel in EMFatic #


Below is presented the ARM metamodel in EMFatic:
```

package arm;

class Case {
  val ModelElement[*] contains;
}

abstract class ModelElement {
  attr String identifier;
  attr String description;
  attr String content;
  val TaggedValue[*] isTagged;
}

class TaggedValue {
  attr String key;
  attr String value;
}

class InformationElement extends ArgumentElement {
}


class Argument extends ModelElement {
  ref ArgumentElement[*]  containsArgumentElement;
  ref ArgumentLink[*] containsArgumentLink;
  ref Argument[*] containsArgument;
}

abstract class ArgumentElement extends ModelElement {
}

abstract class ArgumentLink extends ModelElement {
  ref ModelElement[*] source;
  ref ModelElement[*] target;
}

class Annotation extends ArgumentLink {
}

abstract class AssertedRealationship extends ArgumentLink {
}


class AssertedInference extends AssertedRealationship {
}


class AssertedContext extends AssertedRealationship {
}

class AssertedChallenge extends AssertedRealationship {
}


class AssertedEvidence extends AssertedRealationship {
}

class AssertedCounterEvidence extends AssertedRealationship {
}

abstract class ReasoningElement extends ArgumentElement {
}


class CitiationElement extends ArgumentElement {
  ref ArgumentElement refersToArgumentElement;
  ref Argument refersToArgument;
}



class Claim extends ReasoningElement {
  attr boolean assumed;
  attr boolean toBeSupported;
}

class EvidenceAssertation extends Claim {
}


class ArgumentReasoning extends ReasoningElement {
  ref Argument hasStucture;
  ref AssertedInference[*] describes;
}

```