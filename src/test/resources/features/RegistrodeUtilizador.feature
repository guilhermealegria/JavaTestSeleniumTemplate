
    Feature: Registro de Utilizador
    This feature to test

        Background:
            Given o navegador está aberto
            And navego a pagina para registro de utilizador

        Scenario: Validar todos os campos obrigatórios
            When apago o valor default do campo prefixo
            And clico em aceitar termos
            And clico no botão continuar
            Then todos os campos de preenchimento obrigatório estam apresentando mensagem "Campo obrigatório"

        Scenario Outline: Regitrar utilizador com sucesso.
            When preencho o campo nome nome
            And preencho o campo apelido apelido
            And preencho o campo telefone numero
            And preencho o campo e-mail email
            And clico em aceitar termos
            Then clico no botão continuar
            And as mensagens indicativas são apresentadas "<mensagemUm>" "<mensagemDois>"

            Examples:
            | mensagemUm | mensagemDois |
            | Acesso criado com sucesso! | Enviámos-lhe um link para o seu e-mail com o qual poderá validar a criação da sua conta. |


        Scenario: Validar botao continuar desabilitado
            Then o botão continuar está desabilitado


        Scenario Outline: Validar botao continuar desabilitado preenchendo campos obrigatórios sem aceitar politica de privacidade
            When preencho os campos  "<primeiroNome>" "<apelido>" "<telefone>" "<e-mail>"
            And a politica de privacidade não está marcada
            Then o botão continuar está desabilitado

                Examples:
                | primeiroNome | apelido | telefone | e-mail |
                | teste | teste | 936909586 | teste.teste@globo.com |

        Scenario Outline: Validar tipo de preenchimento no campo nome
            When preencho o campo nome com valor diferente de letras "<texto>"
            And clico em aceitar termos
            And clico no botão continuar
            Then é apresentada mensagem indicativa no campo nome "Apenas deve incluir letras"

            Examples:
            | texto |
            | 123446 |
            | erses123 |
            | @@#@#@#@ |
            | oioioi_..@ |
            | 123@@## |

        Scenario Outline: Validar tipo de preenchimento no campo apelido
            When preencho o campo apelido com valor diferente de letras "<texto>"
            And clico em aceitar termos
            And clico no botão continuar
            Then é apresentada mensagem indicativa no campo apelido "Apenas deve incluir letras"

            Examples:
                | texto |
                | 123446 |
                | erses123 |
                | @@#@#@#@ |
                | oioioi_..@ |
                | 123@@## |

        Scenario Outline: Validar tipo de preenchimento no campo telefone
            When preencho o campo telefone com valor diferente de numeros "<numero>"
            And clico em aceitar termos
            And clico no botão continuar
            Then é apresentada mensagem indicativa no campo telefone "Formato do nº telefone inválido"

                Examples:
                    | numero |
                    | aaaaaa |
                    | sada@# |
                    | @@#@#@#@ |
                    | 12132..@ |


        Scenario Outline: Validar tipo de preenchimento no campo e-mail
            When preencho o campo e-mail com formato inválido "<email>"
            And clico em aceitar termos
            And clico no botão continuar
            Then é apresentada mensagem indicativa no campo e-mail "Formato de email inválido"

            Examples:
                | email |
                | teste..teste@gmail.com |
                | teste@teste@gmail.com |
                | teste.com.br |
                | 12132656|


        Scenario Outline: Validar tipo de preenchimento no campo prefixo
            When apago o valor default do campo prefixo
            And preencho o campo prefixo com formato inválido "<prefixo>"
            And clico em aceitar termos
            And clico no botão continuar
            Then é apresentada mensagem indicativa no campo prefixo "Prefixo inválido"

            Examples:
                | prefixo |
                | teste |
                | -351 |
                | +336 |
                | 12132656|


            Scenario Outline: E-mail já registrado
                When preencho o campo nome "<nome>"
                And preencho o campo apelido "<apelido>"
                And preencho o campo telefone "<numero>"
                And preencho o campo e-mail "<email>"
                And clico em aceitar termos
                Then clico no botão continuar
                And a mensagem indicativa é apresentada "Este e-mail já se encontra registado!"

                Examples:
                | nome | apelido | numero | email |
                | guilherme | alegria | 936999866 | guilhermemoraes.3@gmail.com |
