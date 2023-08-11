
Feature: Efetuar Login

  Background:
    Given o navegador está aberto
    And navego a pagina de loja online
    And acesso a area pessoal


   Scenario: Validar modal de login
     Then modal de login é apresentado com sucesso


    Scenario: Logar com sucesso
      When efetuo login com sucesso
      Then o menu minha conta apresenta as opções "OS MEUS PEDIDOS" "OS MEUS CERTIFICADOS" "LOGOUT"