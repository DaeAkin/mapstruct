/*
 * Copyright MapStruct Authors.
 *
 * Licensed under the Apache License version 2.0, available at http://www.apache.org/licenses/LICENSE-2.0
 */
package org.mapstruct.itest.tests;

import org.junit.runner.RunWith;
import org.mapstruct.itest.testutil.runner.ProcessorSuite;
import org.mapstruct.itest.testutil.runner.ProcessorSuite.ProcessorType;
import org.mapstruct.itest.testutil.runner.ProcessorSuiteRunner;

/**
 * @author Andreas Gudian
 *
 */
@RunWith( ProcessorSuiteRunner.class )
@ProcessorSuite(baseDir = "namingStrategyTest", processorTypes = ProcessorType.ORACLE_JAVA_8)
public class NamingStrategyTest {
}
