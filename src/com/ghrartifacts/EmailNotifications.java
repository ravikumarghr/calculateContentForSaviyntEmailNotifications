package com.ghrartifacts;

import java.text.ParseException;
import java.util.Properties;
import java.util.logging.Logger;

import com.ghrartifacts.utilities.CustomLogger;
import com.ghrartifacts.utilities.StringUtility;
import com.ghrartifacts.utilities.Utility;
import com.ghrartifacts.utilities.GHRConstants;

public class EmailNotifications {
	
	static String className = "EmailNotifications";
	public static String getStringDate(String date, String format) {
		
		String methodName = "getStringDate():";
		Logger logger = CustomLogger.getLogger(className);
		logger.info(className + "." + methodName + "Started");
		
		logger.info("date: " + date);
		logger.info("format: " + format);

	    String dateWithFormat = "";
	    if(!StringUtility.isValidString(format) || date == null) {
	    	logger.info("Invalid input to the method");
	    	logger.info(className + "." + methodName + "Completed");
	    	return dateWithFormat;
	    }
	    	
		try {
			dateWithFormat = new java.text.SimpleDateFormat(format).format(new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(date));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		logger.info("Formatted Date:\n" + dateWithFormat);
		
		logger.info(className + "." + methodName + "Completed");
		return dateWithFormat;
	}
	
	
	public static String getSubjectForNewAccountCreateNotification(String employeeType, String userStartDate, String accountDisplayName) {
		
		String methodName = "getSubjectForNewAccountCreateNotification():";
		Logger logger = CustomLogger.getLogger(className);
		logger.info(className + "." + methodName + "Started");
		
		logger.info("employeeType: " + employeeType);
		logger.info("userStartDate: " + userStartDate);
		logger.info("accountDisplayName: " + accountDisplayName);
		
	    String startDate = "";
	    String subject = "New Personal AD Account is created for";
	    
	    Properties prop = Utility.getProperties();
	    String emailNotificationDateFormat = prop.getProperty(GHRConstants.DATE_FORMAT_FOR_EMAIL_NOTIFICATIONS);
	    
	    if(userStartDate != null && StringUtility.isValidString(emailNotificationDateFormat))
	    	startDate = getStringDate(userStartDate, emailNotificationDateFormat);
	    
	    if(StringUtility.isValidString(employeeType) && employeeType.equalsIgnoreCase("Internal") )
	    	subject = subject + ", Account Name: "+accountDisplayName;
	    else 
	    	subject = subject + " a user starting on "+startDate+" , Account Name: "+accountDisplayName;
	 
    	logger.info("Calculated Subject: \n"+ subject);    
		logger.info(className + "." + methodName + "Completed");
		return subject;
	}	
		
}
