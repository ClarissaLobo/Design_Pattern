## Name: Clarissa Lobo

-----------------------------------------------------------------------
-----------------------------------------------------------------------


Following are the commands and the instructions to run ANT on your project.
#### Note: build.xml is present in myCampusTour/src folder.

-----------------------------------------------------------------------
## Instruction to clean:

####Command_to clean_mycode :ant -buildfile myCampusTour/src/build.xml clean

####Command: ant -buildfile myCampusTour/src/build.xml clean

Description: It cleans up all the .class files that were generated when you
compiled your code.

-----------------------------------------------------------------------
## Instruction to compile:
####Command_to compile_mycode : ant -buildfile myCampusTour/src/build.xml all

####Command: ant -buildfile myCampusTour/src/build.xml all

Description: Compiles your code and generates .class files inside the BUILD folder.

-----------------------------------------------------------------------
## Instruction to run:

####Command_to run_mycode : ant -buildfile myCampusTour/src/build.xml run -Darg0=errorLog.txt -Darg1=2

####Command: ant -buildfile myCampusTour/src/build.xml run -Darg0=<bstError.txt> -Darg1=<UPDATE_VALUE> 

## you can run it in the following manner:

ant -buildfile myCampusTour/src/build.xml run -Darg0=campusTourError.txt -Darg1=2

Note: Arguments accept the absolute path of the files.

-----------------------------------------------------------------------
## Description:

Designed and developed classes and interfaces for attendees campus tour.
Used enums to specify the choices for each activity and have calculated
the total cost,duration,effort and carbonfootprint.





