package org.comanche.autotest.framework.conf;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Configure {

	private static Properties properties = new Properties();

	public static String CASE_PATH = "case.path";
	
	public static void addPropertyFile(String fileName) {
		InputStream in = Configure.class.getClassLoader().getResourceAsStream(fileName);
		try {
			if (in != null)
				properties.load(in);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	public static String getProperty(String property) {
		return properties.getProperty(property);
	}
}
