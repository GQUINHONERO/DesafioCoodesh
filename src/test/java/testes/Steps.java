package testes;


import elementos.ElementosWeb;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
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
	
	
	}
	
	
	
	
	

