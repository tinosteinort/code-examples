code-examples
=============

This Example shows how to configure Log4J2 to use an external (possibly not located in the Workspace)
 Configuration File which is monitored. If the Configuration changes, e.g. the LogLevel, Log4J will
 update the currently used Loggers.
 
To test this behaviour, use "Run as" on the File 'launch/Log4JExample.launch' in this Project. If the
 program is running, change the Log Level from "debug" to "info", wait 5 Seconds and observe the 
 Console Output.
