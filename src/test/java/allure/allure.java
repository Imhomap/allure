package allure;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideConfig;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

class issue_test {
  //  private final static String REPOSITORY = "eroshenkoam/allure-example";
    private final static String USER = "user_5";
    private final static String PASS = "1234!qwer";
    private final static String PORT_NUMBER = "65079";

    @Test
    public void serchForIssue() {
        open("https://brains.tassta.com");
        $(byId("login_port")).click();
        $(byId("login_port")).sendKeys(PORT_NUMBER);
        $(byId("login_username")).click();
        $(byId("login_username")).sendKeys(USER);
        $(byId("login_password")).click();
        $(byId("login_password")).sendKeys(PASS);
        $(byText("Log In")).click();
        $(byText("Main")).shouldBe(Condition.visible);





        //   $(".header-search-input").submit();
        //$(By.linkText("eroshenkoam/allure-example")).click();
     //   $(withText("Issues")).click();
     //   $(withText("#" + ISSUE_NUMBER)).should(Condition.exist);

    }

}
