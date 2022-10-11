package steps;

import elementos.Elementos;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;
import runner.Executa;

public class AulaCucumber {

	Metodos metodos = new Metodos();
	Elementos el = new Elementos();
	
	String name = "Kael";
	
	@Before
	public void iniciarTeste() {
		Executa.abrirNavegador();
	}
	
	@After
	public void finalizarTeste() {
		Executa.fecharNavegador();
	}
	
	@Given("que estaja no formulario")
	public void queEstajaNoFormulario() {
		metodos.scroll(0, 350);
		metodos.clicar(el.menuElements);
		metodos.clicar("span", "Text Box");

	}

	@When("preencher as informacoes")
	public void preencherAsInformacoes() {
		metodos.escrever(el.fullName, this.name);
		metodos.escrever(el.email, "kael@teste.com");
		metodos.escrever(el.currentAddress, "Rua Luiz Piza 141, CEP 13700-970, Casa Branca - SP");
		metodos.escrever(el.permanentAddress, "Rua Luiz Piza 141, CEP 13700-970, Casa Branca - SP");
		metodos.scroll(0, 300);
		metodos.clicar(el.btnSubmit);

	}

	@Then("enviar o formulario")
	public void enviarOFormulario() {
		metodos.validarTexto(el.resultName, this.name);

	}

}
