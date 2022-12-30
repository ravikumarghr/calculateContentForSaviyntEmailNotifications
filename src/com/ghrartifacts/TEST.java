package com.ghrartifacts;

public class TEST {

	public static void main(String[] args) {
		// for testing you can update the GHRConstants file and SAVIYNT_HOME variable to point to externalconfig.properties in your local machine

		String employeeType = "Internal";
		String userStartDate = "2022-11-25 00:00:00.0";
		String accountDisplayName = "Test User";
		
		System.out.println("Expected: New Personal AD Account is created for you, Account Name: [ Account display name ]");
		System.out.println("Calculated Subject:"+ EmailNotifications.getSubjectForNewAccountCreateNotification(employeeType,userStartDate,accountDisplayName));
		
		employeeType = "External";
		userStartDate = "2022-11-25 00:00:00.0";
		accountDisplayName = "Test User";
		
		System.out.println("Expected: New Personal AD Account is created for a user starting on [User start date in dd-MM-YYYY format], Account Name: [ Account display name ]");
		System.out.println("Calculated: "+ EmailNotifications.getSubjectForNewAccountCreateNotification(employeeType,userStartDate,accountDisplayName));
		
		
		
	}

}
