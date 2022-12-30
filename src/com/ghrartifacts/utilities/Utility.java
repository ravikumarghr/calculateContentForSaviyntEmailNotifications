package com.ghrartifacts.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Utility {

	static String className = "Utility";

	public static Properties getProperties() {
		Properties prop = new Properties();
		String url = GHRConstants.SAVIYNT_HOME + File.separator + "externalconfig.properties";
		FileInputStream input;
		try {
			input = new FileInputStream(url);
			prop.load(input);
			input.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return prop;
	}

}
