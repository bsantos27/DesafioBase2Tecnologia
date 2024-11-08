package Steps;

import Pages.CriarTarefaPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import java.util.Map;

import static java.lang.Thread.sleep;

public class CriarTarefaSteps {

    private static final String TITLE_PEDIDO = "MantisBT";

    CriarTarefaPage criarTarefaPage = new CriarTarefaPage();

    @And("estou na tela inicial")
    public void estouNaTelaInicial() {
        criarTarefaPage.validarTelaInicial();
    }

    @And("realizo cadastro do Report Issue")
    public void clicoBotaoCadastro() {
        criarTarefaPage.clicarBotao();
    }

    @And("seleciono a categoria:")
    public void selecionoACategoria(DataTable dataTable) throws InterruptedException {
        Map<String, String> dados = dataTable.asMaps(String.class, String.class).get(0);

        String categoria = dados.get("categoria");
        String reprodutibilidade = dados.get("reprodutibilidade");
        String gravidade = dados.get("gravidade");
        String prioridade = dados.get("prioridade");
        String perfil_plataforma = dados.get("perfil_plataforma");
        String perfil_so = dados.get("perfil_so");
        String perfil_sistema = dados.get("perfil_sistema");
        String resumo = dados.get("resumo");
        String descricao = dados.get("descricao");
        String etapas_reproduzir = dados.get("etapas_reproduzir");
        String informações_adicionais = dados.get("informações_adicionais");
        String tag = dados.get("adicionar_tag");
        String tagb = dados.get("selecionar_tag");

        criarTarefaPage.preencherPerfil(categoria, reprodutibilidade, gravidade , prioridade ,perfil_plataforma, perfil_so ,perfil_sistema, resumo, descricao, etapas_reproduzir, informações_adicionais, tag, tagb);

        criarTarefaPage.clicarDenunciar();
        criarTarefaPage.clicarAddArquivo();
        //Thread.sleep(5000);
        criarTarefaPage.clicarSubmit();
    }


//    @Then("verifico se foi cadastrado com sucesso")
//    public void verificoSeFoiCadastradoComSucesso() {
//        String mensagemCadastro = cadastroPage.validarErro();
//
//        // Verifique se a mensagem indica sucesso
//        if (!mensagemCadastro.equals(cadastroPage.validarErro())) {
//            System.out.println("Erro no cadastro: " + cadastroPage.validarErro());
//        } else {
//            System.out.println("Cadastrado com sucesso: " + cadastroPage.validarCadastro());
//        }
//    }

    @Then("verifico se foi cadastrado com sucesso")
    public void verificoSeFoiCadastradoComSucesso() {
        criarTarefaPage.validarErro();
    }


}
