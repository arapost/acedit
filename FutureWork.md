# Introduction #

This section discusses the possible improvements and extensions can be done in the future to improve the **acedit** and add new functionality.

## Improvements in the ARM editor ##

The ARM editor was mainly implemented to first, offer a first graphical representation of the ARM metamodel and second to visualize the transformation between GSN and ARM models. As a result many of the capabilities and improvements done in the GSN editor were not added in the ARM editor duo to the time restrictions. However is quite trivial to add these capabilities in the future, since is needed to follow the same techniques were followed in the GSN case. For example, is quite trivial to create two plug-ins in a quite similar way, as in happened in the case of the GSN editor, for adding validation and in-place transformation for the ARM editors.

## Enrich the validation and wizards tool ##

The validation and wizards tool provide the required functionality to use these capabilities to the GSN editors. As a result, it’s very trivial for future developers to add extra constraints and extra wizards respectively in order to capture new requirements or to improve more the usability tool. The future developers have only to customize the .evl and .ewl files to achieve this aim.

## Modify the copy and paste functionality ##

As it referred in the previous chapter, the copy and paste functionality is problematic. Future developers have to change the default behavior of these commands in order to provide correct functionality. That means that have to customize the generated diagram code.

## Add the optianility extension ##

The optionality extension is the only feature of the GSN which was not implemented. However it is a feature that can be included in future versions, since the generated code can be customized. This didn’t happen in the current project duo to the time restrictions.

## Transformation ##

In the current project a transformation was implemented from GSN to ARM editors. The transformation feature can be extended to capture:
  * Transformation from ARM to GSN editors. This feature requires the development of a plug-in in a quite similar way as it happened in this project. The same techniques can be used both to integrate the plug-in with the editor and to define the transformation rules
  * Transformation from GSN and ARM to Claims Argument Evidence (CAE). CAE is another notation for presenting safety arguments. In order to support this transformation in a similar way as it’s happening in the current tool, is needed to develop a graphical editor for CAE and create transformation tools for the transformation (GSN to CAE and ARM to CAE), by following the same procedure as it happened during the development of the current tool.

## Generate RCP application ##

The current tool is created as a set of eclipse plug-ins, which need the eclipse platform to run. One future development of the current tool will be to run the tool as a standalone application. This can be done by creating a Rich Client Platform (RCP) application for the current tool. RCP applications can run as standalone applications by including a minimal set of eclipse plug-ins. This can improve the portability of the tool, since the users will not need the eclipse platform to run it.