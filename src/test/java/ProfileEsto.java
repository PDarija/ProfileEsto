import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class ProfileEsto {

    @Test


    public void positiveTestOfAuthorizationMethods() {
        Configuration.holdBrowserOpen = true;
        open("https://profile.esto.ee/login");
        $(By.xpath("//a[@data-cy='method-mobile-id']")).shouldBe(Condition.exist);
        $(By.xpath("//a[@data-cy='method-mobile-id']")).shouldBe(Condition.visible);
        $(By.xpath("//a[@data-cy='method-mobile-id']")).click();
        $(By.xpath("//esto-text-input[@data-cy='mobile-id-phone-input']")).shouldBe(Condition.exist);
        $(By.xpath("//esto-text-input[@data-cy='mobile-id-phone-input']")).shouldBe(Condition.visible);
        $(By.xpath("//esto-text-input[@data-cy='mobile-id-id-input']")).shouldBe(Condition.exist);
        $(By.xpath("//esto-text-input[@data-cy='mobile-id-id-input']")).shouldBe(Condition.visible);

        $(By.xpath("//button[@data-cy='mobile-id-login-button']")).shouldBe(Condition.visible);




        $(By.xpath("//a[@data-cy='method-smart-id']")).shouldBe(Condition.exist);
        $(By.xpath("//a[@data-cy='method-smart-id']")).shouldBe(Condition.visible);
        $(By.xpath("//a[@data-cy='method-smart-id']")).click();
        $(By.xpath("//esto-text-input[@data-cy='smart-id-input']")).shouldBe(Condition.exist);
        $(By.xpath("//esto-text-input[@data-cy='smart-id-input']")).shouldBe(Condition.visible);

        $(By.xpath("//button[@data-cy='smart-id-login-button']")).shouldBe(Condition.visible);



        $(By.xpath("//a[@data-cy='method-password']")).shouldBe(Condition.exist);
        $(By.xpath("//a[@data-cy='method-password']")).shouldBe(Condition.visible);
        $(By.xpath("//a[@data-cy='method-password']")).click();
        $(By.xpath("//esto-text-input[@data-cy='username-input']")).shouldBe(Condition.exist);
        $(By.xpath("//esto-text-input[@data-cy='username-input']")).shouldBe(Condition.visible);
        $(By.xpath("//esto-text-input[@data-cy='password-input']")).shouldBe(Condition.exist);
        $(By.xpath("//esto-text-input[@data-cy='password-input']")).shouldBe(Condition.visible);

        $(By.xpath("//button[@data-cy='password-login-button']")).shouldBe(Condition.visible);
    }
    @Test


    public void negativeTestOfAuthorizationSmartId() {
        Configuration.holdBrowserOpen = true;
        open("https://profile.esto.ee/login");

        $(By.xpath("//a[@data-cy='method-smart-id']")).shouldBe(Condition.visible);
        $(By.xpath("//a[@data-cy='method-smart-id']")).click();

        $(By.xpath("//esto-text-input[@data-cy='smart-id-input']")).shouldBe(Condition.visible);

        $(By.xpath("//button[@data-cy='smart-id-login-button']")).shouldBe(Condition.visible);
        SelenideElement idCodeInput = $(By.xpath("//*[@id=\"login-field\"]/div/input"));
        idCodeInput.setValue("13465");
        $(By.xpath("//button[@data-cy='smart-id-login-button']")).shouldBe(Condition.visible);
        $(By.xpath("//button[@data-cy='smart-id-login-button']")).click();
        $(By.xpath("//esto-error[@data-cy='smart-id-validation-error']")).shouldBe(Condition.visible);

    }

    @Test
    public void negativeTestOfAuthorizationPassword() {
        Configuration.holdBrowserOpen = true;
        open("https://profile.esto.ee/login");

        $(By.xpath("//a[@data-cy='method-password']")).shouldBe(Condition.visible);
        $(By.xpath("//a[@data-cy='method-password']")).click();
        $(By.xpath("//esto-text-input[@data-cy='username-input']")).shouldBe(Condition.visible);
        SelenideElement usernameInput = $(By.xpath("//*[@id=\"login-field\"]/div/input"));
        usernameInput.setValue("Test");
        $(By.xpath("//esto-text-input[@data-cy='password-input']")).shouldBe(Condition.visible);
        SelenideElement usernameInputLogin = $(By.xpath("//*[@id=\"password-field\"]/div/input"));
        usernameInputLogin.setValue("143qref");
        $(By.xpath("//button[@data-cy='password-login-button']")).shouldBe(Condition.visible);
        $(By.xpath("//button[@data-cy='password-login-button']")).click();

        $(By.xpath("//span[@data-cy='password-login-error']")).shouldBe(Condition.visible);
    }



}

