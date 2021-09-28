package testes;

import java.io.IOException;

import elementos.ElementosWeb;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import metodos.Metodos;

public class Steps {
	Metodos metodos = new Metodos();
	ElementosWeb el = new ElementosWeb();

	@Dado("que esteja no site da Coodesh {string}")
	public void que_esteja_no_site_da_coodesh(String site) {
		metodos.abrirBrowser(site);
	}

	@Entao("rolar a pagina ate o final e validar a frase {string}")
	public void rolar_a_pagina_ate_o_final_e_validar_a_frase(String coodesh) throws IOException {
		metodos.validarBarraRolagem(el.getValidarNome(), coodesh);
		metodos.screenShot("1 - Evidencia (Home Page)");

	}

	@Quando("clicar na opcao \\(ver vagas)")
	public void clicar_na_opcao_ver_vagas() throws InterruptedException {
		Thread.sleep(5000);
		metodos.clicar(el.getVerVagas());
	}

	@Entao("valido a palavra {string}")
	public void valido_a_palavra(String categoria) throws InterruptedException, IOException {
		Thread.sleep(5000);
		metodos.validarInformacao(el.getValidarCategoria(), categoria);
		metodos.screenShot("2 - Evidencia (palavra Categoria");

	}

	@E("pesquisar pela empresa {string}")
	public void pesquisar_pela_empresa(String empresa) throws InterruptedException {
		Thread.sleep(3000);
		metodos.escrever(el.getPesquisarVaga(), empresa);
		metodos.submit(el.getPesquisarVaga());
	}

	@Entao("valido o nome da empresa {string}")
	public void valido_o_nome_da_empresa(String empresa) throws InterruptedException, IOException {
		Thread.sleep(3000);
		metodos.validarInformacao(el.getValidarNomeEmpresa(), empresa);
		metodos.screenShot("3 - Evidencia (nome da empresa)");

	}

	@E("clicar em umas das vagas")
	public void clicar_em_umas_das_vagas() throws InterruptedException {
		Thread.sleep(3000);
		metodos.clicar(el.getSelecionarVaga());

	}

	@Entao("validar a frase {string}")
	public void validar_a_frase(String resumoDaVaga) throws InterruptedException, IOException {

		Thread.sleep(3000);
		metodos.validarInformacao(el.getValidarResumoVaga(), resumoDaVaga);
		metodos.screenShot("4 - Evidencia (Resumo da Vaga)");

	}

	@E("clicar em candidata-se")
	public void clicar_em_candidata_se() throws InterruptedException {
		Thread.sleep(5000);
		metodos.clicar(el.getCandidatarSe());
	}

	@Entao("validar a palavra {string}")
	public void validar_a_palavra(String palavra) throws IOException, InterruptedException {
		Thread.sleep(5000);
		metodos.validarInformacao(el.getValidarModal(), palavra);
		metodos.screenShot("5 - Evidencia (validacao Modal)");
		metodos.fecharNavegador();
	}
}
