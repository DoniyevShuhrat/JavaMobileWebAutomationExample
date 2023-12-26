package paralleltesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class ParallelTest1 {

    WebDriverWait waitEle;
    String chromeDriverPath = "C:/chromedriver-win64/chromedriver.exe";
    WebDriver driver;

    @Test
    void logoTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        driver = new ChromeDriver();
        driver.get("http://texnomart.uz");

        waitEle = new WebDriverWait(driver, 5);
        WebElement logo = waitEle.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"header\"]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/span/a/img")));
        //WebElement logo = driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div[2]/div[1]/div/span/a/img"));

        Assert.assertTrue(logo.isDisplayed());
        Thread.sleep(5000);
    }

    @Test
    void homePageTitle() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        driver = new ChromeDriver();
        driver.get("http://texnomart.uz");

        Assert.assertEquals(driver.getTitle(), "Тошкентда маиший техника ва телефонлар онлайн-дўкони");
        Thread.sleep(5000);

    }

    @AfterMethod
    void tearDown(){
        driver.quit();
    }
}
