package Main.java.testNGclasses;

import com.relevantcodes.extentreports.ExtentReports;

public class A16_ExtentFactory {

    public static ExtentReports getExTentInstance(){

        ExtentReports ereports;
        String path = "/Users/incikaratay/git/NAUSelBoot/src/Main/java/reports/ereport.html";
        ereports = new ExtentReports(path,false);
        return ereports;
    }
}
