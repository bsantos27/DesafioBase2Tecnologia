package Steps;

import Pages.LoginPage;
import io.cucumber.java.en.Given;

import static Runners.RunnerBase.getDriver;

public class LoginSteps {

    LoginPage loginPage = new LoginPage();

    @Given("realize login no site Mantis")
    public void realizeLoginNoSiteMantis() {
        getDriver().get("https://mantis-prova.base2.com.br/login_page.php");
        loginPage.digitarEmail();
        loginPage.clicarBotao();
        loginPage.digitarSenha();
        loginPage.clicarBotao();
    }
}
