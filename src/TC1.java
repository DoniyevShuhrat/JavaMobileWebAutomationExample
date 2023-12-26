import org.testng.annotations.*;

public class TC1 {

    @BeforeClass
    void beforeClass(){
        System.out.println("This will execute before every Class");
    }

    @AfterClass
    void afterClass(){
        System.out.println("This will execute after every Class");
    }

    @BeforeMethod
    void beforeMethod(){
        System.out.println("This will execute before every Method");
    }

    @AfterMethod
    void afterMethod(){
        System.out.println("This will execute after every Method");
    }

    @Test
    void test1(){
        System.out.println("This is test1...");
    }

    @Test
    void test2(){
        System.out.println("This is test2...");
    }

    @BeforeTest
    void beforeTest(){
        System.out.println("This will execute before Test");
    }

    @AfterTest
    void afterTest(){
        System.out.println("This will execute after Test");
    }

    @BeforeSuite
    void beforeSuite(){
        System.out.println("This will execute before Test Suite");
    }

    @AfterSuite
    void afterSuite(){
        System.out.println("This will execute after Test Suite");
    }
}
