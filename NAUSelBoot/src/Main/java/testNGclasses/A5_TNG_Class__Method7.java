package Main.java.testNGclasses;

import org.testng.annotations.*;

public class A5_TNG_Class__Method7 {

    @BeforeClass    //similar to @BeforeAll in junit
    public void setUp(){
        System.out.println("Class2 - @BeforeClass method");
    }

    @AfterClass //similar to @AfterAll in junit
    public void TearDown(){
        System.out.println("Class2 - @AfterClass method");
    }

    @BeforeMethod   //similar to @BeforeEach in junit
    public void init (){
        System.out.println("Class2 - @BeforeMethod method");
    }

    @AfterMethod    //similar to @AfterEach in junit
    public void quit(){
        System.out.println("Class2 - @AfterMethod method");
    }
    @Test
    public void test1(){
        System.out.println("Class2 - @Test1 method");
    }
    @Test
    public void test2(){
        System.out.println("Class2 - @Test2 method");
    }
    @Test
    public void test3(){
        System.out.println("Class2 - @Test3 method");
    }


}
