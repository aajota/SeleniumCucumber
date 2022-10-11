package elementos;

import org.openqa.selenium.By;

public class Elementos {

	public By menuElements = By.xpath("//h5[text()='Elements']");
	
	public By textBox = By.xpath("//span[text()='Text Box']");
	public By fullName = By.xpath("//input[@id='userName']");
	public By email = By.xpath("//input[@id='userEmail']");
	public By currentAddress = By.xpath("//textarea[@id='currentAddress']");
	public By permanentAddress = By.xpath("//textarea[@id='permanentAddress']");
	public By btnSubmit = By.xpath("//button[@id='submit']");
	
	public By resultName = By.xpath("//p[@id='name']");
	

}
