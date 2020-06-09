package Main.java.JunitClass;

import org.junit.jupiter.api.*;

public class FirstJunit0 {

    @BeforeAll
    public static void setUp(){
        System.out.println("@BeforeAll - executed once before all test methods in this class");
    }

    @AfterAll
    public static void tearDown(){
        System.out.println("@AfterAll - executed once after all test methods in this class");
    }

    @BeforeEach
    public void init(){
        System.out.println("@BeforeEach - executed once before every test method in this class");
    }

    @AfterEach
    public void done(){
        System.out.println("@BeforeAll - executed once after every test method in this class");
    }

    @Test
    public void test1(){
        System.out.println("@Test1 - executed test");
    }

    @Test
    public void test2(){
        System.out.println("@Test2 - executed test");
    }

    @Test
    public void test3(){
        System.out.println("@Test3 - executed test");
    }


}
