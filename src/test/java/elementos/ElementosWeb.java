package elementos;

import org.openqa.selenium.By;

public class ElementosWeb {

	private By validarNome = By.cssSelector("#__next > footer > div > div > div.order-sm-2.mb-4.mb-sm-0.ml-lg-auto.col-lg-2.col-sm-3 > h4");
    private By verVagas = By.xpath("//a[@class='nav-link u-header__nav-link']");
    private By validarCategoria = By.xpath("//*[@class='h4 d-block text-dark font-weight-semi-bold mb-0']");
	private By pesquisarVaga = By.name("search");
	private By validarNomeEmpresa = By.xpath("//*[@class='link-muted']");
	private By selecionarVaga = By.xpath("//*[@class='h5 mb-1']");
	private By validarResumoVaga =By.cssSelector("#content > div:nth-child(2) > div > div > div.col-lg-4 > div > div.border-0.shadow-sm.mb-3.card > header > div > h3");
    
    
    public By getVerVagas() {
		return verVagas;
	}

	public By getValidarCategoria() {
		return validarCategoria;
	}

	public By getValidarNome() {
		return validarNome;
	}

	public void setValidarNome(By validarNome) {
		this.validarNome = validarNome;
	}

	public By getPesquisarVaga() {
		return pesquisarVaga;
	}

	public void setPesquisarVaga(By pesquisarVaga) {
		this.pesquisarVaga = pesquisarVaga;
	}

	public By getValidarNomeEmpresa() {
		return validarNomeEmpresa;
	}

	public void setValidarNomeEmpresa(By validarNomeEmpresa) {
		this.validarNomeEmpresa = validarNomeEmpresa;
	}

	public By getSelecionarVaga() {
		return selecionarVaga;
	}

	public void setSelecionarVaga(By selecionarVaga) {
		this.selecionarVaga = selecionarVaga;
	}

	public By getValidarResumoVaga() {
		return validarResumoVaga;
	}

	public void setValidarResumoVaga(By validarResumoVaga) {
		this.validarResumoVaga = validarResumoVaga;
	}
}
	