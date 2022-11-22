package testes;

import org.junit.Test;
import org.openqa.selenium.By;

import metodos.Metodos;

public class Testes {

	Metodos metodos = new Metodos();

	// parte login
	By name = By.name("user-name");
	By id = By.name("password");
	By login = By.name("login-button");

	// primera compra

	By bolsa = By.xpath("//img[@alt=('Sauce Labs Backpack')]");
	By addcarrinho0 = By.xpath("//button[@class=('btn btn_primary btn_small btn_inventory')]");
	By continuarcompras = By.xpath("//*[@id=('back-to-products')]");

	// segunda compra

	By bikelight = By.xpath("//img[@alt=('Sauce Labs Bike Light')]");
	By addcarrinho1 = By.name("add-to-cart-sauce-labs-bike-light");
	By botao2 = By.xpath("//*[@id=('back-to-products')]");

	// terceira compra

	By tshirt = By.xpath("//img[@alt=('Sauce Labs Bolt T-Shirt')]");
	By addcarrinho2 = By.xpath("//*[@class=('btn btn_primary btn_small btn_inventory')]");
	By botao3 = By.xpath("//*[@id=('back-to-products')]");

	// quarta compra

	By jacket = By.xpath("//img[@alt=('Sauce Labs Fleece Jacket')]");
	By addcarrinho3 = By.xpath("//*[@class=('btn btn_primary btn_small btn_inventory')]");
	By botao4 = By.xpath("//*[@id=('back-to-products')]");

	// quinta compra

	By labs = By.xpath("//img[@alt=('Sauce Labs Onesie')]");
	By addcarrinho4 = By.xpath("//*[@class=('btn btn_primary btn_small btn_inventory')]");
	By botao5 = By.xpath("//*[@id=('back-to-products')]");

	// ultima compra

	By red = By.xpath("//img[@alt=('Test.allTheThings() T-Shirt (Red)')]");
	By addcarrinho = By.xpath("//*[@class=('btn btn_primary btn_small btn_inventory')]");
	By vercarrinho2 = By.xpath("//span[@class=(\"shopping_cart_badge\")]");
	By finalizarcompras = By.xpath("//*[@class=('btn btn_action btn_medium checkout_button')]");

	// pagamento

	By fistName = By.name("firstName");
	By primeiroNome = By.name("Maria");
	By lastName = By.xpath("//*[@placeholder=('Last Name')]");
	By escreverultimo = By.xpath("Silva");
	By codigo = By.xpath("//*[@placeholder=('Zip/Postal Code')]");
	By digitecodigo = By.name("123456");
	By botaocontinuar = By.xpath("//*[@type=('submit')]");
	By finish = By.xpath("//*[@id=('finish')]");

	@Test
	public void teste1() {

		// login
		metodos.abrirNavegador();
		metodos.escrever(name, "standard_user");
		metodos.escrever(id, "secret_sauce");
		metodos.clicar(login);
		metodos.pause(5000);

//1
		metodos.clicar(bolsa);
		metodos.pause(5000);
		metodos.clicar(addcarrinho0);
		metodos.clicar(continuarcompras);

//2
		metodos.clicar(bikelight);
		metodos.pause(5000);
		metodos.clicar(addcarrinho1);
		metodos.button(botao2);

		// 3

		metodos.clicar(tshirt);
		metodos.pause(5000);
		metodos.clicar(addcarrinho2);
		metodos.button(botao3);
		// 4

		metodos.clicar(jacket);
		metodos.pause(5000);
		metodos.clicar(addcarrinho3);
		metodos.button(botao4);

//5

		metodos.clicar(labs);
		metodos.pause(5000);
		metodos.clicar(addcarrinho4);
		metodos.button(botao5);

//6
		metodos.clicar(red);
		metodos.clicar(addcarrinho);
		metodos.clicar(vercarrinho2);
		metodos.pause(5000);
		metodos.clicar(finalizarcompras);

// pagamento 

		metodos.clicar(fistName);
		metodos.escrever(fistName, "Maria");
		metodos.clicar(lastName);
		metodos.escrever(lastName, "Silva");

		metodos.clicar(codigo);
		metodos.escrever(codigo, "123456");
		metodos.pause(5000);
		metodos.clicar(botaocontinuar);
		metodos.clicar(finish);
	}
}
