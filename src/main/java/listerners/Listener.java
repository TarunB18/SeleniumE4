package listerners;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.crm.BaseClass.BaseClass;

public class Listener extends BaseClass implements ITestListener{
	
	public static ExtentSparkReporter sparkReporter;
	public static ExtentReports extentReports;
	public static ExtentTest extentTest;
	
	@Override
	public void onTestStart(ITestResult result) {
		extentTest=extentReports.createTest("Create Organization With Industry");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String name=result.getMethod().getMethodName();
		extentTest.log(Status.PASS,name);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String name=result.getMethod().getMethodName();
		extentTest.log(Status.FAIL, name);
		TakesScreenshot screenshot=(TakesScreenshot)driver;
		String path = screenshot.getScreenshotAs(OutputType.BASE64);
		extentTest.addScreenCaptureFromBase64String(path);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String name=result.getMethod().getMethodName();
		extentTest.log(Status.SKIP, name);
	}

	@Override
	public void onStart(ITestContext context) {
		sparkReporter=new ExtentSparkReporter("src/main/resources/VtigerExtentReport.html");
		sparkReporter.config().setReportName("Tarun");
		sparkReporter.config().setDocumentTitle("Vtiger Extent Report");
		
		extentReports=new ExtentReports();
		extentReports.setSystemInfo("OS", "Windows11");
		extentReports.setSystemInfo("Browser", "Chrome");
		
		extentReports.attachReporter(sparkReporter);
		
	}

	@Override
	public void onFinish(ITestContext context) {
		extentReports.flush();
	}
	
	
}
