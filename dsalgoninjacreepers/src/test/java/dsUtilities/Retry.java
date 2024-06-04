package dsUtilities;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer {

    private int count = 1; 
    //private static int maxTry = 5; //Run the failed test 5 times

    @Override
    public boolean retry(ITestResult iTestResult) {
        int maxRetry = 4; // Total Execution of TC = Max Retry + 1
        
        if (!iTestResult.isSuccess()) {                     //Check if test not succeed
            if (count <= maxRetry) {                           
                count++;                                    
                iTestResult.setStatus(ITestResult.FAILURE); //Mark test as failed 
                //iTestResult.setStatus(ITestResult.SKIP);
                //extendReportsFailOperations(iTestResult);   
                return true;                                
            }
        } else {
            iTestResult.setStatus(ITestResult.SUCCESS);     
        }
        return false;
    }

}
