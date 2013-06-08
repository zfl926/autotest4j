package org.comanche.autotest.framework.engine.testng;

import org.comanche.autotest.framework.conf.Configure;
import org.comanche.autotest.framework.engine.TestEngine;
import org.testng.TestNG;

public class TestNGEngine implements TestEngine {

	@Override
	public void start() {
		TestNG.main(new String[]{Configure.getProperty(Configure.CASE_PATH)});
	}

}
