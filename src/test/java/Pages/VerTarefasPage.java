package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static Runners.RunnerBase.getDriver;
import static Utils.Utils.*;

public class VerTarefasPage {

    @FindBy(css = "#sidebar > ul > li:nth-child(2) > a")
    private WebElement btnVerTarefa;

    @FindBy(css = "#nav-search > form > span > input")
    private WebElement txtFiltrar;

    @FindBy(css = "#buglist > tbody > tr:nth-child(1) > td.column-id > a")
    private WebElement btnFiltrar;

    @FindBy(xpath = "//*[@id='main-container']/div[2]/div[2]/div/div[1]/div/div[2]/div[2]/div/table/tbody/tr[2]/td[1]")
    private WebElement validarFiltrar;

    @FindBy(css = "#bugnote_add > div.widget-body > div.widget-main.no-padding > div > table > tbody > tr:nth-child(1) > td > label > span")
    private WebElement comboBoxVisibilidade;

    @FindBy(id = "bugnote_text")
    private WebElement txtAnotacao;

    @FindBy(xpath = "//*[@id='bugnote-attach-files']/td/div[2]")
    private WebElement btnAdicionarArquivo;

    @FindBy(css = "#bugnote-attach-files > td > div.dropzone.center.dz-clickable")
    private WebElement campoUpload;

    @FindBy(css = "#bugnote_add > div.widget-body > div.widget-toolbox.padding-8.clearfix > input")
    private WebElement btnAdicionar;


    public VerTarefasPage(){
        PageFactory.initElements(getDriver(), this);
    }

    public void clicarBotaoVerTarefa() {
        clicar(btnVerTarefa);
    }

    public void filtrarTarefa(String filter){
        digitar(txtFiltrar, filter);
        clicar(btnFiltrar);
        pegarTexto(validarFiltrar);
    }

    public void adicionarAnotacaoTarefa(String anotacao){
        clicar(btnAdicionarArquivo);
        digitar(txtAnotacao, anotacao);
    }

    public void clicarBotaoAdicionar() {
        clicar(btnAdicionar);
    }
}
