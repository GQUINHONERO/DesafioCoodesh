package testes;


import elementos.ElementosWeb;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import metodos.Metodos;

public class Steps {
	Metodos metodos = new Metodos();
ElementosWeb el= new ElementosWeb();
	@Dado("que esteja no site da Coodesh {string}")
	public void que_esteja_no_site_da_coodesh(String site) {
	    metodos.abrirBrowser(site);
	}

	@Entao("rolar a pagina ate o final e validar a frase {string}")
	public void rolar_a_pagina_ate_o_final_e_validar_a_frase(String texto) {
metodos.validarBarraRolagem(el.getValidarNome(), texto);
	}
	@Quando("clicar na opcao \\(ver vagas)")
	public void clicar_na_opcao_ver_vagas() {
	  metodos.clicar(el.getVerVagas());  
	}

	@Entao("valido a palavra {string}")
	public void valido_a_palavra(String texto) throws InterruptedException {
		Thread.sleep(5000);
	   metodos.validarInformacao(el.getValidarCategoria(), texto);
	}

	
	}
	
	
	
	
	

