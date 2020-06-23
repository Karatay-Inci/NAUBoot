package Main.java.testNGclasses;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class A6TNG_Suite {

    @BeforeSuite
    public void BeforeSuite(){
        System.out.println("@BeforeSuite - method");
    }

    @AfterSuite
    public void AfterSuite(){
        System.out.println("@AfterSuite - method");
    }

}
