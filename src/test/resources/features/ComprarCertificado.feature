Feature: Comprar Certificado Digital

  Background:
    Given o navegador está aberto
    And navego a pagina de loja online

    Scenario: Comprar Certificado com sucesso
      When seleciono a utilização do produto como "Pessoas ou Organizações"
      And Seleciono o fim de utilização como "Pessoal"
      And clico no botão Comprar na opção de "Individual Particular"
      And efetuo login com sucesso na area de login
      Then clico no botão Continuar com as caracteristicas do certificado em default
      And o modal de termos e condições é apresentado
      Then clico no link de termos e condições para download
      And clico no checkBox termos e condições
      When clico no botão Continuar no modal de Termos e condições
      And preencho os dados para pagamento
      And seleciono o método de pagamento como "Pagar mais  tarde"
      And preencho os dados para envio de pagamento
      And cliclo no botão continuar pagamento
      Then é apresentado modal com mensagem a mensagem de sucesso "Pedido efetuado com sucesso!"
