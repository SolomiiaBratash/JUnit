package com.bratash;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.IncludeClassNamePatterns;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.SuiteDisplayName;

import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SuiteDisplayName("JUnit Test suite")
@SelectPackages({"com.bratash.task2", "com.bratash.task3_2"})
@IncludeClassNamePatterns({"^.*$"})

public class TestSuit {
}
