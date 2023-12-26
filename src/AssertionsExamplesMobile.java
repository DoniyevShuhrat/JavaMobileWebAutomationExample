import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utils.AppiumDriverEx;

public class AssertionsExamplesMobile {

    AppiumDriver<MobileElement> appiumDriver;
    WebDriverWait waitEle;
    WebElement elementBuf;

    @BeforeClass
    public void setup() {
        appiumDriver = AppiumDriverEx.getAppiumDriver();
        System.out.println("setup after class");
    }

    @Test
    void ClickEnterToCarList() {
        waitEle = new WebDriverWait(appiumDriver, 20);
        WebElement selCar = waitEle.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='Номер автомобиля']")));
        selCar.click();
        waitEle = new WebDriverWait(appiumDriver, 5);
        elementBuf = waitEle.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='Изменить номер автомобиля']")));
        Assert.assertTrue(elementBuf.isDisplayed(), "Car selection page not found");
        System.out.println("EnterToCarList()");
    }

    @Test(dependsOnMethods = {"ClickEnterToCarList"}, priority = 1, groups = "positiveTest")
    void loginCarBase() {
        waitEle = new WebDriverWait(appiumDriver, 20);
        elementBuf = waitEle.until((ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='Логин']"))));
        elementBuf.sendKeys("admin");

        elementBuf = waitEle.until((ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='Пароль']"))));
        elementBuf.sendKeys("texnomart*");

        elementBuf = waitEle.until((ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='ВОЙТИ']"))));
        elementBuf.click();

        waitEle = new WebDriverWait(appiumDriver, 5);
        elementBuf = waitEle.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='Выбор номера']")));

        Assert.assertTrue(elementBuf.isDisplayed(), "The Car Number list page could not be opened");
        System.out.println("loginCarBase()");
    }

    @Test(dependsOnMethods = {"loginCarBase"}, alwaysRun = true, priority = 2, groups = "positiveTest")
    void searchCarNumber() {
        waitEle = new WebDriverWait(appiumDriver, 5);
        elementBuf = waitEle.until((ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='Поиск']"))));
        elementBuf.sendKeys("01735BKA");

        elementBuf = waitEle.until((ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='android.widget.RadioButton']"))));
        System.out.println("Before Assert()");
        Assert.assertTrue(elementBuf.isDisplayed(), "Number of Car not found!");
        elementBuf.click();
        System.out.println("searchCarNumber()");
    }

    @Test(dependsOnMethods = {"searchCarNumber"}, priority = 3)
    void contunueViaCar() {

        appiumDriver.findElement(By.xpath("//*[@text='Продолжить']")).click(); // going to loginPage;

        elementBuf = waitEle.until((ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='Логин']"))));
        Assert.assertTrue(elementBuf.isDisplayed(), "The User Login page could not be opened!");
        System.out.println("contunueViaCar()");
    }

    @Test(dependsOnMethods = {"contunueViaCar", "searchCarNumber"}, alwaysRun = true, groups = "positiveTest")
    void loginUserPage() {
        waitEle = new WebDriverWait(appiumDriver, 20);
        elementBuf = waitEle.until((ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='Логин']"))));
        elementBuf.sendKeys("shergashev");

        elementBuf = waitEle.until((ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='Пароль']"))));
        elementBuf.sendKeys("shergashev");

        appiumDriver.findElement(By.xpath("//*[@text='ВОЙТИ']")).click();

        elementBuf = waitEle.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.example.texnomartdelivery:id/directListFragment")));
        Assert.assertTrue(elementBuf.isDisplayed(), "RouteSheets page could not be opened!");
        System.out.println("loginUserPage()");
    }

    @AfterClass
    void tearDown() {
        appiumDriver.quit();
        System.out.println("tearDown()");
    }
}
