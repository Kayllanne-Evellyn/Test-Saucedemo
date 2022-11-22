package metodos;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Metodos {

	WebDriver driver;

	public void abrirNavegador() {

		String teste = "https://www.saucedemo.com/";
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");

		driver = new ChromeDriver();
		driver.get(teste);
		driver.manage().window().maximize();
		System.out.println("!!!!!!!!!!!!!!!!!!! INICIO DO TESTE !!!!!!!!!!!!!!!!!");
	}

	public void clicar(By element) {

		driver.findElement(element).click();

	}

	public void escrever(By element, String texto) {
		driver.findElement(element).sendKeys(texto);

	}

	public void submit(By element) {
		driver.findElement(element).submit();

	}

	public void clear(By element) {
		driver.findElement(element).clear();

	}

	public void pause(int tempo) {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}

	public void button(By button) {

		driver.findElement(button).click();
	}

	public void finalizarcompras(By buttonfinal) {

		driver.findElement(buttonfinal).click();
	}
	
}
