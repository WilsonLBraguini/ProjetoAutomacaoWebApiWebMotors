$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/api/PesquisaApi.feature");
formatter.feature({
  "name": "Validacao de retorno solicitado de Api",
  "description": "",
  "keyword": "Funcionalidade"
});
formatter.scenario({
  "name": "Api_valida_corpo_e_Marca",
  "description": "",
  "keyword": "Cenário"
});
formatter.step({
  "name": "que o usuário deseja fazer uma consulta completa do retorno da Api",
  "keyword": "Dado "
});
formatter.match({
  "location": "steps.api.TesteApiWebMotors.TesteBodyChallengeMakeApiWebMotors() in file:/C:/Users/wlbraguini/Documents/Webmotors/webmotors/target/test-classes/"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enviar a requisição",
  "keyword": "Quando "
});
formatter.match({
  "location": "steps.api.TesteApiWebMotors.TesteBodyChallengeMakeApiWebMotors() in file:/C:/Users/wlbraguini/Documents/Webmotors/webmotors/target/test-classes/"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "validar se o código de resposta é 200",
  "keyword": "E "
});
formatter.match({
  "location": "steps.api.TesteApiWebMotors.TesteBodyChallengeMakeApiWebMotors() in file:/C:/Users/wlbraguini/Documents/Webmotors/webmotors/target/test-classes/"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "validar se existe a marca: \"Honda\" no retorno",
  "keyword": "Então "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "Api_valida_retorno_e_Modelo",
  "description": "",
  "keyword": "Cenário"
});
formatter.step({
  "name": "que o usuário deseja fazer uma consulta de retorno e modelo",
  "keyword": "Dado "
});
formatter.match({
  "location": "steps.api.TesteApiWebMotors.ValidacaoRetornoModeloApiWebMotors() in file:/C:/Users/wlbraguini/Documents/Webmotors/webmotors/target/test-classes/"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "solicitar a requisição",
  "keyword": "Quando "
});
formatter.match({
  "location": "steps.api.TesteApiWebMotors.ValidacaoRetornoModeloApiWebMotors() in file:/C:/Users/wlbraguini/Documents/Webmotors/webmotors/target/test-classes/"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "validar se a resposta é 200",
  "keyword": "E "
});
formatter.match({
  "location": "steps.api.TesteApiWebMotors.ValidacaoRetornoModeloApiWebMotors() in file:/C:/Users/wlbraguini/Documents/Webmotors/webmotors/target/test-classes/"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "validar se existe o modelo: \"City\" no retorno",
  "keyword": "Então "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "Api_valida_retorno_e_Versao",
  "description": "",
  "keyword": "Cenário"
});
formatter.step({
  "name": "que o usuário deseja fazer uma consulta de retorno e versao",
  "keyword": "Dado "
});
formatter.match({
  "location": "steps.api.TesteApiWebMotors.ValidacaoRetornoVersaoApiWebMotors() in file:/C:/Users/wlbraguini/Documents/Webmotors/webmotors/target/test-classes/"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enviar uma requisição",
  "keyword": "Quando "
});
formatter.match({
  "location": "steps.api.TesteApiWebMotors.ValidacaoRetornoVersaoApiWebMotors() in file:/C:/Users/wlbraguini/Documents/Webmotors/webmotors/target/test-classes/"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "validar se o código é 200",
  "keyword": "E "
});
formatter.match({
  "location": "steps.api.TesteApiWebMotors.ValidacaoRetornoVersaoApiWebMotors() in file:/C:/Users/wlbraguini/Documents/Webmotors/webmotors/target/test-classes/"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "validar se existe o versão: \"1.5 DX 16V FLEX 4P AUTOMÁTICO\" no retorno",
  "rows": [
    {},
    {}
  ],
  "keyword": "Então "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});