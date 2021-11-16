# language: pt
Funcionalidade: Validacao de retorno solicitado de Api

  Cenário: Api_valida_corpo_e_Marca
    Dado que o usuário deseja fazer uma consulta completa do retorno da Api
    Quando enviar a requisição
    E validar se o código de resposta é 200
    Então validar se existe a marca: "Honda" no retorno
    
    Cenário: Api_valida_retorno_e_Modelo
    Dado que o usuário deseja fazer uma consulta de retorno e modelo
    Quando solicitar a requisição
    E validar se a resposta é 200
    Então validar se existe o modelo: "City" no retorno
    
    Cenário: Api_valida_retorno_e_Versao
    Dado que o usuário deseja fazer uma consulta de retorno e versao
    Quando enviar uma requisição
    E validar se o código é 200
    Então validar se existe o versão: "1.5 DX 16V FLEX 4P AUTOMÁTICO" no retorno
    |marca|modelo|versão|
    |Honda|City  |1.5 DX 16V FLEX 4P AUTOMÁTICO|
    
   
