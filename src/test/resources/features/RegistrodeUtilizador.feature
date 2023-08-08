@ignore
Feature: Registro de Utilizador
This feature to test

Background:
    Given o navegador está aberto
    And navego a pagina para registro de utilizador


Scenario: Validar todos os campos obrigatórios
    When clico em aceitar termos
    And clico no botão continuar
    Then os todos campos de preenchimento estam apresentando mensagem "Campo Obrigatório"