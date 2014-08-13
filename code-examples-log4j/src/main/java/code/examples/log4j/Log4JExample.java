package code.examples.log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Log4JExample {
	
	private final static Logger LOG = LogManager.getLogger(Log4JExample.class);

	public static void main(String[] args) {
		
		/*
		 * This Example shows how to configure Log4J2 to use an external (possibly not located in the Workspace) 
		 *  Configuration File which is monitored. If the Configuration changes, e.g. the LogLevel, Log4J will
		 *  update the currently used Loggers.
		 * 
		 * To test this behaviour, use "Run as" on the File 'launch/Log4JExample.launch' in this Project. If the 
		 *  program is running, change the Log Level from "debug" to "info", wait 5 Seconds and observe the 
		 *  Console Output.
		 */
		
		while (true) {
			
			LOG.debug("Debug Message");
			LOG.info("Information Message");
			LOG.error("Error Message");

			sleep(1000);
		}
	}
	
	private static void sleep(final long millis) {
		try {
			Thread.sleep(millis);
		}
		catch (InterruptedException ex) {
			LOG.error("Interrupted while sleeping", ex);
		}
	}
}