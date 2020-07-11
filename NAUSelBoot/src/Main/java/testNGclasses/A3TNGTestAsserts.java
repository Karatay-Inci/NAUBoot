package Main.java.testNGclasses;

import Main.java.appCode.B1AppForTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.lang.reflect.Array;

public class A3TNGTestAsserts {
    B1AppForTest atest = new B1AppForTest();

    @Test
    public void testSum(){
        int res ;
        res = atest.sumNbrs(1,2);
        Assert.assertEquals(res,4,"sum mismatch");
        System.out.println("@Test1 method");
    }

    @Test
    public void test2(){    //write and practice for the addString to pass an fail
        System.out.println("@Test2 method");
    }
    @Test
    public void test3(){    //write and practice for the getArray to pass an fail
        System.out.println("Test3 method");

    }

}
/* public String addString(String a, String b){
        return a+ "_" +b;   //String1_String2
    }

    public int[] getArray(){
        int [] arrayEx = {1,2,3};
        return arrayEx;*/