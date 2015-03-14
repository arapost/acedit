# Introduction #

This page presents a high level layered Architecture of **acedit**


# Architecture #

The tool was implemented as a set of eclipse plug-ins under the Eclipse project. The tool implements graphical user interface which consists of diagram editors and model management tools which are unified by a common framework – the tool core. The following figure presents a layered architecture of the tool and its relationships with the eclipse framework and other eclipse plug-ins.


![http://acedit.googlecode.com/svn/acedit%20images/layered%20architecture.png](http://acedit.googlecode.com/svn/acedit%20images/layered%20architecture.png)


## Core framework ##

In the bottom layer is the core framework of the tool. The core framework is the eclipse framework as the tool is considered to be as a set of plug-ins on top of eclipse. The tool will take advantage of the extensive infrastructure that the Eclipse framework provides such as the integration of the created plug-ins, and their loading and management.

## Eclipse plug-ins ##

The second layer consists of eclipse plug-ins on which the tool is based. The GMF and GEF plug-ins are utilized to implement the graphical user interface of the tool. EMF and Epsilon brings the model development part. EMF is mainly used to construct the metamodels in Ecore and to generate the corresponding java code. Epsilon is used to construct the plug-ins for model management tasks such as model validation and model transformation. Figure 14 shows a component diagram which describes the dependencies between the tool and the eclipse plug-ins described above.

## Tool Core ##

The third layer is consists of the tool plug-ins and metamodels. The metamodels (GSN and ARM metamodel) are fundamental parts of the tool, since the plug-ins on this layer are based on them. The plug-ins extend the eclipse framework and provide all the functionality for the tool. This layer includes the GSN plug-ins (responsible for the functionality of the GSN editor, which is based on the GSN metamodel), the ARM plug-ins (responsible for the functionality of the ARM editors, which is based on the ARM metamodel) and the model management plug-ins which are responsible to provide functionality for model management tasks such as model-to-model transformation over the GSN and ARM metamodels.

## User interface ##

The top layer is the layer which is visible to the end user, the user interface. User interacts with the tool in this layer. This layer consists of the eclipse workbench with all the additional functionality that the plug-ins on the previous layer add in the eclipse. The functionality is added in the eclipse workbench can be divided in the following parts: the GSN editor, the ARM editor and the model management tools (GSN to ARM transformation, GSN validation and GSN wizards).