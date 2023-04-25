import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class ProfileEsto {

    @BeforeEach
    public void setUp() {
        open("https://profile.esto.ee/login");
    }

    @AfterEach
    public void tearDown(){
        closeWebDriver();
    }

    @Test


    public void positiveTestOfAuthorizationMethods() {
//        Configuration.holdBrowserOpen = true;
//        open("https://profile.esto.ee/login");
//        $(By.xpath("//a[@data-cy='method-mobile-id']")).shouldBe(Condition.exist);
//        $(By.xpath("//a[@data-cy='method-mobile-id']")).shouldBe(Condition.visible);
//        $(By.xpath("//a[@data-cy='method-mobile-id']")).click();
//        $(By.xpath("//esto-text-input[@data-cy='mobile-id-phone-input']")).shouldBe(Condition.exist);
//        $(By.xpath("//esto-text-input[@data-cy='mobile-id-phone-input']")).shouldBe(Condition.visible);
//        $(By.xpath("//esto-text-input[@data-cy='mobile-id-id-input']")).shouldBe(Condition.exist);
//        $(By.xpath("//esto-text-input[@data-cy='mobile-id-id-input']")).shouldBe(Condition.visible);
//        $(By.xpath("//button[@data-cy='mobile-id-login-button']")).shouldBe(Condition.visible);
//        $(By.xpath("//a[@data-cy='method-smart-id']")).shouldBe(Condition.exist);
//        $(By.xpath("//a[@data-cy='method-smart-id']")).shouldBe(Condition.visible);
//        $(By.xpath("//a[@data-cy='method-smart-id']")).click();
//        $(By.xpath("//esto-text-input[@data-cy='smart-id-input']")).shouldBe(Condition.exist);
//        $(By.xpath("//esto-text-input[@data-cy='smart-id-input']")).shouldBe(Condition.visible);
//        $(By.xpath("//button[@data-cy='smart-id-login-button']")).shouldBe(Condition.visible);
//        $(By.xpath("//a[@data-cy='method-password']")).shouldBe(Condition.exist);
//        $(By.xpath("//a[@data-cy='method-password']")).shouldBe(Condition.visible);
//        $(By.xpath("//a[@data-cy='method-password']")).click();
//        $(By.xpath("//esto-text-input[@data-cy='username-input']")).shouldBe(Condition.exist);
//        $(By.xpath("//esto-text-input[@data-cy='username-input']")).shouldBe(Condition.visible);
//        $(By.xpath("//esto-text-input[@data-cy='password-input']")).shouldBe(Condition.exist);
//        $(By.xpath("//esto-text-input[@data-cy='password-input']")).shouldBe(Condition.visible);
//        $(By.xpath("//button[@data-cy='password-login-button']")).shouldBe(Condition.visible);

        LoginPage loginPage = new LoginPage();
        loginPage.checkMobileIdMethodButton();
        loginPage.clickOnMobileIdButton();
        loginPage.checkMobileIdPhoneInputField();
        loginPage.checkMobileIdIdInputField();
        loginPage.checkMobileIdLoginButton();
        loginPage.checkSmartIdMethodButton();
        loginPage.clickSmartIdButton();
        loginPage.checkSmartIdInputField();
        loginPage.checkSmartIdLoginButton();
        loginPage.checkPasswordMethodButton();
        loginPage.clickPasswordMethodButton();
        loginPage.checkPasswordMethodUsernameField();
        loginPage.checkPasswordMethodPasswordField();
        loginPage.checkPasswordLoginButton();
    }

    @Test

    public void negativeTestOfAuthorizationSmartId() {
//        Configuration.holdBrowserOpen = true;
//        open("https://profile.esto.ee/login");
//        $(By.xpath("//a[@data-cy='method-smart-id']")).shouldBe(Condition.visible);
//        $(By.xpath("//a[@data-cy='method-smart-id']")).click();
//        $(By.xpath("//esto-text-input[@data-cy='smart-id-input']")).shouldBe(Condition.visible);
//        $(By.xpath("//button[@data-cy='smart-id-login-button']")).shouldBe(Condition.visible);
//        SelenideElement idCodeInput = $(By.xpath("//*[@id='login-field']/div/input"));
//        idCodeInput.setValue("13465");
//        $(By.xpath("//button[@data-cy='smart-id-login-button']")).shouldBe(Condition.visible);
//        $(By.xpath("//button[@data-cy='smart-id-login-button']")).click();
//        $(By.xpath("//esto-error[@data-cy='smart-id-validation-error']")).shouldBe(Condition.visible);

        LoginPage loginPage = new LoginPage();
        loginPage.checkSmartIdMethodButton();
        loginPage.clickSmartIdButton();
        loginPage.checkSmartIdInputField();
        loginPage.checkSmartIdLoginButton();
        loginPage.InsertIdCode("255644");
        loginPage.checkSmartIdLoginButton();
        loginPage.clickSmartIdLoginButton();
        loginPage.checkSmartIdValidationError();
    }

    @Test
    public void negativeTestOfAuthorizationPassword() {
//        Configuration.holdBrowserOpen = true;
//        open("https://profile.esto.ee/login");
//        $(By.xpath("//a[@data-cy='method-password']")).shouldBe(Condition.visible);
//        $(By.xpath("//a[@data-cy='method-password']")).click();
////        $(By.xpath("//esto-text-input[@data-cy='username-input']")).shouldBe(Condition.visible);
//        SelenideElement usernameInput = $(By.xpath("//*[@data-cy='username-input']/div/input"));
//        usernameInput.setValue("Test");
//        $(By.xpath("//esto-text-input[@data-cy='password-input']")).shouldBe(Condition.visible);
//        SelenideElement usernameInputLogin = $(By.xpath("//*[@data-cy='password-input']/div/input"));
//        usernameInputLogin.setValue("143ref");
//        $(By.xpath("//button[@data-cy='password-login-button']")).shouldBe(Condition.visible);
//        $(By.xpath("//button[@data-cy='password-login-button']")).click();
//        $(By.xpath("//span[@data-cy='password-login-error']")).shouldBe(Condition.visible);

        LoginPage loginPage = new LoginPage();
        loginPage.checkPasswordMethodButton();
        loginPage.clickPasswordMethodButton();
        loginPage.checkPasswordMethodUsernameField();
        loginPage.InsertUsername("Test");
        loginPage.checkPasswordMethodPasswordField();
        loginPage.InsertPassword("sfeifw");
        loginPage.checkPasswordLoginButton();
        loginPage.clickPasswordLoginButton();
        loginPage.checkPasswordLoginError();
    }

}

