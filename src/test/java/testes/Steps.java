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
	public void rolar_a_pagina_ate_o_final_e_validar_a_frase(String coodesh) {
metodos.validarBarraRolagem(el.getValidarNome(), coodesh);
	}
	@Quando("clicar na opcao \\(ver vagas)")
	public void clicar_na_opcao_ver_vagas() {
	  metodos.clicar(el.getVerVagas());  
	}

	@Entao("valido a palavra {string}")
	public void valido_a_palavra(String categoria) throws InterruptedException {
		Thread.sleep(5000);
	   metodos.validarInformacao(el.getValidarCategoria(), categoria);
	}
	@Quando("pesquisar pela empresa {string}")
	public void pesquisar_pela_empresa(String empresa) throws InterruptedException {
		Thread.sleep(3000);
		metodos.escrever(el.getPesquisarVaga(), empresa);
		metodos.submit(el.getPesquisarVaga());
	}

	@Entao("valido o nome da empresa {string}")
	public void valido_o_nome_da_empresa(String empresa) throws InterruptedException {
		Thread.sleep(3000); 
		metodos.validarInformacao(el.getValidarNomeEmpresa(), empresa);
	}
	
	}
	
	
	
	
	

