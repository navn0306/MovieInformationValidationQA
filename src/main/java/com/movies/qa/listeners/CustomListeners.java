package com.movies.qa.listeners;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.movies.qa.base.TestBase;

public class CustomListeners extends TestBase implements ITestListener {

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Failed Test");
		try {
			failed();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
