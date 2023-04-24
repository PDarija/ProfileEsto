import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {


    public void checkMobileIdMethodButton() {

        $(By.xpath("//a[@data-cy='method-mobile-id']")).shouldBe(Condition.exist);
    }

    public static void clickOnMobileIdButton(){
        $(By.xpath("//a[@data-cy='method-mobile-id']")).click();
    }

    public void checkMobileIdPhoneInputField() {

        $(By.xpath("//esto-text-input[@data-cy='mobile-id-phone-input']")).shouldBe(Condition.exist);
    }

    public void checkMobileIdIdInputField() {

        $(By.xpath("//esto-text-input[@data-cy='mobile-id-id-input']")).shouldBe(Condition.exist);
    }

    public void checkMobileIdLoginButton() {

        $(By.xpath("//button[@data-cy='mobile-id-login-button']")).shouldBe(Condition.exist);
    }


    public void checkSmartIdMethodButton() {

        $(By.xpath("//a[@data-cy='method-smart-id']")).shouldBe(Condition.exist);
    }

    public static void clickSmartIdButton(){

        $(By.xpath("//a[@data-cy='method-smart-id']")).click();
    }

    public void checkSmartIdInputField() {

        $(By.xpath("//esto-text-input[@data-cy='smart-id-input']")).shouldBe(Condition.exist);
    }

    public void checkSmartIdLoginButton() {

        $(By.xpath("//button[@data-cy='smart-id-login-button']")).shouldBe(Condition.exist);
    }

    public void checkPasswordMethodButton() {

        $(By.xpath("//a[@data-cy='method-password']")).shouldBe(Condition.exist);
    }
    public static void clickPasswordMethodButton(){
        $(By.xpath("//a[@data-cy='method-password']")).click();
    }

    public void checkPasswordMethodUsernameField() {

        $(By.xpath("//esto-text-input[@data-cy='username-input']")).shouldBe(Condition.exist);
    }

    public void checkPasswordMethodPasswordField() {

        $(By.xpath("//esto-text-input[@data-cy='password-input']")).shouldBe(Condition.exist);
    }

    public void checkPasswordLoginButton() {

        $(By.xpath("//button[@data-cy='password-login-button']")).shouldBe(Condition.exist);
    }

    public static void InsertIdCode(String query){
        $(By.xpath("//*[@id='login-field']/div/input")).setValue(query);
    }








}
