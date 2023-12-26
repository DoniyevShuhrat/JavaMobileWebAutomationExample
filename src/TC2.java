import org.testng.annotations.*;

public class TC2 {

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
    void test3(){
        System.out.println("This is test3...");
    }

    @Test
    void test4(){
        System.out.println("This is test4...");
    }
}
