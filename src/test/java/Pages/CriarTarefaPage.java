package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;

import static Runners.RunnerBase.getDriver;
import static Utils.Utils.*;
import static javax.print.attribute.standard.MediaSizeName.C;

public class CriarTarefaPage {

    @FindBy(css = "#navbar-container > div:nth-child(2) > a > span")
    private WebElement logo;

    @FindBy(css = "#sidebar > ul > li:nth-child(3) > a")
    private WebElement btnCadastro;

    @FindBy(id = "category_id")
    private WebElement comboBoxCat;

    @FindBy(id = "reproducibility")
    private WebElement comboBoxRep;

    @FindBy(id = "severity")
    private WebElement comboBoxGra;

    @FindBy(id = "priority")
    private WebElement comboBoxPri;

    @FindBy(css = "#profile_closed_link > i")
    private WebElement btnPerfil;

    @FindBy(id = "platform")
    private WebElement txtPlataforma;

    @FindBy(id = "os")
    private WebElement txtOs;

    @FindBy(id = "os_build")
    private WebElement txtOsBuild;

    @FindBy(id = "summary")
    private WebElement txtSummary;

    @FindBy(id = "description")
    private WebElement txtDescription;

    @FindBy(id = "steps_to_reproduce")
    private WebElement txtReproduce;

    @FindBy(id = "additional_info")
    private WebElement txtAdditional;

    @FindBy(id = "tag_string")
    private WebElement txtTag;

    @FindBy(id = "tag_select")
    private WebElement comboBoxTag;

    @FindBy(xpath = "//*[@id='report_bug_form']/div/div[2]/div[1]/div/table/tbody/tr[13]/td/label/span")
    private WebElement btnDenunciar;

    @FindBy(xpath = "//*[@id='report_bug_form']/div/div[2]/div[1]/div/table/tbody/tr[11]/td/div[2]")
    private WebElement btnAddArquivos;

    @FindBy(xpath = "//*[@id='report_bug_form']/div/div[2]/div[2]/input")
    private WebElement btnSubmit;

    @FindBy(css = "#main-container > div.main-content > div.page-content > div > div > div > div.alert.alert-success.center > p")
    private WebElement msn;

    @FindBy(css = "#main-container > div.main-content > div.page-content > div > div > div.alert.alert-danger > p.bold")
    private WebElement msnError;


    public CriarTarefaPage(){
        PageFactory.initElements(getDriver(), this);
    }

    public String validarTelaInicial() {
        return pegarTexto(logo);
    }

    public void clicarBotao() {
        clicar(btnCadastro);
    }

    public void preencherPerfil(String categoria, String reprodutibilidade, String gravidade, String prioridade, String plataforma, String os, String osbuild, String summary, String description, String reproduce, String additional, String tag, String tagb) {
        selecionarComboBoxPorValor(comboBoxCat,categoria);
        selecionarComboBoxPorValor(comboBoxRep, reprodutibilidade);
        selecionarComboBoxPorValor(comboBoxRep, gravidade);
        selecionarComboBoxPorValor(comboBoxRep, prioridade);
        digitar(txtPlataforma, plataforma);
        digitar(txtOs, os);
        digitar(txtOsBuild, osbuild);
        digitar(txtSummary, summary);
        digitar(txtDescription, description);
        digitar(txtReproduce, reproduce);
        digitar(txtAdditional, additional);
        digitar(txtTag, tag);
        selecionarComboBoxPorValor(comboBoxTag, tagb);

    }

    public void clicarDenunciar() {
        clicar(btnDenunciar);
    }

    public void clicarAddArquivo() {
        clicar(btnAddArquivos);
    }

    public void clicarSubmit() {
        clicar(btnSubmit);
    }

    public String validarCadastro() {
        return pegarTexto(msn);
    }

    public String validarErro() {
        return pegarTexto(msnError);
    }
}
