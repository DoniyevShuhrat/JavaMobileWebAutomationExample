import org.testng.Assert;
import org.testng.annotations.Test;

public class SecondTestCase {
    @Test(priority = 1)
    void setup(){
        System.out.println("Opening app");
        Assert.assertTrue(true);
    }

    @Test(priority = 2)
    void selectRouteSheet(){
        System.out.println("This is selectRouteSheet test");
        Assert.assertTrue(true);
    }

    @Test(priority = 3)
    void selectOrder(){
        System.out.println("This is selectOrder test");
        Assert.assertEquals("Hello", "Hello");
    }

    @Test(priority = 4)
    void tearDown(){
        Assert.assertTrue(true);
        System.out.println("Closing app");
    }
}
