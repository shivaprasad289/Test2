package generic;

import java.io.IOException;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result) 
	{
		System.out.println("Step 2,Test case Executing:---"+result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		System.out.println("Step 3,Test case Excecuted:---"+result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
		System.out.println("ScreenShot:--"+result.getName());
		try {
			ScreenShot.getScreenShot(BaseTest.driver,result.getMethod().getMethodName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) 
	{

		System.out.println("Step 3,Test case is skipped:---"+result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result)
	{
		System.out.println("Step 4,Test case pass %:---"+result.getName());
	}

	@Override
	public void onStart(ITestContext context) 
	{
		System.out.println("Step 1,Test case started:--"+context.getName());
	}

	@Override
	public void onFinish(ITestContext context) 
	{
		System.out.println("Step 5,Test case Finished:---"+context.getName());
	}
}
