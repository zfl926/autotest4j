package org.comanche.autotest.framework;

import org.comanche.autotest.framework.conf.Configure;
import org.comanche.autotest.framework.engine.TestEngine;
import org.comanche.autotest.framework.engine.testng.TestNGEngine;

public class TestRunner {
	
	final static String PROPERTY_CASE_FILE = "case.properties";
	
	public static void main(String[] args) {
		if ( args.length >= 1 ) {
			Configure.addPropertyFile(args[0]);
		} else {
			Configure.addPropertyFile(PROPERTY_CASE_FILE);
		}
		TestEngine engine = new TestNGEngine();
		engine.start();
	}
}
