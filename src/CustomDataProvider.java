import org.testng.annotations.DataProvider;

public class CustomDataProvider {
    @DataProvider(name = "LoginDataProvider")
    public Object[][] getData() {
        Object[][] data = {{"email1", "pass1"}, {"email2", "pass2"}, {"email3", "pass3"}};
        return data;
    }
}
