import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataproviderExample {

    @Test(dataProvider = "LoginDataProvider", dataProviderClass = CustomDataProvider.class)
    public void loginTest(String email, String pwd) {
        System.out.println(email + " " + pwd);
    }
//
//    @DataProvider(name = "LoginDataProvider")
//    public Object[][] getData() {
//        Object[][] data = {{"email1", "pass1"}, {"email2", "pass2"}, {"email3", "pass3"}};
//        return data;
//    }
}
