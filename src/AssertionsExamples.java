//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//import org.openqa.selenium.WebDriver;


public class AssertionsExamples {
//     WebDriver driver;
//
//    @BeforeClass
//    void setup() {
//        System.out.println("setup()");
//
//        //String chromeDriverPath = "F:\\Code\\QA\\FilesLibs\\chromedriver_win32\\chromedriver.exe";
//        String chromeDriverPath = "F:\\Code\\C#\\QA\\ITechArt\\SeleniumWebDriver\\SeleniumWebDriver\\bin\\Debug\\net5.0\\chromedriver.exe";
//        String urlTexnomart = "http://texnomart.uz";
//        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
//        driver = new ChromeDriver();
//        driver.get(urlTexnomart);
//
//    }
//
//    @Test
//    void test(){
//        System.out.println("test()");
//    }
/*
    @Test(priority = 1)
    void logoTest() {
        WebElement logo = driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img"));
        Assert.assertTrue(logo.isDisplayed(), "Logo not displayed on the page");
    }

    @Test(priority = 2)
    void homePageTitle() {
        String title = driver.getTitle();
        Assert.assertEquals("Texnomart", title, "Logo not displayed on the page");
    }

    @AfterClass
    void tearDown() {
        driver.quit();
    }

 */


}
