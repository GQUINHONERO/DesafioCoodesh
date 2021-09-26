package elementos;

import org.openqa.selenium.By;

public class ElementosWeb {

	private By validarNome = By.cssSelector("#__next > footer > div > div > div.order-sm-2.mb-4.mb-sm-0.ml-lg-auto.col-lg-2.col-sm-3 > h4");
    private By verVagas = By.xpath("//a[@class='nav-link u-header__nav-link']");
    private By validarCategoria = By.xpath("//*[@class='h4 d-block text-dark font-weight-semi-bold mb-0']");
	
    
    
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
}
	