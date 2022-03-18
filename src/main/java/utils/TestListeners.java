package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.util.Calendar;
import java.util.Date;

public class TestListeners implements ITestListener {

    private static ExtentReports extent = ExtentReportManager.createInstance();
    public static ThreadLocal<ExtentTest> extentTest = new ThreadLocal<ExtentTest>();

    @Override
    public void onTestStart(ITestResult result){
        ExtentTest test = extent.createTest(result.getTestClass().getName()+" :: "
                + result.getMethod().getMethodName());
        extentTest.set(test);
    }

    @Override
    public void onTestSuccess(ITestResult result){
        String logText = "<b>Test Method" + result.getMethod().getMethodName() +
                "Successful</b>";
        Markup markup = MarkupHelper.createLabel(logText, ExtentColor.GREEN);
        extentTest.get().log(Status.PASS,markup);
    }

    @Override
    public void onTestSkipped(ITestResult result){
        String logText = "<b>Test Method" + result.getMethod().getMethodName() +
                "Skipped</b>";
        Markup markup = MarkupHelper.createLabel(logText, ExtentColor.YELLOW);
        extentTest.get().log(Status.SKIP,markup);
    }

    @Override
    public void onTestFailure(ITestResult result){
        String logText = "<b>Test Method" + result.getMethod().getMethodName() +
                "Failed</b>";
        Markup markup = MarkupHelper.createLabel(logText, ExtentColor.RED);
        extentTest.get().log(Status.FAIL,markup);
        extentTest.get().log(Status.INFO,result.getThrowable());
    }

    @Override
    public void onFinish(ITestContext context) {
        if(extent!=null){
            extent.flush();
        }
    }

}