@mantis1
Feature: Desafio Base2 02

  Site Mantis

  Scenario: Ver Tareda no site Mantis
    Given realize login no site Mantis
    And estou na tela de tarefas
    And consultos as tarefas "0002146"
    And adicionar anotação "Teste Automatizados"

