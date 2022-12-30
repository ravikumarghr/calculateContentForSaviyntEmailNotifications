package com.ghrartifacts.utilities;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CustomLogger {
 
	public static Logger getLogger(String className){
		Logger logger = Logger.getLogger(className);
		Properties prop;
		prop = Utility.getProperties();
		String logLevel = prop.getProperty(GHRConstants.LOG_LEVEL).toString();
		logger.setLevel(Level.INFO);
		if (logLevel.equals("INFO")) {
			logger.setLevel(Level.INFO);
		} else if (logLevel.equals("SEVERE")) {
			logger.setLevel(Level.SEVERE);
		} else {
			logger.setLevel(Level.OFF);
		}
	
		return logger;
	}
}
