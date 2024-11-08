package Pages;

import Runners.RunCucumberTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static Utils.Utils.*;

public class LoginPage extends RunCucumberTest {

    @FindBy(id = "username")
    private WebElement txtEmail;

    @FindBy(id = "password")
    private WebElement txtPass;

    @FindBy(css = "#login-form > fieldset > input.width-40.pull-right.btn.btn-success.btn-inverse.bigger-110")
    private WebElement btnLogin;

    public LoginPage(){
        PageFactory.initElements(getDriver(), this);
    }
    public void digitarEmail() {
        digitar(txtEmail, "Bruno_Santos");
    }

    public void digitarSenha() {
        digitar(txtPass, "Brun2710");
    }

    public void clicarBotao() {
        clicar(btnLogin);
    }


}
