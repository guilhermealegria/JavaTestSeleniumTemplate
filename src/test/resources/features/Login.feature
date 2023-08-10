Feature: Efetuar Login

  Background:
    Given o navegador está aberto
    And navego a pagina de loja online
    And clico em area pessoal

  @execution
   Scenario: Validar modal de login
     Then modal de login é apresentado com sucesso