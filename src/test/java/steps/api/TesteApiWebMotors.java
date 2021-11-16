package steps.api;

import java.io.File;

import java.nio.charset.Charset;

import org.apache.commons.io.FileUtils;
import org.hamcrest.Matchers;
import org.junit.Test;

import org.skyscreamer.jsonassert.JSONAssert;
import org.skyscreamer.jsonassert.JSONCompareMode;

import io.cucumber.java.an.E;
import io.cucumber.java.es.Dado;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Então;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class TesteApiWebMotors {
	/* @author Wilson Lucchini*/
	
	@Dado("que o usuário deseja fazer uma consulta completa do retorno da Api")
	@Quando("enviar a requisição")
	@E("validar se o código de resposta é 200")
	@Então("validar se existe a marca:{string} no retorno")
	@Test
	public void TesteBodyChallengeMakeApiWebMotors() throws Exception{
		File file = new File("./src/test/java/steps/api/challengeMake.json");
		
		Response response =
				RestAssured.given()
				.when()				
				      .get("https://desafioonline.webmotors.com.br/api/OnlineChallenge/Make") //@Quando
				.then()
				.log().all()
				.contentType(ContentType.JSON)
				.assertThat()
				.statusCode(200) //E
				.body(Matchers.containsString("Honda")) //Então
				.and()
				.extract()
				.response();
		
		String expectedJson = FileUtils.readFileToString(file, Charset.defaultCharset());
		
		String actualJson = response.body().asString();
		
		JSONAssert.assertEquals(expectedJson, actualJson, JSONCompareMode.STRICT); //@Dado
	}
	
	@Dado("que o usuário deseja fazer uma consulta de retorno e modelo")
    @Quando ("solicitar a requisição")
    @E ("validar se a resposta é 200")
    @Então ("validar se existe o modelo:{string} no retorno")
	@Test
	public void ValidacaoRetornoModeloApiWebMotors() throws Exception{
		String url = "https://desafioonline.webmotors.com.br/api/OnlineChallenge/Model?MakeID=2";
		
				RestAssured
				.given()
				.log().all()
				.when()
				      .get(url) //@Quando
				.then()
				.log().all()
				.assertThat()
				.statusCode(200) //@E
				.body(Matchers.containsString("City")); //@Então
				}
	
	@Dado("que o usuário deseja fazer uma consulta de retorno e versao")
    @Quando("enviar uma requisição")
    @E("validar se o código é 200")
    @Então("validar se existe o versão:{string} no retorno")
	@Test
	public void ValidacaoRetornoVersaoApiWebMotors() throws Exception{
		String versao = "1.5 DX 16V FLEX 4P AUTOMÁTICO";
		String url = "https://desafioonline.webmotors.com.br/api/OnlineChallenge/Version?ModelID=6";
				RestAssured.given()
				.when()
				      .get(url) //@Quando
				.then()
				.log().all()
				.assertThat()
				.statusCode(200) //@E
				.body(Matchers.containsString(versao)); //@Então
	}

}
