package com.ghrartifacts.utilities;

public class GHRConstants {

	//public static String SAVIYNT_HOME = "//Users//ravikumargh//Documents//email//";
	static String SAVIYNT_HOME = System.getenv("SAVIYNT_HOME");
	public static String LOG_LEVEL = "GHR_LOG_LEVEL";
	public static String DATE_FORMAT_FOR_EMAIL_NOTIFICATIONS = "GHR_DATE_FORMAT_FOR_EMAIL_NOTIFICATIONS";
	// add these properties to externalconfig.properties file by Navigating Admin => Settings => Configuration Files, restart the application servers
	//GHR_LOG_LEVEL=INFO
        //GHR_DATE_FORMAT_FOR_EMAIL_NOTIFICATIONS=dd-MM-YYYY

}
