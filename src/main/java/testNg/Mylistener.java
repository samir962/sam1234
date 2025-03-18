package testNg;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Mylistener  implements ITestListener {
	

		public void onStart(ITestContext context) {

			System.out.println("execution started>>>>>>>>>>>>>");

		}

		public void onTestStart(ITestResult result) {
			System.out.println("Test started>>>>>>>>>>>>>");
		}
	public void onTestSuccess(ITestResult result) {
			System.out.println("Test case is passed>>>>>>>>>>>>>");
		}

		public void onTestFailure(ITestResult result) {
			System.out.println("Test case is failed>>>>>>>>>>>>>");
		}

		public void onTestSkipped(ITestResult result) {
			System.out.println("Test case is skiped>>>>>>>>>>>>>");
		}
	public void onFinish(ITestContext context) {
			System.out.println("execution completed>>>>>>>>>>>>>");

		}
	}

