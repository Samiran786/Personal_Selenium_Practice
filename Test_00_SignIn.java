// TASK : The signin button has been tested in this code



package w3School;


import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Test_00_SignIn {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SAMIBANE\\OneDrive - Capgemini\\Desktop\\New_Selenium_File\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.w3schools.com/");
		driver.findElement(By.xpath("//a[@id='w3loginbtn']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		Thread.sleep(5000);
		
		driver.findElement(By.cssSelector("input[class*=EmailInput_input_field__6t4Ux ]")).sendKeys("bsamiran6@gmail.com");
		driver.findElement(By.xpath("//input[@class='PasswordInput_input_field__EWMIU undefined']")).sendKeys("Papai@786");
		driver.findElement(By.cssSelector("button[class='Button_button__URNp+ Button_primary__d2Jt3 Button_fullwidth__0HLEu'] ")).click();
	}


}
