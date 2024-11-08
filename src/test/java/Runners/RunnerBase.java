package Runners;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RunnerBase {

    // Declaração do WebDriver
    private static WebDriver driver;

    // Enum para escolher o navegador
    public enum Browser {CHROME, FIREFOX}

    // Método que verifica o driver atual e cria um novo, se necessário
    public static WebDriver getDriver() {
        if (driver == null) {
            // Aqui você pode configurar o navegador via um parâmetro de configuração ou ambiente
            // Ou, no caso, você pode configurar como padrão CHROME
            String browserName = System.getProperty("browser", "CHROME");  // Usa "CHROME" como padrão
            Browser browser = Browser.valueOf(browserName.toUpperCase());
            getDriver(browser);  // Chama o método que cria o driver com base no navegador
        }
        return driver;
    }

    // Método para configurar o WebDriver baseado no tipo de navegador
    public static WebDriver getDriver(Browser browser) {
        if (driver != null) {
            return driver;  // Retorna o driver já inicializado
        }

        // Criação do driver com base no navegador especificado
        switch (browser) {
            case CHROME:
                ChromeOptions options = new ChromeOptions();
                // Se precisar rodar no modo headless, descomente a linha abaixo
                // options.addArguments("--headless");
                driver = new ChromeDriver(options);
                break;
            case FIREFOX:
                driver = new FirefoxDriver();
                break;
            default:
                throw new IllegalArgumentException("Por favor, forneça um navegador válido: CHROME ou FIREFOX");
        }
        return driver;
    }

    // Método para fechar o WebDriver de forma segura
    public static void quitDriver() {
        if (driver != null) {
            driver.quit();  // Fecha o navegador
            driver = null;  // Define o driver como null após o fechamento
        }
    }

    // Método de controle para garantir que o WebDriver seja fechado, caso contrário, fica com um estado aberto
    public static boolean isDriverActive() {
        return driver != null;
    }
}

