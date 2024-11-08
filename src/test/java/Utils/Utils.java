package Utils;

import Runners.RunCucumberTest;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Utils extends RunCucumberTest {

    private static WebDriver driver;

    public static void uploadImage()  {
       String filePath = "//Documents//cachorro.jpg";
       String url = "https://mantis-prova.base2.com.br/bug_report_page.php";
       driver.get(url);
       WebElement chooseFile = driver.findElement(By.xpath("//*[@id='report_bug_form']/div/div[2]/div[1]/div/table/tbody/tr[11]/td/input"));
        chooseFile.sendKeys(filePath);
    }

    public static void uploadArquivo(WebElement elementoUpload, String caminhoArquivo) {
        elementoUpload.sendKeys(caminhoArquivo);
    }

    public static void clicar(WebElement elemento){
        esperarElementoAparecer(elemento);
        elemento.click();
    }

    public static void digitar(WebElement elemento, String texto){
        esperarElementoAparecer(elemento);
        elemento.sendKeys(texto);
    }

    public static void esperarElementoAparecer(WebElement elemento){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(50));
        wait.until(ExpectedConditions.elementToBeClickable(elemento));
    }

    public static void esperarElementoDesaparecer(WebElement elemento){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.invisibilityOf(elemento));
    }

    public static void selecionarComboBox(WebElement elemento, String texto){
        try {
            esperarElementoAparecer(elemento); // Espera o elemento aparecer
            Select dropDown = new Select(elemento); // Instancia o Select no elemento <select>

            // Tenta selecionar a opção pelo texto exato
            dropDown.selectByVisibleText(texto);
        } catch (NoSuchElementException e) {
            System.out.println("Opção não encontrada: " + texto);
            // Você pode optar por lançar novamente a exceção ou tratá-la conforme necessário
        }
    }

    public static void selecionarComboBoxPorValor(WebElement elemento, String valor) {
        esperarElementoAparecer(elemento);
        Select dropDown = new Select(elemento);
        dropDown.selectByValue(valor);
    }

    public static void validarPopUp() throws InterruptedException{
        Alert alert = getDriver().switchTo().alert();
        alert.accept();
    }

    public static String pegarTexto(WebElement elemento){
        esperarElementoAparecer(elemento);
        return elemento.getText();
    }

}

