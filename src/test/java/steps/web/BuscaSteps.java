package steps.web;

import java.time.Duration;

import javax.swing.JOptionPane;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pages.MainPage;
import pages.ResultadoPage;

public class BuscaSteps {
	/* @author Wilson Lucchini*/
	
	private WebDriver driver;
	private MainPage mainpage;
	private ResultadoPage resultado;

	@Dado("que esteja na tela inicial da Webmotors")
	public void que_esteja_na_tela_inicial_da_Webmotors() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.webmotors.com.br");

	}

	@Quando("eu inserir as informações {string} e {string}")
	public void eu_inserir_as_informações_e(String modelo, String marca) {

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("searchBar")));

		mainpage = new MainPage(driver);

		mainpage.escreveBusca(modelo, marca);
	}

	@E("clicar na opção exibida no drop down menu")
	public void clicar_na_opção_exibida_no_drop_down_menu() {

		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(By.className("SearchBar__results__result")));

		mainpage.clicaOpcao();
	}

	@E("o resultado da busca for exibido")
	public void o_resultado_da_busca_for_exibido() {
		
		FluentWait<WebDriver> wait = new WebDriverWait(driver, 10).withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".title-search")));
		
		String locale = JOptionPane.showInputDialog("Insira sua Cidade como no exemplo - Barueri/SP");
		String searchTitle = driver.findElement(By.cssSelector(".title-search")).getText();
		Assert.assertEquals(searchTitle, "Honda City em " + locale +" - Novos e Usados");

	}

	@E("selecionar a opção Concessionária")
	public void selecionar_a_opção_Concessionária() {

		resultado = new ResultadoPage(driver);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Element = driver.findElement(By.xpath("//div[@id='root']/main/div/div[2]/div/div[5]/div[2]/label"));
		js.executeScript("arguments[0].scrollIntoView();", Element);

		resultado.clicaConcessionaria();

	}

	@E("selecionar a opção Loja")
	public void selecionar_a_opção_Loja() {

		resultado.clicaLoja();

	}

	@Então("a listagem de estoque de uma determinada loja será exibida")
	public void a_listagem_de_estoque_de_uma_determinada_loja_será_exibida() {

		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.textToBePresentInElementLocated(
				By.xpath("//div[contains(@data-test-id,'found-ads')]"), "carros encontrados"));

		resultado.pegaTotal();

	}

}
