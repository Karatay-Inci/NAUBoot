package Main.java.testNGclasses;

import com.relevantcodes.extentreports.ExtentReports;
import java.text.SimpleDateFormat;

public class A16_ExtentFactory {

    static final String currTime = new SimpleDateFormat("yyyyMMdd_HHmmss").format(System.currentTimeMillis());

    public static ExtentReports getExTentInstance(){

        ExtentReports ereports;
        String path = "/Users/incikaratay/git/NAUSelBoot/src/Main/java/reports/ereport.html"+currTime+".html";
        ereports = new ExtentReports(path,false);
        return ereports;
    }
}
