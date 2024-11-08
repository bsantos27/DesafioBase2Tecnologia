@mantis
Feature: Desafio Base2 01

  Site Mantis

  Scenario Outline: Criar Tareda no site Mantis
    Given realize login no site Mantis
    And estou na tela inicial
    And realizo cadastro do Report Issue
    And seleciono a categoria:
      | categoria   | reprodutibilidade   | gravidade   | prioridade   | perfil_plataforma   | perfil_so   | perfil_sistema   | resumo   | descricao   | etapas_reproduzir   | informações_adicionais   | adicionar_tag   | selecionar_tag   |
      | <categoria> | <reprodutibilidade> | <gravidade> | <prioridade> | <perfil_plataforma> | <perfil_so> | <perfil_sistema> | <resumo> | <descricao> | <etapas_reproduzir> | <informações_adicionais> | <adicionar_tag> | <selecionar_tag> |

    Then verifico se foi cadastrado com sucesso

    Examples:
      | categoria | reprodutibilidade | gravidade | prioridade | perfil_plataforma | perfil_so | perfil_sistema | resumo              | descricao                       | etapas_reproduzir                                                                                   | informações_adicionais                                                                                    | adicionar_tag | selecionar_tag |
      #| 1         | 10                | 10        | 10         | testePlataforma   | Windows   | 10             | Teste Automatizados | Teste Automatizados para o site | Passo para indentificar o bug: acessar a tela de cadastro e etc.... Teste Automatizados para o site | Informaçoes para indentificar o bug: acessar a tela de cadastro e etc.... Teste Automatizados para o site | t             | 24             |
      | 1         | 10                | 10        | 10         | testePlataforma   | Windows   | 10             | Teste Automatizados | Teste Automatizados para o site | Passo para indentificar o bug: acessar a tela de cadastro e etc.... Teste Automatizados para o site | Informaçoes para indentificar o bug: acessar a tela de cadastro e etc.... Teste Automatizados para o site | t             | 24             |




