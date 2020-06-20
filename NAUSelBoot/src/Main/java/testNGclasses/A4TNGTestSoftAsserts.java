package Main.java.testNGclasses;

import Main.java.appCode.B1AppForTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class A4TNGTestSoftAsserts {
    B1AppForTest atest = new B1AppForTest();

    @Test
    public void test1(){
        int res;
        SoftAssert sa = new SoftAssert();
        res = atest.sumNbrs(1,2);
        sa.assertEquals(res,4,"sum mismatch");
        System.out.println("@Test1 : first assertion complete");
        sa.assertEquals(res,5,"sum mismatch");
        System.out.println("@Test2 : second assertion complete");
        sa.assertEquals(res,6,"sum mismatch");
        System.out.println("@Test3 : third assertion complete");
        sa.assertAll("after all assertions");
    }

    @Test
    public void test2(){ //write and practice for the addString to pass an fail
        System.out.println("@Test2 method");
    }
    @Test
    public void test3(){ //write and practice for the getArray to pass an fail
        System.out.println("@Test3 method");
    }

}
