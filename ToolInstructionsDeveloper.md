This page provides instructions on how to install and test the **acedit** for developers.

# Installation #

## Install Eclipse with the necessary plug-ins ##

The [Eclipse Distribution with Epsilon](http://www.eclipse.org/epsilon/download/) is recommended, which contains all the prerequisites for the **acedit**.

---


## Install the Assurance Case Argument Editor ##

The last step is to download the acedit projects into your eclipse workspace. The source code is available in this website. There many ways to download the code in eclipse. I suggest to use the Eclipse plugin for SVN:
  * Install the subeclipse in Eclipse from the update site : http://subclipse.tigris.org/update_1.8.x
  * Download the project from the SVN following these steps in Eclipse:
  1. File -> new -> project
  1. Choose the SVN folder
  1. Choose the "Checkout Projects from SVN" option
  1. press Next
  1. Choose "Create a new repository location"
  1. press Next
  1. type the Url that is provided in the [Source](http://code.google.com/p/acedit/source/checkout) section of this site
  1. follow the instructions of the wizard to download the code into your Eclpse workspace from the SVN repository.

# Test the tool #

After you successfully install the the necessary plug-ins and the code you must be able to test the tool by executing the following steps:

  1. Launch a new eclipse instance from the "Run - Eclipse Application" menu using "-XX:PermSize=64M -XX:MaxPermSize=128M -Xms512M -Xmx1024M" as VM arguments in the Run Configuration
  1. select File->new->project
  1. select General-> Project
  1. select next and give a name to your project
  1. select finish
  1. press right click in the created project
  1. select New->Other
  1. in the pop up wizard type GSN
  1. select GSN1 diagram
  1. select Next-> Finish

You must be able to see the acedit editor in your workspace and start testing the tool!