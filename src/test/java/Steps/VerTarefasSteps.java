package Steps;


import Pages.VerTarefasPage;
import io.cucumber.java.en.And;

public class VerTarefasSteps {

    VerTarefasPage verTarefaPage = new VerTarefasPage();

    @And("estou na tela de tarefas")
    public void estouNaTelaDeTarefas() {
        verTarefaPage.clicarBotaoVerTarefa();
    }

    @And("consultos as tarefas {string}")
    public void consultosAsTarefas(String filter) throws InterruptedException {
        verTarefaPage.filtrarTarefa(filter);
        Thread.sleep(5000);
    }

    @And("adicionar anotação {string}")
    public void adicionarAnotação(String anotacao) {
        verTarefaPage.adicionarAnotacaoTarefa(anotacao);
        verTarefaPage.clicarBotaoAdicionar();
    }
}


