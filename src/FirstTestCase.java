import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTestCase {
    @Test(priority = 1)
    void setup() {
        System.out.println("Setup()");
        Assert.assertTrue(true);
    }

    @Test(priority = 2)
    void searchCar() {
        System.out.println("This is SearchCar test into FirstTestCase");
        Assert.assertTrue(true);
    }
    @Test(priority = 3)
    void loginUser() {
        System.out.println("This is loginUser test into FirstTestCase");
        Assert.assertTrue(true);
    }

    @Test(priority = 4)
    void tearDown() {
        System.out.println("Closing app into FirstTestCase");
        Assert.assertTrue(true);
    }
}
