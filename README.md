code-examples
=============

code-examples-log4j
-------------------

This Example shows how to configure Log4J2 to use an external (possibly not located in the Workspace) 
 Configuration File which is monitored. If the Configuration changes, e.g. the LogLevel, Log4J will
 update the currently used Loggers.

If you clone this Repository, Eclipse detects only the Project 'code-examples-launch' on import. Run
 the '/launches/InitEclipseProjects.launch' in this Project (Maven Plugin required) and import the new
 generated Projects.
 
To define the Configuration File, set the Parameter 'log4j.configurationFile' with the Path to the 
 Configuration File as Value, as VM Argument. For details see 
 'code-examples-launch/launches/Log4JExample.launch'. 

To test this behaviour, use "Run as" on the File 'launch/Log4JExample.launch' in this Project. If the 
 program is running, change the Log Level from "debug" to "info", wait 5 Seconds and observe the 
 Console Output.
