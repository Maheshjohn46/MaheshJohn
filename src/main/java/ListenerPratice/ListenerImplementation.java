package ListenerPratice;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerImplementation implements ITestListener {
	
	@Override
	public void onStart(ITestContext context) {
		System.err.println("@Stated");
		}

	@Override
	public void onTestStart(ITestResult result) {
		System.err.println("@TestStarted");

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.err.println("@TestSucess");

	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.err.println("@Failure");

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.err.println("@TestSkiped");
	}

	

	@Override
	public void onFinish(ITestContext context) {
		System.err.println("@Finish");
	}

}
